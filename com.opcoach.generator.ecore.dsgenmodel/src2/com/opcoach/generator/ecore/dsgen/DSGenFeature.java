/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.generator.ecore.dsgen;

import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DS Gen Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.opcoach.generator.ecore.dsgen.DSGenFeature#isNullableValue <em>Nullable Value</em>}</li>
 *   <li>{@link com.opcoach.generator.ecore.dsgen.DSGenFeature#getNullablePercent <em>Nullable Percent</em>}</li>
 *   <li>{@link com.opcoach.generator.ecore.dsgen.DSGenFeature#getDsgenClass <em>Dsgen Class</em>}</li>
 *   <li>{@link com.opcoach.generator.ecore.dsgen.DSGenFeature#getEcoreFeature <em>Ecore Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.opcoach.generator.ecore.dsgen.DataSampleGenPackage#getDSGenFeature()
 * @model
 * @generated
 */
public interface DSGenFeature extends DSGenTypedElement
{
	/**
	 * Returns the value of the '<em><b>Nullable Value</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nullable Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nullable Value</em>' attribute.
	 * @see #setNullableValue(boolean)
	 * @see com.opcoach.generator.ecore.dsgen.DataSampleGenPackage#getDSGenFeature_NullableValue()
	 * @model default="false"
	 * @generated
	 */
	boolean isNullableValue();

	/**
	 * Sets the value of the '{@link com.opcoach.generator.ecore.dsgen.DSGenFeature#isNullableValue <em>Nullable Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nullable Value</em>' attribute.
	 * @see #isNullableValue()
	 * @generated
	 */
	void setNullableValue(boolean value);

	/**
	 * Returns the value of the '<em><b>Nullable Percent</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nullable Percent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nullable Percent</em>' attribute.
	 * @see #setNullablePercent(int)
	 * @see com.opcoach.generator.ecore.dsgen.DataSampleGenPackage#getDSGenFeature_NullablePercent()
	 * @model default="10"
	 * @generated
	 */
	int getNullablePercent();

	/**
	 * Sets the value of the '{@link com.opcoach.generator.ecore.dsgen.DSGenFeature#getNullablePercent <em>Nullable Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nullable Percent</em>' attribute.
	 * @see #getNullablePercent()
	 * @generated
	 */
	void setNullablePercent(int value);

	/**
	 * Returns the value of the '<em><b>Dsgen Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.opcoach.generator.ecore.dsgen.DSGenClassifier#getDsgenFeatures <em>Dsgen Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dsgen Class</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dsgen Class</em>' container reference.
	 * @see #setDsgenClass(DSGenClassifier)
	 * @see com.opcoach.generator.ecore.dsgen.DataSampleGenPackage#getDSGenFeature_DsgenClass()
	 * @see com.opcoach.generator.ecore.dsgen.DSGenClassifier#getDsgenFeatures
	 * @model opposite="dsgenFeatures" required="true" transient="false"
	 * @generated
	 */
	DSGenClassifier getDsgenClass();

	/**
	 * Sets the value of the '{@link com.opcoach.generator.ecore.dsgen.DSGenFeature#getDsgenClass <em>Dsgen Class</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dsgen Class</em>' container reference.
	 * @see #getDsgenClass()
	 * @generated
	 */
	void setDsgenClass(DSGenClassifier value);

	/**
	 * Returns the value of the '<em><b>Ecore Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecore Feature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecore Feature</em>' reference.
	 * @see #setEcoreFeature(EStructuralFeature)
	 * @see com.opcoach.generator.ecore.dsgen.DataSampleGenPackage#getDSGenFeature_EcoreFeature()
	 * @model required="true"
	 * @generated
	 */
	EStructuralFeature getEcoreFeature();

	/**
	 * Sets the value of the '{@link com.opcoach.generator.ecore.dsgen.DSGenFeature#getEcoreFeature <em>Ecore Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ecore Feature</em>' reference.
	 * @see #getEcoreFeature()
	 * @generated
	 */
	void setEcoreFeature(EStructuralFeature value);

} // DSGenFeature
