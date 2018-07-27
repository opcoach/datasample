// ------------------------------------------------
// OPCoach Training Projects
// � OPCoach 2010 http://www.opcoach.com
// ------------------------------------------------

package com.opcoach.datasample.util;

import java.util.Comparator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EReference;



/**
 * Compare 2 EClass EClass is bound to the corresponding eCore class EClasses who has no relations are sorted before EClasses with the most relations to other classes are sorted at the end
 * 
 * @author olivier
 */
public class ClassifierComparator implements Comparator<EClassifier>
{

	/*
	 * (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	public int compare(EClassifier o1, EClassifier o2)
	{	
		
		// Try to sort EEnum
		EEnum e1 = (o1 instanceof EEnum) ? (EEnum) o1 :  null;
		EEnum e2 = (o2 instanceof EEnum) ? (EEnum) o2 :  null;
		if (e1 != null)
		{
			return (e2 != null) ? (e1.getName().compareTo(e2.getName())) : -1;
			
		}
		if (e2 != null)
		{
			return (e1 != null) ? (e1.getName().compareTo(e2.getName())) : 1;
		}

		
		// Try to sort EDataType
		EDataType d1 = (o1 instanceof EDataType) ? (EDataType) o1 :  null;
		EDataType d2 = (o2 instanceof EDataType) ? (EDataType) o2 :  null;
		if (d1 != null)
		{
			return (d2 != null) ? (d1.getName().compareTo(d2.getName())) : -1;
			
		}
		if (d2 != null)
		{
			return (d1 != null) ? (d1.getName().compareTo(d2.getName())) : 1;
		}
		

		// Try to sort 2 EClass and their ecore classes
		EClass c1 = (EClass) o1;
		EClass c2 = (EClass) o2;

		System.out.println("--> Comparing " + c1.getName() + " with " + c2.getName());

		// If c1 is composed of c2, c2 is sorted before
		// If c1 refer to c2 by association, c2 is sorted before
		// Composition is stronger than association (-> for opposite we keep composition)
		// else sort is done by name
		if (isComposedOf(c1,c2))
		{
			System.out.println("   " + c1.getName() + " is composed of " + c2.getName());
			return 1;
		}
		
		if (isComposedOf(c2,c1))
		{
			System.out.println("   " + c2.getName() + " is composed of " + c1.getName());
			return  -1;
		}
		
		
		int nbConnectionsFromC1ToC2 = countConnectionsTo(c1, c2);
		int nbConnectionsFromC2ToC1 = countConnectionsTo(c2, c1);
		
		if ((nbConnectionsFromC1ToC2 == 0) && (nbConnectionsFromC2ToC1 == 0))
		{
			// No link between the two classes... Return string order
			return c1.getName().compareTo(c2.getName());
		}
		
		// Is c1 bound to c2 ?
		if ((nbConnectionsFromC1ToC2 > 0) && (nbConnectionsFromC2ToC1 == 0))
		{
			// C2 is referenced by C1 => C2 < C1  => returns 1 
			System.out.println("   " + c1.getName() + " has " + nbConnectionsFromC1ToC2 + " connections to " + c2.getName()  + "-> " + c1.getName() + " must be before");

			return 1;
		}
		
		// Is c2 bound to c1 ? 
		if ((nbConnectionsFromC2ToC1 > 0) && (nbConnectionsFromC1ToC2 == 0))
		{
			// C1 is referenced by C2 => C1 < C2  => returns -1
			System.out.println("   " + c2.getName() + " has " + nbConnectionsFromC2ToC1 + " connections to " + c1.getName() + "-> " + c2.getName() + " must be after");
			return -1;
		}
		
		// Both of them are connected... put before the less references
		return nbConnectionsFromC1ToC2 - nbConnectionsFromC2ToC1;
		

		

	}

	/**
	 * @return the number of references from a source EClass to a target EClass or
	 * its subclasses. 0 if none.
	 * @param c1 the source EClass
	 * @param c2 the target eclass
	 * @return
	 */
	private int countConnectionsTo(EClass c1, EClass c2)
	{
		int result = 0;
		for (EReference ref : c1.getEReferences())
		{
			EClassifier target = ref.getEType();
			if (target instanceof EClass)
			{
				EClass targetEClass = (EClass) target;
				if (targetEClass.equals(c2) || c2.isSuperTypeOf(targetEClass))
				{
					result++;
				}
			}
		}

		return result;

	}

	/**
	 * @return true if c1 is composed of c2
	 * @param c1 the source EClass
	 * @param c2 the target eclass
	 * @return
	 */
	private boolean isComposedOf(EClass cl1, EClass cl2)
	{
		boolean result = false;
		
		for (EReference ref : cl1.getEAllContainments())
		{
			EClassifier target = ref.getEType();
			if ((ref.isContainment() &&  (target instanceof EClass)))
			{
				EClass targetEClass = (EClass) target;
				if (targetEClass.equals(cl2) || cl2.isSuperTypeOf(targetEClass)) {
					result = true;
					System.out.println(cl1.getName() + " is composed of " + cl2.getName());
					break;
				}
			}
			}
		

		return result;

	}

}
