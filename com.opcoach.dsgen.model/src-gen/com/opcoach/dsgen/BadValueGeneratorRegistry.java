/**
 * © OPCoach 2012
 */
package com.opcoach.dsgen;

import com.opcoach.generator.ValueGenerator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bad Value Generator Registry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.opcoach.dsgen.BadValueGeneratorRegistry#getGenerators <em>Generators</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.opcoach.dsgen.DataSampleGenPackage#getBadValueGeneratorRegistry()
 * @model
 * @generated
 */
public interface BadValueGeneratorRegistry extends EObject
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "© OPCoach 2012";

	/**
	 * Returns the value of the '<em><b>Generators</b></em>' containment reference list.
	 * The list contents are of type {@link com.opcoach.generator.ValueGenerator}&lt;?>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generators</em>' containment reference list.
	 * @see com.opcoach.dsgen.DataSampleGenPackage#getBadValueGeneratorRegistry_Generators()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueGenerator<?>> getGenerators();

} // BadValueGeneratorRegistry
