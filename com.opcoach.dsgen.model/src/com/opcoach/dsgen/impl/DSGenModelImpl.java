/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.dsgen.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.opcoach.dsgen.DSGenModel;
import com.opcoach.dsgen.DSGenPackage;
import com.opcoach.dsgen.DataSampleGenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DS Gen Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.opcoach.dsgen.impl.DSGenModelImpl#getDsgenPackages <em>Dsgen Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DSGenModelImpl extends DSGenBaseImpl implements DSGenModel
{
	/**
	 * The cached value of the '{@link #getDsgenPackages() <em>Dsgen Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDsgenPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<DSGenPackage> dsgenPackages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DSGenModelImpl()
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
		return DataSampleGenPackage.Literals.DS_GEN_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DSGenPackage> getDsgenPackages()
	{
		if (dsgenPackages == null)
		{
			dsgenPackages = new EObjectContainmentWithInverseEList<DSGenPackage>(DSGenPackage.class, this, DataSampleGenPackage.DS_GEN_MODEL__DSGEN_PACKAGES, DataSampleGenPackage.DS_GEN_PACKAGE__DSGEN_MODEL);
		}
		return dsgenPackages;
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
			case DataSampleGenPackage.DS_GEN_MODEL__DSGEN_PACKAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDsgenPackages()).basicAdd(otherEnd, msgs);
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
			case DataSampleGenPackage.DS_GEN_MODEL__DSGEN_PACKAGES:
				return ((InternalEList<?>)getDsgenPackages()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case DataSampleGenPackage.DS_GEN_MODEL__DSGEN_PACKAGES:
				return getDsgenPackages();
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
			case DataSampleGenPackage.DS_GEN_MODEL__DSGEN_PACKAGES:
				getDsgenPackages().clear();
				getDsgenPackages().addAll((Collection<? extends DSGenPackage>)newValue);
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
			case DataSampleGenPackage.DS_GEN_MODEL__DSGEN_PACKAGES:
				getDsgenPackages().clear();
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
			case DataSampleGenPackage.DS_GEN_MODEL__DSGEN_PACKAGES:
				return dsgenPackages != null && !dsgenPackages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DSGenModelImpl
