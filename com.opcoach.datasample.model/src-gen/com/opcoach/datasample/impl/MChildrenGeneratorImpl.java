/**
 */
package com.opcoach.datasample.impl;

import com.opcoach.datasample.ChildrenGenerator;
import com.opcoach.datasample.EntityGenerator;
import com.opcoach.datasample.MDatasamplePackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Children Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.opcoach.datasample.impl.MChildrenGeneratorImpl#isPolymorphic <em>Polymorphic</em>}</li>
 *   <li>{@link com.opcoach.datasample.impl.MChildrenGeneratorImpl#getChildrenGenerators <em>Children Generators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MChildrenGeneratorImpl extends FieldGeneratorImpl implements ChildrenGenerator {
	/**
	 * The default value of the '{@link #isPolymorphic() <em>Polymorphic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPolymorphic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean POLYMORPHIC_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isPolymorphic() <em>Polymorphic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPolymorphic()
	 * @generated
	 * @ordered
	 */
	protected boolean polymorphic = POLYMORPHIC_EDEFAULT;
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
	public boolean isPolymorphic() {
		return polymorphic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPolymorphic(boolean newPolymorphic) {
		boolean oldPolymorphic = polymorphic;
		polymorphic = newPolymorphic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDatasamplePackage.CHILDREN_GENERATOR__POLYMORPHIC, oldPolymorphic, polymorphic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EntityGenerator> getChildrenGenerators() {
		if (childrenGenerators == null) {
			childrenGenerators = new EObjectContainmentEList<EntityGenerator>(EntityGenerator.class, this, MDatasamplePackage.CHILDREN_GENERATOR__CHILDREN_GENERATORS);
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
			case MDatasamplePackage.CHILDREN_GENERATOR__CHILDREN_GENERATORS:
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
			case MDatasamplePackage.CHILDREN_GENERATOR__POLYMORPHIC:
				return isPolymorphic();
			case MDatasamplePackage.CHILDREN_GENERATOR__CHILDREN_GENERATORS:
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
			case MDatasamplePackage.CHILDREN_GENERATOR__POLYMORPHIC:
				setPolymorphic((Boolean)newValue);
				return;
			case MDatasamplePackage.CHILDREN_GENERATOR__CHILDREN_GENERATORS:
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
			case MDatasamplePackage.CHILDREN_GENERATOR__POLYMORPHIC:
				setPolymorphic(POLYMORPHIC_EDEFAULT);
				return;
			case MDatasamplePackage.CHILDREN_GENERATOR__CHILDREN_GENERATORS:
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
			case MDatasamplePackage.CHILDREN_GENERATOR__POLYMORPHIC:
				return polymorphic != POLYMORPHIC_EDEFAULT;
			case MDatasamplePackage.CHILDREN_GENERATOR__CHILDREN_GENERATORS:
				return childrenGenerators != null && !childrenGenerators.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (polymorphic: ");
		result.append(polymorphic);
		result.append(')');
		return result.toString();
	}

} //MChildrenGeneratorImpl
