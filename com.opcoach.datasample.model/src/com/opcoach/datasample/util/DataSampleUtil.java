package com.opcoach.datasample.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.opcoach.datasample.FieldGenerator;
import com.opcoach.datasample.impl.GenerationCatalog;

public class DataSampleUtil {

	
	/** Return a set of direct subclasses of an EClass */
	public static Set<EClass> getSubClasses(EClass c)
	{
		Set<EClass> result = new HashSet<>();
		c.getEPackage().getEClassifiers().forEach((cl) -> { 
			if (cl instanceof EClass)
			{
				EClass cp = (EClass) cl;
				if (cp.getEAllSuperTypes().contains(c))
					result.add(cp);
			}
		} );
		
		return result;
	
	}
	
/*	public static List<EClassifier> getSortedClasses(EPackage p) {
		Set<EClassifier> result = new HashSet<>();
		
		
		// Sort the list of dsgenClass (less referenced before...)
		List<EClassifier> dest = new ArrayList<>();
		for (EClassifier c : p.getEClassifiers())
			dest.add(c);
		
		Collections.sort(dest, new ClassifierComparator());
		
		System.out.println("------ Sorted list -----");
		for (EClassifier c : dest)
			System.out.println(" Class = " + c.getName());
		System.out.println("------ Sorted list -----");
		
		return dest;
	} */

	/** Compute the list of direct ECLass for child for an Eclass
	 * 
	 * @param c the class to search for
	 * @return a list of subclasses found in composition. Abstract classes are not returned.
	 *   Compute the subclasses for them. 
	 */
	public static Set<EClass> getChildrenClasses(EClass c) {
		Set<EClass> result = new HashSet<>();
		
		// Sort the list of dsgenClass (less referenced before...)
		for (EReference r : c.getEAllContainments())
		{
			EClassifier refType = r.getEType();
			if (refType instanceof EClass)
			{
				EClass rc = (EClass) refType; 
				if (!rc.isAbstract())
					result.add(rc);
				else
				{
					// Compute abstract subclasses
					Set<EClass> subc = getSubClasses(rc);
					result.addAll(subc);
				}
			}
		}
		
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
	public static void generateAndSetValue(EObject targetObject, EStructuralFeature sf, FieldGenerator fg,
			GenerationCatalog gcat) {

		if ((targetObject == null) || (fg == null))
			return;

		Object generated = fg.generateValue(gcat);

		if (generated == null)
			return; // If nothing is generated, nothing to setup

		Object valueToSet = generated;

		if (!sf.isMany() && (fg.isMany() && generated instanceof List<?>)) {
			// generated is a list.. must keep the first element
			List<?> childList = (List<?>) generated;
			valueToSet = (childList == null || childList.isEmpty()) ? null : childList.get(0);
		}
		if (sf.isMany() && fg.getNumber() == 1) {
			// generated is an EObject, must create a list with it ...
			valueToSet = Arrays.asList(generated);
		}

		// At this point, valueToSet is either a List or an EObject
		try {
			targetObject.eSet(sf, valueToSet);
		} catch (Exception e) {
			DSLogger.error("Unable to set value on " + sf.getName(), e);
		}

	}

	/**
	 * This method returns the list of EClass expected as Children for a given
	 * rootClass
	 * 
	 * @param p   the main package where all the classifiers are defined
	 * @param cla a class for which there could be some children classes
	 * @return a set of EClass that can be used as children for cla
	 */
	public static Set<EClass> getExpectedChildren(EPackage p, EClass cla) {
		Set<EClass> result = new HashSet<>();

		// Sort the list of dsgenClass (less referenced before...)
		List<EClassifier> dest = new ArrayList<>();
		for (EClassifier c : p.getEClassifiers())
			dest.add(c);

		Collections.sort(dest, new ClassifierComparator());

		System.out.println("------ Sorted list -----");
		for (EClassifier c : dest)
			System.out.println(" Class = " + c.getName());
		System.out.println("------ Sorted list -----");

		getExpectedChildren(cla, result);

		return result;
	}

	public static void getExpectedChildren(EClass c, Set<EClass> result) {

		if (result.contains(c))
			return;

		for (EClass ec : getFirstLevelTypes(c)) {
			if (!result.contains(ec) && !ec.isAbstract()) {
				result.add(ec);
				getExpectedChildren(ec, result);
			}

			for (EClass sc : DataSampleUtil.getSubClasses(ec))
				if (!result.contains(sc) && !sc.isAbstract()) {
					result.add(ec);
					getExpectedChildren(ec, result);
				}

		}

	}

	/**
	 * Get all EClass contained in EReference types at first level of current EClass
	 * 
	 * @param c the class to be analyzed
	 * @return the EReferences types used by this EClass at first level
	 */
	private static Collection<EClass> getFirstLevelTypes(EClass c) {
		Collection<EClass> result = new ArrayList<>();

		System.out.println(" --> Eclass " + c.getName() + " refers to ");
		for (EReference ref : c.getEAllReferences()) {
			EClass refType = ref.getEReferenceType();
			System.out.println("         * " + refType.getName()
					+ ((result.contains(refType) ? " present" : " not present -> Add it")));
			if (!result.contains(refType))
				result.add(refType);
		}

		return result;
	}


}
