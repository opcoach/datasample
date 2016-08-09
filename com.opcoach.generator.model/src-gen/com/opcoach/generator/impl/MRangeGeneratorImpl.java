/**
 */
package com.opcoach.generator.impl;

import com.opcoach.generator.MGeneratorPackage;
import com.opcoach.generator.RangeGenerator;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Range Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.opcoach.generator.impl.MRangeGeneratorImpl#getLow <em>Low</em>}</li>
 *   <li>{@link com.opcoach.generator.impl.MRangeGeneratorImpl#getHigh <em>High</em>}</li>
 *   <li>{@link com.opcoach.generator.impl.MRangeGeneratorImpl#getStep <em>Step</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 public abstract class MRangeGeneratorImpl<T> extends ValueGeneratorImpl<T> implements RangeGenerator<T>
{
	/**
	 * The cached value of the '{@link #getLow() <em>Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLow()
	 * @generated
	 * @ordered
	 */
	protected T low;

	/**
	 * The cached value of the '{@link #getHigh() <em>High</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHigh()
	 * @generated
	 * @ordered
	 */
	protected T high;

	/**
	 * The cached value of the '{@link #getStep() <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected T step;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MRangeGeneratorImpl()
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
		return MGeneratorPackage.Literals.RANGE_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T getLow()
	{
		return low;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLow(T newLow)
	{
		T oldLow = low;
		low = newLow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MGeneratorPackage.RANGE_GENERATOR__LOW, oldLow, low));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T getHigh()
	{
		return high;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHigh(T newHigh)
	{
		T oldHigh = high;
		high = newHigh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MGeneratorPackage.RANGE_GENERATOR__HIGH, oldHigh, high));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T getStep()
	{
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStep(T newStep)
	{
		T oldStep = step;
		step = newStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MGeneratorPackage.RANGE_GENERATOR__STEP, oldStep, step));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBounds(T low, T high)
	{
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
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case MGeneratorPackage.RANGE_GENERATOR__LOW:
				return getLow();
			case MGeneratorPackage.RANGE_GENERATOR__HIGH:
				return getHigh();
			case MGeneratorPackage.RANGE_GENERATOR__STEP:
				return getStep();
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
			case MGeneratorPackage.RANGE_GENERATOR__LOW:
				setLow((T)newValue);
				return;
			case MGeneratorPackage.RANGE_GENERATOR__HIGH:
				setHigh((T)newValue);
				return;
			case MGeneratorPackage.RANGE_GENERATOR__STEP:
				setStep((T)newValue);
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
			case MGeneratorPackage.RANGE_GENERATOR__LOW:
				setLow((T)null);
				return;
			case MGeneratorPackage.RANGE_GENERATOR__HIGH:
				setHigh((T)null);
				return;
			case MGeneratorPackage.RANGE_GENERATOR__STEP:
				setStep((T)null);
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
			case MGeneratorPackage.RANGE_GENERATOR__LOW:
				return low != null;
			case MGeneratorPackage.RANGE_GENERATOR__HIGH:
				return high != null;
			case MGeneratorPackage.RANGE_GENERATOR__STEP:
				return step != null;
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
		result.append(" (low: ");
		result.append(low);
		result.append(", high: ");
		result.append(high);
		result.append(", step: ");
		result.append(step);
		result.append(')');
		return result.toString();
	}

} //MRangeGeneratorImpl
