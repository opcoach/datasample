/**
 */
package com.opcoach.datasample;

import com.opcoach.generator.ValueGenerator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.opcoach.datasample.FieldGenerator#getEntityName <em>Entity Name</em>}</li>
 *   <li>{@link com.opcoach.datasample.FieldGenerator#getFieldName <em>Field Name</em>}</li>
 *   <li>{@link com.opcoach.datasample.FieldGenerator#getGenerator <em>Generator</em>}</li>
 *   <li>{@link com.opcoach.datasample.FieldGenerator#getStructuralFeature <em>Structural Feature</em>}</li>
 *   <li>{@link com.opcoach.datasample.FieldGenerator#getErrorRate <em>Error Rate</em>}</li>
 *   <li>{@link com.opcoach.datasample.FieldGenerator#getGeneratorName <em>Generator Name</em>}</li>
 *   <li>{@link com.opcoach.datasample.FieldGenerator#getErrorGeneratorName <em>Error Generator Name</em>}</li>
 *   <li>{@link com.opcoach.datasample.FieldGenerator#getErrorGenerator <em>Error Generator</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.opcoach.datasample.DatasamplePackage#getFieldGenerator()
 * @model
 * @generated
 */
public interface FieldGenerator extends EObject
{
	/**
	 * Returns the value of the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Name</em>' attribute.
	 * @see #setEntityName(String)
	 * @see com.opcoach.datasample.DatasamplePackage#getFieldGenerator_EntityName()
	 * @model
	 * @generated
	 */
	String getEntityName();

	/**
	 * Sets the value of the '{@link com.opcoach.datasample.FieldGenerator#getEntityName <em>Entity Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Name</em>' attribute.
	 * @see #getEntityName()
	 * @generated
	 */
	void setEntityName(String value);

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
	 * @see com.opcoach.datasample.DatasamplePackage#getFieldGenerator_FieldName()
	 * @model
	 * @generated
	 */
	String getFieldName();

	/**
	 * Sets the value of the '{@link com.opcoach.datasample.FieldGenerator#getFieldName <em>Field Name</em>}' attribute.
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
	 * @see com.opcoach.datasample.DatasamplePackage#getFieldGenerator_Generator()
	 * @model
	 * @generated
	 */
	ValueGenerator<?> getGenerator();

	/**
	 * Sets the value of the '{@link com.opcoach.datasample.FieldGenerator#getGenerator <em>Generator</em>}' reference.
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
	 * @see com.opcoach.datasample.DatasamplePackage#getFieldGenerator_StructuralFeature()
	 * @model
	 * @generated
	 */
	EStructuralFeature getStructuralFeature();

	/**
	 * Sets the value of the '{@link com.opcoach.datasample.FieldGenerator#getStructuralFeature <em>Structural Feature</em>}' reference.
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
	 * @see com.opcoach.datasample.DatasamplePackage#getFieldGenerator_ErrorRate()
	 * @model
	 * @generated
	 */
	int getErrorRate();

	/**
	 * Sets the value of the '{@link com.opcoach.datasample.FieldGenerator#getErrorRate <em>Error Rate</em>}' attribute.
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
	 * @see com.opcoach.datasample.DatasamplePackage#getFieldGenerator_GeneratorName()
	 * @model
	 * @generated
	 */
	String getGeneratorName();

	/**
	 * Sets the value of the '{@link com.opcoach.datasample.FieldGenerator#getGeneratorName <em>Generator Name</em>}' attribute.
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
	 * @see com.opcoach.datasample.DatasamplePackage#getFieldGenerator_ErrorGeneratorName()
	 * @model
	 * @generated
	 */
	String getErrorGeneratorName();

	/**
	 * Sets the value of the '{@link com.opcoach.datasample.FieldGenerator#getErrorGeneratorName <em>Error Generator Name</em>}' attribute.
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
	 * @see com.opcoach.datasample.DatasamplePackage#getFieldGenerator_ErrorGenerator()
	 * @model
	 * @generated
	 */
	ValueGenerator<?> getErrorGenerator();

	/**
	 * Sets the value of the '{@link com.opcoach.datasample.FieldGenerator#getErrorGenerator <em>Error Generator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Generator</em>' reference.
	 * @see #getErrorGenerator()
	 * @generated
	 */
	void setErrorGenerator(ValueGenerator<?> value);

} // FieldGenerator
