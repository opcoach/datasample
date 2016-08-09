/**
 */
package com.opcoach.generator;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.opcoach.generator.MRangeGenerator#getLow <em>Low</em>}</li>
 *   <li>{@link com.opcoach.generator.MRangeGenerator#getHigh <em>High</em>}</li>
 *   <li>{@link com.opcoach.generator.MRangeGenerator#getStep <em>Step</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.opcoach.generator.MGeneratorPackage#getRangeGenerator()
 * @model abstract="true"
 * @generated
 */
public interface MRangeGenerator<T> extends ValueGenerator<T>
{
	/**
	 * Returns the value of the '<em><b>Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Low</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Low</em>' attribute.
	 * @see #setLow(Object)
	 * @see com.opcoach.generator.MGeneratorPackage#getRangeGenerator_Low()
	 * @model
	 * @generated
	 */
	T getLow();

	/**
	 * Sets the value of the '{@link com.opcoach.generator.MRangeGenerator#getLow <em>Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low</em>' attribute.
	 * @see #getLow()
	 * @generated
	 */
	void setLow(T value);

	/**
	 * Returns the value of the '<em><b>High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>High</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>High</em>' attribute.
	 * @see #setHigh(Object)
	 * @see com.opcoach.generator.MGeneratorPackage#getRangeGenerator_High()
	 * @model
	 * @generated
	 */
	T getHigh();

	/**
	 * Sets the value of the '{@link com.opcoach.generator.MRangeGenerator#getHigh <em>High</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High</em>' attribute.
	 * @see #getHigh()
	 * @generated
	 */
	void setHigh(T value);

	/**
	 * Returns the value of the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' attribute.
	 * @see #setStep(Object)
	 * @see com.opcoach.generator.MGeneratorPackage#getRangeGenerator_Step()
	 * @model
	 * @generated
	 */
	T getStep();

	/**
	 * Sets the value of the '{@link com.opcoach.generator.MRangeGenerator#getStep <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' attribute.
	 * @see #getStep()
	 * @generated
	 */
	void setStep(T value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setBounds(T low, T high);

} // MRangeGenerator
