/**
 * © OPCoach 2012
 */
package com.opcoach.dsgen.generator;

import java.util.Collection;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import com.opcoach.dsgen.DSGenClass;
import com.opcoach.generator.ValueGenerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EObject Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.opcoach.dsgen.generator.EObjectGenerator#getTargetDSGenClass <em>Target DS Gen Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.opcoach.dsgen.generator.DSGenGeneratorPackage#getEObjectGenerator()
 * @model
 * @generated
 */
public interface EObjectGenerator extends ValueGenerator<EObject>
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "© OPCoach 2012";

	EObjectGenerator eInstance = DSGenGeneratorFactory.eINSTANCE.createEObjectGenerator();

	/**
	 * Returns the value of the '<em><b>Target DS Gen Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target DS Gen Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target DS Gen Class</em>' reference.
	 * @see #setTargetDSGenClass(DSGenClass)
	 * @see com.opcoach.dsgen.generator.DSGenGeneratorPackage#getEObjectGenerator_TargetDSGenClass()
	 * @model
	 * @generated
	 */
	DSGenClass getTargetDSGenClass();

	/**
	 * Sets the value of the '{@link com.opcoach.dsgen.generator.EObjectGenerator#getTargetDSGenClass <em>Target DS Gen Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target DS Gen Class</em>' reference.
	 * @see #getTargetDSGenClass()
	 * @generated
	 */
	void setTargetDSGenClass(DSGenClass value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="com.opcoach.dsgen.generator.EObjectCollection"
	 * @generated
	 */
	Collection<EObject> getInstances(EClass cl);

} // EObjectGenerator
