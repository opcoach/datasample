/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.dsgen.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import com.opcoach.dsgen.DSGenClassifier;
import com.opcoach.dsgen.DSGenModel;
import com.opcoach.dsgen.DSGenPackage;
import com.opcoach.dsgen.DataSampleGenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DS Gen Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.opcoach.dsgen.impl.DSGenPackageImpl#getEcorePackage <em>Ecore Package</em>}</li>
 *   <li>{@link com.opcoach.dsgen.impl.DSGenPackageImpl#getDsgenModel <em>Dsgen Model</em>}</li>
 *   <li>{@link com.opcoach.dsgen.impl.DSGenPackageImpl#getDsgenClassifiers <em>Dsgen Classifiers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DSGenPackageImpl extends DSGenBaseImpl implements DSGenPackage
{
	/**
	 * The cached value of the '{@link #getEcorePackage() <em>Ecore Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcorePackage()
	 * @generated
	 * @ordered
	 */
	protected EPackage ecorePackage;

	/**
	 * The cached value of the '{@link #getDsgenClassifiers() <em>Dsgen Classifiers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDsgenClassifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<DSGenClassifier> dsgenClassifiers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DSGenPackageImpl()
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
		return DataSampleGenPackage.Literals.DS_GEN_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage getEcorePackage()
	{
		if (ecorePackage != null && ecorePackage.eIsProxy())
		{
			InternalEObject oldEcorePackage = (InternalEObject)ecorePackage;
			ecorePackage = (EPackage)eResolveProxy(oldEcorePackage);
			if (ecorePackage != oldEcorePackage)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataSampleGenPackage.DS_GEN_PACKAGE__ECORE_PACKAGE, oldEcorePackage, ecorePackage));
			}
		}
		return ecorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage basicGetEcorePackage()
	{
		return ecorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcorePackage(EPackage newEcorePackage)
	{
		EPackage oldEcorePackage = ecorePackage;
		ecorePackage = newEcorePackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataSampleGenPackage.DS_GEN_PACKAGE__ECORE_PACKAGE, oldEcorePackage, ecorePackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSGenModel getDsgenModel()
	{
		if (eContainerFeatureID() != DataSampleGenPackage.DS_GEN_PACKAGE__DSGEN_MODEL) return null;
		return (DSGenModel)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDsgenModel(DSGenModel newDsgenModel, NotificationChain msgs)
	{
		msgs = eBasicSetContainer((InternalEObject)newDsgenModel, DataSampleGenPackage.DS_GEN_PACKAGE__DSGEN_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDsgenModel(DSGenModel newDsgenModel)
	{
		if (newDsgenModel != eInternalContainer() || (eContainerFeatureID() != DataSampleGenPackage.DS_GEN_PACKAGE__DSGEN_MODEL && newDsgenModel != null))
		{
			if (EcoreUtil.isAncestor(this, newDsgenModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDsgenModel != null)
				msgs = ((InternalEObject)newDsgenModel).eInverseAdd(this, DataSampleGenPackage.DS_GEN_MODEL__DSGEN_PACKAGES, DSGenModel.class, msgs);
			msgs = basicSetDsgenModel(newDsgenModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataSampleGenPackage.DS_GEN_PACKAGE__DSGEN_MODEL, newDsgenModel, newDsgenModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DSGenClassifier> getDsgenClassifiers()
	{
		if (dsgenClassifiers == null)
		{
			dsgenClassifiers = new EObjectContainmentWithInverseEList<DSGenClassifier>(DSGenClassifier.class, this, DataSampleGenPackage.DS_GEN_PACKAGE__DSGEN_CLASSIFIERS, DataSampleGenPackage.DS_GEN_CLASSIFIER__DSGEN_PACKAGE);
		}
		return dsgenClassifiers;
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
			case DataSampleGenPackage.DS_GEN_PACKAGE__DSGEN_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDsgenModel((DSGenModel)otherEnd, msgs);
			case DataSampleGenPackage.DS_GEN_PACKAGE__DSGEN_CLASSIFIERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDsgenClassifiers()).basicAdd(otherEnd, msgs);
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
			case DataSampleGenPackage.DS_GEN_PACKAGE__DSGEN_MODEL:
				return basicSetDsgenModel(null, msgs);
			case DataSampleGenPackage.DS_GEN_PACKAGE__DSGEN_CLASSIFIERS:
				return ((InternalEList<?>)getDsgenClassifiers()).basicRemove(otherEnd, msgs);
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
			case DataSampleGenPackage.DS_GEN_PACKAGE__DSGEN_MODEL:
				return eInternalContainer().eInverseRemove(this, DataSampleGenPackage.DS_GEN_MODEL__DSGEN_PACKAGES, DSGenModel.class, msgs);
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
			case DataSampleGenPackage.DS_GEN_PACKAGE__ECORE_PACKAGE:
				if (resolve) return getEcorePackage();
				return basicGetEcorePackage();
			case DataSampleGenPackage.DS_GEN_PACKAGE__DSGEN_MODEL:
				return getDsgenModel();
			case DataSampleGenPackage.DS_GEN_PACKAGE__DSGEN_CLASSIFIERS:
				return getDsgenClassifiers();
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
			case DataSampleGenPackage.DS_GEN_PACKAGE__ECORE_PACKAGE:
				setEcorePackage((EPackage)newValue);
				return;
			case DataSampleGenPackage.DS_GEN_PACKAGE__DSGEN_MODEL:
				setDsgenModel((DSGenModel)newValue);
				return;
			case DataSampleGenPackage.DS_GEN_PACKAGE__DSGEN_CLASSIFIERS:
				getDsgenClassifiers().clear();
				getDsgenClassifiers().addAll((Collection<? extends DSGenClassifier>)newValue);
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
			case DataSampleGenPackage.DS_GEN_PACKAGE__ECORE_PACKAGE:
				setEcorePackage((EPackage)null);
				return;
			case DataSampleGenPackage.DS_GEN_PACKAGE__DSGEN_MODEL:
				setDsgenModel((DSGenModel)null);
				return;
			case DataSampleGenPackage.DS_GEN_PACKAGE__DSGEN_CLASSIFIERS:
				getDsgenClassifiers().clear();
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
			case DataSampleGenPackage.DS_GEN_PACKAGE__ECORE_PACKAGE:
				return ecorePackage != null;
			case DataSampleGenPackage.DS_GEN_PACKAGE__DSGEN_MODEL:
				return getDsgenModel() != null;
			case DataSampleGenPackage.DS_GEN_PACKAGE__DSGEN_CLASSIFIERS:
				return dsgenClassifiers != null && !dsgenClassifiers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DSGenPackageImpl
