// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2010 http://www.opcoach.com
// ------------------------------------------------

package com.opcoach.dsgen.core.helpers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.opcoach.dsgen.DSGenAttribute;
import com.opcoach.dsgen.DSGenChild;
import com.opcoach.dsgen.DSGenClass;
import com.opcoach.dsgen.DSGenClassifier;
import com.opcoach.dsgen.DSGenDataType;
import com.opcoach.dsgen.DSGenEnum;
import com.opcoach.dsgen.DSGenFeature;
import com.opcoach.dsgen.DSGenPackage;
import com.opcoach.dsgen.DSGenReference;
import com.opcoach.dsgen.DataSampleGenFactory;
import com.opcoach.generator.GeneratorFactory;
import com.opcoach.generator.RangeGenerator;
import com.opcoach.generator.ReferenceGenerator;
import com.opcoach.generator.ValueGenerator;
import com.opcoach.generator.basic.BasicFactory;

/**
 * An helper class to manage Data Sample Generation models. Will probably be
 * moved in dsgenmodel
 * 
 * @author olivier
 */
public class DSGenHelper
{
	private static BasicFactory generatorFactory = BasicFactory.eINSTANCE;
	
	private static Map<EReference, DSGenReference> refCache = new HashMap<EReference, DSGenReference>();

	/**
	 * Create a DSGenPackage from an EPackage
	 * 
	 * @param rootPackage
	 *            the initial package used to create
	 * @return a datasample generation package
	 */
	public static DSGenPackage createDSGenPackage(EPackage rootPackage)
	{
		// Intermediate array list of dsgen class that will be sorted before
		// added in package
		ArrayList<DSGenClassifier> classes = new ArrayList<DSGenClassifier>();

		// Creer le modèle dsgen en parcourant le modèle lu
		DataSampleGenFactory factory = DataSampleGenFactory.eINSTANCE;
		DSGenPackage dsPack = factory.createDSGenPackage();
		dsPack.setEcorePackage(rootPackage);
		for (EClassifier ec : rootPackage.getEClassifiers())
		{
			if (ec instanceof EClass)
			{
				DSGenClass dscl = createDSGenClass((EClass) ec);
				classes.add(dscl);
			} else if (ec instanceof EEnum)
			{
				DSGenEnum dsen = createDSGenEnum((EEnum) ec);
				classes.add(dsen);

			} else if (ec instanceof EDataType)
			{
				DSGenDataType dst = createDSGenDataType((EDataType) ec);
				classes.add(dst);
			}
		}

		// Then compute the nb of associations refering to each EClass 
		for (DSGenClassifier dsc : classes)
		{
			if (dsc instanceof DSGenClass)
			{
				computeNbAssociationReferencesTo((DSGenClass) dsc, classes);
			}
		}

		// Sort the list of dsgenClass (less referenced before...)
		Collections.sort(classes, new DSGenClassifierComparator());

		// With the sort algorithm, the last class is the root object.
		DSGenClass rootClass = (DSGenClass) classes.get(classes.size() - 1);
		rootClass.setRootObject(true);

		// Add all in package
		dsPack.getDsgenClassifiers().addAll(classes);
		
		// Initialize children field
		for (DSGenClassifier dsc : classes)
		{
			if (dsc instanceof DSGenClass)
			{
				initChildren((DSGenClass) dsc);
			}
		}


		return dsPack;
	}

	/**
	 * @return the number of association references to dsc, looping on the
	 *         classes list.
	 * @param dsc
	 *            : the dsgenclass that is computing the nb of association to
	 *            itself
	 * @param classes
	 *            : the list of other EClasses to loop on
	 * @return nothing (init directly the nbAssociationRefTo field in dsc)
	 */
	private static void computeNbAssociationReferencesTo(DSGenClass dsc,
			ArrayList<DSGenClassifier> classes)
	{

		EClass dsEcoreClass = dsc.getEcoreClass();
		int nbAssoRef = 0;
		for (DSGenClassifier c : classes)
		{
			if ((c instanceof DSGenClass) && (c != dsc))
			{
				for (EReference ref : c.getEcoreClass().getEReferences())
				{
					EClassifier target = ref.getEType();
					if ((target instanceof EClass) && !ref.isContainment())
					{
						EClass targetEClass = (EClass) target;
						if (targetEClass.equals(dsEcoreClass)
								|| dsEcoreClass.isSuperTypeOf(targetEClass))
						{
							System.out.println("The class "
									+ c.getEcoreClass().getName()
									+ " refer to source DSC : "
									+ dsEcoreClass.getName() + " on field : "
									+ ref.getName());
							nbAssoRef++;
						}
					}
				}
			}
		}

		dsc.setNbAssociationRefTo(nbAssoRef);

	}

