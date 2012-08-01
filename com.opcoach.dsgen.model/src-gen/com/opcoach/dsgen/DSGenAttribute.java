/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.dsgen;

import com.opcoach.generator.RangeGenerator;
import com.opcoach.generator.ValueGenerator;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>DS Gen Attribute</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.opcoach.dsgen.DSGenAttribute#getGenerator <em>Generator</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.opcoach.dsgen.DataSampleGenPackage#getDSGenAttribute()
 * @model
 * @generated
 */
public interface DSGenAttribute extends DSGenFeature
{
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "© OPCoach 2012";

	/**
	 * Returns the value of the '<em><b>Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generator</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generator</em>' containment reference.
	 * @see #setGenerator(ValueGenerator)
	 * @see com.opcoach.dsgen.DataSampleGenPackage#getDSGenAttribute_Generator()
	 * @model containment="true"
	 * @generated
	 */
	ValueGenerator<?> getGenerator();

	/**
	 * Sets the value of the '{@link com.opcoach.dsgen.DSGenAttribute#getGenerator <em>Generator</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator</em>' containment reference.
	 * @see #getGenerator()
	 * @generated
	 */
	void setGenerator(ValueGenerator<?> value);

} // DSGenAttribute
