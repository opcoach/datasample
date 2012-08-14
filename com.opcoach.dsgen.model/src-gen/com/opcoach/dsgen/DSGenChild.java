/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.dsgen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>DS Gen Child</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.opcoach.dsgen.DSGenChild#isSingle <em>Single</em>}</li>
 *   <li>{@link com.opcoach.dsgen.DSGenChild#getSourceReference <em>Source Reference</em>}</li>
 *   <li>{@link com.opcoach.dsgen.DSGenChild#getOppositeReference <em>Opposite Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.opcoach.dsgen.DataSampleGenPackage#getDSGenChild()
 * @model
 * @generated
 */
public interface DSGenChild extends EObject
{
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "© OPCoach 2012";

	/**
	 * Returns the value of the '<em><b>Single</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Single</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Single</em>' attribute.
	 * @see #setSingle(boolean)
	 * @see com.opcoach.dsgen.DataSampleGenPackage#getDSGenChild_Single()
	 * @model
	 * @generated
	 */
	boolean isSingle();

	/**
	 * Sets the value of the '{@link com.opcoach.dsgen.DSGenChild#isSingle
	 * <em>Single</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Single</em>' attribute.
	 * @see #isSingle()
	 * @generated
	 */
	void setSingle(boolean value);

	/**
	 * Returns the value of the '<em><b>Opposite Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opposite Reference</em>' reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opposite Reference</em>' reference.
	 * @see #setOppositeReference(DSGenReference)
	 * @see com.opcoach.dsgen.DataSampleGenPackage#getDSGenChild_OppositeReference()
	 * @model
	 * @generated
	 */
	DSGenReference getOppositeReference();

	/**
	 * Sets the value of the '{@link com.opcoach.dsgen.DSGenChild#getOppositeReference <em>Opposite Reference</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Opposite Reference</em>' reference.
	 * @see #getOppositeReference()
	 * @generated
	 */
	void setOppositeReference(DSGenReference value);

	/**
	 * Returns the value of the '<em><b>Source Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Reference</em>' reference.
	 * @see #setSourceReference(DSGenReference)
	 * @see com.opcoach.dsgen.DataSampleGenPackage#getDSGenChild_SourceReference()
	 * @model required="true"
	 * @generated
	 */
	DSGenReference getSourceReference();

	/**
	 * Sets the value of the '{@link com.opcoach.dsgen.DSGenChild#getSourceReference <em>Source Reference</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Source Reference</em>' reference.
	 * @see #getSourceReference()
	 * @generated
	 */
	void setSourceReference(DSGenReference value);

} // DSGenChild
