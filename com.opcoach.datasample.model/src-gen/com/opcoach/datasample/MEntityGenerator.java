/**
 */
package com.opcoach.datasample;

import com.opcoach.generator.ValueGenerator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.opcoach.datasample.MEntityGenerator#getNumber <em>Number</em>}</li>
 *   <li>{@link com.opcoach.datasample.MEntityGenerator#getEntityName <em>Entity Name</em>}</li>
 *   <li>{@link com.opcoach.datasample.MEntityGenerator#getEntity <em>Entity</em>}</li>
 *   <li>{@link com.opcoach.datasample.MEntityGenerator#getFieldGenerators <em>Field Generators</em>}</li>
 * </ul>
 *
 * @see com.opcoach.datasample.MDatasamplePackage#getEntityGenerator()
 * @model
 * @generated
 */
public interface MEntityGenerator extends ValueGenerator<EObject> {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see com.opcoach.datasample.MDatasamplePackage#getEntityGenerator_Number()
	 * @model
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link com.opcoach.datasample.MEntityGenerator#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Name</em>' attribute.
	 * @see #setEntityName(String)
	 * @see com.opcoach.datasample.MDatasamplePackage#getEntityGenerator_EntityName()
	 * @model
	 * @generated
	 */
	String getEntityName();

	/**
	 * Sets the value of the '{@link com.opcoach.datasample.MEntityGenerator#getEntityName <em>Entity Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Name</em>' attribute.
	 * @see #getEntityName()
	 * @generated
	 */
	void setEntityName(String value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(EClass)
	 * @see com.opcoach.datasample.MDatasamplePackage#getEntityGenerator_Entity()
	 * @model
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Sets the value of the '{@link com.opcoach.datasample.MEntityGenerator#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(EClass value);

	/**
	 * Returns the value of the '<em><b>Field Generators</b></em>' containment reference list.
	 * The list contents are of type {@link com.opcoach.datasample.FieldGenerator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Generators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Generators</em>' containment reference list.
	 * @see com.opcoach.datasample.MDatasamplePackage#getEntityGenerator_FieldGenerators()
	 * @model containment="true"
	 * @generated
	 */
	EList<FieldGenerator> getFieldGenerators();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getInstances();

} // MEntityGenerator
