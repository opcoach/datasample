/**
 */
package com.opcoach.generator.basic;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.opcoach.generator.basic.MBasicPackage
 * @generated
 */
public interface MBasicFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MBasicFactory eINSTANCE = com.opcoach.generator.basic.impl.MBasicFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Boolean Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Generator</em>'.
	 * @generated
	 */
	MBooleanGenerator createBooleanGenerator();

	/**
	 * Returns a new object of class '<em>Date Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Generator</em>'.
	 * @generated
	 */
	MDateGenerator createDateGenerator();

	/**
	 * Returns a new object of class '<em>Double Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Double Generator</em>'.
	 * @generated
	 */
	MDoubleGenerator createDoubleGenerator();

	/**
	 * Returns a new object of class '<em>Float Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Float Generator</em>'.
	 * @generated
	 */
	MFloatGenerator createFloatGenerator();

	/**
	 * Returns a new object of class '<em>ID Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ID Generator</em>'.
	 * @generated
	 */
	MIDGenerator createIDGenerator();

	/**
	 * Returns a new object of class '<em>Int Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int Generator</em>'.
	 * @generated
	 */
	MIntGenerator createIntGenerator();

	/**
	 * Returns a new object of class '<em>Long Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Long Generator</em>'.
	 * @generated
	 */
	MLongGenerator createLongGenerator();

	/**
	 * Returns a new object of class '<em>Null Value Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Null Value Generator</em>'.
	 * @generated
	 */
	MNullValueGenerator createNullValueGenerator();

	/**
	 * Returns a new object of class '<em>String Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Generator</em>'.
	 * @generated
	 */
	MStringGenerator createStringGenerator();

	/**
	 * Returns a new object of class '<em>True Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>True Generator</em>'.
	 * @generated
	 */
	MTrueGenerator createTrueGenerator();

	/**
	 * Returns a new object of class '<em>False Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>False Generator</em>'.
	 * @generated
	 */
	MFalseGenerator createFalseGenerator();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MBasicPackage getBasicPackage();

} //MBasicFactory
