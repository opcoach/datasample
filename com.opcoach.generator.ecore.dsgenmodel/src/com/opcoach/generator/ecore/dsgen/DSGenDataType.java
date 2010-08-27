/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.generator.ecore.dsgen;

import org.eclipse.emf.ecore.EDataType;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DS Gen Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.opcoach.generator.ecore.dsgen.DSGenDataType#getDataType <em>Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.opcoach.generator.ecore.dsgen.DataSampleGenPackage#getDSGenDataType()
 * @model
 * @generated
 */
public interface DSGenDataType extends DSGenClassifier
{

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' reference.
	 * @see #setDataType(EDataType)
	 * @see com.opcoach.generator.ecore.dsgen.DataSampleGenPackage#getDSGenDataType_DataType()
	 * @model required="true"
	 * @generated
	 */
	EDataType getDataType();

	/**
	 * Sets the value of the '{@link com.opcoach.generator.ecore.dsgen.DSGenDataType#getDataType <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(EDataType value);
} // DSGenDataType
