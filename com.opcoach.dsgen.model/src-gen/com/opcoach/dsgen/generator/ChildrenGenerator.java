/**
 * © OPCoach 2012
 */
package com.opcoach.dsgen.generator;

import com.opcoach.generator.ValueGenerator;

import java.util.Collection;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Children Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.opcoach.dsgen.generator.ChildrenGenerator#getMaxChildrenNumber <em>Max Children Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.opcoach.dsgen.generator.DSGenGeneratorPackage#getChildrenGenerator()
 * @model superTypes="com.opcoach.generator.ValueGenerator<com.opcoach.dsgen.generator.EObjectCollection>"
 * @generated
 */
public interface ChildrenGenerator extends ValueGenerator<Collection<EObject>>
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "© OPCoach 2012";

	/**
	 * Returns the value of the '<em><b>Max Children Number</b></em>' attribute.
	 * The default value is <code>"50"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Children Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Children Number</em>' attribute.
	 * @see #setMaxChildrenNumber(int)
	 * @see com.opcoach.dsgen.generator.DSGenGeneratorPackage#getChildrenGenerator_MaxChildrenNumber()
	 * @model default="50"
	 * @generated
	 */
	int getMaxChildrenNumber();

	/**
	 * Sets the value of the '{@link com.opcoach.dsgen.generator.ChildrenGenerator#getMaxChildrenNumber <em>Max Children Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Children Number</em>' attribute.
	 * @see #getMaxChildrenNumber()
	 * @generated
	 */
	void setMaxChildrenNumber(int value);

} // ChildrenGenerator
