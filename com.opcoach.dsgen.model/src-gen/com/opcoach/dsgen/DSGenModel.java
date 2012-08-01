/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.dsgen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>DS Gen Model</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.opcoach.dsgen.DSGenModel#getDsgenPackages <em>Dsgen Packages</em>}</li>
 *   <li>{@link com.opcoach.dsgen.DSGenModel#getRandomSeed <em>Random Seed</em>}</li>
 *   <li>{@link com.opcoach.dsgen.DSGenModel#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.opcoach.dsgen.DataSampleGenPackage#getDSGenModel()
 * @model
 * @generated
 */
public interface DSGenModel extends DSGenBase
{
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "© OPCoach 2012";

	/**
	 * Returns the value of the '<em><b>Dsgen Packages</b></em>' containment reference list.
	 * The list contents are of type {@link com.opcoach.dsgen.DSGenPackage}.
	 * It is bidirectional and its opposite is '{@link com.opcoach.dsgen.DSGenPackage#getDsgenModel <em>Dsgen Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dsgen Packages</em>' containment reference
	 * list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dsgen Packages</em>' containment reference list.
	 * @see com.opcoach.dsgen.DataSampleGenPackage#getDSGenModel_DsgenPackages()
	 * @see com.opcoach.dsgen.DSGenPackage#getDsgenModel
	 * @model opposite="dsgenModel" containment="true"
	 * @generated
	 */
	EList<DSGenPackage> getDsgenPackages();

	/**
	 * Returns the value of the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Random Seed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Random Seed</em>' attribute.
	 * @see #setRandomSeed(long)
	 * @see com.opcoach.dsgen.DataSampleGenPackage#getDSGenModel_RandomSeed()
	 * @model
	 * @generated
	 */
	long getRandomSeed();

	/**
	 * Sets the value of the '{@link com.opcoach.dsgen.DSGenModel#getRandomSeed <em>Random Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Random Seed</em>' attribute.
	 * @see #getRandomSeed()
	 * @generated
	 */
	void setRandomSeed(long value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.opcoach.dsgen.DataSampleGenPackage#getDSGenModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.opcoach.dsgen.DSGenModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // DSGenModel