	/**
	 * Create a DSGenClass from an EClass
	 * 
	 * @param rootClass
	 *            the initial class used to create
	 * @return a datasample generation class
	 */
	public static DSGenClass createDSGenClass(EClass rootClass)
	{
		DataSampleGenFactory factory = DataSampleGenFactory.eINSTANCE;

		DSGenClass dscl = factory.createDSGenClass();
		dscl.setEcoreClass((EClass) rootClass);
		dscl.setInstanceNumber(50); // Default but for main object will be 1.
		Collection<DSGenFeature> features = dscl.getDsgenFeatures();

		for (EStructuralFeature sf : rootClass.getEStructuralFeatures())
		{

			DSGenFeature dsf = null;
			if (sf instanceof EAttribute)
			{
				dsf = createDSGenAttribute((EAttribute) sf);
			} else if (sf instanceof EReference)
			{
				EReference ref = (EReference) sf;
				dsf = createDSGenReference(ref);
			}
			System.out.println("Add this ds feature : " + sf.getName());
			features.add(dsf);

		}

		return dscl;
	}

	/**
	 * Init children for an DSGenClass
	 * 
	 * @param rootClass
	 *            the initial class used to create
	 * @return a datasample generation class
	 */
	public static void initChildren(DSGenClass gClass)
	{
		DSGenPackage pack = gClass.getDsgenPackage();
		EClass rootClass = gClass.getEcoreClass();
		for (EStructuralFeature sf : rootClass.getEStructuralFeatures())
		{
			if (sf instanceof EReference)
			{
				EReference ref = (EReference) sf;
				if (ref.isContainment())
				{
					String targetName = ref.getEType().getName();
					DSGenClass c = searchDSGenClass(pack, targetName);
					
					DSGenChild child = DataSampleGenFactory.eINSTANCE.createDSGenChild();
					child.setDsgenClass(c);
					child.setSingle((ref.getUpperBound() == 1));
					EReference opp = ref.getEOpposite();
					child.setOppositeReference((opp == null) ? null : refCache.get(opp));
					child.setSourceReference(refCache.get(ref));
					gClass.getChildren().add(child);
				}
			}

		}
	}

	private static Map<String, DSGenClass> genClassMap = null;

	public static DSGenClass searchDSGenClass(DSGenPackage pack, String name)
	{
		if (genClassMap == null)
		{
			genClassMap = new HashMap<String, DSGenClass>();
			// Init map
			for (DSGenClassifier dc : pack.getDsgenClassifiers())
			{
				if (dc instanceof DSGenClass)
					genClassMap.put(dc.getEcoreClass().getName(), (DSGenClass) dc);
			}
		}
		
		return genClassMap.get(name);
	}

	/**
	 * Create a DSGenEnum from an EEnum
	 * 
	 * @param rootEnum
	 *            the initial enum used to create
	 * @return a datasample generation class
	 */
	public static DSGenEnum createDSGenEnum(EEnum rootEnum)
	{
		DataSampleGenFactory factory = DataSampleGenFactory.eINSTANCE;

		DSGenEnum dsen = factory.createDSGenEnum();
		dsen.setEcoreEnum((EEnum) rootEnum);

		return dsen;
	}

	/**
	 * Create a DSGenDataType from an EDataType
	 * 
	 * @param rootDataType
	 *            the initial dataType used to create
	 * @return a datasample generation class
	 */
	public static DSGenDataType createDSGenDataType(EDataType rootDataType)
	{
		DataSampleGenFactory factory = DataSampleGenFactory.eINSTANCE;

		DSGenDataType dsdt = factory.createDSGenDataType();
		dsdt.setDataType((EDataType) rootDataType);

		return dsdt;
	}

