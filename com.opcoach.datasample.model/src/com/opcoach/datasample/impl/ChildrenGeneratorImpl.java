package com.opcoach.datasample.impl;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import com.opcoach.datasample.ChildrenGenerator;
import com.opcoach.datasample.EntityGenerator;

// This class overrides the generated class and will be instantiated by factory
/**
 * Children generator generates a list of children (depending on 'Number'
 * value), or a single child
 */
public class ChildrenGeneratorImpl extends MChildrenGeneratorImpl implements ChildrenGenerator {

	@Override
	public int getNumber() {
		int result = 0;
		for (EntityGenerator cg : getChildrenGenerators())
			result += cg.getNumber();
		return result;
	}

	@Override
	public Object generateValue() {
		throw new UnsupportedOperationException("Must call generateValue with a GenerationCatalog");
	}

	/**
	 * Generate value for children must generate a list of instances or only one
	 * instance depending on the number of expected children.
	 * 
	 * @return if number is == 1 it returns an EObject, if number is more than 1 it
	 *         returns a list<EObject>
	 */
	@Override
	public Object generateValue(GenerationCatalog gcat) {
		// We must use a delegated entity generator to instantiate any child.
		Object result = null;

		if (getEReference().getUpperBound() == 1) {
			// Generate only 1 value using the first generator if any
			if (!getChildrenGenerators().isEmpty())
			{
				EntityGenerator gen = getChildrenGenerators().get(0);
				result = gen.generateValue(gcat);
			}
		} else {
			// Generate all values for all children generators.
			ArrayList<EObject> children = new ArrayList<>();
			for (EntityGenerator eg : getChildrenGenerators()) {
				children.addAll(eg.generateValues(gcat));
			}
			result = children;

		}

		return result;

	}

	@Override
	public String toString() {
		EntityGenerator eg = (EntityGenerator) eContainer;
		StringBuilder sb = new StringBuilder("ChildrenGenerator for ").append(eg.getEntityName()).append(".")
				.append(getFieldName());
		sb.append("\n The children reference has a polymorphic type. This children generator contains : ");
		for (EntityGenerator cg : getChildrenGenerators()) {
			sb.append("\n For type : ").append(cg.getEntityName()).append(" use : ").append(cg);
		}

		return sb.toString();

	}

	@Override
	public boolean canGenerate(EReference r) {

		// Must search for the generator in the possible generators
		for (EntityGenerator eg : getChildrenGenerators()) {
			if (r.getEReferenceType().isSuperTypeOf(eg.getEntity()))
				return true;
		}

		return false;

	}

}
