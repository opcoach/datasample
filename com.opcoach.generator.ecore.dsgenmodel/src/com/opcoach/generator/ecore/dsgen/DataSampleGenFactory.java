/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.generator.ecore.dsgen;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.opcoach.generator.ecore.dsgen.DataSampleGenPackage
 * @generated
 */
public interface DataSampleGenFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataSampleGenFactory eINSTANCE = com.opcoach.generator.ecore.dsgen.impl.DataSampleGenFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>DS Gen Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DS Gen Model</em>'.
	 * @generated
	 */
	DSGenModel createDSGenModel();

	/**
	 * Returns a new object of class '<em>DS Gen Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DS Gen Package</em>'.
	 * @generated
	 */
	DSGenPackage createDSGenPackage();

	/**
	 * Returns a new object of class '<em>DS Gen Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DS Gen Class</em>'.
	 * @generated
	 */
	DSGenClass createDSGenClass();

	/**
	 * Returns a new object of class '<em>DS Gen Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DS Gen Feature</em>'.
	 * @generated
	 */
	DSGenFeature createDSGenFeature();

	/**
	 * Returns a new object of class '<em>DS Gen Enum Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DS Gen Enum Literal</em>'.
	 * @generated
	 */
	DSGenEnumLiteral createDSGenEnumLiteral();

	/**
	 * Returns a new object of class '<em>DS Gen Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DS Gen Data Type</em>'.
	 * @generated
	 */
	DSGenDataType createDSGenDataType();

	/**
	 * Returns a new object of class '<em>DS Gen Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DS Gen Annotation</em>'.
	 * @generated
	 */
	DSGenAnnotation createDSGenAnnotation();

	/**
	 * Returns a new object of class '<em>DS Gen Type Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DS Gen Type Parameter</em>'.
	 * @generated
	 */
	DSGenTypeParameter createDSGenTypeParameter();

	/**
	 * Returns a new object of class '<em>DS Gen Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DS Gen Attribute</em>'.
	 * @generated
	 */
	DSGenAttribute createDSGenAttribute();

	/**
	 * Returns a new object of class '<em>DS Gen Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DS Gen Reference</em>'.
	 * @generated
	 */
	DSGenReference createDSGenReference();

	/**
	 * Returns a new object of class '<em>DS Gen Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DS Gen Enum</em>'.
	 * @generated
	 */
	DSGenEnum createDSGenEnum();

	/**
	 * Returns a new object of class '<em>DS Gen Child</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DS Gen Child</em>'.
	 * @generated
	 */
	DSGenChild createDSGenChild();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DataSampleGenPackage getDataSampleGenPackage();

} //DataSampleGenFactory
