/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.generator.basic.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.osgi.framework.Bundle;

import com.opcoach.generator.GeneratorActivator;
import com.opcoach.generator.basic.BasicPackage;
import com.opcoach.generator.basic.CasePolicyType;
import com.opcoach.generator.basic.CaseType;
import com.opcoach.generator.basic.StringGenerator;
import com.opcoach.generator.impl.ReferenceGeneratorImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>String Generator</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.opcoach.generator.basic.impl.StringGeneratorImpl#getDataFilename <em>Data Filename</em>}</li>
 *   <li>{@link com.opcoach.generator.basic.impl.StringGeneratorImpl#getCasePolicy <em>Case Policy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StringGeneratorImpl extends ReferenceGeneratorImpl<String>
		implements StringGenerator
{
	/**
	 * The location where data files should be searched (initialized by default
	 * with the bundle location)
	 */
	public static String rootData = null;

	/**
	 * The default value of the '{@link #getDataFilename() <em>Data Filename</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
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
	
	

	@Override
	public String generateValue()
	{
		// Manage the case policy
		String result = super.generateValue();
		switch (casePolicy)
		{
		case LOWERCASE : result = result.toLowerCase(); break;
		case UPPERCASE : result =  result.toUpperCase(); break;
		default : break;
		}
		
		return result;
		
	}



	/**
	 * The cached value of the '{@link #getDataFilename() <em>Data Filename</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getDataFilename()
	 * @generated
	 * @ordered
	 */
	protected String dataFilename = DATA_FILENAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCasePolicy() <em>Case Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCasePolicy()
	 * @generated
	 * @ordered
	 */
	protected static final CasePolicyType CASE_POLICY_EDEFAULT = CasePolicyType.DEFAULT;

	/**
	 * The cached value of the '{@link #getCasePolicy() <em>Case Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCasePolicy()
	 * @generated
	 * @ordered
	 */
	protected CasePolicyType casePolicy = CASE_POLICY_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected StringGeneratorImpl()
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
		return BasicPackage.Literals.STRING_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataFilename()
	{
		return dataFilename;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataFilenameGen(String newDataFilename)
	{
		String oldDataFilename = dataFilename;
		dataFilename = newDataFilename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.STRING_GENERATOR__DATA_FILENAME, oldDataFilename, dataFilename));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void setDataFilename(String newDataFilename)
	{
		setDataFilenameGen(newDataFilename);
		// Reset the values
		readValues();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CasePolicyType getCasePolicy()
	{
		return casePolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCasePolicy(CasePolicyType newCasePolicy)
	{
		CasePolicyType oldCasePolicy = casePolicy;
		casePolicy = newCasePolicy == null ? CASE_POLICY_EDEFAULT : newCasePolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.STRING_GENERATOR__CASE_POLICY, oldCasePolicy, casePolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootData2()
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case BasicPackage.STRING_GENERATOR__DATA_FILENAME:
				return getDataFilename();
			case BasicPackage.STRING_GENERATOR__CASE_POLICY:
				return getCasePolicy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
			case BasicPackage.STRING_GENERATOR__CASE_POLICY:
				setCasePolicy((CasePolicyType)newValue);
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
			case BasicPackage.STRING_GENERATOR__DATA_FILENAME:
				setDataFilename(DATA_FILENAME_EDEFAULT);
				return;
			case BasicPackage.STRING_GENERATOR__CASE_POLICY:
				setCasePolicy(CASE_POLICY_EDEFAULT);
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
			case BasicPackage.STRING_GENERATOR__DATA_FILENAME:
				return DATA_FILENAME_EDEFAULT == null ? dataFilename != null : !DATA_FILENAME_EDEFAULT.equals(dataFilename);
			case BasicPackage.STRING_GENERATOR__CASE_POLICY:
				return casePolicy != CASE_POLICY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (dataFilename: ");
		result.append(dataFilename);
		result.append(", casePolicy: ");
		result.append(casePolicy);
		result.append(')');
		return result.toString();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.opcoach.generator.basic.StringGenerator#setRootData(java.lang.String)
	 */
	public static void setRootData(String root)
	{
		rootData = root;

	}

	/** Read the datafile, and initialize values */
	private void readValues()
	{
		values = null;
		try
		{
			File f = new File(getDataFilename());
			if (f.exists())
			{
				FileReader reader = new FileReader(f);
				BufferedReader bf = new BufferedReader(reader);
				String s = null;
				while ((s = bf.readLine()) != null)
				{
					addValue(s);
				}
			}
		} catch (Exception ex)
		{
			System.out.println("Unable to read values in file : "
					+ getDataFilename());
		}
	}

	@Override
	public void setID(String newID)
	{
		super.setID(newID);
		final String DATA_FILE_EXT = ".txt";
		// According to ID, try to read a file containing possible values
		// Id may be set with several parts : rental.Customer.FirstName :
		// P1.P2.P3
		// Use the rootData if it has been set.
		// Search order is like this :
		// 1. rootData/P1.P2.P3.txt
		// 2. rootData/P2.P3.txt
		// 3. rootData/P3.txt
		// By default rootData is initialized with the location of
		// com.opcoach.generator Bundle

		// 1. search for rootData/P1.P2.P3.txt
		String fname = rootData + File.separator + newID + DATA_FILE_EXT;
		File f = new File(fname);
		if (f.exists())
			setDataFilename(fname);
		else
		{
			// 2. rootData/P2.P3.txt
			String[] names = newID.split("\\.",3);
			System.out.println("Found this names : " + names);
			if (names.length == 3)
			{
				fname = rootData + File.separator + names[1] + "." + names[2]
						+ DATA_FILE_EXT;
				f = new File(fname);
				if (f.exists())
					setDataFilename(fname);

			} else if (names.length == 2)
			{
				fname = rootData + File.separator + names[1] + DATA_FILE_EXT;
				f = new File(fname);
				if (f.exists())
					setDataFilename(fname);
			}

		}

	}

} // StringGeneratorImpl
