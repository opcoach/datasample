/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.dsgen;

import com.opcoach.generator.ValueGenerator;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>DS Gen Feature</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.opcoach.dsgen.DSGenFeature#getDsgenClass <em>Dsgen Class</em>}</li>
 *   <li>{@link com.opcoach.dsgen.DSGenFeature#getEcoreFeature <em>Ecore Feature</em>}</li>
 *   <li>{@link com.opcoach.dsgen.DSGenFeature#getGenerator <em>Generator</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.opcoach.dsgen.DataSampleGenPackage#getDSGenFeature()
 * @model
 * @generated
 */
public interface DSGenFeature extends DSGenTypedElement
{
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "© OPCoach 2012";

	/**
	 * Returns the value of the '<em><b>Dsgen Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.opcoach.dsgen.DSGenClassifier#getDsgenFeatures <em>Dsgen Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dsgen Class</em>' container reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dsgen Class</em>' container reference.
	 * @see #setDsgenClass(DSGenClassifier)
	 * @see com.opcoach.dsgen.DataSampleGenPackage#getDSGenFeature_DsgenClass()
	 * @see com.opcoach.dsgen.DSGenClassifier#getDsgenFeatures
	 * @model opposite="dsgenFeatures" required="true" transient="false"
	 * @generated
	 */
	DSGenClassifier getDsgenClass();

	/**
	 * Sets the value of the '{@link com.opcoach.dsgen.DSGenFeature#getDsgenClass <em>Dsgen Class</em>}' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dsgen Class</em>' container reference.
	 * @see #getDsgenClass()
	 * @generated
	 */
	void setDsgenClass(DSGenClassifier value);

	/**
	 * Returns the value of the '<em><b>Ecore Feature</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecore Feature</em>' containment reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Ecore Feature</em>' reference.
	 * @see #setEcoreFeature(EStructuralFeature)
	 * @see com.opcoach.dsgen.DataSampleGenPackage#getDSGenFeature_EcoreFeature()
	 * @model required="true"
	 * @generated
	 */
	EStructuralFeature getEcoreFeature();

	/**
	 * Sets the value of the '{@link com.opcoach.dsgen.DSGenFeature#getEcoreFeature <em>Ecore Feature</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Ecore Feature</em>' reference.
	 * @see #getEcoreFeature()
	 * @generated
	 */
	void setEcoreFeature(EStructuralFeature value);

	/**
	 * Returns the value of the '<em><b>Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generator</em>' containment reference.
	 * @see #setGenerator(ValueGenerator)
	 * @see com.opcoach.dsgen.DataSampleGenPackage#getDSGenFeature_Generator()
	 * @model containment="true"
	 * @generated
	 */
	ValueGenerator<?> getGenerator();

	/**
	 * Sets the value of the '{@link com.opcoach.dsgen.DSGenFeature#getGenerator <em>Generator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator</em>' containment reference.
	 * @see #getGenerator()
	 * @generated
	 */
	void setGenerator(ValueGenerator<?> value);

} // DSGenFeature
