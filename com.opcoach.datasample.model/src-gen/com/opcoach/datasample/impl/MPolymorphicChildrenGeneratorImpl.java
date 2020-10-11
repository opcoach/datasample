/**
 */
package com.opcoach.datasample.impl;

import com.opcoach.datasample.ChildrenGenerator;
import com.opcoach.datasample.EntityGenerator;
import com.opcoach.datasample.MDatasamplePackage;
import com.opcoach.datasample.PolymorphicChildrenGenerator;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Polymorphic Children Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.opcoach.datasample.impl.MPolymorphicChildrenGeneratorImpl#getChildrenGenerators <em>Children Generators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MPolymorphicChildrenGeneratorImpl extends ChildrenGeneratorImpl implements PolymorphicChildrenGenerator {
	/**
	 * The cached value of the '{@link #getChildrenGenerators() <em>Children Generators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildrenGenerators()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityGenerator> childrenGenerators;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MPolymorphicChildrenGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MDatasamplePackage.Literals.POLYMORPHIC_CHILDREN_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EntityGenerator> getChildrenGenerators() {
		if (childrenGenerators == null) {
			childrenGenerators = new EObjectContainmentEList<EntityGenerator>(EntityGenerator.class, this, MDatasamplePackage.POLYMORPHIC_CHILDREN_GENERATOR__CHILDREN_GENERATORS);
		}
		return childrenGenerators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MDatasamplePackage.POLYMORPHIC_CHILDREN_GENERATOR__CHILDREN_GENERATORS:
				return ((InternalEList<?>)getChildrenGenerators()).basicRemove(otherEnd, msgs);
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
			case MDatasamplePackage.POLYMORPHIC_CHILDREN_GENERATOR__CHILDREN_GENERATORS:
				return getChildrenGenerators();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MDatasamplePackage.POLYMORPHIC_CHILDREN_GENERATOR__CHILDREN_GENERATORS:
				getChildrenGenerators().clear();
				getChildrenGenerators().addAll((Collection<? extends EntityGenerator>)newValue);
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
			case MDatasamplePackage.POLYMORPHIC_CHILDREN_GENERATOR__CHILDREN_GENERATORS:
				getChildrenGenerators().clear();
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
			case MDatasamplePackage.POLYMORPHIC_CHILDREN_GENERATOR__CHILDREN_GENERATORS:
				return childrenGenerators != null && !childrenGenerators.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MPolymorphicChildrenGeneratorImpl
