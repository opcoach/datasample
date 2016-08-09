/**
 */
package com.opcoach.generator.basic.impl;

import com.opcoach.generator.basic.CasePolicyType;
import com.opcoach.generator.basic.MBasicPackage;
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
 *   <li>{@link com.opcoach.generator.basic.impl.MStringGeneratorImpl#getDataFilename <em>Data Filename</em>}</li>
 *   <li>{@link com.opcoach.generator.basic.impl.MStringGeneratorImpl#getCasePolicy <em>Case Policy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 public class MStringGeneratorImpl extends ReferenceGeneratorImpl<String> implements StringGenerator
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MStringGeneratorImpl()
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
		return MBasicPackage.Literals.STRING_GENERATOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MBasicPackage.STRING_GENERATOR__DATA_FILENAME, oldDataFilename, dataFilename));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MBasicPackage.STRING_GENERATOR__CASE_POLICY, oldCasePolicy, casePolicy));
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
			case MBasicPackage.STRING_GENERATOR__DATA_FILENAME:
				return getDataFilename();
			case MBasicPackage.STRING_GENERATOR__CASE_POLICY:
				return getCasePolicy();
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
			case MBasicPackage.STRING_GENERATOR__DATA_FILENAME:
				setDataFilename((String)newValue);
				return;
			case MBasicPackage.STRING_GENERATOR__CASE_POLICY:
				setCasePolicy((CasePolicyType)newValue);
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
			case MBasicPackage.STRING_GENERATOR__DATA_FILENAME:
				setDataFilename(DATA_FILENAME_EDEFAULT);
				return;
			case MBasicPackage.STRING_GENERATOR__CASE_POLICY:
				setCasePolicy(CASE_POLICY_EDEFAULT);
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
			case MBasicPackage.STRING_GENERATOR__DATA_FILENAME:
				return DATA_FILENAME_EDEFAULT == null ? dataFilename != null : !DATA_FILENAME_EDEFAULT.equals(dataFilename);
			case MBasicPackage.STRING_GENERATOR__CASE_POLICY:
				return casePolicy != CASE_POLICY_EDEFAULT;
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
		result.append(", casePolicy: ");
		result.append(casePolicy);
		result.append(')');
		return result.toString();
	}

} //MStringGeneratorImpl