	/**
	 * Create a DSGenAttribute from an EAttribute
	 * 
	 * @param rootAttr
	 *            the initial Attribute used to create
	 * @return a datasample generation class
	 */
	public static DSGenAttribute createDSGenAttribute(EAttribute rootAttr)
	{
		DataSampleGenFactory factory = DataSampleGenFactory.eINSTANCE;

		DSGenAttribute result = factory.createDSGenAttribute();
		result.setEcoreFeature(rootAttr);

		// Add the generator according to the field type...
		EDataType dt = (rootAttr.getEAttributeType());

		ValueGenerator<?> gen = getGeneratorFromType(dt);
		result.setGenerator(gen);

		return result;
	}

	/**
	 * Create a DSGenAttribute from an EAttribute
	 * 
	 * @param rootAttr
	 *            the initial Attribute used to create
	 * @return a datasample generation class
	 */
	public static DSGenReference createDSGenReference(EReference rootRef)
	{
		DataSampleGenFactory factory = DataSampleGenFactory.eINSTANCE;
		DSGenReference result = factory.createDSGenReference();

		result.setEcoreFeature(rootRef);

		// Set the generator.
		EClass target = rootRef.getEReferenceType();
		ReferenceGenerator<?> refGen = GeneratorFactory.eINSTANCE
				.createReferenceGenerator();
		refGen.setType(target.getInstanceClass());
		result.setGenerator(refGen);
		
		// Store it in a cache...
		refCache.put(rootRef, result);

		return result;
	}

	// May be these constants are already defined somewhere ?
	private static final String STRING_TYPE = "EString";
	private static final String INT_TYPE = "EInt";
	private static final String INT_OBJECT_TYPE = "EInteger";
	private static final String LONG_TYPE = "ELong";
	private static final String LONG_OBJECT_TYPE = "ELongObject";
	private static final String FLOAT_TYPE = "EFloat";
	private static final String FLOAT_OBJECT_TYPE = "EFLoatObject";
	private static final String DOUBLE_TYPE = "EDouble";
	private static final String DOUBLE_OBJECT_TYPE = "EDoubleObject";
	private static final String DATE_TYPE = "EDate";

	private static ValueGenerator<?> getGeneratorFromType(EDataType dt)
	{
		String typeName = dt.getName();
		ValueGenerator<?> result = null;

		if (STRING_TYPE.equals(typeName))
		{
			result = generatorFactory.createStringGenerator();
		} else if (DATE_TYPE.equals(typeName))
		{
			result = generatorFactory.createDateGenerator();

		} else if (INT_TYPE.equals(typeName)
				|| INT_OBJECT_TYPE.equals(typeName))
		{
			result = generatorFactory.createIntGenerator();

		} else if (LONG_TYPE.equals(typeName)
				|| LONG_OBJECT_TYPE.equals(typeName))
		{
			result = generatorFactory.createLongGenerator();

		} else if (FLOAT_TYPE.equals(typeName)
				|| FLOAT_OBJECT_TYPE.equals(typeName))
		{
			result = generatorFactory.createFloatGenerator();

		} else if (DOUBLE_TYPE.equals(typeName)
				|| DOUBLE_OBJECT_TYPE.equals(typeName))
		{
			result = generatorFactory.createDoubleGenerator();

		}
		return result;

	}

	public static boolean isContainment(EStructuralFeature sf)
	{
		return ((sf instanceof EReference) && ((EReference) sf).isContainment());
	}

	public static boolean isMultipleRelation(EStructuralFeature sf)
	{
		if (!(sf instanceof EReference))
			return false;

		EReference ref = (EReference) sf;
		boolean val = (ref.getUpperBound() > 1) || (ref.getUpperBound() == -1);
		// System.out.println("Valeur de isMultipleRelation pour sf " +
		// ref.getName() + " upper = " + ref.getUpperBound() + "  value = " +
		// val);
		return val;
	}

	public static boolean isOpposite(EStructuralFeature sf)
	{
		if (sf instanceof EAttribute)
			return false;

		EReference ref = (EReference) sf;
		EReference refOpp = ref.getEOpposite();

		System.out.println("Ref " + ref.getName() + " est il opposite de "
				+ ((refOpp == null) ? "none" : refOpp.getName()));
		return (!ref.isContainment() && (refOpp != null)
				&& refOpp.isContainment() && (refOpp.getEOpposite() == ref));
	}

}
