/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.generator.ecore.dsgen.impl;

import com.opcoach.generator.ecore.dsgen.*;

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
public class DataSampleGenFactoryImpl extends EFactoryImpl implements DataSampleGenFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataSampleGenFactory init()
	{
		try {
			DataSampleGenFactory theDataSampleGenFactory = (DataSampleGenFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.opcoach.com/dsgen/1.0"); 
			if (theDataSampleGenFactory != null) {
				return theDataSampleGenFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DataSampleGenFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSampleGenFactoryImpl()
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
		switch (eClass.getClassifierID()) {
			case DataSampleGenPackage.DS_GEN_MODEL: return createDSGenModel();
			case DataSampleGenPackage.DS_GEN_PACKAGE: return createDSGenPackage();
			case DataSampleGenPackage.DS_GEN_CLASS: return createDSGenClass();
			case DataSampleGenPackage.DS_GEN_FEATURE: return createDSGenFeature();
			case DataSampleGenPackage.DS_GEN_ENUM_LITERAL: return createDSGenEnumLiteral();
			case DataSampleGenPackage.DS_GEN_DATA_TYPE: return createDSGenDataType();
			case DataSampleGenPackage.DS_GEN_ANNOTATION: return createDSGenAnnotation();
			case DataSampleGenPackage.DS_GEN_TYPE_PARAMETER: return createDSGenTypeParameter();
			case DataSampleGenPackage.DS_GEN_ATTRIBUTE: return createDSGenAttribute();
			case DataSampleGenPackage.DS_GEN_REFERENCE: return createDSGenReference();
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
		switch (eDataType.getClassifierID()) {
			case DataSampleGenPackage.DS_GEN_RUNTIME_VERSION:
				return createDSGenRuntimeVersionFromString(eDataType, initialValue);
			case DataSampleGenPackage.DS_GEN_JDK_LEVEL:
				return createDSGenJDKLevelFromString(eDataType, initialValue);
			case DataSampleGenPackage.DS_GEN_DELEGATION_KIND:
				return createDSGenDelegationKindFromString(eDataType, initialValue);
			case DataSampleGenPackage.DS_GEN_PROPERTY_KIND:
				return createDSGenPropertyKindFromString(eDataType, initialValue);
			case DataSampleGenPackage.DS_GEN_RESOURCE_KIND:
				return createDSGenResourceKindFromString(eDataType, initialValue);
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
		switch (eDataType.getClassifierID()) {
			case DataSampleGenPackage.DS_GEN_RUNTIME_VERSION:
				return convertDSGenRuntimeVersionToString(eDataType, instanceValue);
			case DataSampleGenPackage.DS_GEN_JDK_LEVEL:
				return convertDSGenJDKLevelToString(eDataType, instanceValue);
			case DataSampleGenPackage.DS_GEN_DELEGATION_KIND:
				return convertDSGenDelegationKindToString(eDataType, instanceValue);
			case DataSampleGenPackage.DS_GEN_PROPERTY_KIND:
				return convertDSGenPropertyKindToString(eDataType, instanceValue);
			case DataSampleGenPackage.DS_GEN_RESOURCE_KIND:
				return convertDSGenResourceKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSGenModel createDSGenModel()
	{
		DSGenModelImpl dsGenModel = new DSGenModelImpl();
		return dsGenModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSGenPackage createDSGenPackage()
	{
		DSGenPackageImpl dsGenPackage = new DSGenPackageImpl();
		return dsGenPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSGenClass createDSGenClass()
	{
		DSGenClassImpl dsGenClass = new DSGenClassImpl();
		return dsGenClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSGenFeature createDSGenFeature()
	{
		DSGenFeatureImpl dsGenFeature = new DSGenFeatureImpl();
		return dsGenFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSGenEnumLiteral createDSGenEnumLiteral()
	{
		DSGenEnumLiteralImpl dsGenEnumLiteral = new DSGenEnumLiteralImpl();
		return dsGenEnumLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSGenDataType createDSGenDataType()
	{
		DSGenDataTypeImpl dsGenDataType = new DSGenDataTypeImpl();
		return dsGenDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSGenAnnotation createDSGenAnnotation()
	{
		DSGenAnnotationImpl dsGenAnnotation = new DSGenAnnotationImpl();
		return dsGenAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSGenTypeParameter createDSGenTypeParameter()
	{
		DSGenTypeParameterImpl dsGenTypeParameter = new DSGenTypeParameterImpl();
		return dsGenTypeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSGenAttribute createDSGenAttribute()
	{
		DSGenAttributeImpl dsGenAttribute = new DSGenAttributeImpl();
		return dsGenAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSGenReference createDSGenReference()
	{
		DSGenReferenceImpl dsGenReference = new DSGenReferenceImpl();
		return dsGenReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSGenRuntimeVersion createDSGenRuntimeVersionFromString(EDataType eDataType, String initialValue)
	{
		DSGenRuntimeVersion result = DSGenRuntimeVersion.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDSGenRuntimeVersionToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSGenJDKLevel createDSGenJDKLevelFromString(EDataType eDataType, String initialValue)
	{
		DSGenJDKLevel result = DSGenJDKLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDSGenJDKLevelToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSGenDelegationKind createDSGenDelegationKindFromString(EDataType eDataType, String initialValue)
	{
		DSGenDelegationKind result = DSGenDelegationKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDSGenDelegationKindToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSGenPropertyKind createDSGenPropertyKindFromString(EDataType eDataType, String initialValue)
	{
		DSGenPropertyKind result = DSGenPropertyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDSGenPropertyKindToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSGenResourceKind createDSGenResourceKindFromString(EDataType eDataType, String initialValue)
	{
		DSGenResourceKind result = DSGenResourceKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDSGenResourceKindToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSampleGenPackage getDataSampleGenPackage()
	{
		return (DataSampleGenPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DataSampleGenPackage getPackage()
	{
		return DataSampleGenPackage.eINSTANCE;
	}

} //DataSampleGenFactoryImpl
