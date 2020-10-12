/**
 */
package com.opcoach.datasample;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Children Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.opcoach.datasample.MChildrenGenerator#isPolymorphic <em>Polymorphic</em>}</li>
 *   <li>{@link com.opcoach.datasample.MChildrenGenerator#getChildrenGenerators <em>Children Generators</em>}</li>
 * </ul>
 *
 * @see com.opcoach.datasample.MDatasamplePackage#getChildrenGenerator()
 * @model
 * @generated
 */
public interface MChildrenGenerator extends FieldGenerator {

	/**
	 * Returns the value of the '<em><b>Polymorphic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A children generator is polymorphic if the expected type in the ereference has subclasses. In this case, it is possible to provide several childrenGenerators.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Polymorphic</em>' attribute.
	 * @see #setPolymorphic(boolean)
	 * @see com.opcoach.datasample.MDatasamplePackage#getChildrenGenerator_Polymorphic()
	 * @model
	 * @generated
	 */
	boolean isPolymorphic();

	/**
	 * Sets the value of the '{@link com.opcoach.datasample.MChildrenGenerator#isPolymorphic <em>Polymorphic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polymorphic</em>' attribute.
	 * @see #isPolymorphic()
	 * @generated
	 */
	void setPolymorphic(boolean value);

	/**
	 * Returns the value of the '<em><b>Children Generators</b></em>' containment reference list.
	 * The list contents are of type {@link com.opcoach.datasample.EntityGenerator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children Generators</em>' containment reference list.
	 * @see com.opcoach.datasample.MDatasamplePackage#getChildrenGenerator_ChildrenGenerators()
	 * @model containment="true"
	 * @generated
	 */
	EList<EntityGenerator> getChildrenGenerators();
} // MChildrenGenerator
