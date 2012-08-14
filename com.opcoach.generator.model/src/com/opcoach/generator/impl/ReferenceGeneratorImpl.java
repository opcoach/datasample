/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.generator.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.opcoach.generator.GeneratorPackage;
import com.opcoach.generator.ReferenceGenerator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.opcoach.generator.impl.ReferenceGeneratorImpl#getStep <em>Step</em>}</li>
 *   <li>{@link com.opcoach.generator.impl.ReferenceGeneratorImpl#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferenceGeneratorImpl<T> extends ValueGeneratorImpl<T> implements ReferenceGenerator<T>
{
	
	/** The last generated index */
	protected int lastGeneratedIndex = -1;
		
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

	protected Vector<T> values;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceGeneratorImpl()
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
		return GeneratorPackage.Literals.REFERENCE_GENERATOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.REFERENCE_GENERATOR__STEP, oldStep, step));
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	public Collection<T> getValues()
	{
		return (values == null) ? Collections.EMPTY_LIST : values;
	}
	
	
	public void addValue(T value)
	{
		if (values == null)
			values = new Vector<T>();
		values.add(value);
	}
	


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setValues(Collection<T> newValues)
	{
		Collection<T> oldValues = values;
		values = new Vector<T>();
		values.addAll(newValues);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.REFERENCE_GENERATOR__VALUES, oldValues, values));
	}

	@Override
	protected T generateRandomValue()
	{
		// Get the values to check if there are samples 
		if (getValues().isEmpty())
			return null;

		// Find a random index in the array.
		lastGeneratedIndex = getRandomizer().nextInt(values.size());
		return (values == null) ? null : values.get(lastGeneratedIndex);

	}


	@Override
	protected T generateSimpleValue()
	{
		if (getValues().isEmpty())
			return null;
		
		if (lastGeneratedIndex == -1)
			lastGeneratedIndex = 0;
		else
		{
			lastGeneratedIndex += step;
			if (lastGeneratedIndex >= values.size())
			{
				lastGeneratedIndex = lastGeneratedIndex % values.size();
			}
		}
		
		return (values == null) ? null : values.get(lastGeneratedIndex);
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
			case GeneratorPackage.REFERENCE_GENERATOR__STEP:
				return getStep();
			case GeneratorPackage.REFERENCE_GENERATOR__VALUES:
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
			case GeneratorPackage.REFERENCE_GENERATOR__STEP:
				setStep((Integer)newValue);
				return;
			case GeneratorPackage.REFERENCE_GENERATOR__VALUES:
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
			case GeneratorPackage.REFERENCE_GENERATOR__STEP:
				setStep(STEP_EDEFAULT);
				return;
			case GeneratorPackage.REFERENCE_GENERATOR__VALUES:
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
			case GeneratorPackage.REFERENCE_GENERATOR__STEP:
				return step != STEP_EDEFAULT;
			case GeneratorPackage.REFERENCE_GENERATOR__VALUES:
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

} //ReferenceGeneratorImpl
