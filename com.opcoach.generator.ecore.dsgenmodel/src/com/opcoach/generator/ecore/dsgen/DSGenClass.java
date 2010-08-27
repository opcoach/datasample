/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.generator.ecore.dsgen;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DS Gen Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.opcoach.generator.ecore.dsgen.DSGenClass#getInstanceNumber <em>Instance Number</em>}</li>
 *   <li>{@link com.opcoach.generator.ecore.dsgen.DSGenClass#isRootObject <em>Root Object</em>}</li>
 *   <li>{@link com.opcoach.generator.ecore.dsgen.DSGenClass#getNbAssociationRefTo <em>Nb Association Ref To</em>}</li>
 *   <li>{@link com.opcoach.generator.ecore.dsgen.DSGenClass#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.opcoach.generator.ecore.dsgen.DataSampleGenPackage#getDSGenClass()
 * @model
 * @generated
 */
public interface DSGenClass extends DSGenClassifier
{
	/**
	 * Returns the value of the '<em><b>Instance Number</b></em>' attribute.
	 * The default value is <code>"50"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Number</em>' attribute.
	 * @see #setInstanceNumber(int)
	 * @see com.opcoach.generator.ecore.dsgen.DataSampleGenPackage#getDSGenClass_InstanceNumber()
	 * @model default="50"
	 * @generated
	 */
	int getInstanceNumber();

	/**
	 * Sets the value of the '{@link com.opcoach.generator.ecore.dsgen.DSGenClass#getInstanceNumber <em>Instance Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Number</em>' attribute.
	 * @see #getInstanceNumber()
	 * @generated
	 */
	void setInstanceNumber(int value);

	/**
	 * Returns the value of the '<em><b>Root Object</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Object</em>' attribute.
	 * @see #setRootObject(boolean)
	 * @see com.opcoach.generator.ecore.dsgen.DataSampleGenPackage#getDSGenClass_RootObject()
	 * @model default="false" derived="true"
	 * @generated
	 */
	boolean isRootObject();

	/**
	 * Sets the value of the '{@link com.opcoach.generator.ecore.dsgen.DSGenClass#isRootObject <em>Root Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * If the meaning of the '<em>Nb Association Ref To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Association Ref To</em>' attribute.
	 * @see #setNbAssociationRefTo(int)
	 * @see com.opcoach.generator.ecore.dsgen.DataSampleGenPackage#getDSGenClass_NbAssociationRefTo()
	 * @model default="0" derived="true"
	 * @generated
	 */
	int getNbAssociationRefTo();

	/**
	 * Sets the value of the '{@link com.opcoach.generator.ecore.dsgen.DSGenClass#getNbAssociationRefTo <em>Nb Association Ref To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Association Ref To</em>' attribute.
	 * @see #getNbAssociationRefTo()
	 * @generated
	 */
	void setNbAssociationRefTo(int value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link com.opcoach.generator.ecore.dsgen.DSGenClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see com.opcoach.generator.ecore.dsgen.DataSampleGenPackage#getDSGenClass_Children()
	 * @model
	 * @generated
	 */
	EList<DSGenClass> getChildren();

} // DSGenClass
