/**
 */
package com.opcoach.datasample;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.opcoach.datasample.MDatasamplePackage
 * @generated
 */
public interface MDatasampleFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MDatasampleFactory eINSTANCE = com.opcoach.datasample.impl.MDatasampleFactoryImpl.init();

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
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Association Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Association Generator</em>'.
	 * @generated
	 */
	AssociationGenerator createAssociationGenerator();

	/**
	 * Returns a new object of class '<em>Children Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Children Generator</em>'.
	 * @generated
	 */
	ChildrenGenerator createChildrenGenerator();

	/**
	 * Returns a new object of class '<em>Polymorphic Children Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Polymorphic Children Generator</em>'.
	 * @generated
	 */
	PolymorphicChildrenGenerator createPolymorphicChildrenGenerator();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MDatasamplePackage getDatasamplePackage();

} //MDatasampleFactory
