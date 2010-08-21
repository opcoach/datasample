// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2010 http://www.opcoach.com
// ------------------------------------------------

package com.opcoach.generator.ecore.dsgen.helpers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.opcoach.generator.GeneratorFactory;
import com.opcoach.generator.ReferenceGenerator;
import com.opcoach.generator.ValueGenerator;
import com.opcoach.generator.basic.BasicFactory;
import com.opcoach.generator.ecore.dsgen.DSGenAttribute;
import com.opcoach.generator.ecore.dsgen.DSGenClass;
import com.opcoach.generator.ecore.dsgen.DSGenFeature;
import com.opcoach.generator.ecore.dsgen.DSGenPackage;
import com.opcoach.generator.ecore.dsgen.DSGenReference;
import com.opcoach.generator.ecore.dsgen.DataSampleGenFactory;

/**
 * An helper class to manage Data Sample Generation models. Will probably be moved in dsgenmodel
 * 
 * @author olivier
 */
public class DSGenHelper
{
	private static BasicFactory generatorFactory = BasicFactory.eINSTANCE;

	/**
	 * Create a DSGenPackage from an EPackage
	 * 
	 * @param rootPackage the initial package used to create
	 * @return a datasample generation package
	 */
	public static DSGenPackage createDSGenPackage(EPackage rootPackage)
	{
		// Intermediate array list of dsgen class that will be sorted before added in package
		ArrayList<DSGenClass> classes = new ArrayList<DSGenClass>();
		
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
			}
		}
		
		// Sort the list of dsgenClass
	     Collections.sort(classes, new DSGenClassComparator());
	     
		// Add all in package
		dsPack.getDsgenClassifiers().addAll(classes);

		return dsPack;
	}

	/**
	 * Create a DSGenClass from an EClass
	 * 
	 * @param rootClass the initial class used to create
	 * @return a datasample generation class
	 */
	public static DSGenClass createDSGenClass(EClass rootClass)
	{
		DataSampleGenFactory factory = DataSampleGenFactory.eINSTANCE;

		DSGenClass dscl = factory.createDSGenClass();
		dscl.setEcoreClass((EClass) rootClass);
		dscl.setInstanceNumber(50);
		Collection<DSGenFeature> features = dscl.getDsgenFeatures();

		for (EStructuralFeature sf : rootClass.getEStructuralFeatures() )
		{

			DSGenFeature dsf = null;
			if (sf instanceof EAttribute)
			{
				dsf = createDSGenAttribute((EAttribute) sf);
			}
			else if (sf instanceof EReference)
			{
				dsf = createDSGenReference((EReference) sf);
			}
			System.out.println("Add this ds feature : " + sf.getName());
			features.add(dsf);

		}

		return dscl;
	}

	/**
	 * Create a DSGenAttribute from an EAttribute
	 * 
	 * @param rootAttr the initial Attribute used to create
	 * @return a datasample generation class
	 */
	public static DSGenAttribute createDSGenAttribute(EAttribute rootAttr)
	{
		DataSampleGenFactory factory = DataSampleGenFactory.eINSTANCE;

		DSGenAttribute result = factory.createDSGenAttribute();
		result.setEcoreFeature(rootAttr);
		
		// Add the generator according to the field type...
		EDataType dt =  (rootAttr.getEAttributeType());
		
		ValueGenerator<?> gen = getGeneratorFromType(dt);
		result.setGenerator(gen);
		
		return result;
	}

	/**
	 * Create a DSGenAttribute from an EAttribute
	 * 
	 * @param rootAttr the initial Attribute used to create
	 * @return a datasample generation class
	 */
	public static DSGenReference createDSGenReference(EReference rootRef)
	{
		DataSampleGenFactory factory = DataSampleGenFactory.eINSTANCE;
		DSGenReference result = factory.createDSGenReference();

		result.setEcoreFeature(rootRef);
		
		// Set the generator.
		EClass target = rootRef.getEReferenceType();
		ReferenceGenerator<?> refGen = GeneratorFactory.eINSTANCE.createReferenceGenerator();
		refGen.setType(target.getInstanceClass());
		result.setGenerator(refGen);
		

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
		}
		else if (DATE_TYPE.equals(typeName))
		{
			result = generatorFactory.createDateGenerator();

		}
		else if (INT_TYPE.equals(typeName) || INT_OBJECT_TYPE.equals(typeName))
		{
			result = generatorFactory.createIntGenerator();

		}
		else if (LONG_TYPE.equals(typeName) || LONG_OBJECT_TYPE.equals(typeName))
		{
			result = generatorFactory.createLongGenerator();

		}
		else if (FLOAT_TYPE.equals(typeName) || FLOAT_OBJECT_TYPE.equals(typeName))
		{
			result = generatorFactory.createFloatGenerator();

		}
		else if (DOUBLE_TYPE.equals(typeName) || DOUBLE_OBJECT_TYPE.equals(typeName))
		{
			result = generatorFactory.createDoubleGenerator();

		}
		 return result;
		
	}

}
