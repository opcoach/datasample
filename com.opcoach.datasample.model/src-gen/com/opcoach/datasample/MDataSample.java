/**
 */
package com.opcoach.datasample;

import com.opcoach.generator.ValueGenerator;
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
 * </p>
 * <ul>
 *   <li>{@link com.opcoach.datasample.MDataSample#getName <em>Name</em>}</li>
 *   <li>{@link com.opcoach.datasample.MDataSample#getSeed <em>Seed</em>}</li>
 *   <li>{@link com.opcoach.datasample.MDataSample#getLanguage <em>Language</em>}</li>
 *   <li>{@link com.opcoach.datasample.MDataSample#getPackageURI <em>Package URI</em>}</li>
 *   <li>{@link com.opcoach.datasample.MDataSample#getPackage <em>Package</em>}</li>
 *   <li>{@link com.opcoach.datasample.MDataSample#getRootEntity <em>Root Entity</em>}</li>
 *   <li>{@link com.opcoach.datasample.MDataSample#getRootEntityName <em>Root Entity Name</em>}</li>
 *   <li>{@link com.opcoach.datasample.MDataSample#getBadValueGeneratorNames <em>Bad Value Generator Names</em>}</li>
 *   <li>{@link com.opcoach.datasample.MDataSample#getRootGenerator <em>Root Generator</em>}</li>
 *   <li>{@link com.opcoach.datasample.MDataSample#getFileExtension <em>File Extension</em>}</li>
 * </ul>
 *
 * @see com.opcoach.datasample.MDatasamplePackage#getDataSample()
 * @model
 * @generated
 */
public interface MDataSample extends ValueGenerator<EObject> {
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
	 * @see com.opcoach.datasample.MDatasamplePackage#getDataSample_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.opcoach.datasample.MDataSample#getName <em>Name</em>}' attribute.
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
	 * @see com.opcoach.datasample.MDatasamplePackage#getDataSample_Seed()
	 * @model
	 * @generated
	 */
	int getSeed();

	/**
	 * Sets the value of the '{@link com.opcoach.datasample.MDataSample#getSeed <em>Seed</em>}' attribute.
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
	 * @see com.opcoach.datasample.MDatasamplePackage#getDataSample_Language()
	 * @model
	 * @generated
	 */
	Language getLanguage();

	/**
	 * Sets the value of the '{@link com.opcoach.datasample.MDataSample#getLanguage <em>Language</em>}' attribute.
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
	 * @see com.opcoach.datasample.MDatasamplePackage#getDataSample_PackageURI()
	 * @model
	 * @generated
	 */
	String getPackageURI();

	/**
	 * Sets the value of the '{@link com.opcoach.datasample.MDataSample#getPackageURI <em>Package URI</em>}' attribute.
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
	 * @see com.opcoach.datasample.MDatasamplePackage#getDataSample_Package()
	 * @model
	 * @generated
	 */
	EPackage getPackage();

	/**
	 * Sets the value of the '{@link com.opcoach.datasample.MDataSample#getPackage <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(EPackage value);

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
	 * @see com.opcoach.datasample.MDatasamplePackage#getDataSample_RootEntity()
	 * @model
	 * @generated
	 */
	EClass getRootEntity();

	/**
	 * Sets the value of the '{@link com.opcoach.datasample.MDataSample#getRootEntity <em>Root Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Entity</em>' reference.
	 * @see #getRootEntity()
	 * @generated
	 */
	void setRootEntity(EClass value);

	/**
	 * Returns the value of the '<em><b>Root Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Entity Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Entity Name</em>' attribute.
	 * @see #setRootEntityName(String)
	 * @see com.opcoach.datasample.MDatasamplePackage#getDataSample_RootEntityName()
	 * @model
	 * @generated
	 */
	String getRootEntityName();

	/**
	 * Sets the value of the '{@link com.opcoach.datasample.MDataSample#getRootEntityName <em>Root Entity Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Entity Name</em>' attribute.
	 * @see #getRootEntityName()
	 * @generated
	 */
	void setRootEntityName(String value);

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
	 * @see com.opcoach.datasample.MDatasamplePackage#getDataSample_BadValueGeneratorNames()
	 * @model
	 * @generated
	 */
	EList<String> getBadValueGeneratorNames();

	/**
	 * Returns the value of the '<em><b>Root Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Generator</em>' containment reference.
	 * @see #setRootGenerator(EntityGenerator)
	 * @see com.opcoach.datasample.MDatasamplePackage#getDataSample_RootGenerator()
	 * @model containment="true"
	 * @generated
	 */
	EntityGenerator getRootGenerator();

	/**
	 * Sets the value of the '{@link com.opcoach.datasample.MDataSample#getRootGenerator <em>Root Generator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Generator</em>' containment reference.
	 * @see #getRootGenerator()
	 * @generated
	 */
	void setRootGenerator(EntityGenerator value);

	/**
	 * Returns the value of the '<em><b>File Extension</b></em>' attribute.
	 * The default value is <code>"xmi"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Extension</em>' attribute.
	 * @see #setFileExtension(String)
	 * @see com.opcoach.datasample.MDatasamplePackage#getDataSample_FileExtension()
	 * @model default="xmi"
	 * @generated
	 */
	String getFileExtension();

	/**
	 * Sets the value of the '{@link com.opcoach.datasample.MDataSample#getFileExtension <em>File Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Extension</em>' attribute.
	 * @see #getFileExtension()
	 * @generated
	 */
	void setFileExtension(String value);

} // MDataSample
