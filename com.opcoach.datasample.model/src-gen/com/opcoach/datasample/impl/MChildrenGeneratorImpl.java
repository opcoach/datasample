/**
 */
package com.opcoach.datasample.impl;

import com.opcoach.datasample.ChildrenGenerator;
import com.opcoach.datasample.EntityGenerator;
import com.opcoach.datasample.MDatasamplePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Children Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.opcoach.datasample.impl.MChildrenGeneratorImpl#getDelegatedEntityGenerator <em>Delegated Entity Generator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MChildrenGeneratorImpl extends FieldGeneratorImpl implements ChildrenGenerator {
	/**
	 * The cached value of the '{@link #getDelegatedEntityGenerator() <em>Delegated Entity Generator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegatedEntityGenerator()
	 * @generated
	 * @ordered
	 */
	protected EntityGenerator delegatedEntityGenerator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MChildrenGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MDatasamplePackage.Literals.CHILDREN_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntityGenerator getDelegatedEntityGenerator() {
		return delegatedEntityGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDelegatedEntityGenerator(EntityGenerator newDelegatedEntityGenerator, NotificationChain msgs) {
		EntityGenerator oldDelegatedEntityGenerator = delegatedEntityGenerator;
		delegatedEntityGenerator = newDelegatedEntityGenerator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MDatasamplePackage.CHILDREN_GENERATOR__DELEGATED_ENTITY_GENERATOR, oldDelegatedEntityGenerator, newDelegatedEntityGenerator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDelegatedEntityGenerator(EntityGenerator newDelegatedEntityGenerator) {
		if (newDelegatedEntityGenerator != delegatedEntityGenerator) {
			NotificationChain msgs = null;
			if (delegatedEntityGenerator != null)
				msgs = ((InternalEObject)delegatedEntityGenerator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MDatasamplePackage.CHILDREN_GENERATOR__DELEGATED_ENTITY_GENERATOR, null, msgs);
			if (newDelegatedEntityGenerator != null)
				msgs = ((InternalEObject)newDelegatedEntityGenerator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MDatasamplePackage.CHILDREN_GENERATOR__DELEGATED_ENTITY_GENERATOR, null, msgs);
			msgs = basicSetDelegatedEntityGenerator(newDelegatedEntityGenerator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDatasamplePackage.CHILDREN_GENERATOR__DELEGATED_ENTITY_GENERATOR, newDelegatedEntityGenerator, newDelegatedEntityGenerator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MDatasamplePackage.CHILDREN_GENERATOR__DELEGATED_ENTITY_GENERATOR:
				return basicSetDelegatedEntityGenerator(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MDatasamplePackage.CHILDREN_GENERATOR__DELEGATED_ENTITY_GENERATOR:
				return getDelegatedEntityGenerator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MDatasamplePackage.CHILDREN_GENERATOR__DELEGATED_ENTITY_GENERATOR:
				setDelegatedEntityGenerator((EntityGenerator)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case MDatasamplePackage.CHILDREN_GENERATOR__DELEGATED_ENTITY_GENERATOR:
				setDelegatedEntityGenerator((EntityGenerator)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MDatasamplePackage.CHILDREN_GENERATOR__DELEGATED_ENTITY_GENERATOR:
				return delegatedEntityGenerator != null;
		}
		return super.eIsSet(featureID);
	}

} //MChildrenGeneratorImpl
