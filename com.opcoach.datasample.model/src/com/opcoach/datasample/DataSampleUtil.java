package com.opcoach.datasample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;

import com.opcoach.datasample.util.ClassifierComparator;

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
	
	public static List<EClassifier> getSortedClasses(EPackage p) {
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
	}

}
