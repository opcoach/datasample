/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.generator.ecore.dsgen.util;

import com.opcoach.generator.ecore.dsgen.*;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import com.opcoach.generator.ecore.dsgen.DSGenAnnotation;
import com.opcoach.generator.ecore.dsgen.DSGenAttribute;
import com.opcoach.generator.ecore.dsgen.DSGenBase;
import com.opcoach.generator.ecore.dsgen.DSGenClass;
import com.opcoach.generator.ecore.dsgen.DSGenClassifier;
import com.opcoach.generator.ecore.dsgen.DSGenDataType;
import com.opcoach.generator.ecore.dsgen.DSGenEnum;
import com.opcoach.generator.ecore.dsgen.DSGenEnumLiteral;
import com.opcoach.generator.ecore.dsgen.DSGenFeature;
import com.opcoach.generator.ecore.dsgen.DSGenModel;
import com.opcoach.generator.ecore.dsgen.DSGenPackage;
import com.opcoach.generator.ecore.dsgen.DSGenReference;
import com.opcoach.generator.ecore.dsgen.DSGenTypeParameter;
import com.opcoach.generator.ecore.dsgen.DSGenTypedElement;
import com.opcoach.generator.ecore.dsgen.DataSampleGenPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.opcoach.generator.ecore.dsgen.DataSampleGenPackage
 * @generated
 */
public class DataSampleGenAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DataSampleGenPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSampleGenAdapterFactory() {
		if (modelPackage == null)
		{
			modelPackage = DataSampleGenPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage)
		{
			return true;
		}
		if (object instanceof EObject)
		{
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSampleGenSwitch<Adapter> modelSwitch =
		new DataSampleGenSwitch<Adapter>()
		{
			@Override
			public Adapter caseDSGenModel(DSGenModel object)
			{
				return createDSGenModelAdapter();
			}
			@Override
			public Adapter caseDSGenPackage(DSGenPackage object)
			{
				return createDSGenPackageAdapter();
			}
			@Override
			public Adapter caseDSGenClass(DSGenClass object)
			{
				return createDSGenClassAdapter();
			}
			@Override
			public Adapter caseDSGenFeature(DSGenFeature object)
			{
				return createDSGenFeatureAdapter();
			}
			@Override
			public Adapter caseDSGenBase(DSGenBase object)
			{
				return createDSGenBaseAdapter();
			}
			@Override
			public Adapter caseDSGenEnumLiteral(DSGenEnumLiteral object)
			{
				return createDSGenEnumLiteralAdapter();
			}
			@Override
			public Adapter caseDSGenClassifier(DSGenClassifier object)
			{
				return createDSGenClassifierAdapter();
			}
			@Override
			public Adapter caseDSGenDataType(DSGenDataType object)
			{
				return createDSGenDataTypeAdapter();
			}
			@Override
			public Adapter caseDSGenTypedElement(DSGenTypedElement object)
			{
				return createDSGenTypedElementAdapter();
			}
			@Override
			public Adapter caseDSGenAnnotation(DSGenAnnotation object)
			{
				return createDSGenAnnotationAdapter();
			}
			@Override
			public Adapter caseDSGenTypeParameter(DSGenTypeParameter object)
			{
				return createDSGenTypeParameterAdapter();
			}
			@Override
			public Adapter caseDSGenAttribute(DSGenAttribute object)
			{
				return createDSGenAttributeAdapter();
			}
			@Override
			public Adapter caseDSGenReference(DSGenReference object)
			{
				return createDSGenReferenceAdapter();
			}
			@Override
			public Adapter caseDSGenEnum(DSGenEnum object)
			{
				return createDSGenEnumAdapter();
			}
			@Override
			public Adapter caseDSGenChild(DSGenChild object)
			{
				return createDSGenChildAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object)
			{
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.opcoach.generator.ecore.dsgen.DSGenModel <em>DS Gen Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.opcoach.generator.ecore.dsgen.DSGenModel
	 * @generated
	 */
	public Adapter createDSGenModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.opcoach.generator.ecore.dsgen.DSGenPackage <em>DS Gen Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.opcoach.generator.ecore.dsgen.DSGenPackage
	 * @generated
	 */
	public Adapter createDSGenPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.opcoach.generator.ecore.dsgen.DSGenClass <em>DS Gen Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.opcoach.generator.ecore.dsgen.DSGenClass
	 * @generated
	 */
	public Adapter createDSGenClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.opcoach.generator.ecore.dsgen.DSGenFeature <em>DS Gen Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.opcoach.generator.ecore.dsgen.DSGenFeature
	 * @generated
	 */
	public Adapter createDSGenFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.opcoach.generator.ecore.dsgen.DSGenBase <em>DS Gen Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.opcoach.generator.ecore.dsgen.DSGenBase
	 * @generated
	 */
	public Adapter createDSGenBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.opcoach.generator.ecore.dsgen.DSGenEnumLiteral <em>DS Gen Enum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.opcoach.generator.ecore.dsgen.DSGenEnumLiteral
	 * @generated
	 */
	public Adapter createDSGenEnumLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.opcoach.generator.ecore.dsgen.DSGenClassifier <em>DS Gen Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.opcoach.generator.ecore.dsgen.DSGenClassifier
	 * @generated
	 */
	public Adapter createDSGenClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.opcoach.generator.ecore.dsgen.DSGenDataType <em>DS Gen Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.opcoach.generator.ecore.dsgen.DSGenDataType
	 * @generated
	 */
	public Adapter createDSGenDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.opcoach.generator.ecore.dsgen.DSGenTypedElement <em>DS Gen Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.opcoach.generator.ecore.dsgen.DSGenTypedElement
	 * @generated
	 */
	public Adapter createDSGenTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.opcoach.generator.ecore.dsgen.DSGenAnnotation <em>DS Gen Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.opcoach.generator.ecore.dsgen.DSGenAnnotation
	 * @generated
	 */
	public Adapter createDSGenAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.opcoach.generator.ecore.dsgen.DSGenTypeParameter <em>DS Gen Type Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.opcoach.generator.ecore.dsgen.DSGenTypeParameter
	 * @generated
	 */
	public Adapter createDSGenTypeParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.opcoach.generator.ecore.dsgen.DSGenAttribute <em>DS Gen Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.opcoach.generator.ecore.dsgen.DSGenAttribute
	 * @generated
	 */
	public Adapter createDSGenAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.opcoach.generator.ecore.dsgen.DSGenReference <em>DS Gen Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.opcoach.generator.ecore.dsgen.DSGenReference
	 * @generated
	 */
	public Adapter createDSGenReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.opcoach.generator.ecore.dsgen.DSGenEnum <em>DS Gen Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.opcoach.generator.ecore.dsgen.DSGenEnum
	 * @generated
	 */
	public Adapter createDSGenEnumAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.opcoach.generator.ecore.dsgen.DSGenChild <em>DS Gen Child</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.opcoach.generator.ecore.dsgen.DSGenChild
	 * @generated
	 */
	public Adapter createDSGenChildAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DataSampleGenAdapterFactory
