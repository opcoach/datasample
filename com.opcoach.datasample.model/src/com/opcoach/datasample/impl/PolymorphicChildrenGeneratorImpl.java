package com.opcoach.datasample.impl;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.opcoach.datasample.ChildrenGenerator;
import com.opcoach.datasample.DatasampleFactory;
import com.opcoach.datasample.EntityGenerator;
import com.opcoach.datasample.PolymorphicChildrenGenerator;
import com.opcoach.generator.ValueGenerator;

// This class overrides the generated class and will be instantiated by factory
public class PolymorphicChildrenGeneratorImpl extends MPolymorphicChildrenGeneratorImpl
		implements PolymorphicChildrenGenerator {

	@Override
	public int getNumber() {
		int result = 0;
		for (ChildrenGenerator cg : getChildrenGenerators())
			result += cg.getNumber();
		return result;
	}

	@Override
	public EList<ChildrenGenerator> getChildrenGenerators() {
		if (childrenGenerators == null) {
			childrenGenerators = super.getChildrenGenerators();

			for (EntityGenerator eg : getDataSample().getEntityGenerators()) {
				EClass abstractType = getEReference().getEReferenceType();
				if (abstractType.isSuperTypeOf(eg.getEntity())) {
					// This entity generator is compliant with the polymorphic type
					// Create a child generator for it...
					ChildrenGenerator cg = DatasampleFactory.eINSTANCE.createChildrenGenerator();

					// Must create a sub entity generator (delegated entity generator is a
					// composition)
					EntityGenerator deg = DatasampleFactory.eINSTANCE.createEntityGenerator();
					deg.setEntityName(eg.getEntityName());
					deg.setNumber(10); // By default create 10 objects of this type
					cg.setDelegatedEntityGenerator(deg);
					childrenGenerators.add(cg);
				}

			}
		}
		return childrenGenerators;
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
	public Object generateValue() {

		ArrayList<EObject> children = new ArrayList<>();
		for (ChildrenGenerator cg : getChildrenGenerators()) {
			if (cg.getNumber() == 1)
				children.add((EObject) cg.generateValue());
			else {
				// Result of generation is a list of EObject
				ArrayList<EObject> generated = (ArrayList<EObject>) cg.generateValue();
				for (EObject o : generated) {
					children.add(o);
				}
			}
		}
		return children;

	}

	@Override
	public String toString() {
		EntityGenerator eg = (EntityGenerator) eContainer;
		StringBuilder sb = new StringBuilder("ChildrenGenerator for ").append(eg.getEntityName()).append(".")
				.append(getFieldName());
		sb.append("\n The children reference has a polymorphic type. This children generator contains : ");
		for (ChildrenGenerator cg : getChildrenGenerators()) {
			ValueGenerator<?> gen = cg.getGenerator();
			String genDesc = (gen == null) ? " NO GENERATOR FOUND (will use default)" : gen.getDescription();
			sb.append("\n For type : ").append(cg.getParentEntityName()).append(" use : ").append(genDesc);
		}

		return sb.toString();

	}

}
