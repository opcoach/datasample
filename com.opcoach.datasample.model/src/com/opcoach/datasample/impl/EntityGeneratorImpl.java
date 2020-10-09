package com.opcoach.datasample.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import com.opcoach.datasample.AssociationGenerator;
import com.opcoach.datasample.ChildrenGenerator;
import com.opcoach.datasample.DataSample;
import com.opcoach.datasample.DatasampleFactory;
import com.opcoach.datasample.EntityGenerator;
import com.opcoach.datasample.FieldGenerator;
import com.opcoach.datasample.util.DSLogger;
import com.opcoach.generator.ValueGenerator;

// This class overrides the generated class and will be instantiated by factory
public class EntityGeneratorImpl extends MEntityGeneratorImpl implements EntityGenerator {

	/**
	 * Entity Generator must globally remind of all child instances created so as to
	 * be able to set associations values Key : EClass name, value : list of all
	 * instances available for this type
	 */
	private static Map<String, List<EObject>> availableObjects = new HashMap<String, List<EObject>>();

	public EntityGeneratorImpl() {
		super();
		System.out.println("Create an EntityGeneratorImpl");
	}

	@Override
	public EClass getEntity() {

		EClass result = super.getEntity();
		if (result == null) {
			DataSample ds = getDataSample();
			EPackage p = ds.getPackage();
			EClassifier cl = p.getEClassifier(getEntityName());
			if (cl instanceof EClass) {
				result = (EClass) cl;
				setEntity(result);
			}
		}
		System.out.println("Return EClass : " + result + " for entity name " + getEntityName());
		return result;

	}

	@Override
	public EObject generateValue() {
		EClass target = getEntity();
		EObject result = null;
		try {
			result = target.getEPackage().getEFactoryInstance().create(target);
		} catch (Exception e) {
			DSLogger.error("Unable to create an entity instance for the class name : " + target.getName()
					+ " check the generator : " + eContainer());
			result = null;
			return null;
		}
		// Fist initialize attributes values
		for (EAttribute a : target.getEAllAttributes()) {
			FieldGenerator fg = getFieldGenerator(a.getName());
			ValueGenerator<?> gen = (fg == null) ? null : fg.getGenerator();

			if (gen == null) {
				gen = FieldGenerator.getDefaultGenerator(a);
			}

			Object v = gen.generateValue();
			DSLogger.info("Setting this value " + v + " on this attribute : " + a.getName());
			result.eSet(a, v);
		}

		// Then create reference values.

		// ---------------------------------------------------------------------
		// First of all create compositions (to know objects for associations)
		// ---------------------------------------------------------------------
		for (EReference r : target.getEAllReferences()) {
			if (r.isContainment()) {
				ChildrenGenerator childGen = getChildGenerator(r);
				if (childGen == null) {
					childGen = getDefaultChildGenerator(r);
					// Bind this generator to its parent
					// if (eContainer() instanceof DataSample)
					// ((DataSample)eContainer()).getEntityGenerators().add(childGen);
					// TBD else
					// TBD ((EntityGenerator)eContainer()).getChildGenerators().add(childGen);
				}

				// Can now generate as many as expected children.
				Object o = childGen.generateValue();
				if (o != null) {

					// we must remind of all child instances for later associations
					// Children generator generates one EObject if number is 1 and a list of objects
					// if number is > 1
					if (childGen.getNumber() == 1) {
						remindInstance((EObject) o);
					} else {
						// generated value is a list... iterate on it to remind of instances
						List<?> children = (List<?>) o;
						for (Object c : children)
							if (c instanceof EObject)
								remindInstance((EObject) c);
					}

					// Can set the EReference value, it depends on the number of generated values
					// and the reference cardinality
					Object valueToSet = o;
					if (!r.isMany() && (childGen.getNumber() > 1)) {
						// child generated a list.. must keep the first element
						List<?> childList = (List<?>) o;
						valueToSet = childList.isEmpty() ? null : childList.get(0);
					}
					if (r.isMany() && childGen.getNumber() == 1) {
						// child generated is an EObject, must create a list...
						valueToSet = Arrays.asList(o);
					}
					if (valueToSet != null)
						result.eSet(r, valueToSet);
				}
			}
		}

		// ---------------------------------------------------------------------
		// Then can set the association references
		// ---------------------------------------------------------------------
		for (EReference r : target.getEAllReferences()) {
			if (!r.isContainment()) {

				AssociationGenerator ag = getAssociationGenerator(r);
				if (!(ag instanceof AssociationGenerator)) {
					DSLogger.warning("The generator for reference " + r.getName() + " in EClass "
							+ ((EClass) r.eContainer()).getName() + " should be an AssociationGenerator");
					ag = null;
				}

				if (ag == null)
					ag = getDefaultAssociationGenerator(r);

				String targetType = r.getEReferenceType().getName();
				ag.setValues(availableObjects.get(targetType));

				Object o = ag.generateValue();
				// Can set the EReference value, it depends on the number of generated values
				// and the reference cardinality
				Object valueToSet = o;
				if (!r.isMany() && (ag.getNumber() > 1)) {
					// child generated a list.. must keep the first element
					List<?> childList = (List<?>) o;
					valueToSet = childList.isEmpty() ? null : childList.get(0);
				}
				if (r.isMany() && ag.getNumber() == 1) {
					// child generated is an EObject, must create a list...
					valueToSet = Arrays.asList(o);
				}

				if (valueToSet != null)
					result.eSet(r, valueToSet);

			}
		}

		return result;
	}

