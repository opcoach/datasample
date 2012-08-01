/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.dsgen;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>DS Gen Classifier</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.opcoach.dsgen.DSGenClassifier#getEcoreClass <em>Ecore Class</em>}</li>
 *   <li>{@link com.opcoach.dsgen.DSGenClassifier#getDsgenFeatures <em>Dsgen Features</em>}</li>
 *   <li>{@link com.opcoach.dsgen.DSGenClassifier#getDsgenPackage <em>Dsgen Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.opcoach.dsgen.DataSampleGenPackage#getDSGenClassifier()
 * @model abstract="true"
 * @generated
 */
public interface DSGenClassifier extends DSGenBase
{
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "© OPCoach 2012";

	/**
	 * Returns the value of the '<em><b>Ecore Class</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecore Class</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Ecore Class</em>' reference.
	 * @see #setEcoreClass(EClass)
	 * @see com.opcoach.dsgen.DataSampleGenPackage#getDSGenClassifier_EcoreClass()
	 * @model required="true"
	 * @generated
	 */
	EClass getEcoreClass();

	/**
	 * Sets the value of the '{@link com.opcoach.dsgen.DSGenClassifier#getEcoreClass <em>Ecore Class</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Ecore Class</em>' reference.
	 * @see #getEcoreClass()
	 * @generated
	 */
	void setEcoreClass(EClass value);

	/**
	 * Returns the value of the '<em><b>Dsgen Features</b></em>' containment reference list.
	 * The list contents are of type {@link com.opcoach.dsgen.DSGenFeature}.
	 * It is bidirectional and its opposite is '{@link com.opcoach.dsgen.DSGenFeature#getDsgenClass <em>Dsgen Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dsgen Features</em>' containment reference
	 * list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dsgen Features</em>' containment reference list.
	 * @see com.opcoach.dsgen.DataSampleGenPackage#getDSGenClassifier_DsgenFeatures()
	 * @see com.opcoach.dsgen.DSGenFeature#getDsgenClass
	 * @model opposite="dsgenClass" containment="true"
	 * @generated
	 */
	EList<DSGenFeature> getDsgenFeatures();

	/**
	 * Returns the value of the '<em><b>Dsgen Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.opcoach.dsgen.DSGenPackage#getDsgenClassifiers <em>Dsgen Classifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dsgen Package</em>' container reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dsgen Package</em>' container reference.
	 * @see #setDsgenPackage(DSGenPackage)
	 * @see com.opcoach.dsgen.DataSampleGenPackage#getDSGenClassifier_DsgenPackage()
	 * @see com.opcoach.dsgen.DSGenPackage#getDsgenClassifiers
	 * @model opposite="dsgenClassifiers" required="true" transient="false"
	 * @generated
	 */
	DSGenPackage getDsgenPackage();

	/**
	 * Sets the value of the '{@link com.opcoach.dsgen.DSGenClassifier#getDsgenPackage <em>Dsgen Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dsgen Package</em>' container reference.
	 * @see #getDsgenPackage()
	 * @generated
	 */
	void setDsgenPackage(DSGenPackage value);

} // DSGenClassifier
