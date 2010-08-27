/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.generator.ecore.dsgen.util;

import com.opcoach.generator.ecore.dsgen.*;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import com.opcoach.generator.ecore.dsgen.DSGenAnnotation;
import com.opcoach.generator.ecore.dsgen.DSGenAttribute;
import com.opcoach.generator.ecore.dsgen.DSGenBase;
import com.opcoach.generator.ecore.dsgen.DSGenClass;
import com.opcoach.generator.ecore.dsgen.DSGenClassifier;
import com.opcoach.generator.ecore.dsgen.DSGenDataType;
import com.opcoach.generator.ecore.dsgen.DSGenEnum;
import com.opcoach.generator.ecore.dsgen.DSGenEnumLiteral;
import com.opcoach.generator.ecore.dsgen.DSGenFeature;
import com.opcoach.generator.ecore.dsgen.DSGenModel;
import com.opcoach.generator.ecore.dsgen.DSGenPackage;
import com.opcoach.generator.ecore.dsgen.DSGenReference;
import com.opcoach.generator.ecore.dsgen.DSGenTypeParameter;
import com.opcoach.generator.ecore.dsgen.DSGenTypedElement;
import com.opcoach.generator.ecore.dsgen.DataSampleGenPackage;

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
 * @see com.opcoach.generator.ecore.dsgen.DataSampleGenPackage
 * @generated
 */
public class DataSampleGenSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DataSampleGenPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSampleGenSwitch() {
		if (modelPackage == null)
		{
			modelPackage = DataSampleGenPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage)
		{
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else
		{
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID)
		{
			case DataSampleGenPackage.DS_GEN_MODEL:
			{
				DSGenModel dsGenModel = (DSGenModel)theEObject;
				T result = caseDSGenModel(dsGenModel);
				if (result == null) result = caseDSGenBase(dsGenModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataSampleGenPackage.DS_GEN_PACKAGE:
			{
				DSGenPackage dsGenPackage = (DSGenPackage)theEObject;
				T result = caseDSGenPackage(dsGenPackage);
				if (result == null) result = caseDSGenBase(dsGenPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataSampleGenPackage.DS_GEN_CLASS:
			{
				DSGenClass dsGenClass = (DSGenClass)theEObject;
				T result = caseDSGenClass(dsGenClass);
				if (result == null) result = caseDSGenClassifier(dsGenClass);
				if (result == null) result = caseDSGenBase(dsGenClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataSampleGenPackage.DS_GEN_FEATURE:
			{
				DSGenFeature dsGenFeature = (DSGenFeature)theEObject;
				T result = caseDSGenFeature(dsGenFeature);
				if (result == null) result = caseDSGenTypedElement(dsGenFeature);
				if (result == null) result = caseDSGenBase(dsGenFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataSampleGenPackage.DS_GEN_BASE:
			{
				DSGenBase dsGenBase = (DSGenBase)theEObject;
				T result = caseDSGenBase(dsGenBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataSampleGenPackage.DS_GEN_ENUM_LITERAL:
			{
				DSGenEnumLiteral dsGenEnumLiteral = (DSGenEnumLiteral)theEObject;
				T result = caseDSGenEnumLiteral(dsGenEnumLiteral);
				if (result == null) result = caseDSGenBase(dsGenEnumLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataSampleGenPackage.DS_GEN_CLASSIFIER:
			{
				DSGenClassifier dsGenClassifier = (DSGenClassifier)theEObject;
				T result = caseDSGenClassifier(dsGenClassifier);
				if (result == null) result = caseDSGenBase(dsGenClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataSampleGenPackage.DS_GEN_DATA_TYPE:
			{
				DSGenDataType dsGenDataType = (DSGenDataType)theEObject;
				T result = caseDSGenDataType(dsGenDataType);
				if (result == null) result = caseDSGenClassifier(dsGenDataType);
				if (result == null) result = caseDSGenBase(dsGenDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataSampleGenPackage.DS_GEN_TYPED_ELEMENT:
			{
				DSGenTypedElement dsGenTypedElement = (DSGenTypedElement)theEObject;
				T result = caseDSGenTypedElement(dsGenTypedElement);
				if (result == null) result = caseDSGenBase(dsGenTypedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataSampleGenPackage.DS_GEN_ANNOTATION:
			{
				DSGenAnnotation dsGenAnnotation = (DSGenAnnotation)theEObject;
				T result = caseDSGenAnnotation(dsGenAnnotation);
				if (result == null) result = caseDSGenBase(dsGenAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataSampleGenPackage.DS_GEN_TYPE_PARAMETER:
			{
				DSGenTypeParameter dsGenTypeParameter = (DSGenTypeParameter)theEObject;
				T result = caseDSGenTypeParameter(dsGenTypeParameter);
				if (result == null) result = caseDSGenBase(dsGenTypeParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataSampleGenPackage.DS_GEN_ATTRIBUTE:
			{
				DSGenAttribute dsGenAttribute = (DSGenAttribute)theEObject;
				T result = caseDSGenAttribute(dsGenAttribute);
				if (result == null) result = caseDSGenFeature(dsGenAttribute);
				if (result == null) result = caseDSGenTypedElement(dsGenAttribute);
				if (result == null) result = caseDSGenBase(dsGenAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataSampleGenPackage.DS_GEN_REFERENCE:
			{
				DSGenReference dsGenReference = (DSGenReference)theEObject;
				T result = caseDSGenReference(dsGenReference);
				if (result == null) result = caseDSGenFeature(dsGenReference);
				if (result == null) result = caseDSGenTypedElement(dsGenReference);
				if (result == null) result = caseDSGenBase(dsGenReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataSampleGenPackage.DS_GEN_ENUM:
			{
				DSGenEnum dsGenEnum = (DSGenEnum)theEObject;
				T result = caseDSGenEnum(dsGenEnum);
				if (result == null) result = caseDSGenDataType(dsGenEnum);
				if (result == null) result = caseDSGenClassifier(dsGenEnum);
				if (result == null) result = caseDSGenBase(dsGenEnum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DS Gen Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DS Gen Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSGenModel(DSGenModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DS Gen Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DS Gen Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSGenPackage(DSGenPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DS Gen Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DS Gen Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSGenClass(DSGenClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DS Gen Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DS Gen Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSGenFeature(DSGenFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DS Gen Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DS Gen Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSGenBase(DSGenBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DS Gen Enum Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DS Gen Enum Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSGenEnumLiteral(DSGenEnumLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DS Gen Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DS Gen Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSGenClassifier(DSGenClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DS Gen Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DS Gen Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSGenDataType(DSGenDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DS Gen Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DS Gen Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSGenTypedElement(DSGenTypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DS Gen Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DS Gen Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSGenAnnotation(DSGenAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DS Gen Type Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DS Gen Type Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSGenTypeParameter(DSGenTypeParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DS Gen Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DS Gen Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSGenAttribute(DSGenAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DS Gen Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DS Gen Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSGenReference(DSGenReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DS Gen Enum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DS Gen Enum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSGenEnum(DSGenEnum object)
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
	public T defaultCase(EObject object) {
		return null;
	}

} //DataSampleGenSwitch
