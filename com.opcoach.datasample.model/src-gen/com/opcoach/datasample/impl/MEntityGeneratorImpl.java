/**
 */
package com.opcoach.datasample.impl;

import com.opcoach.datasample.EntityGenerator;
import com.opcoach.datasample.FieldGenerator;
import com.opcoach.datasample.MDatasamplePackage;

import com.opcoach.generator.impl.ValueGeneratorImpl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.opcoach.datasample.impl.MEntityGeneratorImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link com.opcoach.datasample.impl.MEntityGeneratorImpl#getEntityName <em>Entity Name</em>}</li>
 *   <li>{@link com.opcoach.datasample.impl.MEntityGeneratorImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link com.opcoach.datasample.impl.MEntityGeneratorImpl#getFieldGenerators <em>Field Generators</em>}</li>
 *   <li>{@link com.opcoach.datasample.impl.MEntityGeneratorImpl#getChildGenerators <em>Child Generators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MEntityGeneratorImpl extends ValueGeneratorImpl<EObject> implements EntityGenerator {
	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected int number = NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getEntityName() <em>Entity Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityName()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTITY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntityName() <em>Entity Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityName()
	 * @generated
	 * @ordered
	 */
	protected String entityName = ENTITY_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected EClass entity;

	/**
	 * The cached value of the '{@link #getFieldGenerators() <em>Field Generators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldGenerators()
	 * @generated
	 * @ordered
	 */
	protected EList<FieldGenerator> fieldGenerators;

	/**
	 * The cached value of the '{@link #getChildGenerators() <em>Child Generators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildGenerators()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityGenerator> childGenerators;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MEntityGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MDatasamplePackage.Literals.ENTITY_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setLastGeneratedValue(EObject newLastGeneratedValue) {
		super.setLastGeneratedValue(newLastGeneratedValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(int newNumber) {
		int oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDatasamplePackage.ENTITY_GENERATOR__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEntityName() {
		return entityName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntityName(String newEntityName) {
		String oldEntityName = entityName;
		entityName = newEntityName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDatasamplePackage.ENTITY_GENERATOR__ENTITY_NAME, oldEntityName, entityName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		if (entity != null && entity.eIsProxy()) {
			InternalEObject oldEntity = (InternalEObject)entity;
			entity = (EClass)eResolveProxy(oldEntity);
			if (entity != oldEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MDatasamplePackage.ENTITY_GENERATOR__ENTITY, oldEntity, entity));
			}
		}
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetEntity() {
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntity(EClass newEntity) {
		EClass oldEntity = entity;
		entity = newEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDatasamplePackage.ENTITY_GENERATOR__ENTITY, oldEntity, entity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FieldGenerator> getFieldGenerators() {
		if (fieldGenerators == null) {
			fieldGenerators = new EObjectContainmentEList<FieldGenerator>(FieldGenerator.class, this, MDatasamplePackage.ENTITY_GENERATOR__FIELD_GENERATORS);
		}
		return fieldGenerators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityGenerator> getChildGenerators() {
		if (childGenerators == null) {
			childGenerators = new EObjectContainmentEList<EntityGenerator>(EntityGenerator.class, this, MDatasamplePackage.ENTITY_GENERATOR__CHILD_GENERATORS);
		}
		return childGenerators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getInstances() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MDatasamplePackage.ENTITY_GENERATOR__FIELD_GENERATORS:
				return ((InternalEList<?>)getFieldGenerators()).basicRemove(otherEnd, msgs);
			case MDatasamplePackage.ENTITY_GENERATOR__CHILD_GENERATORS:
				return ((InternalEList<?>)getChildGenerators()).basicRemove(otherEnd, msgs);
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
			case MDatasamplePackage.ENTITY_GENERATOR__NUMBER:
				return getNumber();
			case MDatasamplePackage.ENTITY_GENERATOR__ENTITY_NAME:
				return getEntityName();
			case MDatasamplePackage.ENTITY_GENERATOR__ENTITY:
				if (resolve) return getEntity();
				return basicGetEntity();
			case MDatasamplePackage.ENTITY_GENERATOR__FIELD_GENERATORS:
				return getFieldGenerators();
			case MDatasamplePackage.ENTITY_GENERATOR__CHILD_GENERATORS:
				return getChildGenerators();
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
			case MDatasamplePackage.ENTITY_GENERATOR__NUMBER:
				setNumber((Integer)newValue);
				return;
			case MDatasamplePackage.ENTITY_GENERATOR__ENTITY_NAME:
				setEntityName((String)newValue);
				return;
			case MDatasamplePackage.ENTITY_GENERATOR__ENTITY:
				setEntity((EClass)newValue);
				return;
			case MDatasamplePackage.ENTITY_GENERATOR__FIELD_GENERATORS:
				getFieldGenerators().clear();
				getFieldGenerators().addAll((Collection<? extends FieldGenerator>)newValue);
				return;
			case MDatasamplePackage.ENTITY_GENERATOR__CHILD_GENERATORS:
				getChildGenerators().clear();
				getChildGenerators().addAll((Collection<? extends EntityGenerator>)newValue);
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
			case MDatasamplePackage.ENTITY_GENERATOR__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case MDatasamplePackage.ENTITY_GENERATOR__ENTITY_NAME:
				setEntityName(ENTITY_NAME_EDEFAULT);
				return;
			case MDatasamplePackage.ENTITY_GENERATOR__ENTITY:
				setEntity((EClass)null);
				return;
			case MDatasamplePackage.ENTITY_GENERATOR__FIELD_GENERATORS:
				getFieldGenerators().clear();
				return;
			case MDatasamplePackage.ENTITY_GENERATOR__CHILD_GENERATORS:
				getChildGenerators().clear();
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
			case MDatasamplePackage.ENTITY_GENERATOR__NUMBER:
				return number != NUMBER_EDEFAULT;
			case MDatasamplePackage.ENTITY_GENERATOR__ENTITY_NAME:
				return ENTITY_NAME_EDEFAULT == null ? entityName != null : !ENTITY_NAME_EDEFAULT.equals(entityName);
			case MDatasamplePackage.ENTITY_GENERATOR__ENTITY:
				return entity != null;
			case MDatasamplePackage.ENTITY_GENERATOR__FIELD_GENERATORS:
				return fieldGenerators != null && !fieldGenerators.isEmpty();
			case MDatasamplePackage.ENTITY_GENERATOR__CHILD_GENERATORS:
				return childGenerators != null && !childGenerators.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case MDatasamplePackage.ENTITY_GENERATOR___GET_INSTANCES:
				getInstances();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (number: ");
		result.append(number);
		result.append(", entityName: ");
		result.append(entityName);
		result.append(')');
		return result.toString();
	}

} //MEntityGeneratorImpl
