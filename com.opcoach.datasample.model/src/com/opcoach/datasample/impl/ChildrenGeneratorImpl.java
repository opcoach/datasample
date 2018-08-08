package com.opcoach.datasample.impl;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EObject;

import com.opcoach.datasample.ChildrenGenerator;
import com.opcoach.datasample.DatasampleFactory;
import com.opcoach.datasample.EntityGenerator;
import com.opcoach.datasample.util.DSLogger;
import com.opcoach.generator.ValueGenerator;

// This class overrides the generated class and will be instantiated by factory
/**
 * Children generator generates a list of children (depending on 'Number'
 * value), or a single child
 */
public class ChildrenGeneratorImpl extends MChildrenGeneratorImpl implements ChildrenGenerator {

	/**
	 * Generate value for children must generate a list of instances or only one
	 * instance depending on the number of expected children.
	 * 
	 * @return if number is == 1 it returns an EObject, if number is more than 1 it
	 *         returns a list<EObject>
	 */
	@Override
	public Object generateValue() {
		// We must use a delegated entity generator to instantiate any child.
		Object result = null;
		int childnumber = getNumber();
		EntityGenerator deg = getDelegatedEntityGenerator();
		if (deg != null) {
			if (childnumber == 1)
				result = deg.generateValue();
			else {
				ArrayList<EObject> children = new ArrayList<>(getNumber());
				// Must generate a list of children
				for (int i = 0; i < childnumber; i++) {
					EObject child = deg.generateValue();
					children.add(child);
				}
				result = children;
			}
		}

		return result;

	}

	/**
	 * use the described entity generator to instanciate a child or create a default
	 * one
	 */
	public EntityGenerator getDelegatedEntityGenerator() {
		EntityGenerator result = super.getDelegatedEntityGenerator();
		if (result == null) {
			// create the default one but only if it is not recursive...
			String entityName = getStructuralFeature().getEType().getName();
			if (!entityName.equals(((EntityGenerator) eContainer).getEntityName())) {
				result = DatasampleFactory.eINSTANCE.createEntityGenerator();
				result.setEntityName(entityName);
				setDelegatedEntityGenerator(result);
			}
		}
		return result;
	}

	@Override
	public String getFieldName() {
		String result = super.getFieldName();
		if (result == null) {
			if (getStructuralFeature() == null)
				DSLogger.warning("Should check why structural Feature is null here " + toString());
			else
				result = getStructuralFeature().getName();
		}
		return result;
	}

	@Override
	public String toString() {
		EntityGenerator eg = (EntityGenerator) eContainer;
		StringBuilder sb = new StringBuilder("ChildrenGenerator for ").append(eg.getEntityName()).append(".")
				.append(getFieldName());
		ValueGenerator<?> gen = getGenerator();
		sb.append(
				"\n Generator : " + ((gen == null) ? " NO GENERATOR FOUND (will use default)" : gen.getDescription()));

		return sb.toString();

	}

}
