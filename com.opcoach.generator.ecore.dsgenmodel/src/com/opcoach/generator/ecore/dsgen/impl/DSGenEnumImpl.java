/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.generator.ecore.dsgen.impl;

import com.opcoach.generator.ecore.dsgen.DSGenEnum;
import com.opcoach.generator.ecore.dsgen.DataSampleGenPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DS Gen Enum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.opcoach.generator.ecore.dsgen.impl.DSGenEnumImpl#getEcoreEnum <em>Ecore Enum</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DSGenEnumImpl extends DSGenDataTypeImpl implements DSGenEnum
{
	/**
	 * The cached value of the '{@link #getEcoreEnum() <em>Ecore Enum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcoreEnum()
	 * @generated
	 * @ordered
	 */
	protected EEnum ecoreEnum;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DSGenEnumImpl()
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
		return DataSampleGenPackage.Literals.DS_GEN_ENUM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEcoreEnum()
	{
		if (ecoreEnum != null && ecoreEnum.eIsProxy())
		{
			InternalEObject oldEcoreEnum = (InternalEObject)ecoreEnum;
			ecoreEnum = (EEnum)eResolveProxy(oldEcoreEnum);
			if (ecoreEnum != oldEcoreEnum)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataSampleGenPackage.DS_GEN_ENUM__ECORE_ENUM, oldEcoreEnum, ecoreEnum));
			}
		}
		return ecoreEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum basicGetEcoreEnum()
	{
		return ecoreEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcoreEnum(EEnum newEcoreEnum)
	{
		EEnum oldEcoreEnum = ecoreEnum;
		ecoreEnum = newEcoreEnum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataSampleGenPackage.DS_GEN_ENUM__ECORE_ENUM, oldEcoreEnum, ecoreEnum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case DataSampleGenPackage.DS_GEN_ENUM__ECORE_ENUM:
				if (resolve) return getEcoreEnum();
				return basicGetEcoreEnum();
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
		switch (featureID)
		{
			case DataSampleGenPackage.DS_GEN_ENUM__ECORE_ENUM:
				setEcoreEnum((EEnum)newValue);
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
		switch (featureID)
		{
			case DataSampleGenPackage.DS_GEN_ENUM__ECORE_ENUM:
				setEcoreEnum((EEnum)null);
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
		switch (featureID)
		{
			case DataSampleGenPackage.DS_GEN_ENUM__ECORE_ENUM:
				return ecoreEnum != null;
		}
		return super.eIsSet(featureID);
	}

} //DSGenEnumImpl
