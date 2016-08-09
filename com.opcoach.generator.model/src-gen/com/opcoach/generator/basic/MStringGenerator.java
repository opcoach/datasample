/**
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
 *   <li>{@link com.opcoach.generator.basic.MStringGenerator#getDataFilename <em>Data Filename</em>}</li>
 *   <li>{@link com.opcoach.generator.basic.MStringGenerator#getCasePolicy <em>Case Policy</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.opcoach.generator.basic.MBasicPackage#getStringGenerator()
 * @model superTypes="com.opcoach.generator.ReferenceGenerator<org.eclipse.emf.ecore.EString>"
 * @generated
 */
public interface MStringGenerator extends ReferenceGenerator<String>
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
	 * @see com.opcoach.generator.basic.MBasicPackage#getStringGenerator_DataFilename()
	 * @model
	 * @generated
	 */
	String getDataFilename();

	/**
	 * Sets the value of the '{@link com.opcoach.generator.basic.MStringGenerator#getDataFilename <em>Data Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Filename</em>' attribute.
	 * @see #getDataFilename()
	 * @generated
	 */
	void setDataFilename(String value);

	/**
	 * Returns the value of the '<em><b>Case Policy</b></em>' attribute.
	 * The default value is <code>"DEFAULT"</code>.
	 * The literals are from the enumeration {@link com.opcoach.generator.basic.CasePolicyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Case Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case Policy</em>' attribute.
	 * @see com.opcoach.generator.basic.CasePolicyType
	 * @see #setCasePolicy(CasePolicyType)
	 * @see com.opcoach.generator.basic.MBasicPackage#getStringGenerator_CasePolicy()
	 * @model default="DEFAULT"
	 * @generated
	 */
	CasePolicyType getCasePolicy();

	/**
	 * Sets the value of the '{@link com.opcoach.generator.basic.MStringGenerator#getCasePolicy <em>Case Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case Policy</em>' attribute.
	 * @see com.opcoach.generator.basic.CasePolicyType
	 * @see #getCasePolicy()
	 * @generated
	 */
	void setCasePolicy(CasePolicyType value);

} // MStringGenerator
