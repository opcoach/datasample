package com.opcoach.datasample.impl;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import com.opcoach.datasample.EntityGenerator;
import com.opcoach.datasample.PolymorphicChildrenGenerator;

// This class overrides the generated class and will be instantiated by factory
public class PolymorphicChildrenGeneratorImpl extends MPolymorphicChildrenGeneratorImpl
		implements PolymorphicChildrenGenerator {

	@Override
	public int getNumber() {
		int result = 0;
		for (EntityGenerator cg : getChildrenGenerators())
			result += cg.getNumber();
		return result;
	}


	/**
	 * Generate values for all the expected children polymorphic types. It must
	 * generate a list of instances or only one instance depending on the number of
	 * expected children.
	 * 
	 * @return if number is == 1 it returns an EObject, if number is more than 1 it
	 *         returns a list<EObject>
	 */
	@Override
	public Object generateValue(GenerationCatalog gcat) {
		
		if (getChildrenGenerators().isEmpty())
			return super.generateValue(gcat);

		ArrayList<EObject> children = new ArrayList<>();
		for (EntityGenerator eg : getChildrenGenerators()) {
			children.addAll(eg.generateValues(gcat));
		}

		return children;

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
			for (EntityGenerator eg : getChildrenGenerators())
			{
				if (r.getEReferenceType().isSuperTypeOf(eg.getEntity()))
					return true;
			}

		return false;
		
	}
	
	
	

}
