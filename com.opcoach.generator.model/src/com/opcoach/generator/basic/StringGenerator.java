/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.generator.basic;

import com.opcoach.generator.ReferenceGenerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.opcoach.generator.basic.StringGenerator#getDataFilename <em>Data Filename</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.opcoach.generator.basic.BasicPackage#getStringGenerator()
 * @model superTypes="com.opcoach.generator.ReferenceGenerator<org.eclipse.emf.ecore.EString>"
 * @generated
 */
public interface StringGenerator extends ReferenceGenerator<String>
{
	/**
	 * Returns the value of the '<em><b>Data Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Filename</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Filename</em>' attribute.
	 * @see #setDataFilename(String)
	 * @see com.opcoach.generator.basic.BasicPackage#getStringGenerator_DataFilename()
	 * @model
	 * @generated
	 */
	String getDataFilename();

	/**
	 * Sets the value of the '{@link com.opcoach.generator.basic.StringGenerator#getDataFilename <em>Data Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Filename</em>' attribute.
	 * @see #getDataFilename()
	 * @generated
	 */
	void setDataFilename(String value);
	
	
} // StringGenerator
