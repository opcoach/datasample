/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.dsgen.impl;

import com.opcoach.dsgen.DSGenClass;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.opcoach.dsgen.DSGenReference;
import com.opcoach.dsgen.DataSampleGenPackage;
import com.opcoach.generator.ReferenceGenerator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>DS Gen Reference</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.opcoach.dsgen.impl.DSGenReferenceImpl#getTargetDSGenClass <em>Target DS Gen Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DSGenReferenceImpl extends DSGenFeatureImpl implements DSGenReference
{
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "© OPCoach 2012";
	/**
	 * The cached value of the '{@link #getTargetDSGenClass() <em>Target DS Gen Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDSGenClass()
	 * @generated
	 * @ordered
	 */
	protected DSGenClass targetDSGenClass;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DSGenReferenceImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return DataSampleGenPackage.Literals.DS_GEN_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSGenClass getTargetDSGenClass()
	{
		if (targetDSGenClass != null && targetDSGenClass.eIsProxy())
		{
			InternalEObject oldTargetDSGenClass = (InternalEObject) targetDSGenClass;
			targetDSGenClass = (DSGenClass) eResolveProxy(oldTargetDSGenClass);
			if (targetDSGenClass != oldTargetDSGenClass)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DataSampleGenPackage.DS_GEN_REFERENCE__TARGET_DS_GEN_CLASS, oldTargetDSGenClass, targetDSGenClass));
			}
		}
		return targetDSGenClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSGenClass basicGetTargetDSGenClass()
	{
		return targetDSGenClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetDSGenClass(DSGenClass newTargetDSGenClass)
	{
		DSGenClass oldTargetDSGenClass = targetDSGenClass;
		targetDSGenClass = newTargetDSGenClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataSampleGenPackage.DS_GEN_REFERENCE__TARGET_DS_GEN_CLASS,
					oldTargetDSGenClass, targetDSGenClass));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
		case DataSampleGenPackage.DS_GEN_REFERENCE__TARGET_DS_GEN_CLASS:
			if (resolve)
				return getTargetDSGenClass();
			return basicGetTargetDSGenClass();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
		case DataSampleGenPackage.DS_GEN_REFERENCE__TARGET_DS_GEN_CLASS:
			setTargetDSGenClass((DSGenClass) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
		case DataSampleGenPackage.DS_GEN_REFERENCE__TARGET_DS_GEN_CLASS:
			setTargetDSGenClass((DSGenClass) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
		case DataSampleGenPackage.DS_GEN_REFERENCE__TARGET_DS_GEN_CLASS:
			return targetDSGenClass != null;
		}
		return super.eIsSet(featureID);
	}

} // DSGenReferenceImpl
