/**
 */
package com.opcoach.datasample;

import com.opcoach.generator.ValueGenerator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.opcoach.datasample.MFieldGenerator#getFieldName <em>Field Name</em>}</li>
 *   <li>{@link com.opcoach.datasample.MFieldGenerator#getGenerator <em>Generator</em>}</li>
 *   <li>{@link com.opcoach.datasample.MFieldGenerator#getStructuralFeature <em>Structural Feature</em>}</li>
 *   <li>{@link com.opcoach.datasample.MFieldGenerator#getErrorRate <em>Error Rate</em>}</li>
 *   <li>{@link com.opcoach.datasample.MFieldGenerator#getGeneratorName <em>Generator Name</em>}</li>
 *   <li>{@link com.opcoach.datasample.MFieldGenerator#getErrorGeneratorName <em>Error Generator Name</em>}</li>
 *   <li>{@link com.opcoach.datasample.MFieldGenerator#getErrorGenerator <em>Error Generator</em>}</li>
 *   <li>{@link com.opcoach.datasample.MFieldGenerator#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see com.opcoach.datasample.MDatasamplePackage#getFieldGenerator()
 * @model superTypes="com.opcoach.generator.ValueGenerator&lt;org.eclipse.emf.ecore.EJavaObject&gt;"
 * @generated
 */
public interface MFieldGenerator extends ValueGenerator<Object> {
	/**
	 * Returns the value of the '<em><b>Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Name</em>' attribute.
	 * @see #setFieldName(String)
	 * @see com.opcoach.datasample.MDatasamplePackage#getFieldGenerator_FieldName()
	 * @model
	 * @generated
	 */
	String getFieldName();

	/**
	 * Sets the value of the '{@link com.opcoach.datasample.MFieldGenerator#getFieldName <em>Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Name</em>' attribute.
	 * @see #getFieldName()
	 * @generated
	 */
	void setFieldName(String value);

	/**
	 * Returns the value of the '<em><b>Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generator</em>' reference.
	 * @see #setGenerator(ValueGenerator)
	 * @see com.opcoach.datasample.MDatasamplePackage#getFieldGenerator_Generator()
	 * @model
	 * @generated
	 */
	ValueGenerator<?> getGenerator();

	/**
	 * Sets the value of the '{@link com.opcoach.datasample.MFieldGenerator#getGenerator <em>Generator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator</em>' reference.
	 * @see #getGenerator()
	 * @generated
	 */
	void setGenerator(ValueGenerator<?> value);

	/**
	 * Returns the value of the '<em><b>Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structural Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structural Feature</em>' reference.
	 * @see #setStructuralFeature(EStructuralFeature)
	 * @see com.opcoach.datasample.MDatasamplePackage#getFieldGenerator_StructuralFeature()
	 * @model
	 * @generated
	 */
	EStructuralFeature getStructuralFeature();

	/**
	 * Sets the value of the '{@link com.opcoach.datasample.MFieldGenerator#getStructuralFeature <em>Structural Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structural Feature</em>' reference.
	 * @see #getStructuralFeature()
	 * @generated
	 */
	void setStructuralFeature(EStructuralFeature value);

	/**
	 * Returns the value of the '<em><b>Error Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Rate</em>' attribute.
	 * @see #setErrorRate(int)
	 * @see com.opcoach.datasample.MDatasamplePackage#getFieldGenerator_ErrorRate()
	 * @model
	 * @generated
	 */
	int getErrorRate();

	/**
	 * Sets the value of the '{@link com.opcoach.datasample.MFieldGenerator#getErrorRate <em>Error Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Rate</em>' attribute.
	 * @see #getErrorRate()
	 * @generated
	 */
	void setErrorRate(int value);

	/**
	 * Returns the value of the '<em><b>Generator Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generator Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generator Name</em>' attribute.
	 * @see #setGeneratorName(String)
	 * @see com.opcoach.datasample.MDatasamplePackage#getFieldGenerator_GeneratorName()
	 * @model
	 * @generated
	 */
	String getGeneratorName();

	/**
	 * Sets the value of the '{@link com.opcoach.datasample.MFieldGenerator#getGeneratorName <em>Generator Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator Name</em>' attribute.
	 * @see #getGeneratorName()
	 * @generated
	 */
	void setGeneratorName(String value);

	/**
	 * Returns the value of the '<em><b>Error Generator Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Generator Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Generator Name</em>' attribute.
	 * @see #setErrorGeneratorName(String)
	 * @see com.opcoach.datasample.MDatasamplePackage#getFieldGenerator_ErrorGeneratorName()
	 * @model
	 * @generated
	 */
	String getErrorGeneratorName();

	/**
	 * Sets the value of the '{@link com.opcoach.datasample.MFieldGenerator#getErrorGeneratorName <em>Error Generator Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Generator Name</em>' attribute.
	 * @see #getErrorGeneratorName()
	 * @generated
	 */
	void setErrorGeneratorName(String value);

	/**
	 * Returns the value of the '<em><b>Error Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Generator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Generator</em>' reference.
	 * @see #setErrorGenerator(ValueGenerator)
	 * @see com.opcoach.datasample.MDatasamplePackage#getFieldGenerator_ErrorGenerator()
	 * @model
	 * @generated
	 */
	ValueGenerator<?> getErrorGenerator();

	/**
	 * Sets the value of the '{@link com.opcoach.datasample.MFieldGenerator#getErrorGenerator <em>Error Generator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Generator</em>' reference.
	 * @see #getErrorGenerator()
	 * @generated
	 */
	void setErrorGenerator(ValueGenerator<?> value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link com.opcoach.datasample.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see com.opcoach.datasample.MDatasamplePackage#getFieldGenerator_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

} // MFieldGenerator
