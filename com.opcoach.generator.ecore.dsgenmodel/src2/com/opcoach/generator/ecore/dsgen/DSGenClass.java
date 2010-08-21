/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.generator.ecore.dsgen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DS Gen Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.opcoach.generator.ecore.dsgen.DSGenClass#getInstanceNumber <em>Instance Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.opcoach.generator.ecore.dsgen.DataSampleGenPackage#getDSGenClass()
 * @model
 * @generated
 */
public interface DSGenClass extends DSGenClassifier
{
	/**
	 * Returns the value of the '<em><b>Instance Number</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Number</em>' attribute.
	 * @see #setInstanceNumber(int)
	 * @see com.opcoach.generator.ecore.dsgen.DataSampleGenPackage#getDSGenClass_InstanceNumber()
	 * @model default="1"
	 * @generated
	 */
	int getInstanceNumber();

	/**
	 * Sets the value of the '{@link com.opcoach.generator.ecore.dsgen.DSGenClass#getInstanceNumber <em>Instance Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Number</em>' attribute.
	 * @see #getInstanceNumber()
	 * @generated
	 */
	void setInstanceNumber(int value);

} // DSGenClass
