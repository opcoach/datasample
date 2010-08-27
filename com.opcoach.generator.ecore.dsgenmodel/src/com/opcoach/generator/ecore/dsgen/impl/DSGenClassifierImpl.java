/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.generator.ecore.dsgen.impl;

import com.opcoach.generator.ecore.dsgen.DSGenClassifier;
import com.opcoach.generator.ecore.dsgen.DSGenFeature;
import com.opcoach.generator.ecore.dsgen.DSGenPackage;
import com.opcoach.generator.ecore.dsgen.DataSampleGenPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DS Gen Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.opcoach.generator.ecore.dsgen.impl.DSGenClassifierImpl#getEcoreClass <em>Ecore Class</em>}</li>
 *   <li>{@link com.opcoach.generator.ecore.dsgen.impl.DSGenClassifierImpl#getDsgenFeatures <em>Dsgen Features</em>}</li>
 *   <li>{@link com.opcoach.generator.ecore.dsgen.impl.DSGenClassifierImpl#getDsgenPackage <em>Dsgen Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DSGenClassifierImpl extends DSGenBaseImpl implements DSGenClassifier
{
	/**
	 * The cached value of the '{@link #getEcoreClass() <em>Ecore Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcoreClass()
	 * @generated
	 * @ordered
	 */
	protected EClass ecoreClass;

	/**
	 * The cached value of the '{@link #getDsgenFeatures() <em>Dsgen Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDsgenFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<DSGenFeature> dsgenFeatures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DSGenClassifierImpl()
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
		return DataSampleGenPackage.Literals.DS_GEN_CLASSIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEcoreClass()
	{
		if (ecoreClass != null && ecoreClass.eIsProxy())
		{
			InternalEObject oldEcoreClass = (InternalEObject)ecoreClass;
			ecoreClass = (EClass)eResolveProxy(oldEcoreClass);
			if (ecoreClass != oldEcoreClass)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataSampleGenPackage.DS_GEN_CLASSIFIER__ECORE_CLASS, oldEcoreClass, ecoreClass));
			}
		}
		return ecoreClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetEcoreClass()
	{
		return ecoreClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcoreClass(EClass newEcoreClass)
	{
		EClass oldEcoreClass = ecoreClass;
		ecoreClass = newEcoreClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataSampleGenPackage.DS_GEN_CLASSIFIER__ECORE_CLASS, oldEcoreClass, ecoreClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DSGenFeature> getDsgenFeatures()
	{
		if (dsgenFeatures == null)
		{
			dsgenFeatures = new EObjectContainmentWithInverseEList<DSGenFeature>(DSGenFeature.class, this, DataSampleGenPackage.DS_GEN_CLASSIFIER__DSGEN_FEATURES, DataSampleGenPackage.DS_GEN_FEATURE__DSGEN_CLASS);
		}
		return dsgenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSGenPackage getDsgenPackage()
	{
		if (eContainerFeatureID() != DataSampleGenPackage.DS_GEN_CLASSIFIER__DSGEN_PACKAGE) return null;
		return (DSGenPackage)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDsgenPackage(DSGenPackage newDsgenPackage, NotificationChain msgs)
	{
		msgs = eBasicSetContainer((InternalEObject)newDsgenPackage, DataSampleGenPackage.DS_GEN_CLASSIFIER__DSGEN_PACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDsgenPackage(DSGenPackage newDsgenPackage)
	{
		if (newDsgenPackage != eInternalContainer() || (eContainerFeatureID() != DataSampleGenPackage.DS_GEN_CLASSIFIER__DSGEN_PACKAGE && newDsgenPackage != null))
		{
			if (EcoreUtil.isAncestor(this, newDsgenPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDsgenPackage != null)
				msgs = ((InternalEObject)newDsgenPackage).eInverseAdd(this, DataSampleGenPackage.DS_GEN_PACKAGE__DSGEN_CLASSIFIERS, DSGenPackage.class, msgs);
			msgs = basicSetDsgenPackage(newDsgenPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataSampleGenPackage.DS_GEN_CLASSIFIER__DSGEN_PACKAGE, newDsgenPackage, newDsgenPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case DataSampleGenPackage.DS_GEN_CLASSIFIER__DSGEN_FEATURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDsgenFeatures()).basicAdd(otherEnd, msgs);
			case DataSampleGenPackage.DS_GEN_CLASSIFIER__DSGEN_PACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDsgenPackage((DSGenPackage)otherEnd, msgs);
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
			case DataSampleGenPackage.DS_GEN_CLASSIFIER__DSGEN_FEATURES:
				return ((InternalEList<?>)getDsgenFeatures()).basicRemove(otherEnd, msgs);
			case DataSampleGenPackage.DS_GEN_CLASSIFIER__DSGEN_PACKAGE:
				return basicSetDsgenPackage(null, msgs);
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
			case DataSampleGenPackage.DS_GEN_CLASSIFIER__DSGEN_PACKAGE:
				return eInternalContainer().eInverseRemove(this, DataSampleGenPackage.DS_GEN_PACKAGE__DSGEN_CLASSIFIERS, DSGenPackage.class, msgs);
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
			case DataSampleGenPackage.DS_GEN_CLASSIFIER__ECORE_CLASS:
				if (resolve) return getEcoreClass();
				return basicGetEcoreClass();
			case DataSampleGenPackage.DS_GEN_CLASSIFIER__DSGEN_FEATURES:
				return getDsgenFeatures();
			case DataSampleGenPackage.DS_GEN_CLASSIFIER__DSGEN_PACKAGE:
				return getDsgenPackage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case DataSampleGenPackage.DS_GEN_CLASSIFIER__ECORE_CLASS:
				setEcoreClass((EClass)newValue);
				return;
			case DataSampleGenPackage.DS_GEN_CLASSIFIER__DSGEN_FEATURES:
				getDsgenFeatures().clear();
				getDsgenFeatures().addAll((Collection<? extends DSGenFeature>)newValue);
				return;
			case DataSampleGenPackage.DS_GEN_CLASSIFIER__DSGEN_PACKAGE:
				setDsgenPackage((DSGenPackage)newValue);
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
			case DataSampleGenPackage.DS_GEN_CLASSIFIER__ECORE_CLASS:
				setEcoreClass((EClass)null);
				return;
			case DataSampleGenPackage.DS_GEN_CLASSIFIER__DSGEN_FEATURES:
				getDsgenFeatures().clear();
				return;
			case DataSampleGenPackage.DS_GEN_CLASSIFIER__DSGEN_PACKAGE:
				setDsgenPackage((DSGenPackage)null);
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
			case DataSampleGenPackage.DS_GEN_CLASSIFIER__ECORE_CLASS:
				return ecoreClass != null;
			case DataSampleGenPackage.DS_GEN_CLASSIFIER__DSGEN_FEATURES:
				return dsgenFeatures != null && !dsgenFeatures.isEmpty();
			case DataSampleGenPackage.DS_GEN_CLASSIFIER__DSGEN_PACKAGE:
				return getDsgenPackage() != null;
		}
		return super.eIsSet(featureID);
	}

} //DSGenClassifierImpl
