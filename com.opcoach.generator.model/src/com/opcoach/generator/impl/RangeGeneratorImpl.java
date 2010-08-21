/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.generator.impl;

import com.opcoach.generator.GeneratorPackage;
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
 *   <li>{@link com.opcoach.generator.impl.RangeGeneratorImpl#getLow <em>Low</em>}</li>
 *   <li>{@link com.opcoach.generator.impl.RangeGeneratorImpl#getHigh <em>High</em>}</li>
 *   <li>{@link com.opcoach.generator.impl.RangeGeneratorImpl#getStep <em>Step</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RangeGeneratorImpl<T> extends ValueGeneratorImpl<T> implements RangeGenerator<T>
{
	
	
	public RangeGeneratorImpl(T vlow, T vhigh)
	{
		super();
		low = vlow;
		high = vhigh;
	}

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
	protected RangeGeneratorImpl()
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
		return GeneratorPackage.Literals.RANGE_GENERATOR;
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowGen(T newLow)
	{
		T oldLow = low;
		low = newLow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.RANGE_GENERATOR__LOW, oldLow, low));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setLow(T newLow)
	{
		setLowGen(newLow);
		description = null;
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHighGen(T newHigh)
	{
		T oldHigh = high;
		high = newHigh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.RANGE_GENERATOR__HIGH, oldHigh, high));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setHigh(T newHigh)
	{
		setHighGen(newHigh);
		description = null;

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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.RANGE_GENERATOR__STEP, oldStep, step));
	}
	
	
	/** Default implementation for bounds */
	protected String computeDescription()
	{

		// TODO Auto-generated method stub
		return "[" + low.toString() + "," + high.toString() + "] " + super.computeDescription();

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
			case GeneratorPackage.RANGE_GENERATOR__LOW:
				return getLow();
			case GeneratorPackage.RANGE_GENERATOR__HIGH:
				return getHigh();
			case GeneratorPackage.RANGE_GENERATOR__STEP:
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
			case GeneratorPackage.RANGE_GENERATOR__LOW:
				setLow((T)newValue);
				return;
			case GeneratorPackage.RANGE_GENERATOR__HIGH:
				setHigh((T)newValue);
				return;
			case GeneratorPackage.RANGE_GENERATOR__STEP:
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
			case GeneratorPackage.RANGE_GENERATOR__LOW:
				setLow((T)null);
				return;
			case GeneratorPackage.RANGE_GENERATOR__HIGH:
				setHigh((T)null);
				return;
			case GeneratorPackage.RANGE_GENERATOR__STEP:
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
			case GeneratorPackage.RANGE_GENERATOR__LOW:
				return low != null;
			case GeneratorPackage.RANGE_GENERATOR__HIGH:
				return high != null;
			case GeneratorPackage.RANGE_GENERATOR__STEP:
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

} //RangeGeneratorImpl
