/**
 */
package com.opcoach.datasample;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Sample</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.opcoach.datasample.DataSample#getName <em>Name</em>}</li>
 *   <li>{@link com.opcoach.datasample.DataSample#getSeed <em>Seed</em>}</li>
 *   <li>{@link com.opcoach.datasample.DataSample#getLanguage <em>Language</em>}</li>
 *   <li>{@link com.opcoach.datasample.DataSample#getPackageURI <em>Package URI</em>}</li>
 *   <li>{@link com.opcoach.datasample.DataSample#getPackage <em>Package</em>}</li>
 *   <li>{@link com.opcoach.datasample.DataSample#getEntityGenerators <em>Entity Generators</em>}</li>
 *   <li>{@link com.opcoach.datasample.DataSample#getFieldGenerators <em>Field Generators</em>}</li>
 *   <li>{@link com.opcoach.datasample.DataSample#getRootEntity <em>Root Entity</em>}</li>
 *   <li>{@link com.opcoach.datasample.DataSample#getBadValueGeneratorNames <em>Bad Value Generator Names</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.opcoach.datasample.DatasamplePackage#getDataSample()
 * @model
 * @generated
 */
public interface DataSample extends EObject
{
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.opcoach.datasample.DatasamplePackage#getDataSample_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.opcoach.datasample.DataSample#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seed</em>' attribute.
	 * @see #setSeed(int)
	 * @see com.opcoach.datasample.DatasamplePackage#getDataSample_Seed()
	 * @model
	 * @generated
	 */
	int getSeed();

	/**
	 * Sets the value of the '{@link com.opcoach.datasample.DataSample#getSeed <em>Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seed</em>' attribute.
	 * @see #getSeed()
	 * @generated
	 */
	void setSeed(int value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * The literals are from the enumeration {@link com.opcoach.datasample.Language}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see com.opcoach.datasample.Language
	 * @see #setLanguage(Language)
	 * @see com.opcoach.datasample.DatasamplePackage#getDataSample_Language()
	 * @model
	 * @generated
	 */
	Language getLanguage();

	/**
	 * Sets the value of the '{@link com.opcoach.datasample.DataSample#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see com.opcoach.datasample.Language
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(Language value);

	/**
	 * Returns the value of the '<em><b>Package URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package URI</em>' attribute.
	 * @see #setPackageURI(String)
	 * @see com.opcoach.datasample.DatasamplePackage#getDataSample_PackageURI()
	 * @model
	 * @generated
	 */
	String getPackageURI();

	/**
	 * Sets the value of the '{@link com.opcoach.datasample.DataSample#getPackageURI <em>Package URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package URI</em>' attribute.
	 * @see #getPackageURI()
	 * @generated
	 */
	void setPackageURI(String value);

	/**
	 * Returns the value of the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' reference.
	 * @see #setPackage(EPackage)
	 * @see com.opcoach.datasample.DatasamplePackage#getDataSample_Package()
	 * @model
	 * @generated
	 */
	EPackage getPackage();

	/**
	 * Sets the value of the '{@link com.opcoach.datasample.DataSample#getPackage <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(EPackage value);

	/**
	 * Returns the value of the '<em><b>Entity Generators</b></em>' containment reference list.
	 * The list contents are of type {@link com.opcoach.datasample.EntityGenerator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Generators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Generators</em>' containment reference list.
	 * @see com.opcoach.datasample.DatasamplePackage#getDataSample_EntityGenerators()
	 * @model containment="true"
	 * @generated
	 */
	EList<EntityGenerator> getEntityGenerators();

	/**
	 * Returns the value of the '<em><b>Field Generators</b></em>' containment reference list.
	 * The list contents are of type {@link com.opcoach.datasample.FieldGenerator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Generators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Generators</em>' containment reference list.
	 * @see com.opcoach.datasample.DatasamplePackage#getDataSample_FieldGenerators()
	 * @model containment="true"
	 * @generated
	 */
	EList<FieldGenerator> getFieldGenerators();

	/**
	 * Returns the value of the '<em><b>Root Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Entity</em>' reference.
	 * @see #setRootEntity(EClass)
	 * @see com.opcoach.datasample.DatasamplePackage#getDataSample_RootEntity()
	 * @model
	 * @generated
	 */
	EClass getRootEntity();

	/**
	 * Sets the value of the '{@link com.opcoach.datasample.DataSample#getRootEntity <em>Root Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Entity</em>' reference.
	 * @see #getRootEntity()
	 * @generated
	 */
	void setRootEntity(EClass value);

	/**
	 * Returns the value of the '<em><b>Bad Value Generator Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bad Value Generator Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bad Value Generator Names</em>' attribute list.
	 * @see com.opcoach.datasample.DatasamplePackage#getDataSample_BadValueGeneratorNames()
	 * @model
	 * @generated
	 */
	EList<String> getBadValueGeneratorNames();

} // DataSample
