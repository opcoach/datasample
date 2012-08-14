/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.dsgen;

import com.opcoach.generator.ReferenceGenerator;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>DS Gen Reference</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.opcoach.dsgen.DSGenReference#getTargetDSGenClass <em>Target DS Gen Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.opcoach.dsgen.DataSampleGenPackage#getDSGenReference()
 * @model
 * @generated
 */
public interface DSGenReference extends DSGenFeature
{

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "© OPCoach 2012";

	/**
	 * Returns the value of the '<em><b>Target DS Gen Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target DS Gen Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target DS Gen Class</em>' reference.
	 * @see #setTargetDSGenClass(DSGenClass)
	 * @see com.opcoach.dsgen.DataSampleGenPackage#getDSGenReference_TargetDSGenClass()
	 * @model
	 * @generated
	 */
	DSGenClass getTargetDSGenClass();

	/**
	 * Sets the value of the '{@link com.opcoach.dsgen.DSGenReference#getTargetDSGenClass <em>Target DS Gen Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target DS Gen Class</em>' reference.
	 * @see #getTargetDSGenClass()
	 * @generated
	 */
	void setTargetDSGenClass(DSGenClass value);
} // DSGenReference
