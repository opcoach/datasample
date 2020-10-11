package com.opcoach.datasample.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import com.opcoach.datasample.AssociationGenerator;
import com.opcoach.datasample.DataSampleUtil;
import com.opcoach.datasample.EntityGenerator;
import com.opcoach.datasample.util.DataSampleHelper;

/**
 * Generation Catalog contains all objects created during generation. There is
 * only one catalog for the root object generation. It is used to bind all the
 * associations once all objects have been created.
 */
public class GenerationCatalog {

	/**
	 * Entity Generator must globally remind of all child instances created so as to
	 * be able to set associations values Key : EClass name, value : list of all
	 * instances available for this type
	 */
	private Map<EClass, List<EObject>> availableObjects = new WeakHashMap<>();

	/**
	 * For each EObject created, we must remind of all the association generators to
	 * call after all objects have been generated Must store generators for each
	 * object, because association generator may have different parameters depending
	 * on their level
	 */
	private Map<EObject, List<AssociationGenerator>> instancesToBind = new WeakHashMap<>();

	public void registerObject(EObject o, EntityGenerator gen) {
		// First remember of the instance in the main object table.
		List<EObject> objects = availableObjects.get(o.eClass());
		if (objects == null) {
			objects = new ArrayList<>();
			availableObjects.put(o.eClass(), objects);
		}
		objects.add(o);

		// Then store association generators if any...
		if (!gen.getAssociationGenerators().isEmpty())
			instancesToBind.put(o, gen.getAssociationGenerators());
	}

	/**
	 * This method binds all generated objects together, using the association
	 * generators
	 */
	public void bindAssociations() {

		// Iterate on all objects to bind, setup the possible values and generate the
		// values..
		instancesToBind.entrySet().stream().forEach((e) -> bindObject(e.getKey(), e.getValue()));

	}

	/**
	 * This method bind an object with its environment, following the association
	 * generator definitions
	 */
	private void bindObject(EObject object, List<AssociationGenerator> generators) {

		for (AssociationGenerator ag : generators) {
			// First refer to the possible objects to be bound to
			EClass targetClass = ag.getEReference().getEReferenceType();
			List<EObject> possibleValues = new ArrayList<>();

			List<EObject> existingObjects = availableObjects.get(targetClass);
			if (existingObjects != null)
				possibleValues.addAll(existingObjects);

			// Then try to find also instances that are compliant with the expected target
			// type.
			for (EClass c : DataSampleUtil.getSubClasses(targetClass)) {
				existingObjects = availableObjects.get(c);
				if (existingObjects != null)
					possibleValues.addAll(existingObjects);

			}
			
			// Can set this object list to the generator and generate the value... 
			ag.setValues(possibleValues);
			
			System.out.println("Binding reference '" + ag.getEReference().getName() + "' of object :" + object);

			
			DataSampleHelper.generateAndSetValue(object, ag.getEReference(), ag, null);
		}
	}

}
