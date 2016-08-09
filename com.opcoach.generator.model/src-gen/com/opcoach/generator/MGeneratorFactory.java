/**
 */
package com.opcoach.generator;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.opcoach.generator.MGeneratorPackage
 * @generated
 */
public interface MGeneratorFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MGeneratorFactory eINSTANCE = com.opcoach.generator.impl.MGeneratorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Reference Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Generator</em>'.
	 * @generated
	 */
	<T> MReferenceGenerator<T> createReferenceGenerator();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MGeneratorPackage getGeneratorPackage();

} //MGeneratorFactory