	private FieldGenerator getFieldGenerator(String fieldname) {
		FieldGenerator result = null;

		for (FieldGenerator fg : getFieldGenerators())
			if (fieldname.equals(fg.getFieldName())) {
				result = fg;
				break;
			}

		return result;
	}

	/**
	 * Search for a defined association generator in the model. If none, returns
	 * null
	 * 
	 * @param r the reference to be generated with this association generator
	 * @return an AssocationGenerator or null if none is found
	 */
	private AssociationGenerator getAssociationGenerator(EReference r) {
		AssociationGenerator result = null;
		String fieldname = r.getName();
		for (AssociationGenerator ag : getAssociationGenerators())
			if (fieldname.equals(ag.getFieldName())) {
				result = ag;
				break;
			}

		return result;
	}

	/**
	 * Return a default association generator that select up to 3 instances (if
	 * upper bound is != 1)
	 */
	private AssociationGenerator getDefaultAssociationGenerator(EReference r) {

		AssociationGenerator result = DatasampleFactory.eINSTANCE.createAssociationGenerator();
		result.setStructuralFeature(r);
		result.setFieldName(r.getName());
		result.setNumber(Math.max(3, r.getUpperBound()));

		// Child generator must be inside this object
		// getChildGenerators().add(result);

		return result;
	}

	/**
	 * Find the child generator and return a default one if none found
	 * 
	 * @param r the EReference
	 * @return the defined entity generator or null if none
	 */
	private ChildrenGenerator getChildGenerator(EReference r) {
		ChildrenGenerator result = null;
		String refName = r.getEReferenceType().getName();

		for (ChildrenGenerator g : getChildGenerators()) {
			if (refName.equals(g.getFieldName())) {
				result = g;
				break;
			}
		}
		return result;
	}

	/** Return a default entity generator that creates 3 instances or a polymorphic if type is abstract */
	private ChildrenGenerator getDefaultChildGenerator(EReference r) {

		ChildrenGenerator result = null;

		// Create a polymorphic  generator when the type of composition is abstract
		if (r.getEReferenceType().isAbstract()) {
			result = DatasampleFactory.eINSTANCE.createPolymorphicChildrenGenerator();

		} else {
			result = DatasampleFactory.eINSTANCE.createChildrenGenerator();
			result.setNumber(3);
		}

		// Child generator must be inside this object
		getChildGenerators().add(result);

		result.setStructuralFeature(r);
		result.setFieldName(r.getName());


		return result;
	}

	/** Remember of all instances created to use them for associations */
	private void remindInstance(EObject o) {
		if (o == null)
			return;
		String cname = o.eClass().getName();
		List<EObject> objects = availableObjects.get(cname);
		if (objects == null) {
			objects = new ArrayList<>();
			availableObjects.put(cname, objects);
		}
		objects.add(o);
	}

	public DataSample getDataSample() {
		EObject result = eContainer();
		while ((result != null) && (!(result instanceof DataSample))) {
			result = result.eContainer();
		}

		if (result == null)
			DSLogger.error("Error : no data sample found for EntityGenerator" + toString());

		return (DataSample) result;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "EntityGenerator for " + getEntityName() + " will generate " + getNumber() + " instances.";
	}
}
