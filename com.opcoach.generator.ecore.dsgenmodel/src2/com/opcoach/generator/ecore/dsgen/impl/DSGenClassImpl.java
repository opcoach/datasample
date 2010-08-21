/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.generator.ecore.dsgen.impl;

import com.opcoach.generator.ecore.dsgen.DSGenClass;
import com.opcoach.generator.ecore.dsgen.DataSampleGenPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DS Gen Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.opcoach.generator.ecore.dsgen.impl.DSGenClassImpl#getInstanceNumber <em>Instance Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DSGenClassImpl extends DSGenClassifierImpl implements DSGenClass
{
	/**
	 * The default value of the '{@link #getInstanceNumber() <em>Instance Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int INSTANCE_NUMBER_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getInstanceNumber() <em>Instance Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceNumber()
	 * @generated
	 * @ordered
	 */
	protected int instanceNumber = INSTANCE_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DSGenClassImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return DataSampleGenPackage.eINSTANCE.getDSGenClass();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInstanceNumber()
	{
		return instanceNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceNumber(int newInstanceNumber)
	{
		int oldInstanceNumber = instanceNumber;
		instanceNumber = newInstanceNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataSampleGenPackage.DS_GEN_CLASS__INSTANCE_NUMBER, oldInstanceNumber, instanceNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID) {
			case DataSampleGenPackage.DS_GEN_CLASS__INSTANCE_NUMBER:
				return getInstanceNumber();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID) {
			case DataSampleGenPackage.DS_GEN_CLASS__INSTANCE_NUMBER:
				setInstanceNumber((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID) {
			case DataSampleGenPackage.DS_GEN_CLASS__INSTANCE_NUMBER:
				setInstanceNumber(INSTANCE_NUMBER_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID) {
			case DataSampleGenPackage.DS_GEN_CLASS__INSTANCE_NUMBER:
				return instanceNumber != INSTANCE_NUMBER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (instanceNumber: ");
		result.append(instanceNumber);
		result.append(')');
		return result.toString();
	}

} //DSGenClassImpl
