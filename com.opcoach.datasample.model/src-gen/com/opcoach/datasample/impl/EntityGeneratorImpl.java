/**
 */
package com.opcoach.datasample.impl;

import com.opcoach.datasample.DatasamplePackage;
import com.opcoach.datasample.EntityGenerator;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.opcoach.datasample.impl.EntityGeneratorImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link com.opcoach.datasample.impl.EntityGeneratorImpl#getEntityName <em>Entity Name</em>}</li>
 *   <li>{@link com.opcoach.datasample.impl.EntityGeneratorImpl#getEntity <em>Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityGeneratorImpl extends MinimalEObjectImpl.Container implements EntityGenerator
{
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityGeneratorImpl()
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
		return DatasamplePackage.Literals.ENTITY_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumber()
	{
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(int newNumber)
	{
		int oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatasamplePackage.ENTITY_GENERATOR__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEntityName()
	{
		return entityName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntityName(String newEntityName)
	{
		String oldEntityName = entityName;
		entityName = newEntityName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatasamplePackage.ENTITY_GENERATOR__ENTITY_NAME, oldEntityName, entityName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity()
	{
		if (entity != null && entity.eIsProxy())
		{
			InternalEObject oldEntity = (InternalEObject)entity;
			entity = (EClass)eResolveProxy(oldEntity);
			if (entity != oldEntity)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatasamplePackage.ENTITY_GENERATOR__ENTITY, oldEntity, entity));
			}
		}
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetEntity()
	{
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntity(EClass newEntity)
	{
		EClass oldEntity = entity;
		entity = newEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatasamplePackage.ENTITY_GENERATOR__ENTITY, oldEntity, entity));
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
			case DatasamplePackage.ENTITY_GENERATOR__NUMBER:
				return getNumber();
			case DatasamplePackage.ENTITY_GENERATOR__ENTITY_NAME:
				return getEntityName();
			case DatasamplePackage.ENTITY_GENERATOR__ENTITY:
				if (resolve) return getEntity();
				return basicGetEntity();
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
			case DatasamplePackage.ENTITY_GENERATOR__NUMBER:
				setNumber((Integer)newValue);
				return;
			case DatasamplePackage.ENTITY_GENERATOR__ENTITY_NAME:
				setEntityName((String)newValue);
				return;
			case DatasamplePackage.ENTITY_GENERATOR__ENTITY:
				setEntity((EClass)newValue);
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
			case DatasamplePackage.ENTITY_GENERATOR__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case DatasamplePackage.ENTITY_GENERATOR__ENTITY_NAME:
				setEntityName(ENTITY_NAME_EDEFAULT);
				return;
			case DatasamplePackage.ENTITY_GENERATOR__ENTITY:
				setEntity((EClass)null);
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
			case DatasamplePackage.ENTITY_GENERATOR__NUMBER:
				return number != NUMBER_EDEFAULT;
			case DatasamplePackage.ENTITY_GENERATOR__ENTITY_NAME:
				return ENTITY_NAME_EDEFAULT == null ? entityName != null : !ENTITY_NAME_EDEFAULT.equals(entityName);
			case DatasamplePackage.ENTITY_GENERATOR__ENTITY:
				return entity != null;
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
		result.append(" (number: ");
		result.append(number);
		result.append(", entityName: ");
		result.append(entityName);
		result.append(')');
		return result.toString();
	}

} //EntityGeneratorImpl