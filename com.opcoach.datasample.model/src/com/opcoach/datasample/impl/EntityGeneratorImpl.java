package com.opcoach.datasample.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

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
		// System.out.println("Return EClass : " + result + " for entity name " +
		// getEntityName());
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
			if (a.isChangeable()) {

				FieldGenerator fg = getFieldGenerator(a);
				generateAndSetValue(result, a, fg);

			}
		}

		// Then create reference values.

		// ---------------------------------------------------------------------
		// First of all create compositions (to know objects for associations)
		// ---------------------------------------------------------------------
		for (EReference r : target.getEAllReferences()) {
			if (r.isContainment() && r.isChangeable()) {
				ChildrenGenerator childGen = getChildGenerator(r);
				generateAndSetValue(result, r, childGen);

			}
		}

		// ---------------------------------------------------------------------
		// Then can set the association references
		// ---------------------------------------------------------------------
		for (EReference r : target.getEAllReferences()) {
			if (!r.isContainment() && r.isChangeable()) {

				AssociationGenerator ag = getAssociationGenerator(r);
				if (!(ag instanceof AssociationGenerator)) {
					DSLogger.warning("The generator for reference " + r.getName() + " in EClass "
							+ ((EClass) r.eContainer()).getName() + " should be an AssociationGenerator");
					ag = null;
				}

				String targetType = r.getEReferenceType().getName();
				ag.setValues(availableObjects.get(targetType));

				generateAndSetValue(result, r, ag);

			}
		}

		// we must remind of all child instances for later associations
		if (result != null)
			remindInstance(result);

		return result;
	}

	/**
	 * Generate a value using a generator and set this value on the
	 * StructuralFeature of current instance.
	 *
	 * 
	 * @param targetObject : the EObject that must be set
	 * @param sf           : the EStructural feature to setup
	 * @param fg           : the field generator to use to generate the value
	 */
	private void generateAndSetValue(EObject targetObject, EStructuralFeature sf, FieldGenerator fg) {

		if ((targetObject == null) || (fg == null))
			return;

		Object generated = fg.generateValue();
		
		if (generated == null) return;  // If nothing is generated, nothing to setup
		
		Object valueToSet = generated;

		if (!sf.isMany() && (fg.isMany())) {
			// generated is a list.. must keep the first element
			List<?> childList = (List<?>) generated;
			valueToSet = (childList == null || childList.isEmpty()) ? null : childList.get(0);
		}
		if (sf.isMany() && fg.getNumber() == 1) {
			// generated is an EObject, must create a list with it ...
			valueToSet = Arrays.asList(generated);
		}

		try {
			if (valueToSet != null)
				targetObject.eSet(sf, valueToSet);
		} catch (Exception e) {
			DSLogger.error("Unable to set value on " + sf.getName(), e);
		}

	}

	@Override
	public Collection<EObject> generateValues() {
		Collection<EObject> result = new ArrayList<>();
		for (int i = 0; i < getNumber(); i++)
			result.add(generateValue());
		return result;
	}

	private FieldGenerator getFieldGenerator(EAttribute a) {

		String aName = a.getName();
		for (FieldGenerator fg : getFieldGenerators())
			if (aName.equals(fg.getFieldName())) {
				// Setup structural feature if null
				if (fg.getStructuralFeature() == null)
					fg.setStructuralFeature(a);
				return fg;
			}

		return getDefaultFieldGenerator(a);
	}

	private FieldGenerator getDefaultFieldGenerator(EAttribute a) {
		FieldGenerator result = DatasampleFactory.eINSTANCE.createFieldGenerator();
		result.setStructuralFeature(a);
		result.setNumber(a.getUpperBound());

		// Child generator must be inside this entity generator
		getFieldGenerators().add(result);

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
		String fieldname = r.getName();
		for (AssociationGenerator ag : getAssociationGenerators())
			if (fieldname.equals(ag.getFieldName())) {
				if (ag.getStructuralFeature() == null)
					ag.setStructuralFeature(r);
				return ag;
			}

		return getDefaultAssociationGenerator(r);
	}

	/**
	 * Return a default association generator that select up to 3 instances (if
	 * upper bound is != 1)
	 */
	private AssociationGenerator getDefaultAssociationGenerator(EReference r) {

		AssociationGenerator result = DatasampleFactory.eINSTANCE.createAssociationGenerator();
		result.setStructuralFeature(r);
		result.setNumber(Math.max(3, r.getUpperBound()));

		// Child generator belongs to this entity generator
		getAssociationGenerators().add(result);

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

		for (ChildrenGenerator g : getChildGenerators()) {
			if (g.canGenerate(r)) {
				if (g.getStructuralFeature() == null)
					g.setStructuralFeature(r);
				return g;
			}
		}

		return getDefaultChildGenerator(r);
	}

	/**
	 * Return a default entity generator that creates 1 instances or a polymorphic
	 * if type is abstract
	 */
	private ChildrenGenerator getDefaultChildGenerator(EReference r) {

		ChildrenGenerator result = null;

		// Create a polymorphic generator when the type of composition is abstract
		if (r.getEReferenceType().isAbstract()) {
			result = DatasampleFactory.eINSTANCE.createPolymorphicChildrenGenerator();

		} else {
			result = DatasampleFactory.eINSTANCE.createChildrenGenerator();
			result.setNumber(1);
		}

		// Child generator belongs to this entity generator.
		getChildGenerators().add(result);

		result.setStructuralFeature(r);

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
