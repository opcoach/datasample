/**
 */
package com.opcoach.generator.basic;

import com.opcoach.generator.RangeGenerator;
import java.util.Date;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.opcoach.generator.basic.MDateGenerator#isGenerateNow <em>Generate Now</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.opcoach.generator.basic.MBasicPackage#getDateGenerator()
 * @model superTypes="com.opcoach.generator.RangeGenerator<org.eclipse.emf.ecore.EDate>"
 * @generated
 */
public interface MDateGenerator extends RangeGenerator<Date>
{
	/**
	 * Returns the value of the '<em><b>Generate Now</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generate Now</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate Now</em>' attribute.
	 * @see #setGenerateNow(boolean)
	 * @see com.opcoach.generator.basic.MBasicPackage#getDateGenerator_GenerateNow()
	 * @model
	 * @generated
	 */
	boolean isGenerateNow();

	/**
	 * Sets the value of the '{@link com.opcoach.generator.basic.MDateGenerator#isGenerateNow <em>Generate Now</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate Now</em>' attribute.
	 * @see #isGenerateNow()
	 * @generated
	 */
	void setGenerateNow(boolean value);

} // MDateGenerator
