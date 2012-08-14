/**
 * © OPCoach 2012
 */
package com.opcoach.dsgen.generator.util;

import com.opcoach.dsgen.generator.*;

import com.opcoach.generator.ReferenceGenerator;
import com.opcoach.generator.ValueGenerator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see com.opcoach.dsgen.generator.DSGenGeneratorPackage
 * @generated
 */
public class DSGenGeneratorSwitch<T1> extends Switch<T1>
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "© OPCoach 2012";

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DSGenGeneratorPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSGenGeneratorSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = DSGenGeneratorPackage.eINSTANCE;
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
		case DSGenGeneratorPackage.EOBJECT_GENERATOR:
		{
			EObjectGenerator eObjectGenerator = (EObjectGenerator) theEObject;
			T1 result = caseEObjectGenerator(eObjectGenerator);
			if (result == null)
				result = caseValueGenerator(eObjectGenerator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DSGenGeneratorPackage.CHILDREN_GENERATOR:
		{
			ChildrenGenerator childrenGenerator = (ChildrenGenerator) theEObject;
			T1 result = caseChildrenGenerator(childrenGenerator);
			if (result == null)
				result = caseValueGenerator(childrenGenerator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DSGenGeneratorPackage.SINGLE_ASSOCIATION_GENERATOR:
		{
			SingleAssociationGenerator singleAssociationGenerator = (SingleAssociationGenerator) theEObject;
			T1 result = caseSingleAssociationGenerator(singleAssociationGenerator);
			if (result == null)
				result = caseReferenceGenerator(singleAssociationGenerator);
			if (result == null)
				result = caseValueGenerator(singleAssociationGenerator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DSGenGeneratorPackage.MULTIPLE_ASSOCIATION_GENERATOR:
		{
			MultipleAssociationGenerator multipleAssociationGenerator = (MultipleAssociationGenerator) theEObject;
			T1 result = caseMultipleAssociationGenerator(multipleAssociationGenerator);
			if (result == null)
				result = caseValueGenerator(multipleAssociationGenerator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEObjectGenerator(EObjectGenerator object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Children Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Children Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseChildrenGenerator(ChildrenGenerator object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Association Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Association Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSingleAssociationGenerator(SingleAssociationGenerator object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiple Association Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiple Association Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMultipleAssociationGenerator(MultipleAssociationGenerator object)
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

} //DSGenGeneratorSwitch
