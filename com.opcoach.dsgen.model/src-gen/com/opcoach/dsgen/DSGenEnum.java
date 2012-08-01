/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.dsgen;

import org.eclipse.emf.ecore.EEnum;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>DS Gen Enum</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.opcoach.dsgen.DSGenEnum#getEcoreEnum <em>Ecore Enum</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.opcoach.dsgen.DataSampleGenPackage#getDSGenEnum()
 * @model
 * @generated
 */
public interface DSGenEnum extends DSGenDataType
{
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "© OPCoach 2012";

	/**
	 * Returns the value of the '<em><b>Ecore Enum</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecore Enum</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Ecore Enum</em>' reference.
	 * @see #setEcoreEnum(EEnum)
	 * @see com.opcoach.dsgen.DataSampleGenPackage#getDSGenEnum_EcoreEnum()
	 * @model required="true"
	 * @generated
	 */
	EEnum getEcoreEnum();

	/**
	 * Sets the value of the '{@link com.opcoach.dsgen.DSGenEnum#getEcoreEnum <em>Ecore Enum</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Ecore Enum</em>' reference.
	 * @see #getEcoreEnum()
	 * @generated
	 */
	void setEcoreEnum(EEnum value);

} // DSGenEnum
