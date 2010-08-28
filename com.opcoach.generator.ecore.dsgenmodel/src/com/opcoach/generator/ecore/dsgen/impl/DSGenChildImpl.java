/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.generator.ecore.dsgen.impl;

import com.opcoach.generator.ecore.dsgen.DSGenChild;
import com.opcoach.generator.ecore.dsgen.DSGenClass;
import com.opcoach.generator.ecore.dsgen.DSGenReference;
import com.opcoach.generator.ecore.dsgen.DataSampleGenPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DS Gen Child</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.opcoach.generator.ecore.dsgen.impl.DSGenChildImpl#getDsgenClass <em>Dsgen Class</em>}</li>
 *   <li>{@link com.opcoach.generator.ecore.dsgen.impl.DSGenChildImpl#isSingle <em>Single</em>}</li>
 *   <li>{@link com.opcoach.generator.ecore.dsgen.impl.DSGenChildImpl#getOppositeReference <em>Opposite Reference</em>}</li>
 *   <li>{@link com.opcoach.generator.ecore.dsgen.impl.DSGenChildImpl#getSourceReference <em>Source Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DSGenChildImpl extends EObjectImpl implements DSGenChild
{
	/**
	 * The cached value of the '{@link #getDsgenClass() <em>Dsgen Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDsgenClass()
	 * @generated
	 * @ordered
	 */
	protected DSGenClass dsgenClass;

	/**
	 * The default value of the '{@link #isSingle() <em>Single</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSingle()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SINGLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSingle() <em>Single</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSingle()
	 * @generated
	 * @ordered
	 */
	protected boolean single = SINGLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOppositeReference() <em>Opposite Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOppositeReference()
	 * @generated
	 * @ordered
	 */
	protected DSGenReference oppositeReference;

	/**
	 * The cached value of the '{@link #getSourceReference() <em>Source Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceReference()
	 * @generated
	 * @ordered
	 */
	protected DSGenReference sourceReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DSGenChildImpl()
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
		return DataSampleGenPackage.Literals.DS_GEN_CHILD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSGenClass getDsgenClass()
	{
		if (dsgenClass != null && dsgenClass.eIsProxy())
		{
			InternalEObject oldDsgenClass = (InternalEObject)dsgenClass;
			dsgenClass = (DSGenClass)eResolveProxy(oldDsgenClass);
			if (dsgenClass != oldDsgenClass)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataSampleGenPackage.DS_GEN_CHILD__DSGEN_CLASS, oldDsgenClass, dsgenClass));
			}
		}
		return dsgenClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSGenClass basicGetDsgenClass()
	{
		return dsgenClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDsgenClass(DSGenClass newDsgenClass)
	{
		DSGenClass oldDsgenClass = dsgenClass;
		dsgenClass = newDsgenClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataSampleGenPackage.DS_GEN_CHILD__DSGEN_CLASS, oldDsgenClass, dsgenClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSingle()
	{
		return single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingle(boolean newSingle)
	{
		boolean oldSingle = single;
		single = newSingle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataSampleGenPackage.DS_GEN_CHILD__SINGLE, oldSingle, single));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSGenReference getOppositeReference()
	{
		if (oppositeReference != null && oppositeReference.eIsProxy())
		{
			InternalEObject oldOppositeReference = (InternalEObject)oppositeReference;
			oppositeReference = (DSGenReference)eResolveProxy(oldOppositeReference);
			if (oppositeReference != oldOppositeReference)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataSampleGenPackage.DS_GEN_CHILD__OPPOSITE_REFERENCE, oldOppositeReference, oppositeReference));
			}
		}
		return oppositeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSGenReference basicGetOppositeReference()
	{
		return oppositeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOppositeReference(DSGenReference newOppositeReference)
	{
		DSGenReference oldOppositeReference = oppositeReference;
		oppositeReference = newOppositeReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataSampleGenPackage.DS_GEN_CHILD__OPPOSITE_REFERENCE, oldOppositeReference, oppositeReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSGenReference getSourceReference()
	{
		if (sourceReference != null && sourceReference.eIsProxy())
		{
			InternalEObject oldSourceReference = (InternalEObject)sourceReference;
			sourceReference = (DSGenReference)eResolveProxy(oldSourceReference);
			if (sourceReference != oldSourceReference)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataSampleGenPackage.DS_GEN_CHILD__SOURCE_REFERENCE, oldSourceReference, sourceReference));
			}
		}
		return sourceReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSGenReference basicGetSourceReference()
	{
		return sourceReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceReference(DSGenReference newSourceReference)
	{
		DSGenReference oldSourceReference = sourceReference;
		sourceReference = newSourceReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataSampleGenPackage.DS_GEN_CHILD__SOURCE_REFERENCE, oldSourceReference, sourceReference));
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
			case DataSampleGenPackage.DS_GEN_CHILD__DSGEN_CLASS:
				if (resolve) return getDsgenClass();
				return basicGetDsgenClass();
			case DataSampleGenPackage.DS_GEN_CHILD__SINGLE:
				return isSingle();
			case DataSampleGenPackage.DS_GEN_CHILD__OPPOSITE_REFERENCE:
				if (resolve) return getOppositeReference();
				return basicGetOppositeReference();
			case DataSampleGenPackage.DS_GEN_CHILD__SOURCE_REFERENCE:
				if (resolve) return getSourceReference();
				return basicGetSourceReference();
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
			case DataSampleGenPackage.DS_GEN_CHILD__DSGEN_CLASS:
				setDsgenClass((DSGenClass)newValue);
				return;
			case DataSampleGenPackage.DS_GEN_CHILD__SINGLE:
				setSingle((Boolean)newValue);
				return;
			case DataSampleGenPackage.DS_GEN_CHILD__OPPOSITE_REFERENCE:
				setOppositeReference((DSGenReference)newValue);
				return;
			case DataSampleGenPackage.DS_GEN_CHILD__SOURCE_REFERENCE:
				setSourceReference((DSGenReference)newValue);
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
			case DataSampleGenPackage.DS_GEN_CHILD__DSGEN_CLASS:
				setDsgenClass((DSGenClass)null);
				return;
			case DataSampleGenPackage.DS_GEN_CHILD__SINGLE:
				setSingle(SINGLE_EDEFAULT);
				return;
			case DataSampleGenPackage.DS_GEN_CHILD__OPPOSITE_REFERENCE:
				setOppositeReference((DSGenReference)null);
				return;
			case DataSampleGenPackage.DS_GEN_CHILD__SOURCE_REFERENCE:
				setSourceReference((DSGenReference)null);
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
			case DataSampleGenPackage.DS_GEN_CHILD__DSGEN_CLASS:
				return dsgenClass != null;
			case DataSampleGenPackage.DS_GEN_CHILD__SINGLE:
				return single != SINGLE_EDEFAULT;
			case DataSampleGenPackage.DS_GEN_CHILD__OPPOSITE_REFERENCE:
				return oppositeReference != null;
			case DataSampleGenPackage.DS_GEN_CHILD__SOURCE_REFERENCE:
				return sourceReference != null;
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
		result.append(" (single: ");
		result.append(single);
		result.append(')');
		return result.toString();
	}

} //DSGenChildImpl
