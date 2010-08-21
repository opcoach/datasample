/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.generator.basic.impl;

import com.opcoach.generator.basic.BasicPackage;
import com.opcoach.generator.basic.StringGenerator;

import com.opcoach.generator.impl.ReferenceGeneratorImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.opcoach.generator.basic.impl.StringGeneratorImpl#getDataFilename <em>Data Filename</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StringGeneratorImpl extends ReferenceGeneratorImpl<String> implements StringGenerator
{
	/**
	 * The default value of the '{@link #getDataFilename() <em>Data Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFilename()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_FILENAME_EDEFAULT = null;

	@Override
	protected String generateSimpleValue()
	{
		// TODO Auto-generated method stub
		return super.generateSimpleValue();
	}

	/**
	 * The cached value of the '{@link #getDataFilename() <em>Data Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFilename()
	 * @generated
	 * @ordered
	 */
	protected String dataFilename = DATA_FILENAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringGeneratorImpl()
	{
		super();
		// Temporary init
		for (int i = 0; i < 100; i ++)
		    addValue("valeur_"+i);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return BasicPackage.Literals.STRING_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataFilename()
	{
		return dataFilename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataFilename(String newDataFilename)
	{
		String oldDataFilename = dataFilename;
		dataFilename = newDataFilename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.STRING_GENERATOR__DATA_FILENAME, oldDataFilename, dataFilename));
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
			case BasicPackage.STRING_GENERATOR__DATA_FILENAME:
				return getDataFilename();
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
			case BasicPackage.STRING_GENERATOR__DATA_FILENAME:
				setDataFilename((String)newValue);
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
			case BasicPackage.STRING_GENERATOR__DATA_FILENAME:
				setDataFilename(DATA_FILENAME_EDEFAULT);
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
			case BasicPackage.STRING_GENERATOR__DATA_FILENAME:
				return DATA_FILENAME_EDEFAULT == null ? dataFilename != null : !DATA_FILENAME_EDEFAULT.equals(dataFilename);
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
		result.append(" (dataFilename: ");
		result.append(dataFilename);
		result.append(')');
		return result.toString();
	}

	/* (non-Javadoc)
	 * @see com.opcoach.generator.basic.StringGenerator#setRootData(java.lang.String)
	 */
	public static void setRootData(String root)
	{
		// TODO Auto-generated method stub
		
	}

} //StringGeneratorImpl
