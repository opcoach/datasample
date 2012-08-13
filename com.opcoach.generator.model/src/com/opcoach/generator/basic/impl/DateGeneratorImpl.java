 /**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.generator.basic.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.opcoach.generator.basic.BasicPackage;
import com.opcoach.generator.basic.DateGenerator;
import com.opcoach.generator.impl.RangeGeneratorImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.opcoach.generator.basic.impl.DateGeneratorImpl#isGenerateNow <em>Generate Now</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DateGeneratorImpl extends RangeGeneratorImpl<Date> implements DateGenerator
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
	private static final Date DEFAULT_START_DATE = new GregorianCalendar(2000,1,1).getTime();
	private static final Date DEFAULT_END_DATE = new GregorianCalendar(2019,12,31).getTime();

	private long dateRange;

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected DateGeneratorImpl()
	{
		this(DEFAULT_START_DATE, DEFAULT_END_DATE);
	}
	
	  /** Default javabean constructor. Build it with min and max date bounds */
	public DateGeneratorImpl(Date vlow, Date vhigh) 
	{
		super(vlow, vhigh);
		dateRange = vhigh.getTime() - vlow.getTime();
		step = new Date(86400000L);  // By default one day
		setType(Date.class);
	}
	
	
	@Override
	protected Date generateRandomValue()
	{
		if (generateNow)
			return new Date();
		
		 // Generate random value.
	   	  long dateVal = getRandomizer().nextLong();
	   	  if (dateVal > (dateRange))
	   	  {
	   		  // Must adjust the value. 
	   		dateVal = (long) (dateVal * (dateRange)/(Long.MAX_VALUE - Long.MIN_VALUE));
	   	  }
	   	  // Can return the result .
	   	  dateVal +=  low.getTime();
	   	  
	   	  return new Date(dateVal);
	   	  
	}



	@Override
	protected Date generateSimpleValue()
	{
		
		if (generateNow)
			return new Date();

		Date result;
		
		if (lastGeneratedValue == null)
			result = low;
		else
		{
			long dateVal =  lastGeneratedValue.getTime() + step.getTime();
			// Restart ˆ low value if value to high.
			if (dateVal > high.getTime())
				dateVal = low.getTime();
			result = new Date(dateVal);
		}
		
		return result;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return BasicPackage.Literals.DATE_GENERATOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.DATE_GENERATOR__GENERATE_NOW, oldGenerateNow, generateNow));
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
			case BasicPackage.DATE_GENERATOR__GENERATE_NOW:
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
			case BasicPackage.DATE_GENERATOR__GENERATE_NOW:
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
			case BasicPackage.DATE_GENERATOR__GENERATE_NOW:
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
			case BasicPackage.DATE_GENERATOR__GENERATE_NOW:
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

	/* (non-Javadoc)
	 * @see com.opcoach.generator.impl.RangeGeneratorImpl#computeBoundsAsString()
	 */
	@Override
	protected String computeDescription()
	{
		if (generateNow)
			return "Now Date";
		else
		{
			SimpleDateFormat df = new SimpleDateFormat("dd/MM/yy");
			String lowStr = df.format(getLow());
			String highStr = df.format(getHigh());
			return " [" + lowStr + "," + highStr + "] " + super.computeDescription();
		}
	}

} //DateGeneratorImpl
