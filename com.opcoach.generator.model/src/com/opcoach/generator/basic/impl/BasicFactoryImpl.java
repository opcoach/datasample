/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.generator.basic.impl;

import com.opcoach.generator.basic.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
	@Override
	public Object createFromString(EDataType eDataType, String initialValue)
	{
		switch (eDataType.getClassifierID())
		{
			case BasicPackage.CASE_POLICY_TYPE:
				return createCasePolicyTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue)
	{
		switch (eDataType.getClassifierID())
		{
			case BasicPackage.CASE_POLICY_TYPE:
				return convertCasePolicyTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
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
	public CasePolicyType createCasePolicyTypeFromString(EDataType eDataType, String initialValue)
	{
		CasePolicyType result = CasePolicyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCasePolicyTypeToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
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

	@Override
	public BooleanGenerator createBooleanGenerator(String id)
	{
		BooleanGenerator g = createBooleanGenerator();
		g.setID(id);
		return g;
	}

	@Override
	public DateGenerator createDateGenerator(String id)
	{
		DateGenerator g = createDateGenerator();
		g.setID(id);
		return g;

	}

	@Override
	public DoubleGenerator createDoubleGenerator(String id)
	{
		DoubleGenerator g = createDoubleGenerator();
		g.setID(id);
		return g;

	}

	@Override
	public FloatGenerator createFloatGenerator(String id)
	{
		FloatGenerator g = createFloatGenerator();
		g.setID(id);
		return g;

	}

	@Override
	public IDGenerator createIDGenerator(String id)
	{
		IDGenerator g = createIDGenerator();
		g.setID(id);
		return g;

	}

	@Override
	public IntGenerator createIntGenerator(String id)
	{
		IntGenerator g = createIntGenerator();
		g.setID(id);
		return g;

	}

	@Override
	public LongGenerator createLongGenerator(String id)
	{
		LongGenerator g = createLongGenerator();
		g.setID(id);
		return g;

	}

	@Override
	public NullValueGenerator createNullValueGenerator(String id)
	{
		NullValueGenerator g = createNullValueGenerator();
		g.setID(id);
		return g;

	}

	@Override
	public StringGenerator createStringGenerator(String id)
	{
		StringGenerator g = createStringGenerator();
		g.setID(id);
		return g;

	}

} //BasicFactoryImpl
