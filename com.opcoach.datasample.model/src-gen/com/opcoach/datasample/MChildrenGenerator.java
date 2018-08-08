/**
 */
package com.opcoach.datasample;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Children Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.opcoach.datasample.MChildrenGenerator#getDelegatedEntityGenerator <em>Delegated Entity Generator</em>}</li>
 * </ul>
 *
 * @see com.opcoach.datasample.MDatasamplePackage#getChildrenGenerator()
 * @model
 * @generated
 */
public interface MChildrenGenerator extends FieldGenerator {

	/**
	 * Returns the value of the '<em><b>Delegated Entity Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegated Entity Generator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegated Entity Generator</em>' containment reference.
	 * @see #setDelegatedEntityGenerator(EntityGenerator)
	 * @see com.opcoach.datasample.MDatasamplePackage#getChildrenGenerator_DelegatedEntityGenerator()
	 * @model containment="true"
	 * @generated
	 */
	EntityGenerator getDelegatedEntityGenerator();

	/**
	 * Sets the value of the '{@link com.opcoach.datasample.MChildrenGenerator#getDelegatedEntityGenerator <em>Delegated Entity Generator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegated Entity Generator</em>' containment reference.
	 * @see #getDelegatedEntityGenerator()
	 * @generated
	 */
	void setDelegatedEntityGenerator(EntityGenerator value);
} // MChildrenGenerator
