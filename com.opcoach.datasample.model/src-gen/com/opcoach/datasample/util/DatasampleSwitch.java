/**
 */
package com.opcoach.datasample.util;

import com.opcoach.datasample.*;

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
 * @see com.opcoach.datasample.MDatasamplePackage
 * @generated
 */
public class DatasampleSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MDatasamplePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasampleSwitch() {
		if (modelPackage == null) {
			modelPackage = MDatasamplePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
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
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MDatasamplePackage.DATA_SAMPLE: {
				DataSample dataSample = (DataSample)theEObject;
				T1 result = caseDataSample(dataSample);
				if (result == null) result = caseValueGenerator(dataSample);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MDatasamplePackage.ENTITY_GENERATOR: {
				EntityGenerator entityGenerator = (EntityGenerator)theEObject;
				T1 result = caseEntityGenerator(entityGenerator);
				if (result == null) result = caseValueGenerator(entityGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MDatasamplePackage.FIELD_GENERATOR: {
				FieldGenerator fieldGenerator = (FieldGenerator)theEObject;
				T1 result = caseFieldGenerator(fieldGenerator);
				if (result == null) result = caseValueGenerator(fieldGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MDatasamplePackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T1 result = caseParameter(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MDatasamplePackage.ASSOCIATION_GENERATOR: {
				AssociationGenerator associationGenerator = (AssociationGenerator)theEObject;
				T1 result = caseAssociationGenerator(associationGenerator);
				if (result == null) result = caseFieldGenerator(associationGenerator);
				if (result == null) result = caseValueGenerator(associationGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MDatasamplePackage.CHILDREN_GENERATOR: {
				ChildrenGenerator childrenGenerator = (ChildrenGenerator)theEObject;
				T1 result = caseChildrenGenerator(childrenGenerator);
				if (result == null) result = caseFieldGenerator(childrenGenerator);
				if (result == null) result = caseValueGenerator(childrenGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MDatasamplePackage.POLYMORPHIC_CHILDREN_GENERATOR: {
				PolymorphicChildrenGenerator polymorphicChildrenGenerator = (PolymorphicChildrenGenerator)theEObject;
				T1 result = casePolymorphicChildrenGenerator(polymorphicChildrenGenerator);
				if (result == null) result = caseChildrenGenerator(polymorphicChildrenGenerator);
				if (result == null) result = caseFieldGenerator(polymorphicChildrenGenerator);
				if (result == null) result = caseValueGenerator(polymorphicChildrenGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Sample</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Sample</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDataSample(DataSample object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEntityGenerator(EntityGenerator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFieldGenerator(FieldGenerator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAssociationGenerator(AssociationGenerator object) {
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
	public T1 caseChildrenGenerator(ChildrenGenerator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polymorphic Children Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polymorphic Children Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePolymorphicChildrenGenerator(PolymorphicChildrenGenerator object) {
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
	public <T> T1 caseValueGenerator(ValueGenerator<T> object) {
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
	public T1 defaultCase(EObject object) {
		return null;
	}

} //DatasampleSwitch
