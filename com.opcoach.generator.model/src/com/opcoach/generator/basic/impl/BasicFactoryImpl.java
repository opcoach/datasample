/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.generator.basic.impl;

import com.opcoach.generator.basic.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BasicFactoryImpl extends EFactoryImpl implements BasicFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BasicFactory init()
	{
		try
		{
			BasicFactory theBasicFactory = (BasicFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.opcoach.com/generator/basic/1.0"); 
			if (theBasicFactory != null)
			{
				return theBasicFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BasicFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case BasicPackage.BOOLEAN_GENERATOR: return createBooleanGenerator();
			case BasicPackage.DATE_GENERATOR: return createDateGenerator();
			case BasicPackage.DOUBLE_GENERATOR: return createDoubleGenerator();
			case BasicPackage.FLOAT_GENERATOR: return createFloatGenerator();
			case BasicPackage.ID_GENERATOR: return createIDGenerator();
			case BasicPackage.INT_GENERATOR: return createIntGenerator();
			case BasicPackage.LONG_GENERATOR: return createLongGenerator();
			case BasicPackage.NULL_VALUE_GENERATOR: return createNullValueGenerator();
			case BasicPackage.STRING_GENERATOR: return createStringGenerator();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanGenerator createBooleanGenerator()
	{
		BooleanGeneratorImpl booleanGenerator = new BooleanGeneratorImpl();
		return booleanGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateGenerator createDateGenerator()
	{
		DateGeneratorImpl dateGenerator = new DateGeneratorImpl();
		return dateGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleGenerator createDoubleGenerator()
	{
		DoubleGeneratorImpl doubleGenerator = new DoubleGeneratorImpl();
		return doubleGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatGenerator createFloatGenerator()
	{
		FloatGeneratorImpl floatGenerator = new FloatGeneratorImpl();
		return floatGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDGenerator createIDGenerator()
	{
		IDGeneratorImpl idGenerator = new IDGeneratorImpl();
		return idGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntGenerator createIntGenerator()
	{
		IntGeneratorImpl intGenerator = new IntGeneratorImpl();
		return intGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LongGenerator createLongGenerator()
	{
		LongGeneratorImpl longGenerator = new LongGeneratorImpl();
		return longGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullValueGenerator createNullValueGenerator()
	{
		NullValueGeneratorImpl nullValueGenerator = new NullValueGeneratorImpl();
		return nullValueGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringGenerator createStringGenerator()
	{
		StringGeneratorImpl stringGenerator = new StringGeneratorImpl();
		return stringGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicPackage getBasicPackage()
	{
		return (BasicPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BasicPackage getPackage()
	{
		return BasicPackage.eINSTANCE;
	}

} //BasicFactoryImpl