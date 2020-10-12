package com.opcoach.datasample.impl;

import java.util.ArrayList;
import java.util.Collection;

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
import com.opcoach.datasample.util.DataSampleUtil;

// This class overrides the generated class and will be instantiated by factory
public class EntityGeneratorImpl extends MEntityGeneratorImpl implements EntityGenerator {

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
		throw new UnsupportedOperationException("Must call generateValue with a GenerationCatalog");
	}

	@Override
	public EObject generateValue(GenerationCatalog gcat) {
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
				DataSampleUtil.generateAndSetValue(result, a, fg, gcat);

			}
		}

		// Then create reference values.

		// ---------------------------------------------------------------------
		// First of all create compositions (to know objects for associations)
		// ---------------------------------------------------------------------
		for (EReference r : target.getEAllReferences()) {
			if (r.isContainment() && r.isChangeable()) {
				ChildrenGenerator childGen = getChildGenerator(r);
				DataSampleUtil.generateAndSetValue(result, r, childGen, gcat);

			}
		}

		// ---------------------------------------------------------------------
		// Just setup association generators, but do not yet generate (see
		// bindAssociations in GenerationCatalog
		// ---------------------------------------------------------------------
		for (EReference r : target.getEAllReferences()) {
			if (!r.isContainment() && r.isChangeable()) {

				AssociationGenerator ag = getAssociationGenerator(r);
				if (!(ag instanceof AssociationGenerator)) {
					DSLogger.warning("The generator for reference " + r.getName() + " in EClass "
							+ ((EClass) r.eContainer()).getName() + " should be an AssociationGenerator");
					ag = null;
				}

			}
		}

		// we must remind of all child instances for later associations
		if (result != null)
			gcat.registerObject(result, this);

		return result;
	}

	@Override
	public Collection<EObject> generateValues(GenerationCatalog gcat) {
		Collection<EObject> result = new ArrayList<>();
		for (int i = 0; i < getNumber(); i++)
			result.add(generateValue(gcat));
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

		return result;
	}

	/**
	 * Find the child generator and return a default one if none found
	 * 
	 * @param r the EReference
	 * @return the defined entity generator or null if none
	 */
	private ChildrenGenerator getChildGenerator(EReference r) {

		for (ChildrenGenerator g : getChildrenGenerators()) {
			if (g.canGenerate(r)) {
				if (g.getStructuralFeature() == null)
					g.setStructuralFeature(r);
				return g;
			}
		}

		return getDefaultChildrenGenerator(r);
	}

	/**
	 * Return a default entity generator that creates 1 instances or a polymorphic
	 * if type is abstract                            
	 */
	private ChildrenGenerator getDefaultChildrenGenerator(EReference r) {

		ChildrenGenerator result = null;

		result = DatasampleFactory.eINSTANCE.createChildrenGenerator();
		result.setNumber(1);

		// Child generator belongs to this entity generator.
		getChildrenGenerators().add(result);
		result.setStructuralFeature(r);

		// Must create a default entity generator for this child. 
	/*	EntityGenerator defaultEntityGen = DatasampleFactory.eINSTANCE.createEntityGenerator();
		EClass classToGenerate = r.getEReferenceType();
		if (classToGenerate.isAbstract())
		{
			// Set up the first subclass to be generated... 
			Set<EClass> subClasses = DataSampleUtil.getSubClasses(classToGenerate);
			if (!subClasses.isEmpty())
				defaultEntityGen.setEntity(subClasses.stream().findFirst().get());
		}
		else
		{
			defaultEntityGen.setEntity(classToGenerate);

		}
		defaultEntityGen.setNumber(1);
		result.getChildrenGenerators().add(defaultEntityGen);
		*/

		return result;
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
