/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.generator.basic.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import com.opcoach.generator.RangeGenerator;
import com.opcoach.generator.ReferenceGenerator;
import com.opcoach.generator.ValueGenerator;
import com.opcoach.generator.basic.BasicPackage;
import com.opcoach.generator.basic.BooleanGenerator;
import com.opcoach.generator.basic.DateGenerator;
import com.opcoach.generator.basic.DoubleGenerator;
import com.opcoach.generator.basic.FloatGenerator;
import com.opcoach.generator.basic.IDGenerator;
import com.opcoach.generator.basic.IntGenerator;
import com.opcoach.generator.basic.LongGenerator;
import com.opcoach.generator.basic.NullValueGenerator;
import com.opcoach.generator.basic.StringGenerator;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.opcoach.generator.basic.BasicPackage
 * @generated
 */
public class BasicSwitch<T1> extends Switch<T1>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BasicPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = BasicPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage)
	{
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID)
		{
			case BasicPackage.BOOLEAN_GENERATOR:
			{
				BooleanGenerator booleanGenerator = (BooleanGenerator)theEObject;
				T1 result = caseBooleanGenerator(booleanGenerator);
				if (result == null) result = caseValueGenerator(booleanGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicPackage.DATE_GENERATOR:
			{
				DateGenerator dateGenerator = (DateGenerator)theEObject;
				T1 result = caseDateGenerator(dateGenerator);
				if (result == null) result = caseRangeGenerator(dateGenerator);
				if (result == null) result = caseValueGenerator(dateGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicPackage.DOUBLE_GENERATOR:
			{
				DoubleGenerator doubleGenerator = (DoubleGenerator)theEObject;
				T1 result = caseDoubleGenerator(doubleGenerator);
				if (result == null) result = caseRangeGenerator(doubleGenerator);
				if (result == null) result = caseValueGenerator(doubleGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicPackage.FLOAT_GENERATOR:
			{
				FloatGenerator floatGenerator = (FloatGenerator)theEObject;
				T1 result = caseFloatGenerator(floatGenerator);
				if (result == null) result = caseRangeGenerator(floatGenerator);
				if (result == null) result = caseValueGenerator(floatGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicPackage.ID_GENERATOR:
			{
				IDGenerator idGenerator = (IDGenerator)theEObject;
				T1 result = caseIDGenerator(idGenerator);
				if (result == null) result = caseValueGenerator(idGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicPackage.INT_GENERATOR:
			{
				IntGenerator intGenerator = (IntGenerator)theEObject;
				T1 result = caseIntGenerator(intGenerator);
				if (result == null) result = caseRangeGenerator(intGenerator);
				if (result == null) result = caseValueGenerator(intGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicPackage.LONG_GENERATOR:
			{
				LongGenerator longGenerator = (LongGenerator)theEObject;
				T1 result = caseLongGenerator(longGenerator);
				if (result == null) result = caseRangeGenerator(longGenerator);
				if (result == null) result = caseValueGenerator(longGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicPackage.NULL_VALUE_GENERATOR:
			{
				NullValueGenerator nullValueGenerator = (NullValueGenerator)theEObject;
				T1 result = caseNullValueGenerator(nullValueGenerator);
				if (result == null) result = caseValueGenerator(nullValueGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicPackage.STRING_GENERATOR:
			{
				StringGenerator stringGenerator = (StringGenerator)theEObject;
				T1 result = caseStringGenerator(stringGenerator);
				if (result == null) result = caseReferenceGenerator(stringGenerator);
				if (result == null) result = caseValueGenerator(stringGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBooleanGenerator(BooleanGenerator object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDateGenerator(DateGenerator object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDoubleGenerator(DoubleGenerator object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFloatGenerator(FloatGenerator object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIDGenerator(IDGenerator object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIntGenerator(IntGenerator object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLongGenerator(LongGenerator object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Null Value Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Null Value Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNullValueGenerator(NullValueGenerator object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseStringGenerator(StringGenerator object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseValueGenerator(ValueGenerator<T> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseRangeGenerator(RangeGenerator<T> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseReferenceGenerator(ReferenceGenerator<T> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object)
	{
		return null;
	}

} //BasicSwitch
