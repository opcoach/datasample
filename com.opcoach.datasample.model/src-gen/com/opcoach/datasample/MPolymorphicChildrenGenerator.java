/**
 */
package com.opcoach.datasample;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Polymorphic Children Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.opcoach.datasample.MPolymorphicChildrenGenerator#getChildrenGenerators <em>Children Generators</em>}</li>
 * </ul>
 *
 * @see com.opcoach.datasample.MDatasamplePackage#getPolymorphicChildrenGenerator()
 * @model
 * @generated
 */
public interface MPolymorphicChildrenGenerator extends ChildrenGenerator {
	/**
	 * Returns the value of the '<em><b>Children Generators</b></em>' reference list.
	 * The list contents are of type {@link com.opcoach.datasample.ChildrenGenerator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children Generators</em>' reference list.
	 * @see com.opcoach.datasample.MDatasamplePackage#getPolymorphicChildrenGenerator_ChildrenGenerators()
	 * @model
	 * @generated
	 */
	EList<ChildrenGenerator> getChildrenGenerators();

} // MPolymorphicChildrenGenerator
