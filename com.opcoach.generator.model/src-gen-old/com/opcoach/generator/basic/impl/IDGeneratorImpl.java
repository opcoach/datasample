/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.generator.basic.impl;

import com.opcoach.generator.basic.BasicPackage;
import com.opcoach.generator.basic.IDGenerator;

import com.opcoach.generator.impl.ValueGeneratorImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ID Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.opcoach.generator.basic.impl.IDGeneratorImpl#getKeyLength <em>Key Length</em>}</li>
 *   <li>{@link com.opcoach.generator.basic.impl.IDGeneratorImpl#getPrefix <em>Prefix</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IDGeneratorImpl extends ValueGeneratorImpl<String> implements IDGenerator
{
	   /**  The last key returned */
    private static long __lastKey = 0L;

    /** The time that represents zero. */
    private static long __startTime = System.currentTimeMillis();

	
	/**
	 * The default value of the '{@link #getKeyLength() <em>Key Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyLength()
	 * @generated
	 * @ordered
	 */
	protected static final int KEY_LENGTH_EDEFAULT = 10;
	/**
	 * The cached value of the '{@link #getKeyLength() <em>Key Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyLength()
	 * @generated
	 * @ordered
	 */
	protected int keyLength = KEY_LENGTH_EDEFAULT;
	/**
	 * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated NOT
	 * @ordered
	 */
	protected static final String PREFIX_EDEFAULT = "";
	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected String prefix = PREFIX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IDGeneratorImpl()
	{
		super();
	}

	
	
	@Override
	protected String generateRandomValue()
	{
		// No random value
		return generateSimpleValue();
	}



	@Override
	protected String generateSimpleValue()
	{
		/** Generate a value base 36 encoded on 10 letters  */
        long value;
        // Find a new value
        synchronized (IDGenerator.class)
        {
            while ((value = System.currentTimeMillis() - __startTime) <= __lastKey)
            {
                // iterate
            }
            __lastKey = value;
        }

        // Convert it to a string using radix 36 (more compact)
        String longString = Long.toString(value, Character.MAX_RADIX);
    
        // And pad it right with zeroes according to the key length so that
        // alphabetical order is also numeric order.
        int longLength = longString.length() + prefix.length();

        StringBuffer result = new StringBuffer(prefix);
        for (int i = keyLength - longLength; i > 0; i--)
        {
            result.append('0');
        }
        result.append(longString);

        // Done
        return result.toString();
    
	}

	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return BasicPackage.Literals.ID_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setLastGeneratedValue(String newLastGeneratedValue)
	{
		super.setLastGeneratedValue(newLastGeneratedValue);
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getKeyLength()
	{
		return keyLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyLength(int newKeyLength)
	{
		int oldKeyLength = keyLength;
		keyLength = newKeyLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.ID_GENERATOR__KEY_LENGTH, oldKeyLength, keyLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrefix()
	{
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefix(String newPrefix)
	{
		String oldPrefix = prefix;
		prefix = newPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.ID_GENERATOR__PREFIX, oldPrefix, prefix));
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
			case BasicPackage.ID_GENERATOR__KEY_LENGTH:
				return getKeyLength();
			case BasicPackage.ID_GENERATOR__PREFIX:
				return getPrefix();
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
			case BasicPackage.ID_GENERATOR__KEY_LENGTH:
				setKeyLength((Integer)newValue);
				return;
			case BasicPackage.ID_GENERATOR__PREFIX:
				setPrefix((String)newValue);
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
			case BasicPackage.ID_GENERATOR__KEY_LENGTH:
				setKeyLength(KEY_LENGTH_EDEFAULT);
				return;
			case BasicPackage.ID_GENERATOR__PREFIX:
				setPrefix(PREFIX_EDEFAULT);
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
			case BasicPackage.ID_GENERATOR__KEY_LENGTH:
				return keyLength != KEY_LENGTH_EDEFAULT;
			case BasicPackage.ID_GENERATOR__PREFIX:
				return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
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
		result.append(" (keyLength: ");
		result.append(keyLength);
		result.append(", prefix: ");
		result.append(prefix);
		result.append(')');
		return result.toString();
	}

} //IDGeneratorImpl
