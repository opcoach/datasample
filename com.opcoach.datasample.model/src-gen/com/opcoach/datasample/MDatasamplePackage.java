/**
 */
package com.opcoach.datasample;

import com.opcoach.generator.MGeneratorPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
	 * The feature id for the '<em><b>Bad Value Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SAMPLE__BAD_VALUE_PROPORTION = MGeneratorPackage.VALUE_GENERATOR__BAD_VALUE_PROPORTION;

	/**
	 * The feature id for the '<em><b>Bad Value Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SAMPLE__BAD_VALUE_GENERATOR = MGeneratorPackage.VALUE_GENERATOR__BAD_VALUE_GENERATOR;

	/**
	 * The feature id for the '<em><b>Last Generated Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SAMPLE__LAST_GENERATED_VALUE = MGeneratorPackage.VALUE_GENERATOR__LAST_GENERATED_VALUE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SAMPLE__RANDOM_SEED = MGeneratorPackage.VALUE_GENERATOR__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SAMPLE__DESCRIPTION = MGeneratorPackage.VALUE_GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SAMPLE__ID = MGeneratorPackage.VALUE_GENERATOR__ID;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SAMPLE__LOCALE = MGeneratorPackage.VALUE_GENERATOR__LOCALE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SAMPLE__NAME = MGeneratorPackage.VALUE_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SAMPLE__SEED = MGeneratorPackage.VALUE_GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SAMPLE__LANGUAGE = MGeneratorPackage.VALUE_GENERATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Package URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SAMPLE__PACKAGE_URI = MGeneratorPackage.VALUE_GENERATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SAMPLE__PACKAGE = MGeneratorPackage.VALUE_GENERATOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Root Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SAMPLE__ROOT_ENTITY = MGeneratorPackage.VALUE_GENERATOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Root Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SAMPLE__ROOT_ENTITY_NAME = MGeneratorPackage.VALUE_GENERATOR_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Bad Value Generator Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SAMPLE__BAD_VALUE_GENERATOR_NAMES = MGeneratorPackage.VALUE_GENERATOR_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Root Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SAMPLE__ROOT_GENERATOR = MGeneratorPackage.VALUE_GENERATOR_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>File Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SAMPLE__FILE_EXTENSION = MGeneratorPackage.VALUE_GENERATOR_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Data Sample</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SAMPLE_FEATURE_COUNT = MGeneratorPackage.VALUE_GENERATOR_FEATURE_COUNT + 10;

	/**
	 * The operation id for the '<em>Generate Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SAMPLE___GENERATE_VALUE = MGeneratorPackage.VALUE_GENERATOR___GENERATE_VALUE;

	/**
	 * The number of operations of the '<em>Data Sample</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SAMPLE_OPERATION_COUNT = MGeneratorPackage.VALUE_GENERATOR_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Bad Value Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_GENERATOR__BAD_VALUE_PROPORTION = MGeneratorPackage.VALUE_GENERATOR__BAD_VALUE_PROPORTION;

	/**
	 * The feature id for the '<em><b>Bad Value Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_GENERATOR__BAD_VALUE_GENERATOR = MGeneratorPackage.VALUE_GENERATOR__BAD_VALUE_GENERATOR;

	/**
	 * The feature id for the '<em><b>Last Generated Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_GENERATOR__LAST_GENERATED_VALUE = MGeneratorPackage.VALUE_GENERATOR__LAST_GENERATED_VALUE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_GENERATOR__RANDOM_SEED = MGeneratorPackage.VALUE_GENERATOR__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_GENERATOR__DESCRIPTION = MGeneratorPackage.VALUE_GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_GENERATOR__ID = MGeneratorPackage.VALUE_GENERATOR__ID;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_GENERATOR__LOCALE = MGeneratorPackage.VALUE_GENERATOR__LOCALE;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_GENERATOR__NUMBER = MGeneratorPackage.VALUE_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_GENERATOR__ENTITY_NAME = MGeneratorPackage.VALUE_GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_GENERATOR__ENTITY = MGeneratorPackage.VALUE_GENERATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Field Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_GENERATOR__FIELD_GENERATORS = MGeneratorPackage.VALUE_GENERATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Children Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_GENERATOR__CHILDREN_GENERATORS = MGeneratorPackage.VALUE_GENERATOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Association Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_GENERATOR__ASSOCIATION_GENERATORS = MGeneratorPackage.VALUE_GENERATOR_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Entity Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_GENERATOR_FEATURE_COUNT = MGeneratorPackage.VALUE_GENERATOR_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Generate Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_GENERATOR___GENERATE_VALUE = MGeneratorPackage.VALUE_GENERATOR___GENERATE_VALUE;

	/**
	 * The operation id for the '<em>Get Instances</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_GENERATOR___GET_INSTANCES = MGeneratorPackage.VALUE_GENERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Entity Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_GENERATOR_OPERATION_COUNT = MGeneratorPackage.VALUE_GENERATOR_OPERATION_COUNT + 1;

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
	 * The feature id for the '<em><b>Bad Value Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_GENERATOR__BAD_VALUE_PROPORTION = MGeneratorPackage.VALUE_GENERATOR__BAD_VALUE_PROPORTION;

	/**
	 * The feature id for the '<em><b>Bad Value Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_GENERATOR__BAD_VALUE_GENERATOR = MGeneratorPackage.VALUE_GENERATOR__BAD_VALUE_GENERATOR;

	/**
	 * The feature id for the '<em><b>Last Generated Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_GENERATOR__LAST_GENERATED_VALUE = MGeneratorPackage.VALUE_GENERATOR__LAST_GENERATED_VALUE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_GENERATOR__RANDOM_SEED = MGeneratorPackage.VALUE_GENERATOR__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_GENERATOR__DESCRIPTION = MGeneratorPackage.VALUE_GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_GENERATOR__ID = MGeneratorPackage.VALUE_GENERATOR__ID;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_GENERATOR__LOCALE = MGeneratorPackage.VALUE_GENERATOR__LOCALE;

	/**
	 * The feature id for the '<em><b>Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_GENERATOR__FIELD_NAME = MGeneratorPackage.VALUE_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_GENERATOR__GENERATOR = MGeneratorPackage.VALUE_GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_GENERATOR__STRUCTURAL_FEATURE = MGeneratorPackage.VALUE_GENERATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Error Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_GENERATOR__ERROR_RATE = MGeneratorPackage.VALUE_GENERATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Generator Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_GENERATOR__GENERATOR_NAME = MGeneratorPackage.VALUE_GENERATOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Error Generator Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_GENERATOR__ERROR_GENERATOR_NAME = MGeneratorPackage.VALUE_GENERATOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Error Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_GENERATOR__ERROR_GENERATOR = MGeneratorPackage.VALUE_GENERATOR_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_GENERATOR__PARAMETERS = MGeneratorPackage.VALUE_GENERATOR_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_GENERATOR__NUMBER = MGeneratorPackage.VALUE_GENERATOR_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Field Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_GENERATOR_FEATURE_COUNT = MGeneratorPackage.VALUE_GENERATOR_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Generate Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_GENERATOR___GENERATE_VALUE = MGeneratorPackage.VALUE_GENERATOR___GENERATE_VALUE;

	/**
	 * The number of operations of the '<em>Field Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_GENERATOR_OPERATION_COUNT = MGeneratorPackage.VALUE_GENERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.opcoach.datasample.impl.MParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.datasample.impl.MParameterImpl
	 * @see com.opcoach.datasample.impl.MDatasamplePackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.opcoach.datasample.impl.MAssociationGeneratorImpl <em>Association Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.datasample.impl.MAssociationGeneratorImpl
	 * @see com.opcoach.datasample.impl.MDatasamplePackageImpl#getAssociationGenerator()
	 * @generated
	 */
	int ASSOCIATION_GENERATOR = 4;

	/**
	 * The feature id for the '<em><b>Bad Value Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_GENERATOR__BAD_VALUE_PROPORTION = FIELD_GENERATOR__BAD_VALUE_PROPORTION;

	/**
	 * The feature id for the '<em><b>Bad Value Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_GENERATOR__BAD_VALUE_GENERATOR = FIELD_GENERATOR__BAD_VALUE_GENERATOR;

	/**
	 * The feature id for the '<em><b>Last Generated Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_GENERATOR__LAST_GENERATED_VALUE = FIELD_GENERATOR__LAST_GENERATED_VALUE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_GENERATOR__RANDOM_SEED = FIELD_GENERATOR__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_GENERATOR__DESCRIPTION = FIELD_GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_GENERATOR__ID = FIELD_GENERATOR__ID;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_GENERATOR__LOCALE = FIELD_GENERATOR__LOCALE;

	/**
	 * The feature id for the '<em><b>Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_GENERATOR__FIELD_NAME = FIELD_GENERATOR__FIELD_NAME;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_GENERATOR__GENERATOR = FIELD_GENERATOR__GENERATOR;

	/**
	 * The feature id for the '<em><b>Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_GENERATOR__STRUCTURAL_FEATURE = FIELD_GENERATOR__STRUCTURAL_FEATURE;

	/**
	 * The feature id for the '<em><b>Error Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_GENERATOR__ERROR_RATE = FIELD_GENERATOR__ERROR_RATE;

	/**
	 * The feature id for the '<em><b>Generator Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_GENERATOR__GENERATOR_NAME = FIELD_GENERATOR__GENERATOR_NAME;

	/**
	 * The feature id for the '<em><b>Error Generator Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_GENERATOR__ERROR_GENERATOR_NAME = FIELD_GENERATOR__ERROR_GENERATOR_NAME;

	/**
	 * The feature id for the '<em><b>Error Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_GENERATOR__ERROR_GENERATOR = FIELD_GENERATOR__ERROR_GENERATOR;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_GENERATOR__PARAMETERS = FIELD_GENERATOR__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_GENERATOR__NUMBER = FIELD_GENERATOR__NUMBER;

	/**
	 * The number of structural features of the '<em>Association Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_GENERATOR_FEATURE_COUNT = FIELD_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Generate Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_GENERATOR___GENERATE_VALUE = FIELD_GENERATOR___GENERATE_VALUE;

	/**
	 * The number of operations of the '<em>Association Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_GENERATOR_OPERATION_COUNT = FIELD_GENERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.opcoach.datasample.impl.MChildrenGeneratorImpl <em>Children Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.datasample.impl.MChildrenGeneratorImpl
	 * @see com.opcoach.datasample.impl.MDatasamplePackageImpl#getChildrenGenerator()
	 * @generated
	 */
	int CHILDREN_GENERATOR = 5;

	/**
	 * The feature id for the '<em><b>Bad Value Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILDREN_GENERATOR__BAD_VALUE_PROPORTION = FIELD_GENERATOR__BAD_VALUE_PROPORTION;

	/**
	 * The feature id for the '<em><b>Bad Value Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILDREN_GENERATOR__BAD_VALUE_GENERATOR = FIELD_GENERATOR__BAD_VALUE_GENERATOR;

	/**
	 * The feature id for the '<em><b>Last Generated Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILDREN_GENERATOR__LAST_GENERATED_VALUE = FIELD_GENERATOR__LAST_GENERATED_VALUE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILDREN_GENERATOR__RANDOM_SEED = FIELD_GENERATOR__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILDREN_GENERATOR__DESCRIPTION = FIELD_GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILDREN_GENERATOR__ID = FIELD_GENERATOR__ID;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILDREN_GENERATOR__LOCALE = FIELD_GENERATOR__LOCALE;

	/**
	 * The feature id for the '<em><b>Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILDREN_GENERATOR__FIELD_NAME = FIELD_GENERATOR__FIELD_NAME;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILDREN_GENERATOR__GENERATOR = FIELD_GENERATOR__GENERATOR;

	/**
	 * The feature id for the '<em><b>Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILDREN_GENERATOR__STRUCTURAL_FEATURE = FIELD_GENERATOR__STRUCTURAL_FEATURE;

	/**
	 * The feature id for the '<em><b>Error Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILDREN_GENERATOR__ERROR_RATE = FIELD_GENERATOR__ERROR_RATE;

	/**
	 * The feature id for the '<em><b>Generator Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILDREN_GENERATOR__GENERATOR_NAME = FIELD_GENERATOR__GENERATOR_NAME;

	/**
	 * The feature id for the '<em><b>Error Generator Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILDREN_GENERATOR__ERROR_GENERATOR_NAME = FIELD_GENERATOR__ERROR_GENERATOR_NAME;

	/**
	 * The feature id for the '<em><b>Error Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILDREN_GENERATOR__ERROR_GENERATOR = FIELD_GENERATOR__ERROR_GENERATOR;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILDREN_GENERATOR__PARAMETERS = FIELD_GENERATOR__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILDREN_GENERATOR__NUMBER = FIELD_GENERATOR__NUMBER;

	/**
	 * The feature id for the '<em><b>Polymorphic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILDREN_GENERATOR__POLYMORPHIC = FIELD_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Children Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILDREN_GENERATOR__CHILDREN_GENERATORS = FIELD_GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Children Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILDREN_GENERATOR_FEATURE_COUNT = FIELD_GENERATOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Generate Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILDREN_GENERATOR___GENERATE_VALUE = FIELD_GENERATOR___GENERATE_VALUE;

	/**
	 * The number of operations of the '<em>Children Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILDREN_GENERATOR_OPERATION_COUNT = FIELD_GENERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.opcoach.datasample.Language <em>Language</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.datasample.Language
	 * @see com.opcoach.datasample.impl.MDatasamplePackageImpl#getLanguage()
	 * @generated
	 */
	int LANGUAGE = 6;


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
	 * Returns the meta object for the attribute '{@link com.opcoach.datasample.MDataSample#getRootEntityName <em>Root Entity Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root Entity Name</em>'.
	 * @see com.opcoach.datasample.MDataSample#getRootEntityName()
	 * @see #getDataSample()
	 * @generated
	 */
	EAttribute getDataSample_RootEntityName();

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
	 * Returns the meta object for the containment reference '{@link com.opcoach.datasample.MDataSample#getRootGenerator <em>Root Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root Generator</em>'.
	 * @see com.opcoach.datasample.MDataSample#getRootGenerator()
	 * @see #getDataSample()
	 * @generated
	 */
	EReference getDataSample_RootGenerator();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.datasample.MDataSample#getFileExtension <em>File Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Extension</em>'.
	 * @see com.opcoach.datasample.MDataSample#getFileExtension()
	 * @see #getDataSample()
	 * @generated
	 */
	EAttribute getDataSample_FileExtension();

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
	 * Returns the meta object for the containment reference list '{@link com.opcoach.datasample.MEntityGenerator#getChildrenGenerators <em>Children Generators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children Generators</em>'.
	 * @see com.opcoach.datasample.MEntityGenerator#getChildrenGenerators()
	 * @see #getEntityGenerator()
	 * @generated
	 */
	EReference getEntityGenerator_ChildrenGenerators();

	/**
	 * Returns the meta object for the containment reference list '{@link com.opcoach.datasample.MEntityGenerator#getAssociationGenerators <em>Association Generators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Association Generators</em>'.
	 * @see com.opcoach.datasample.MEntityGenerator#getAssociationGenerators()
	 * @see #getEntityGenerator()
	 * @generated
	 */
	EReference getEntityGenerator_AssociationGenerators();

	/**
	 * Returns the meta object for the '{@link com.opcoach.datasample.MEntityGenerator#getInstances() <em>Get Instances</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Instances</em>' operation.
	 * @see com.opcoach.datasample.MEntityGenerator#getInstances()
	 * @generated
	 */
	EOperation getEntityGenerator__GetInstances();

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
	 * Returns the meta object for the containment reference list '{@link com.opcoach.datasample.MFieldGenerator#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see com.opcoach.datasample.MFieldGenerator#getParameters()
	 * @see #getFieldGenerator()
	 * @generated
	 */
	EReference getFieldGenerator_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.datasample.MFieldGenerator#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see com.opcoach.datasample.MFieldGenerator#getNumber()
	 * @see #getFieldGenerator()
	 * @generated
	 */
	EAttribute getFieldGenerator_Number();

	/**
	 * Returns the meta object for class '{@link com.opcoach.datasample.MParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see com.opcoach.datasample.MParameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.datasample.MParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.opcoach.datasample.MParameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.datasample.MParameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.opcoach.datasample.MParameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Value();

	/**
	 * Returns the meta object for class '{@link com.opcoach.datasample.MAssociationGenerator <em>Association Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association Generator</em>'.
	 * @see com.opcoach.datasample.MAssociationGenerator
	 * @generated
	 */
	EClass getAssociationGenerator();

	/**
	 * Returns the meta object for class '{@link com.opcoach.datasample.MChildrenGenerator <em>Children Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Children Generator</em>'.
	 * @see com.opcoach.datasample.MChildrenGenerator
	 * @generated
	 */
	EClass getChildrenGenerator();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.datasample.MChildrenGenerator#isPolymorphic <em>Polymorphic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Polymorphic</em>'.
	 * @see com.opcoach.datasample.MChildrenGenerator#isPolymorphic()
	 * @see #getChildrenGenerator()
	 * @generated
	 */
	EAttribute getChildrenGenerator_Polymorphic();

	/**
	 * Returns the meta object for the containment reference list '{@link com.opcoach.datasample.MChildrenGenerator#getChildrenGenerators <em>Children Generators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children Generators</em>'.
	 * @see com.opcoach.datasample.MChildrenGenerator#getChildrenGenerators()
	 * @see #getChildrenGenerator()
	 * @generated
	 */
	EReference getChildrenGenerator_ChildrenGenerators();

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
		 * The meta object literal for the '<em><b>Root Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SAMPLE__ROOT_ENTITY = eINSTANCE.getDataSample_RootEntity();

		/**
		 * The meta object literal for the '<em><b>Root Entity Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SAMPLE__ROOT_ENTITY_NAME = eINSTANCE.getDataSample_RootEntityName();

		/**
		 * The meta object literal for the '<em><b>Bad Value Generator Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SAMPLE__BAD_VALUE_GENERATOR_NAMES = eINSTANCE.getDataSample_BadValueGeneratorNames();

		/**
		 * The meta object literal for the '<em><b>Root Generator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SAMPLE__ROOT_GENERATOR = eINSTANCE.getDataSample_RootGenerator();

		/**
		 * The meta object literal for the '<em><b>File Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SAMPLE__FILE_EXTENSION = eINSTANCE.getDataSample_FileExtension();

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
		 * The meta object literal for the '<em><b>Children Generators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_GENERATOR__CHILDREN_GENERATORS = eINSTANCE.getEntityGenerator_ChildrenGenerators();

		/**
		 * The meta object literal for the '<em><b>Association Generators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_GENERATOR__ASSOCIATION_GENERATORS = eINSTANCE.getEntityGenerator_AssociationGenerators();

		/**
		 * The meta object literal for the '<em><b>Get Instances</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY_GENERATOR___GET_INSTANCES = eINSTANCE.getEntityGenerator__GetInstances();

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
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_GENERATOR__PARAMETERS = eINSTANCE.getFieldGenerator_Parameters();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_GENERATOR__NUMBER = eINSTANCE.getFieldGenerator_Number();

		/**
		 * The meta object literal for the '{@link com.opcoach.datasample.impl.MParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.opcoach.datasample.impl.MParameterImpl
		 * @see com.opcoach.datasample.impl.MDatasamplePackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

		/**
		 * The meta object literal for the '{@link com.opcoach.datasample.impl.MAssociationGeneratorImpl <em>Association Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.opcoach.datasample.impl.MAssociationGeneratorImpl
		 * @see com.opcoach.datasample.impl.MDatasamplePackageImpl#getAssociationGenerator()
		 * @generated
		 */
		EClass ASSOCIATION_GENERATOR = eINSTANCE.getAssociationGenerator();

		/**
		 * The meta object literal for the '{@link com.opcoach.datasample.impl.MChildrenGeneratorImpl <em>Children Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.opcoach.datasample.impl.MChildrenGeneratorImpl
		 * @see com.opcoach.datasample.impl.MDatasamplePackageImpl#getChildrenGenerator()
		 * @generated
		 */
		EClass CHILDREN_GENERATOR = eINSTANCE.getChildrenGenerator();

		/**
		 * The meta object literal for the '<em><b>Polymorphic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHILDREN_GENERATOR__POLYMORPHIC = eINSTANCE.getChildrenGenerator_Polymorphic();

		/**
		 * The meta object literal for the '<em><b>Children Generators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHILDREN_GENERATOR__CHILDREN_GENERATORS = eINSTANCE.getChildrenGenerator_ChildrenGenerators();

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
