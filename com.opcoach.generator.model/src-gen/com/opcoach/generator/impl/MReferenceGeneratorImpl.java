/**
 */
package com.opcoach.generator.impl;

import com.opcoach.generator.MGeneratorPackage;
import com.opcoach.generator.ReferenceGenerator;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.opcoach.generator.impl.MReferenceGeneratorImpl#getStep <em>Step</em>}</li>
 *   <li>{@link com.opcoach.generator.impl.MReferenceGeneratorImpl#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 public class MReferenceGeneratorImpl<T> extends ValueGeneratorImpl<T> implements ReferenceGenerator<T>
{
	/**
	 * The default value of the '{@link #getStep() <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected static final int STEP_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getStep() <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected int step = STEP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected Collection<T> values;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MReferenceGeneratorImpl()
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
		return MGeneratorPackage.Literals.REFERENCE_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStep()
	{
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStep(int newStep)
	{
		int oldStep = step;
		step = newStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MGeneratorPackage.REFERENCE_GENERATOR__STEP, oldStep, step));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<T> getValues()
	{
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValues(Collection<T> newValues)
	{
		Collection<T> oldValues = values;
		values = newValues;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MGeneratorPackage.REFERENCE_GENERATOR__VALUES, oldValues, values));
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
			case MGeneratorPackage.REFERENCE_GENERATOR__STEP:
				return getStep();
			case MGeneratorPackage.REFERENCE_GENERATOR__VALUES:
				return getValues();
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
			case MGeneratorPackage.REFERENCE_GENERATOR__STEP:
				setStep((Integer)newValue);
				return;
			case MGeneratorPackage.REFERENCE_GENERATOR__VALUES:
				setValues((Collection<T>)newValue);
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
			case MGeneratorPackage.REFERENCE_GENERATOR__STEP:
				setStep(STEP_EDEFAULT);
				return;
			case MGeneratorPackage.REFERENCE_GENERATOR__VALUES:
				setValues((Collection<T>)null);
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
			case MGeneratorPackage.REFERENCE_GENERATOR__STEP:
				return step != STEP_EDEFAULT;
			case MGeneratorPackage.REFERENCE_GENERATOR__VALUES:
				return values != null;
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
		result.append(" (step: ");
		result.append(step);
		result.append(", values: ");
		result.append(values);
		result.append(')');
		return result.toString();
	}

} //MReferenceGeneratorImpl
