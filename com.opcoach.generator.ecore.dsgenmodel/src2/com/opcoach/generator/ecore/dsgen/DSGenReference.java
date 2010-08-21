/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.generator.ecore.dsgen;

import com.opcoach.generator.ReferenceGenerator;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DS Gen Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.opcoach.generator.ecore.dsgen.DSGenReference#getGenerator <em>Generator</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.opcoach.generator.ecore.dsgen.DataSampleGenPackage#getDSGenReference()
 * @model
 * @generated
 */
public interface DSGenReference extends DSGenFeature
{

	/**
	 * Returns the value of the '<em><b>Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generator</em>' containment reference.
	 * @see #setGenerator(ReferenceGenerator)
	 * @see com.opcoach.generator.ecore.dsgen.DataSampleGenPackage#getDSGenReference_Generator()
	 * @model containment="true"
	 * @generated
	 */
	ReferenceGenerator<?> getGenerator();

	/**
	 * Sets the value of the '{@link com.opcoach.generator.ecore.dsgen.DSGenReference#getGenerator <em>Generator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator</em>' containment reference.
	 * @see #getGenerator()
	 * @generated
	 */
	void setGenerator(ReferenceGenerator<?> value);
} // DSGenReference
