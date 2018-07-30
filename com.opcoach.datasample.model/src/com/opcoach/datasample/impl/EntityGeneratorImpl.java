package com.opcoach.datasample.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.opcoach.datasample.DataSample;
import com.opcoach.datasample.DatasampleFactory;
import com.opcoach.datasample.EntityGenerator;
import com.opcoach.datasample.FieldGenerator;
import com.opcoach.datasample.util.DSLogger;
import com.opcoach.generator.GeneratorFactory;
import com.opcoach.generator.ReferenceGenerator;
import com.opcoach.generator.ValueGenerator;

// This class overrides the generated class and will be instantiated by factory
public class EntityGeneratorImpl extends MEntityGeneratorImpl implements EntityGenerator {

	/**
	 * Entity Generator must globally remind of all child instances created so as to
	 * be able to set associations values Key : EClass name, value : list of all
	 * instances available for this type
	 */
	private static Map<String, List<EObject>> availableObjects = new HashMap();

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
		EObject result = target.getEPackage().getEFactoryInstance().create(target);

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
		for (EReference r : target.getEAllContainments()) {
			EntityGenerator childGen = getChildGenerator(r);
			if (childGen == null)
			{
				childGen = getDefaultChildGenerator(r);
				// Bind this generator to its parent
				if (eContainer() instanceof DataSample)
					((DataSample)eContainer()).getEntityGenerators().add(childGen);
			//TBD	else
			//TBD		((EntityGenerator)eContainer()).getChildGenerators().add(childGen);
			}

			// Can now generate as many as expected children.
			List<EObject> children = new ArrayList<>();
			for (int i = 0; i < childGen.getNumber(); i++) {
				EObject child = childGen.generateValue();
				remindInstance(child);
				children.add(child);
			}
			// Can set the EReference value.
			if (r.getUpperBound() == 1) {
				// Only one child, set the first value
				result.eSet(r, children.get(0));
			} else {
				// More than one child
				result.eSet(r, children);
			}
		}

		// ---------------------------------------------------------------------
		// Then can set the association references
		// ---------------------------------------------------------------------
		for (EReference r : target.getEAllContainments()) {
			if (!r.isContainment()) {
				
				FieldGenerator fg = getFieldGenerator(r.getName());
				if (!(fg instanceof ReferenceGenerator<?>)) {
					DSLogger.warning("The generator for reference " + r.getName() + " in EClass "
							+ ((EClass) r.eContainer()).getName() + " should be a reference Generator");
					fg = null;
				}
				
				
				ReferenceGenerator<EObject> refGen = null;
				if (fg != null && fg.getGenerator() instanceof ReferenceGenerator<?>)
					refGen = (ReferenceGenerator<EObject>) fg.getGenerator() ;
				
				if (refGen == null) {
					// Create a default one ! 
					refGen = GeneratorFactory.eINSTANCE.createReferenceGenerator();
					fg.setGenerator(refGen);
				}
				
				refGen.setValues(availableObjects.get(r.getEReferenceType().getName()));
				
				Object value = null;
				if (r.getUpperBound() != 1)
				{
					// Generate some values inside (by default 10)
					List<EObject> association = new ArrayList<EObject>();
					for (int i = 0; i < 10; i++)
					{
						association.add(refGen.generateValue());
					}
					value = association;
					
				}
				else
				{
					value = refGen.generateValue();
				}
				// Can set the value
				result.eSet(r, value);

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
	 * Find the child generator and return a default one if none found
	 * 
	 * @param r the EReference
	 * @return the defined entity generator or null if none
	 */
	private EntityGenerator getChildGenerator(EReference r) {
		EntityGenerator result = null;
		String childType = r.getEReferenceType().getName();

/*		for (EntityGenerator g : getChildGenerators()) {
			if (childType.equals(g.getEntityName())) {
				result = g;
				break;
			}
		}*/
		return result;
	}

	/** Return a default entity generator that creates 10 instances */
	private EntityGenerator getDefaultChildGenerator(EReference r) {

		EntityGenerator result = DatasampleFactory.eINSTANCE.createEntityGenerator();
		result.setEntityName(r.getEReferenceType().getName());
		result.setNumber(10);

		return result;
	}

	/** Remember of all instances created to use them for associations */
	private void remindInstance(EObject o) {
		String cname = o.eClass().getName();
		List<EObject> objects = availableObjects.get(cname);
		if (objects == null) {
			objects = new ArrayList<>();
			availableObjects.put(cname, objects);
		}
		objects.add(o);
	}
	
	private DataSample getDataSample() {
		EObject current = this;
		EObject result = null;
		while ((result == null && current != null && (! (result instanceof DataSample))))
		{
		 result = current.eContainer();
		 current = result;
		}
		
		return (DataSample) result;
	}
}
