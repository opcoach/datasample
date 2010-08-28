/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.generator.ecore.dsgen.impl;

import com.opcoach.generator.ecore.dsgen.DSGenChild;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import com.opcoach.generator.ecore.dsgen.DSGenClass;
import com.opcoach.generator.ecore.dsgen.DataSampleGenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DS Gen Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.opcoach.generator.ecore.dsgen.impl.DSGenClassImpl#getInstanceNumber <em>Instance Number</em>}</li>
 *   <li>{@link com.opcoach.generator.ecore.dsgen.impl.DSGenClassImpl#isRootObject <em>Root Object</em>}</li>
 *   <li>{@link com.opcoach.generator.ecore.dsgen.impl.DSGenClassImpl#getNbAssociationRefTo <em>Nb Association Ref To</em>}</li>
 *   <li>{@link com.opcoach.generator.ecore.dsgen.impl.DSGenClassImpl#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DSGenClassImpl extends DSGenClassifierImpl implements DSGenClass
{
	/**
	 * The default value of the '{@link #getInstanceNumber() <em>Instance Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int INSTANCE_NUMBER_EDEFAULT = 50;

	/**
	 * The cached value of the '{@link #getInstanceNumber() <em>Instance Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceNumber()
	 * @generated
	 * @ordered
	 */
	protected int instanceNumber = INSTANCE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #isRootObject() <em>Root Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRootObject()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ROOT_OBJECT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRootObject() <em>Root Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRootObject()
	 * @generated
	 * @ordered
	 */
	protected boolean rootObject = ROOT_OBJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbAssociationRefTo() <em>Nb Association Ref To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbAssociationRefTo()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_ASSOCIATION_REF_TO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbAssociationRefTo() <em>Nb Association Ref To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbAssociationRefTo()
	 * @generated
	 * @ordered
	 */
	protected int nbAssociationRefTo = NB_ASSOCIATION_REF_TO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<DSGenChild> children;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DSGenClassImpl()
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
		return DataSampleGenPackage.Literals.DS_GEN_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInstanceNumber()
	{
		return instanceNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceNumber(int newInstanceNumber)
	{
		int oldInstanceNumber = instanceNumber;
		instanceNumber = newInstanceNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataSampleGenPackage.DS_GEN_CLASS__INSTANCE_NUMBER, oldInstanceNumber, instanceNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRootObject() {
		return rootObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbAssociationRefTo() {
		return nbAssociationRefTo;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbAssociationRefToGen(int newNbAssociationRefTo)
	{
		int oldNbAssociationRefTo = nbAssociationRefTo;
		nbAssociationRefTo = newNbAssociationRefTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataSampleGenPackage.DS_GEN_CLASS__NB_ASSOCIATION_REF_TO, oldNbAssociationRefTo, nbAssociationRefTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setNbAssociationRefTo(int newNbAssociationRefTo) {
		setNbAssociationRefToGen(newNbAssociationRefTo);
		if (newNbAssociationRefTo == 0)
		{
			// Unset the nb of instance (will be created directly)
			setInstanceNumber(-1);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DSGenChild> getChildren()
	{
		if (children == null)
		{
			children = new EObjectContainmentEList<DSGenChild>(DSGenChild.class, this, DataSampleGenPackage.DS_GEN_CLASS__CHILDREN);
		}
		return children;
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
			case DataSampleGenPackage.DS_GEN_CLASS__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootObjectGen(boolean newRootObject)
	{
		boolean oldRootObject = rootObject;
		rootObject = newRootObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataSampleGenPackage.DS_GEN_CLASS__ROOT_OBJECT, oldRootObject, rootObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setRootObject(boolean newRootObject) {
		setRootObjectGen(newRootObject);
		// Main object implies only one instance will be created.
		setInstanceNumber(1);	}


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
			case DataSampleGenPackage.DS_GEN_CLASS__INSTANCE_NUMBER:
				return getInstanceNumber();
			case DataSampleGenPackage.DS_GEN_CLASS__ROOT_OBJECT:
				return isRootObject();
			case DataSampleGenPackage.DS_GEN_CLASS__NB_ASSOCIATION_REF_TO:
				return getNbAssociationRefTo();
			case DataSampleGenPackage.DS_GEN_CLASS__CHILDREN:
				return getChildren();
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
			case DataSampleGenPackage.DS_GEN_CLASS__INSTANCE_NUMBER:
				setInstanceNumber((Integer)newValue);
				return;
			case DataSampleGenPackage.DS_GEN_CLASS__ROOT_OBJECT:
				setRootObject((Boolean)newValue);
				return;
			case DataSampleGenPackage.DS_GEN_CLASS__NB_ASSOCIATION_REF_TO:
				setNbAssociationRefTo((Integer)newValue);
				return;
			case DataSampleGenPackage.DS_GEN_CLASS__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends DSGenChild>)newValue);
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
			case DataSampleGenPackage.DS_GEN_CLASS__INSTANCE_NUMBER:
				setInstanceNumber(INSTANCE_NUMBER_EDEFAULT);
				return;
			case DataSampleGenPackage.DS_GEN_CLASS__ROOT_OBJECT:
				setRootObject(ROOT_OBJECT_EDEFAULT);
				return;
			case DataSampleGenPackage.DS_GEN_CLASS__NB_ASSOCIATION_REF_TO:
				setNbAssociationRefTo(NB_ASSOCIATION_REF_TO_EDEFAULT);
				return;
			case DataSampleGenPackage.DS_GEN_CLASS__CHILDREN:
				getChildren().clear();
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
			case DataSampleGenPackage.DS_GEN_CLASS__INSTANCE_NUMBER:
				return instanceNumber != INSTANCE_NUMBER_EDEFAULT;
			case DataSampleGenPackage.DS_GEN_CLASS__ROOT_OBJECT:
				return rootObject != ROOT_OBJECT_EDEFAULT;
			case DataSampleGenPackage.DS_GEN_CLASS__NB_ASSOCIATION_REF_TO:
				return nbAssociationRefTo != NB_ASSOCIATION_REF_TO_EDEFAULT;
			case DataSampleGenPackage.DS_GEN_CLASS__CHILDREN:
				return children != null && !children.isEmpty();
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
		result.append(" (instanceNumber: ");
		result.append(instanceNumber);
		result.append(", rootObject: ");
		result.append(rootObject);
		result.append(", nbAssociationRefTo: ");
		result.append(nbAssociationRefTo);
		result.append(')');
		return result.toString();
	}

} //DSGenClassImpl
