/**
 */
package com.opcoach.dsgen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DS Gen Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.opcoach.dsgen.DSGenPackage#getEcorePackage <em>Ecore Package</em>}</li>
 *   <li>{@link com.opcoach.dsgen.DSGenPackage#getDsgenModel <em>Dsgen Model</em>}</li>
 *   <li>{@link com.opcoach.dsgen.DSGenPackage#getDsgenClassifiers <em>Dsgen Classifiers</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.opcoach.dsgen.DataSampleGenPackage#getDSGenPackage()
 * @model annotation="dsg.name foo='bar'"
 * @generated
 */
public interface DSGenPackage extends DSGenBase {
	/**
	 * Returns the value of the '<em><b>Ecore Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecore Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecore Package</em>' reference.
	 * @see #setEcorePackage(EPackage)
	 * @see com.opcoach.dsgen.DataSampleGenPackage#getDSGenPackage_EcorePackage()
	 * @model required="true"
	 * @generated
	 */
	EPackage getEcorePackage();

	/**
	 * Sets the value of the '{@link com.opcoach.dsgen.DSGenPackage#getEcorePackage <em>Ecore Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ecore Package</em>' reference.
	 * @see #getEcorePackage()
	 * @generated
	 */
	void setEcorePackage(EPackage value);

	/**
	 * Returns the value of the '<em><b>Dsgen Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.opcoach.dsgen.DSGenModel#getDsgenPackages <em>Dsgen Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dsgen Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dsgen Model</em>' container reference.
	 * @see #setDsgenModel(DSGenModel)
	 * @see com.opcoach.dsgen.DataSampleGenPackage#getDSGenPackage_DsgenModel()
	 * @see com.opcoach.dsgen.DSGenModel#getDsgenPackages
	 * @model opposite="dsgenPackages" required="true" transient="false"
	 * @generated
	 */
	DSGenModel getDsgenModel();

	/**
	 * Sets the value of the '{@link com.opcoach.dsgen.DSGenPackage#getDsgenModel <em>Dsgen Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dsgen Model</em>' container reference.
	 * @see #getDsgenModel()
	 * @generated
	 */
	void setDsgenModel(DSGenModel value);

	/**
	 * Returns the value of the '<em><b>Dsgen Classifiers</b></em>' containment reference list.
	 * The list contents are of type {@link com.opcoach.dsgen.DSGenClassifier}.
	 * It is bidirectional and its opposite is '{@link com.opcoach.dsgen.DSGenClassifier#getDsgenPackage <em>Dsgen Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dsgen Classifiers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dsgen Classifiers</em>' containment reference list.
	 * @see com.opcoach.dsgen.DataSampleGenPackage#getDSGenPackage_DsgenClassifiers()
	 * @see com.opcoach.dsgen.DSGenClassifier#getDsgenPackage
	 * @model opposite="dsgenPackage" containment="true"
	 * @generated
	 */
	EList<DSGenClassifier> getDsgenClassifiers();

} // DSGenPackage
