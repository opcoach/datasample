/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.dsgen.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.opcoach.dsgen.DSGenClassifier;
import com.opcoach.dsgen.DSGenFeature;
import com.opcoach.dsgen.DataSampleGenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DS Gen Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.opcoach.dsgen.impl.DSGenFeatureImpl#isNullableValue <em>Nullable Value</em>}</li>
 *   <li>{@link com.opcoach.dsgen.impl.DSGenFeatureImpl#getNullablePercent <em>Nullable Percent</em>}</li>
 *   <li>{@link com.opcoach.dsgen.impl.DSGenFeatureImpl#getDsgenClass <em>Dsgen Class</em>}</li>
 *   <li>{@link com.opcoach.dsgen.impl.DSGenFeatureImpl#getEcoreFeature <em>Ecore Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DSGenFeatureImpl extends DSGenTypedElementImpl implements DSGenFeature
{
	/**
	 * The default value of the '{@link #isNullableValue() <em>Nullable Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNullableValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NULLABLE_VALUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNullableValue() <em>Nullable Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNullableValue()
	 * @generated
	 * @ordered
	 */
	protected boolean nullableValue = NULLABLE_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNullablePercent() <em>Nullable Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullablePercent()
	 * @generated
	 * @ordered
	 */
	protected static final int NULLABLE_PERCENT_EDEFAULT = 10;

	/**
	 * The cached value of the '{@link #getNullablePercent() <em>Nullable Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullablePercent()
	 * @generated
	 * @ordered
	 */
	protected int nullablePercent = NULLABLE_PERCENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEcoreFeature() <em>Ecore Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcoreFeature()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature ecoreFeature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DSGenFeatureImpl()
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
		return DataSampleGenPackage.Literals.DS_GEN_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNullableValue()
	{
		return nullableValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullableValue(boolean newNullableValue)
	{
		boolean oldNullableValue = nullableValue;
		nullableValue = newNullableValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataSampleGenPackage.DS_GEN_FEATURE__NULLABLE_VALUE, oldNullableValue, nullableValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNullablePercent()
	{
		return nullablePercent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullablePercent(int newNullablePercent)
	{
		int oldNullablePercent = nullablePercent;
		nullablePercent = newNullablePercent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataSampleGenPackage.DS_GEN_FEATURE__NULLABLE_PERCENT, oldNullablePercent, nullablePercent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSGenClassifier getDsgenClass()
	{
		if (eContainerFeatureID() != DataSampleGenPackage.DS_GEN_FEATURE__DSGEN_CLASS) return null;
		return (DSGenClassifier)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDsgenClass(DSGenClassifier newDsgenClass, NotificationChain msgs)
	{
		msgs = eBasicSetContainer((InternalEObject)newDsgenClass, DataSampleGenPackage.DS_GEN_FEATURE__DSGEN_CLASS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDsgenClass(DSGenClassifier newDsgenClass)
	{
		if (newDsgenClass != eInternalContainer() || (eContainerFeatureID() != DataSampleGenPackage.DS_GEN_FEATURE__DSGEN_CLASS && newDsgenClass != null))
		{
			if (EcoreUtil.isAncestor(this, newDsgenClass))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDsgenClass != null)
				msgs = ((InternalEObject)newDsgenClass).eInverseAdd(this, DataSampleGenPackage.DS_GEN_CLASSIFIER__DSGEN_FEATURES, DSGenClassifier.class, msgs);
			msgs = basicSetDsgenClass(newDsgenClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataSampleGenPackage.DS_GEN_FEATURE__DSGEN_CLASS, newDsgenClass, newDsgenClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature getEcoreFeature()
	{
		if (ecoreFeature != null && ecoreFeature.eIsProxy())
		{
			InternalEObject oldEcoreFeature = (InternalEObject)ecoreFeature;
			ecoreFeature = (EStructuralFeature)eResolveProxy(oldEcoreFeature);
			if (ecoreFeature != oldEcoreFeature)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataSampleGenPackage.DS_GEN_FEATURE__ECORE_FEATURE, oldEcoreFeature, ecoreFeature));
			}
		}
		return ecoreFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature basicGetEcoreFeature()
	{
		return ecoreFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcoreFeature(EStructuralFeature newEcoreFeature)
	{
		EStructuralFeature oldEcoreFeature = ecoreFeature;
		ecoreFeature = newEcoreFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataSampleGenPackage.DS_GEN_FEATURE__ECORE_FEATURE, oldEcoreFeature, ecoreFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case DataSampleGenPackage.DS_GEN_FEATURE__DSGEN_CLASS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDsgenClass((DSGenClassifier)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case DataSampleGenPackage.DS_GEN_FEATURE__DSGEN_CLASS:
				return basicSetDsgenClass(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
	{
		switch (eContainerFeatureID())
		{
			case DataSampleGenPackage.DS_GEN_FEATURE__DSGEN_CLASS:
				return eInternalContainer().eInverseRemove(this, DataSampleGenPackage.DS_GEN_CLASSIFIER__DSGEN_FEATURES, DSGenClassifier.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case DataSampleGenPackage.DS_GEN_FEATURE__NULLABLE_VALUE:
				return isNullableValue();
			case DataSampleGenPackage.DS_GEN_FEATURE__NULLABLE_PERCENT:
				return getNullablePercent();
			case DataSampleGenPackage.DS_GEN_FEATURE__DSGEN_CLASS:
				return getDsgenClass();
			case DataSampleGenPackage.DS_GEN_FEATURE__ECORE_FEATURE:
				if (resolve) return getEcoreFeature();
				return basicGetEcoreFeature();
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
			case DataSampleGenPackage.DS_GEN_FEATURE__NULLABLE_VALUE:
				setNullableValue((Boolean)newValue);
				return;
			case DataSampleGenPackage.DS_GEN_FEATURE__NULLABLE_PERCENT:
				setNullablePercent((Integer)newValue);
				return;
			case DataSampleGenPackage.DS_GEN_FEATURE__DSGEN_CLASS:
				setDsgenClass((DSGenClassifier)newValue);
				return;
			case DataSampleGenPackage.DS_GEN_FEATURE__ECORE_FEATURE:
				setEcoreFeature((EStructuralFeature)newValue);
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
			case DataSampleGenPackage.DS_GEN_FEATURE__NULLABLE_VALUE:
				setNullableValue(NULLABLE_VALUE_EDEFAULT);
				return;
			case DataSampleGenPackage.DS_GEN_FEATURE__NULLABLE_PERCENT:
				setNullablePercent(NULLABLE_PERCENT_EDEFAULT);
				return;
			case DataSampleGenPackage.DS_GEN_FEATURE__DSGEN_CLASS:
				setDsgenClass((DSGenClassifier)null);
				return;
			case DataSampleGenPackage.DS_GEN_FEATURE__ECORE_FEATURE:
				setEcoreFeature((EStructuralFeature)null);
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
			case DataSampleGenPackage.DS_GEN_FEATURE__NULLABLE_VALUE:
				return nullableValue != NULLABLE_VALUE_EDEFAULT;
			case DataSampleGenPackage.DS_GEN_FEATURE__NULLABLE_PERCENT:
				return nullablePercent != NULLABLE_PERCENT_EDEFAULT;
			case DataSampleGenPackage.DS_GEN_FEATURE__DSGEN_CLASS:
				return getDsgenClass() != null;
			case DataSampleGenPackage.DS_GEN_FEATURE__ECORE_FEATURE:
				return ecoreFeature != null;
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
		result.append(" (nullableValue: ");
		result.append(nullableValue);
		result.append(", nullablePercent: ");
		result.append(nullablePercent);
		result.append(')');
		return result.toString();
	}

} //DSGenFeatureImpl
