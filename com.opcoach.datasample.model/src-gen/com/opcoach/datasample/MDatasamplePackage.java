/**
 */
package com.opcoach.datasample;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.opcoach.datasample.MDatasampleFactory
 * @model kind="package"
 * @generated
 */
public interface MDatasamplePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "datasample";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.opcoach.com/datasample/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ds";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MDatasamplePackage eINSTANCE = com.opcoach.datasample.impl.MDatasamplePackageImpl.init();

	/**
	 * The meta object id for the '{@link com.opcoach.datasample.impl.MDataSampleImpl <em>Data Sample</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.datasample.impl.MDataSampleImpl
	 * @see com.opcoach.datasample.impl.MDatasamplePackageImpl#getDataSample()
	 * @generated
	 */
	int DATA_SAMPLE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SAMPLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SAMPLE__SEED = 1;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SAMPLE__LANGUAGE = 2;

	/**
	 * The feature id for the '<em><b>Package URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SAMPLE__PACKAGE_URI = 3;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SAMPLE__PACKAGE = 4;

	/**
	 * The feature id for the '<em><b>Entity Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SAMPLE__ENTITY_GENERATORS = 5;

	/**
	 * The feature id for the '<em><b>Root Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SAMPLE__ROOT_ENTITY = 6;

	/**
	 * The feature id for the '<em><b>Bad Value Generator Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SAMPLE__BAD_VALUE_GENERATOR_NAMES = 7;

	/**
	 * The number of structural features of the '<em>Data Sample</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SAMPLE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Data Sample</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SAMPLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.opcoach.datasample.impl.MEntityGeneratorImpl <em>Entity Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.datasample.impl.MEntityGeneratorImpl
	 * @see com.opcoach.datasample.impl.MDatasamplePackageImpl#getEntityGenerator()
	 * @generated
	 */
	int ENTITY_GENERATOR = 1;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_GENERATOR__NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_GENERATOR__ENTITY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_GENERATOR__ENTITY = 2;

	/**
	 * The feature id for the '<em><b>Field Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_GENERATOR__FIELD_GENERATORS = 3;

	/**
	 * The number of structural features of the '<em>Entity Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_GENERATOR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Entity Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_GENERATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.opcoach.datasample.impl.MFieldGeneratorImpl <em>Field Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.datasample.impl.MFieldGeneratorImpl
	 * @see com.opcoach.datasample.impl.MDatasamplePackageImpl#getFieldGenerator()
	 * @generated
	 */
	int FIELD_GENERATOR = 2;

	/**
	 * The feature id for the '<em><b>Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_GENERATOR__FIELD_NAME = 0;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_GENERATOR__GENERATOR = 1;

	/**
	 * The feature id for the '<em><b>Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_GENERATOR__STRUCTURAL_FEATURE = 2;

	/**
	 * The feature id for the '<em><b>Error Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_GENERATOR__ERROR_RATE = 3;

	/**
	 * The feature id for the '<em><b>Generator Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_GENERATOR__GENERATOR_NAME = 4;

	/**
	 * The feature id for the '<em><b>Error Generator Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_GENERATOR__ERROR_GENERATOR_NAME = 5;

	/**
	 * The feature id for the '<em><b>Error Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_GENERATOR__ERROR_GENERATOR = 6;

	/**
	 * The number of structural features of the '<em>Field Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_GENERATOR_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Field Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_GENERATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.opcoach.datasample.Language <em>Language</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.datasample.Language
	 * @see com.opcoach.datasample.impl.MDatasamplePackageImpl#getLanguage()
	 * @generated
	 */
	int LANGUAGE = 3;


	/**
	 * Returns the meta object for class '{@link com.opcoach.datasample.MDataSample <em>Data Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Sample</em>'.
	 * @see com.opcoach.datasample.MDataSample
	 * @generated
	 */
	EClass getDataSample();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.datasample.MDataSample#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.opcoach.datasample.MDataSample#getName()
	 * @see #getDataSample()
	 * @generated
	 */
	EAttribute getDataSample_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.datasample.MDataSample#getSeed <em>Seed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seed</em>'.
	 * @see com.opcoach.datasample.MDataSample#getSeed()
	 * @see #getDataSample()
	 * @generated
	 */
	EAttribute getDataSample_Seed();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.datasample.MDataSample#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see com.opcoach.datasample.MDataSample#getLanguage()
	 * @see #getDataSample()
	 * @generated
	 */
	EAttribute getDataSample_Language();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.datasample.MDataSample#getPackageURI <em>Package URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package URI</em>'.
	 * @see com.opcoach.datasample.MDataSample#getPackageURI()
	 * @see #getDataSample()
	 * @generated
	 */
	EAttribute getDataSample_PackageURI();

	/**
	 * Returns the meta object for the reference '{@link com.opcoach.datasample.MDataSample#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Package</em>'.
	 * @see com.opcoach.datasample.MDataSample#getPackage()
	 * @see #getDataSample()
	 * @generated
	 */
	EReference getDataSample_Package();

	/**
	 * Returns the meta object for the containment reference list '{@link com.opcoach.datasample.MDataSample#getEntityGenerators <em>Entity Generators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity Generators</em>'.
	 * @see com.opcoach.datasample.MDataSample#getEntityGenerators()
	 * @see #getDataSample()
	 * @generated
	 */
	EReference getDataSample_EntityGenerators();

	/**
	 * Returns the meta object for the reference '{@link com.opcoach.datasample.MDataSample#getRootEntity <em>Root Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root Entity</em>'.
	 * @see com.opcoach.datasample.MDataSample#getRootEntity()
	 * @see #getDataSample()
	 * @generated
	 */
	EReference getDataSample_RootEntity();

	/**
	 * Returns the meta object for the attribute list '{@link com.opcoach.datasample.MDataSample#getBadValueGeneratorNames <em>Bad Value Generator Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Bad Value Generator Names</em>'.
	 * @see com.opcoach.datasample.MDataSample#getBadValueGeneratorNames()
	 * @see #getDataSample()
	 * @generated
	 */
	EAttribute getDataSample_BadValueGeneratorNames();

	/**
	 * Returns the meta object for class '{@link com.opcoach.datasample.MEntityGenerator <em>Entity Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Generator</em>'.
	 * @see com.opcoach.datasample.MEntityGenerator
	 * @generated
	 */
	EClass getEntityGenerator();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.datasample.MEntityGenerator#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see com.opcoach.datasample.MEntityGenerator#getNumber()
	 * @see #getEntityGenerator()
	 * @generated
	 */
	EAttribute getEntityGenerator_Number();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.datasample.MEntityGenerator#getEntityName <em>Entity Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Name</em>'.
	 * @see com.opcoach.datasample.MEntityGenerator#getEntityName()
	 * @see #getEntityGenerator()
	 * @generated
	 */
	EAttribute getEntityGenerator_EntityName();

	/**
	 * Returns the meta object for the reference '{@link com.opcoach.datasample.MEntityGenerator#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see com.opcoach.datasample.MEntityGenerator#getEntity()
	 * @see #getEntityGenerator()
	 * @generated
	 */
	EReference getEntityGenerator_Entity();

	/**
	 * Returns the meta object for the containment reference list '{@link com.opcoach.datasample.MEntityGenerator#getFieldGenerators <em>Field Generators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field Generators</em>'.
	 * @see com.opcoach.datasample.MEntityGenerator#getFieldGenerators()
	 * @see #getEntityGenerator()
	 * @generated
	 */
	EReference getEntityGenerator_FieldGenerators();

	/**
	 * Returns the meta object for class '{@link com.opcoach.datasample.MFieldGenerator <em>Field Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Generator</em>'.
	 * @see com.opcoach.datasample.MFieldGenerator
	 * @generated
	 */
	EClass getFieldGenerator();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.datasample.MFieldGenerator#getFieldName <em>Field Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Name</em>'.
	 * @see com.opcoach.datasample.MFieldGenerator#getFieldName()
	 * @see #getFieldGenerator()
	 * @generated
	 */
	EAttribute getFieldGenerator_FieldName();

	/**
	 * Returns the meta object for the reference '{@link com.opcoach.datasample.MFieldGenerator#getGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Generator</em>'.
	 * @see com.opcoach.datasample.MFieldGenerator#getGenerator()
	 * @see #getFieldGenerator()
	 * @generated
	 */
	EReference getFieldGenerator_Generator();

	/**
	 * Returns the meta object for the reference '{@link com.opcoach.datasample.MFieldGenerator#getStructuralFeature <em>Structural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Structural Feature</em>'.
	 * @see com.opcoach.datasample.MFieldGenerator#getStructuralFeature()
	 * @see #getFieldGenerator()
	 * @generated
	 */
	EReference getFieldGenerator_StructuralFeature();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.datasample.MFieldGenerator#getErrorRate <em>Error Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Rate</em>'.
	 * @see com.opcoach.datasample.MFieldGenerator#getErrorRate()
	 * @see #getFieldGenerator()
	 * @generated
	 */
	EAttribute getFieldGenerator_ErrorRate();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.datasample.MFieldGenerator#getGeneratorName <em>Generator Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generator Name</em>'.
	 * @see com.opcoach.datasample.MFieldGenerator#getGeneratorName()
	 * @see #getFieldGenerator()
	 * @generated
	 */
	EAttribute getFieldGenerator_GeneratorName();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.datasample.MFieldGenerator#getErrorGeneratorName <em>Error Generator Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Generator Name</em>'.
	 * @see com.opcoach.datasample.MFieldGenerator#getErrorGeneratorName()
	 * @see #getFieldGenerator()
	 * @generated
	 */
	EAttribute getFieldGenerator_ErrorGeneratorName();

	/**
	 * Returns the meta object for the reference '{@link com.opcoach.datasample.MFieldGenerator#getErrorGenerator <em>Error Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Error Generator</em>'.
	 * @see com.opcoach.datasample.MFieldGenerator#getErrorGenerator()
	 * @see #getFieldGenerator()
	 * @generated
	 */
	EReference getFieldGenerator_ErrorGenerator();

	/**
	 * Returns the meta object for enum '{@link com.opcoach.datasample.Language <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Language</em>'.
	 * @see com.opcoach.datasample.Language
	 * @generated
	 */
	EEnum getLanguage();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MDatasampleFactory getDatasampleFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.opcoach.datasample.impl.MDataSampleImpl <em>Data Sample</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.opcoach.datasample.impl.MDataSampleImpl
		 * @see com.opcoach.datasample.impl.MDatasamplePackageImpl#getDataSample()
		 * @generated
		 */
		EClass DATA_SAMPLE = eINSTANCE.getDataSample();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SAMPLE__NAME = eINSTANCE.getDataSample_Name();

		/**
		 * The meta object literal for the '<em><b>Seed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SAMPLE__SEED = eINSTANCE.getDataSample_Seed();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SAMPLE__LANGUAGE = eINSTANCE.getDataSample_Language();

		/**
		 * The meta object literal for the '<em><b>Package URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SAMPLE__PACKAGE_URI = eINSTANCE.getDataSample_PackageURI();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SAMPLE__PACKAGE = eINSTANCE.getDataSample_Package();

		/**
		 * The meta object literal for the '<em><b>Entity Generators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SAMPLE__ENTITY_GENERATORS = eINSTANCE.getDataSample_EntityGenerators();

		/**
		 * The meta object literal for the '<em><b>Root Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SAMPLE__ROOT_ENTITY = eINSTANCE.getDataSample_RootEntity();

		/**
		 * The meta object literal for the '<em><b>Bad Value Generator Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SAMPLE__BAD_VALUE_GENERATOR_NAMES = eINSTANCE.getDataSample_BadValueGeneratorNames();

		/**
		 * The meta object literal for the '{@link com.opcoach.datasample.impl.MEntityGeneratorImpl <em>Entity Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.opcoach.datasample.impl.MEntityGeneratorImpl
		 * @see com.opcoach.datasample.impl.MDatasamplePackageImpl#getEntityGenerator()
		 * @generated
		 */
		EClass ENTITY_GENERATOR = eINSTANCE.getEntityGenerator();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_GENERATOR__NUMBER = eINSTANCE.getEntityGenerator_Number();

		/**
		 * The meta object literal for the '<em><b>Entity Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_GENERATOR__ENTITY_NAME = eINSTANCE.getEntityGenerator_EntityName();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_GENERATOR__ENTITY = eINSTANCE.getEntityGenerator_Entity();

		/**
		 * The meta object literal for the '<em><b>Field Generators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_GENERATOR__FIELD_GENERATORS = eINSTANCE.getEntityGenerator_FieldGenerators();

		/**
		 * The meta object literal for the '{@link com.opcoach.datasample.impl.MFieldGeneratorImpl <em>Field Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.opcoach.datasample.impl.MFieldGeneratorImpl
		 * @see com.opcoach.datasample.impl.MDatasamplePackageImpl#getFieldGenerator()
		 * @generated
		 */
		EClass FIELD_GENERATOR = eINSTANCE.getFieldGenerator();

		/**
		 * The meta object literal for the '<em><b>Field Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_GENERATOR__FIELD_NAME = eINSTANCE.getFieldGenerator_FieldName();

		/**
		 * The meta object literal for the '<em><b>Generator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_GENERATOR__GENERATOR = eINSTANCE.getFieldGenerator_Generator();

		/**
		 * The meta object literal for the '<em><b>Structural Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_GENERATOR__STRUCTURAL_FEATURE = eINSTANCE.getFieldGenerator_StructuralFeature();

		/**
		 * The meta object literal for the '<em><b>Error Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_GENERATOR__ERROR_RATE = eINSTANCE.getFieldGenerator_ErrorRate();

		/**
		 * The meta object literal for the '<em><b>Generator Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_GENERATOR__GENERATOR_NAME = eINSTANCE.getFieldGenerator_GeneratorName();

		/**
		 * The meta object literal for the '<em><b>Error Generator Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_GENERATOR__ERROR_GENERATOR_NAME = eINSTANCE.getFieldGenerator_ErrorGeneratorName();

		/**
		 * The meta object literal for the '<em><b>Error Generator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_GENERATOR__ERROR_GENERATOR = eINSTANCE.getFieldGenerator_ErrorGenerator();

		/**
		 * The meta object literal for the '{@link com.opcoach.datasample.Language <em>Language</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.opcoach.datasample.Language
		 * @see com.opcoach.datasample.impl.MDatasamplePackageImpl#getLanguage()
		 * @generated
		 */
		EEnum LANGUAGE = eINSTANCE.getLanguage();

	}

} //MDatasamplePackage
