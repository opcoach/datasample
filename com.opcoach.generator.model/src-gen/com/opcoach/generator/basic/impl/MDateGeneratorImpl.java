/**
 */
package com.opcoach.generator.basic.impl;

import com.opcoach.generator.basic.MBasicPackage;
import com.opcoach.generator.basic.DateGenerator;
import com.opcoach.generator.impl.RangeGeneratorImpl;
import java.util.Date;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.opcoach.generator.basic.impl.MDateGeneratorImpl#isGenerateNow <em>Generate Now</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 public class MDateGeneratorImpl extends RangeGeneratorImpl<Date> implements DateGenerator
{
	/**
	 * The default value of the '{@link #isGenerateNow() <em>Generate Now</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateNow()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_NOW_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGenerateNow() <em>Generate Now</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateNow()
	 * @generated
	 * @ordered
	 */
	protected boolean generateNow = GENERATE_NOW_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MDateGeneratorImpl()
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
		return MBasicPackage.Literals.DATE_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setLow(Date newLow)
	{
		super.setLow(newLow);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setHigh(Date newHigh)
	{
		super.setHigh(newHigh);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setStep(Date newStep)
	{
		super.setStep(newStep);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGenerateNow()
	{
		return generateNow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerateNow(boolean newGenerateNow)
	{
		boolean oldGenerateNow = generateNow;
		generateNow = newGenerateNow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MBasicPackage.DATE_GENERATOR__GENERATE_NOW, oldGenerateNow, generateNow));
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
			case MBasicPackage.DATE_GENERATOR__GENERATE_NOW:
				return isGenerateNow();
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
			case MBasicPackage.DATE_GENERATOR__GENERATE_NOW:
				setGenerateNow((Boolean)newValue);
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
			case MBasicPackage.DATE_GENERATOR__GENERATE_NOW:
				setGenerateNow(GENERATE_NOW_EDEFAULT);
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
			case MBasicPackage.DATE_GENERATOR__GENERATE_NOW:
				return generateNow != GENERATE_NOW_EDEFAULT;
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
		result.append(" (generateNow: ");
		result.append(generateNow);
		result.append(')');
		return result.toString();
	}

} //MDateGeneratorImpl
