/**
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
public class MBasicFactoryImpl extends EFactoryImpl implements MBasicFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MBasicFactory init()
	{
		try
		{
			MBasicFactory theBasicFactory = (MBasicFactory)EPackage.Registry.INSTANCE.getEFactory(MBasicPackage.eNS_URI);
			if (theBasicFactory != null)
			{
				return theBasicFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MBasicFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MBasicFactoryImpl()
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
			case MBasicPackage.BOOLEAN_GENERATOR: return createBooleanGenerator();
			case MBasicPackage.DATE_GENERATOR: return createDateGenerator();
			case MBasicPackage.DOUBLE_GENERATOR: return createDoubleGenerator();
			case MBasicPackage.FLOAT_GENERATOR: return createFloatGenerator();
			case MBasicPackage.ID_GENERATOR: return createIDGenerator();
			case MBasicPackage.INT_GENERATOR: return createIntGenerator();
			case MBasicPackage.LONG_GENERATOR: return createLongGenerator();
			case MBasicPackage.NULL_VALUE_GENERATOR: return createNullValueGenerator();
			case MBasicPackage.STRING_GENERATOR: return createStringGenerator();
			case MBasicPackage.TRUE_GENERATOR: return createTrueGenerator();
			case MBasicPackage.FALSE_GENERATOR: return createFalseGenerator();
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
			case MBasicPackage.CASE_POLICY_TYPE:
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
			case MBasicPackage.CASE_POLICY_TYPE:
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
	public MBooleanGenerator createBooleanGenerator()
	{
		MBooleanGeneratorImpl booleanGenerator = new MBooleanGeneratorImpl();
		return booleanGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDateGenerator createDateGenerator()
	{
		MDateGeneratorImpl dateGenerator = new MDateGeneratorImpl();
		return dateGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDoubleGenerator createDoubleGenerator()
	{
		MDoubleGeneratorImpl doubleGenerator = new MDoubleGeneratorImpl();
		return doubleGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MFloatGenerator createFloatGenerator()
	{
		MFloatGeneratorImpl floatGenerator = new MFloatGeneratorImpl();
		return floatGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MIDGenerator createIDGenerator()
	{
		MIDGeneratorImpl idGenerator = new MIDGeneratorImpl();
		return idGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MIntGenerator createIntGenerator()
	{
		MIntGeneratorImpl intGenerator = new MIntGeneratorImpl();
		return intGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MLongGenerator createLongGenerator()
	{
		MLongGeneratorImpl longGenerator = new MLongGeneratorImpl();
		return longGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MNullValueGenerator createNullValueGenerator()
	{
		MNullValueGeneratorImpl nullValueGenerator = new MNullValueGeneratorImpl();
		return nullValueGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MStringGenerator createStringGenerator()
	{
		MStringGeneratorImpl stringGenerator = new MStringGeneratorImpl();
		return stringGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTrueGenerator createTrueGenerator()
	{
		MTrueGeneratorImpl trueGenerator = new MTrueGeneratorImpl();
		return trueGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MFalseGenerator createFalseGenerator()
	{
		MFalseGeneratorImpl falseGenerator = new MFalseGeneratorImpl();
		return falseGenerator;
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
	public MBasicPackage getBasicPackage()
	{
		return (MBasicPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MBasicPackage getPackage()
	{
		return MBasicPackage.eINSTANCE;
	}

} //MBasicFactoryImpl
