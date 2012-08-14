/**
 * © OPCoach 2012
 */
package com.opcoach.dsgen.generator;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.opcoach.dsgen.generator.DSGenGeneratorPackage
 * @generated
 */
public interface DSGenGeneratorFactory extends EFactory
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "© OPCoach 2012";

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DSGenGeneratorFactory eINSTANCE = com.opcoach.dsgen.generator.impl.DSGenGeneratorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>EObject Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EObject Generator</em>'.
	 * @generated
	 */
	EObjectGenerator createEObjectGenerator();

	/**
	 * Returns a new object of class '<em>Children Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Children Generator</em>'.
	 * @generated
	 */
	ChildrenGenerator createChildrenGenerator();

	/**
	 * Returns a new object of class '<em>Single Association Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Association Generator</em>'.
	 * @generated
	 */
	SingleAssociationGenerator createSingleAssociationGenerator();

	/**
	 * Returns a new object of class '<em>Multiple Association Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiple Association Generator</em>'.
	 * @generated
	 */
	MultipleAssociationGenerator createMultipleAssociationGenerator();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DSGenGeneratorPackage getDSGenGeneratorPackage();

} //DSGenGeneratorFactory
