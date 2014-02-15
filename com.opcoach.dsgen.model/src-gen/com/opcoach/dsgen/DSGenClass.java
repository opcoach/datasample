/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.dsgen;

import com.opcoach.dsgen.generator.EObjectGenerator;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>DS Gen Class</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.opcoach.dsgen.DSGenClass#isRootObject <em>Root Object</em>}</li>
 *   <li>{@link com.opcoach.dsgen.DSGenClass#getNbAssociationRefTo <em>Nb Association Ref To</em>}</li>
 *   <li>{@link com.opcoach.dsgen.DSGenClass#getGenerator <em>Generator</em>}</li>
 *   <li>{@link com.opcoach.dsgen.DSGenClass#getNbInstances <em>Nb Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.opcoach.dsgen.DataSampleGenPackage#getDSGenClass()
 * @model
 * @generated
 */
public interface DSGenClass extends DSGenClassifier
{
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "© OPCoach 2012";

	/**
	 * Returns the value of the '<em><b>Root Object</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Object</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Object</em>' attribute.
	 * @see #setRootObject(boolean)
	 * @see com.opcoach.dsgen.DataSampleGenPackage#getDSGenClass_RootObject()
	 * @model default="false" derived="true"
	 * @generated
	 */
	boolean isRootObject();

	/**
	 * Sets the value of the '{@link com.opcoach.dsgen.DSGenClass#isRootObject <em>Root Object</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Root Object</em>' attribute.
	 * @see #isRootObject()
	 * @generated
	 */
	void setRootObject(boolean value);

	/**
	 * Returns the value of the '<em><b>Nb Association Ref To</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Association Ref To</em>' attribute isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Association Ref To</em>' attribute.
	 * @see #setNbAssociationRefTo(int)
	 * @see com.opcoach.dsgen.DataSampleGenPackage#getDSGenClass_NbAssociationRefTo()
	 * @model default="0" derived="true"
	 * @generated
	 */
	int getNbAssociationRefTo();

	/**
	 * Sets the value of the '{@link com.opcoach.dsgen.DSGenClass#getNbAssociationRefTo <em>Nb Association Ref To</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Nb Association Ref To</em>' attribute.
	 * @see #getNbAssociationRefTo()
	 * @generated
	 */
	void setNbAssociationRefTo(int value);

	/**
	 * Returns the value of the '<em><b>Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generator</em>' containment reference.
	 * @see #setGenerator(EObjectGenerator)
	 * @see com.opcoach.dsgen.DataSampleGenPackage#getDSGenClass_Generator()
	 * @model containment="true"
	 * @generated
	 */
	EObjectGenerator getGenerator();

	/**
	 * Sets the value of the '{@link com.opcoach.dsgen.DSGenClass#getGenerator <em>Generator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator</em>' containment reference.
	 * @see #getGenerator()
	 * @generated
	 */
	void setGenerator(EObjectGenerator value);

	/**
	 * Returns the value of the '<em><b>Nb Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Instances</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Instances</em>' attribute.
	 * @see #setNbInstances(int)
	 * @see com.opcoach.dsgen.DataSampleGenPackage#getDSGenClass_NbInstances()
	 * @model
	 * @generated
	 */
	int getNbInstances();

	/**
	 * Sets the value of the '{@link com.opcoach.dsgen.DSGenClass#getNbInstances <em>Nb Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Instances</em>' attribute.
	 * @see #getNbInstances()
	 * @generated
	 */
	void setNbInstances(int value);

} // DSGenClass
