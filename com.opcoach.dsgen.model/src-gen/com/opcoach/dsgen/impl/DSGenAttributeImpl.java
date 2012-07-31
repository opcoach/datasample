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
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.opcoach.dsgen.DSGenAttribute;
import com.opcoach.dsgen.DataSampleGenPackage;
import com.opcoach.generator.ValueGenerator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DS Gen Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.opcoach.dsgen.impl.DSGenAttributeImpl#getGenerator <em>Generator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DSGenAttributeImpl extends DSGenFeatureImpl implements DSGenAttribute
{
	/**
	 * The cached value of the '{@link #getGenerator() <em>Generator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerator()
	 * @generated
	 * @ordered
	 */
	protected ValueGenerator<?> generator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DSGenAttributeImpl()
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
		return DataSampleGenPackage.Literals.DS_GEN_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueGenerator<?> getGenerator()
	{
		return generator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenerator(ValueGenerator<?> newGenerator, NotificationChain msgs)
	{
		ValueGenerator<?> oldGenerator = generator;
		generator = newGenerator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataSampleGenPackage.DS_GEN_ATTRIBUTE__GENERATOR, oldGenerator, newGenerator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerator(ValueGenerator<?> newGenerator)
	{
		if (newGenerator != generator) {
			NotificationChain msgs = null;
			if (generator != null)
				msgs = ((InternalEObject)generator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataSampleGenPackage.DS_GEN_ATTRIBUTE__GENERATOR, null, msgs);
			if (newGenerator != null)
				msgs = ((InternalEObject)newGenerator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataSampleGenPackage.DS_GEN_ATTRIBUTE__GENERATOR, null, msgs);
			msgs = basicSetGenerator(newGenerator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataSampleGenPackage.DS_GEN_ATTRIBUTE__GENERATOR, newGenerator, newGenerator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID) {
			case DataSampleGenPackage.DS_GEN_ATTRIBUTE__GENERATOR:
				return basicSetGenerator(null, msgs);
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
		switch (featureID) {
			case DataSampleGenPackage.DS_GEN_ATTRIBUTE__GENERATOR:
				return getGenerator();
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
			case DataSampleGenPackage.DS_GEN_ATTRIBUTE__GENERATOR:
				setGenerator((ValueGenerator<?>)newValue);
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
			case DataSampleGenPackage.DS_GEN_ATTRIBUTE__GENERATOR:
				setGenerator((ValueGenerator<?>)null);
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
			case DataSampleGenPackage.DS_GEN_ATTRIBUTE__GENERATOR:
				return generator != null;
		}
		return super.eIsSet(featureID);
	}

} //DSGenAttributeImpl
