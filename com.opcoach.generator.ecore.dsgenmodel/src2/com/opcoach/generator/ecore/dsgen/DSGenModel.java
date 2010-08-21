/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.generator.ecore.dsgen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DS Gen Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.opcoach.generator.ecore.dsgen.DSGenModel#getDsgenPackages <em>Dsgen Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.opcoach.generator.ecore.dsgen.DataSampleGenPackage#getDSGenModel()
 * @model
 * @generated
 */
public interface DSGenModel extends DSGenBase
{
	/**
	 * Returns the value of the '<em><b>Dsgen Packages</b></em>' containment reference list.
	 * The list contents are of type {@link com.opcoach.generator.ecore.dsgen.DSGenPackage}.
	 * It is bidirectional and its opposite is '{@link com.opcoach.generator.ecore.dsgen.DSGenPackage#getDsgenModel <em>Dsgen Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dsgen Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dsgen Packages</em>' containment reference list.
	 * @see com.opcoach.generator.ecore.dsgen.DataSampleGenPackage#getDSGenModel_DsgenPackages()
	 * @see com.opcoach.generator.ecore.dsgen.DSGenPackage#getDsgenModel
	 * @model opposite="dsgenModel" containment="true"
	 * @generated
	 */
	EList<DSGenPackage> getDsgenPackages();

} // DSGenModel
