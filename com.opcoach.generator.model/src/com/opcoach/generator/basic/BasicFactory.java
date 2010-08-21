/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.generator.basic;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.opcoach.generator.basic.BasicPackage
 * @generated
 */
public interface BasicFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasicFactory eINSTANCE = com.opcoach.generator.basic.impl.BasicFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Boolean Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Generator</em>'.
	 * @generated
	 */
	BooleanGenerator createBooleanGenerator();

	/**
	 * Returns a new object of class '<em>Date Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Generator</em>'.
	 * @generated
	 */
	DateGenerator createDateGenerator();

	/**
	 * Returns a new object of class '<em>Double Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Double Generator</em>'.
	 * @generated
	 */
	DoubleGenerator createDoubleGenerator();

	/**
	 * Returns a new object of class '<em>Float Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Float Generator</em>'.
	 * @generated
	 */
	FloatGenerator createFloatGenerator();

	/**
	 * Returns a new object of class '<em>ID Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ID Generator</em>'.
	 * @generated
	 */
	IDGenerator createIDGenerator();

	/**
	 * Returns a new object of class '<em>Int Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int Generator</em>'.
	 * @generated
	 */
	IntGenerator createIntGenerator();

	/**
	 * Returns a new object of class '<em>Long Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Long Generator</em>'.
	 * @generated
	 */
	LongGenerator createLongGenerator();

	/**
	 * Returns a new object of class '<em>Null Value Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Null Value Generator</em>'.
	 * @generated
	 */
	NullValueGenerator createNullValueGenerator();

	/**
	 * Returns a new object of class '<em>String Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Generator</em>'.
	 * @generated
	 */
	StringGenerator createStringGenerator();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BasicPackage getBasicPackage();

} //BasicFactory
