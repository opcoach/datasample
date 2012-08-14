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
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.opcoach.dsgen.DSGenChild;
import com.opcoach.dsgen.DSGenClass;
import com.opcoach.dsgen.DataSampleGenPackage;
import com.opcoach.dsgen.generator.EObjectGenerator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>DS Gen Class</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.opcoach.dsgen.impl.DSGenClassImpl#isRootObject <em>Root Object</em>}</li>
 *   <li>{@link com.opcoach.dsgen.impl.DSGenClassImpl#getNbAssociationRefTo <em>Nb Association Ref To</em>}</li>
 *   <li>{@link com.opcoach.dsgen.impl.DSGenClassImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link com.opcoach.dsgen.impl.DSGenClassImpl#getGenerator <em>Generator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DSGenClassImpl extends DSGenClassifierImpl implements DSGenClass
{
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "© OPCoach 2012";

	/**
	 * The default value of the '{@link #isRootObject() <em>Root Object</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isRootObject()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ROOT_OBJECT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRootObject() <em>Root Object</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isRootObject()
	 * @generated
	 * @ordered
	 */
	protected boolean rootObject = ROOT_OBJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbAssociationRefTo() <em>Nb Association Ref To</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getNbAssociationRefTo()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_ASSOCIATION_REF_TO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbAssociationRefTo() <em>Nb Association Ref To</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getNbAssociationRefTo()
	 * @generated
	 * @ordered
	 */
	protected int nbAssociationRefTo = NB_ASSOCIATION_REF_TO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<DSGenChild> children;

	/**
	 * The cached value of the '{@link #getGenerator() <em>Generator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerator()
	 * @generated
	 * @ordered
	 */
	protected EObjectGenerator generator;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DSGenClassImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return DataSampleGenPackage.Literals.DS_GEN_CLASS;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRootObject()
	{
		return rootObject;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbAssociationRefTo()
	{
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataSampleGenPackage.DS_GEN_CLASS__NB_ASSOCIATION_REF_TO,
					oldNbAssociationRefTo, nbAssociationRefTo));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void setNbAssociationRefTo(int newNbAssociationRefTo)
	{
		setNbAssociationRefToGen(newNbAssociationRefTo);
		/*if (newNbAssociationRefTo == 0)
		{
			// Unset the nb of instance (will be created directly)
			setInstanceNumber(-1);
		} */
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	public EObjectGenerator getGenerator()
	{
		return generator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenerator(EObjectGenerator newGenerator, NotificationChain msgs)
	{
		EObjectGenerator oldGenerator = generator;
		generator = newGenerator;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DataSampleGenPackage.DS_GEN_CLASS__GENERATOR, oldGenerator, newGenerator);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerator(EObjectGenerator newGenerator)
	{
		if (newGenerator != generator)
		{
			NotificationChain msgs = null;
			if (generator != null)
				msgs = ((InternalEObject) generator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- DataSampleGenPackage.DS_GEN_CLASS__GENERATOR, null, msgs);
			if (newGenerator != null)
				msgs = ((InternalEObject) newGenerator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- DataSampleGenPackage.DS_GEN_CLASS__GENERATOR, null, msgs);
			msgs = basicSetGenerator(newGenerator, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataSampleGenPackage.DS_GEN_CLASS__GENERATOR, newGenerator,
					newGenerator));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
		case DataSampleGenPackage.DS_GEN_CLASS__CHILDREN:
			return ((InternalEList<?>) getChildren()).basicRemove(otherEnd, msgs);
		case DataSampleGenPackage.DS_GEN_CLASS__GENERATOR:
			return basicSetGenerator(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootObject(boolean newRootObject)
	{
		boolean oldRootObject = rootObject;
		rootObject = newRootObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataSampleGenPackage.DS_GEN_CLASS__ROOT_OBJECT, oldRootObject,
					rootObject));
	}

	

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
		case DataSampleGenPackage.DS_GEN_CLASS__ROOT_OBJECT:
			return isRootObject();
		case DataSampleGenPackage.DS_GEN_CLASS__NB_ASSOCIATION_REF_TO:
			return getNbAssociationRefTo();
		case DataSampleGenPackage.DS_GEN_CLASS__CHILDREN:
			return getChildren();
		case DataSampleGenPackage.DS_GEN_CLASS__GENERATOR:
			return getGenerator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
		case DataSampleGenPackage.DS_GEN_CLASS__ROOT_OBJECT:
			setRootObject((Boolean) newValue);
			return;
		case DataSampleGenPackage.DS_GEN_CLASS__NB_ASSOCIATION_REF_TO:
			setNbAssociationRefTo((Integer) newValue);
			return;
		case DataSampleGenPackage.DS_GEN_CLASS__CHILDREN:
			getChildren().clear();
			getChildren().addAll((Collection<? extends DSGenChild>) newValue);
			return;
		case DataSampleGenPackage.DS_GEN_CLASS__GENERATOR:
			setGenerator((EObjectGenerator) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
		case DataSampleGenPackage.DS_GEN_CLASS__ROOT_OBJECT:
			setRootObject(ROOT_OBJECT_EDEFAULT);
			return;
		case DataSampleGenPackage.DS_GEN_CLASS__NB_ASSOCIATION_REF_TO:
			setNbAssociationRefTo(NB_ASSOCIATION_REF_TO_EDEFAULT);
			return;
		case DataSampleGenPackage.DS_GEN_CLASS__CHILDREN:
			getChildren().clear();
			return;
		case DataSampleGenPackage.DS_GEN_CLASS__GENERATOR:
			setGenerator((EObjectGenerator) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
		case DataSampleGenPackage.DS_GEN_CLASS__ROOT_OBJECT:
			return rootObject != ROOT_OBJECT_EDEFAULT;
		case DataSampleGenPackage.DS_GEN_CLASS__NB_ASSOCIATION_REF_TO:
			return nbAssociationRefTo != NB_ASSOCIATION_REF_TO_EDEFAULT;
		case DataSampleGenPackage.DS_GEN_CLASS__CHILDREN:
			return children != null && !children.isEmpty();
		case DataSampleGenPackage.DS_GEN_CLASS__GENERATOR:
			return generator != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public String toString()
	{
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (related ecoreClass : ");
		result.append((getEcoreClass() == null ? "NONE" : getEcoreClass().getName()));
		result.append(", rootObject: ");
		result.append(rootObject);
		result.append(", nbAssociationRefTo: ");
		result.append(nbAssociationRefTo);
		result.append(')');
		return result.toString();
	}

} // DSGenClassImpl
