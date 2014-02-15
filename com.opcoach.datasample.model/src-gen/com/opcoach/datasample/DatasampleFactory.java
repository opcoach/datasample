/**
 */
package com.opcoach.datasample;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.opcoach.datasample.DatasamplePackage
 * @generated
 */
public interface DatasampleFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatasampleFactory eINSTANCE = com.opcoach.datasample.impl.DatasampleFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Data Sample</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Sample</em>'.
	 * @generated
	 */
	DataSample createDataSample();

	/**
	 * Returns a new object of class '<em>Entity Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Generator</em>'.
	 * @generated
	 */
	EntityGenerator createEntityGenerator();

	/**
	 * Returns a new object of class '<em>Field Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Generator</em>'.
	 * @generated
	 */
	FieldGenerator createFieldGenerator();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DatasamplePackage getDatasamplePackage();

} //DatasampleFactory
