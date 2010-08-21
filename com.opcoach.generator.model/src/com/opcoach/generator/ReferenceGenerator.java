/**
 * <copyright>
 * </copyright>
 *
 * $Id$
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
 *   <li>{@link com.opcoach.generator.ReferenceGenerator#getStep <em>Step</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.opcoach.generator.GeneratorPackage#getReferenceGenerator()
 * @model
 * @generated
 */
public interface ReferenceGenerator<T> extends ValueGenerator<T>
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
	 * @see com.opcoach.generator.GeneratorPackage#getReferenceGenerator_Step()
	 * @model default="1"
	 * @generated
	 */
	int getStep();

	/**
	 * Sets the value of the '{@link com.opcoach.generator.ReferenceGenerator#getStep <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' attribute.
	 * @see #getStep()
	 * @generated
	 */
	void setStep(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addValue(T value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="com.opcoach.generator.Collection<T>"
	 * @generated
	 */
	Collection<T> getValues();

} // ReferenceGenerator
