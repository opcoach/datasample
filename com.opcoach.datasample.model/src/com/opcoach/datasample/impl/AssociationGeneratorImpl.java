package com.opcoach.datasample.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.ecore.EObject;

import com.opcoach.datasample.AssociationGenerator;
import com.opcoach.datasample.util.DSLogger;
import com.opcoach.generator.GeneratorFactory;
import com.opcoach.generator.ReferenceGenerator;
import com.opcoach.generator.ValueGenerator;

// This class overrides the generated class and will be instantiated by factory
public class AssociationGeneratorImpl extends MAssociationGeneratorImpl implements AssociationGenerator {

	@Override
	public ReferenceGenerator<EObject> getGenerator() {
		Object result = (ValueGenerator<EObject>) super.getGenerator();
		if (result == null || !(result instanceof ReferenceGenerator)) {

			DSLogger.warning("Warning : the associated generator for " + getStructuralFeature().toString()
					+ " is not a reference generator -> OVERRIDEN WITH CORRECT GENERATOR");
			ReferenceGenerator<EObject> refgen = GeneratorFactory.eINSTANCE.createReferenceGenerator();
			result = refgen;
			setGenerator(refgen);
		}
		return (ReferenceGenerator<EObject>) result;
	}

	@Override
	public void setValues(Collection<EObject> possibleValues) {
		ReferenceGenerator<EObject> refgen = getGenerator();
		if (possibleValues != null)
			refgen.setValues(possibleValues);
		else
			DSLogger.warning("Association values are null when setting generator for : " + getStructuralFeature());

	}

	/**
	 * @return if number is == 1 it returns an EObject, if number is more than 1 it
	 *         returns a list<EObject>
	 */
	@Override
	public Object generateValue() {
		// We must use a delegated entity generator to instantiate any child.
		Object result = null;
		int childnumber = getNumber();
		ValueGenerator<EObject> gen = getGenerator();

		if (gen != null) {
			if (childnumber == 1)
				result = gen.generateValue();
			else {
				ArrayList<EObject> children = new ArrayList<>(getNumber());
				// Must generate a list of children
				for (int i = 0; i < childnumber; i++) {
					EObject child = gen.generateValue();
					if (child != null)
						children.add(child);
				}
				result = children;
			}
		}

		return result;

	}

}
