/**
 */
package com.opcoach.generator;

import java.util.Collection;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.opcoach.generator.MReferenceGenerator#getStep <em>Step</em>}</li>
 *   <li>{@link com.opcoach.generator.MReferenceGenerator#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.opcoach.generator.MGeneratorPackage#getReferenceGenerator()
 * @model
 * @generated
 */
public interface MReferenceGenerator<T> extends ValueGenerator<T>
{
	/**
	 * Returns the value of the '<em><b>Step</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The step for choosing data in the values collection, when no random is required. Default value is 1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Step</em>' attribute.
	 * @see #setStep(int)
	 * @see com.opcoach.generator.MGeneratorPackage#getReferenceGenerator_Step()
	 * @model default="1"
	 * @generated
	 */
	int getStep();

	/**
	 * Sets the value of the '{@link com.opcoach.generator.MReferenceGenerator#getStep <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' attribute.
	 * @see #getStep()
	 * @generated
	 */
	void setStep(int value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute.
	 * @see #setValues(Collection)
	 * @see com.opcoach.generator.MGeneratorPackage#getReferenceGenerator_Values()
	 * @model dataType="com.opcoach.generator.Collection<T>" transient="true"
	 * @generated
	 */
	Collection<T> getValues();

	/**
	 * Sets the value of the '{@link com.opcoach.generator.MReferenceGenerator#getValues <em>Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Values</em>' attribute.
	 * @see #getValues()
	 * @generated
	 */
	void setValues(Collection<T> value);

} // MReferenceGenerator
