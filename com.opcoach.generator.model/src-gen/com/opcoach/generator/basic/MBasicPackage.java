/**
 */
package com.opcoach.generator.basic;

import com.opcoach.generator.MGeneratorPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.opcoach.generator.basic.MBasicFactory
 * @model kind="package"
 * @generated
 */
public interface MBasicPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "basic";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.opcoach.com/generator/basic/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "genbasic";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MBasicPackage eINSTANCE = com.opcoach.generator.basic.impl.MBasicPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.opcoach.generator.basic.impl.MBooleanGeneratorImpl <em>Boolean Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.generator.basic.impl.MBooleanGeneratorImpl
	 * @see com.opcoach.generator.basic.impl.MBasicPackageImpl#getBooleanGenerator()
	 * @generated
	 */
	int BOOLEAN_GENERATOR = 0;

	/**
	 * The feature id for the '<em><b>Bad Value Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_GENERATOR__BAD_VALUE_PROPORTION = MGeneratorPackage.VALUE_GENERATOR__BAD_VALUE_PROPORTION;

	/**
	 * The feature id for the '<em><b>Bad Value Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_GENERATOR__BAD_VALUE_GENERATOR = MGeneratorPackage.VALUE_GENERATOR__BAD_VALUE_GENERATOR;

	/**
	 * The feature id for the '<em><b>Last Generated Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_GENERATOR__LAST_GENERATED_VALUE = MGeneratorPackage.VALUE_GENERATOR__LAST_GENERATED_VALUE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_GENERATOR__RANDOM_SEED = MGeneratorPackage.VALUE_GENERATOR__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_GENERATOR__DESCRIPTION = MGeneratorPackage.VALUE_GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_GENERATOR__ID = MGeneratorPackage.VALUE_GENERATOR__ID;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_GENERATOR__LOCALE = MGeneratorPackage.VALUE_GENERATOR__LOCALE;

	/**
	 * The number of structural features of the '<em>Boolean Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_GENERATOR_FEATURE_COUNT = MGeneratorPackage.VALUE_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.opcoach.generator.basic.impl.MDateGeneratorImpl <em>Date Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.generator.basic.impl.MDateGeneratorImpl
	 * @see com.opcoach.generator.basic.impl.MBasicPackageImpl#getDateGenerator()
	 * @generated
	 */
	int DATE_GENERATOR = 1;

	/**
	 * The feature id for the '<em><b>Bad Value Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_GENERATOR__BAD_VALUE_PROPORTION = MGeneratorPackage.RANGE_GENERATOR__BAD_VALUE_PROPORTION;

	/**
	 * The feature id for the '<em><b>Bad Value Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_GENERATOR__BAD_VALUE_GENERATOR = MGeneratorPackage.RANGE_GENERATOR__BAD_VALUE_GENERATOR;

	/**
	 * The feature id for the '<em><b>Last Generated Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_GENERATOR__LAST_GENERATED_VALUE = MGeneratorPackage.RANGE_GENERATOR__LAST_GENERATED_VALUE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_GENERATOR__RANDOM_SEED = MGeneratorPackage.RANGE_GENERATOR__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_GENERATOR__DESCRIPTION = MGeneratorPackage.RANGE_GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_GENERATOR__ID = MGeneratorPackage.RANGE_GENERATOR__ID;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_GENERATOR__LOCALE = MGeneratorPackage.RANGE_GENERATOR__LOCALE;

	/**
	 * The feature id for the '<em><b>Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_GENERATOR__LOW = MGeneratorPackage.RANGE_GENERATOR__LOW;

	/**
	 * The feature id for the '<em><b>High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_GENERATOR__HIGH = MGeneratorPackage.RANGE_GENERATOR__HIGH;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_GENERATOR__STEP = MGeneratorPackage.RANGE_GENERATOR__STEP;

	/**
	 * The feature id for the '<em><b>Generate Now</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_GENERATOR__GENERATE_NOW = MGeneratorPackage.RANGE_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Date Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_GENERATOR_FEATURE_COUNT = MGeneratorPackage.RANGE_GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.opcoach.generator.basic.impl.MDoubleGeneratorImpl <em>Double Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.generator.basic.impl.MDoubleGeneratorImpl
	 * @see com.opcoach.generator.basic.impl.MBasicPackageImpl#getDoubleGenerator()
	 * @generated
	 */
	int DOUBLE_GENERATOR = 2;

	/**
	 * The feature id for the '<em><b>Bad Value Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_GENERATOR__BAD_VALUE_PROPORTION = MGeneratorPackage.RANGE_GENERATOR__BAD_VALUE_PROPORTION;

	/**
	 * The feature id for the '<em><b>Bad Value Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_GENERATOR__BAD_VALUE_GENERATOR = MGeneratorPackage.RANGE_GENERATOR__BAD_VALUE_GENERATOR;

	/**
	 * The feature id for the '<em><b>Last Generated Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_GENERATOR__LAST_GENERATED_VALUE = MGeneratorPackage.RANGE_GENERATOR__LAST_GENERATED_VALUE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_GENERATOR__RANDOM_SEED = MGeneratorPackage.RANGE_GENERATOR__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_GENERATOR__DESCRIPTION = MGeneratorPackage.RANGE_GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_GENERATOR__ID = MGeneratorPackage.RANGE_GENERATOR__ID;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_GENERATOR__LOCALE = MGeneratorPackage.RANGE_GENERATOR__LOCALE;

	/**
	 * The feature id for the '<em><b>Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_GENERATOR__LOW = MGeneratorPackage.RANGE_GENERATOR__LOW;

	/**
	 * The feature id for the '<em><b>High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_GENERATOR__HIGH = MGeneratorPackage.RANGE_GENERATOR__HIGH;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_GENERATOR__STEP = MGeneratorPackage.RANGE_GENERATOR__STEP;

	/**
	 * The number of structural features of the '<em>Double Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_GENERATOR_FEATURE_COUNT = MGeneratorPackage.RANGE_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.opcoach.generator.basic.impl.MFloatGeneratorImpl <em>Float Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.generator.basic.impl.MFloatGeneratorImpl
	 * @see com.opcoach.generator.basic.impl.MBasicPackageImpl#getFloatGenerator()
	 * @generated
	 */
	int FLOAT_GENERATOR = 3;

	/**
	 * The feature id for the '<em><b>Bad Value Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_GENERATOR__BAD_VALUE_PROPORTION = MGeneratorPackage.RANGE_GENERATOR__BAD_VALUE_PROPORTION;

	/**
	 * The feature id for the '<em><b>Bad Value Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_GENERATOR__BAD_VALUE_GENERATOR = MGeneratorPackage.RANGE_GENERATOR__BAD_VALUE_GENERATOR;

	/**
	 * The feature id for the '<em><b>Last Generated Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_GENERATOR__LAST_GENERATED_VALUE = MGeneratorPackage.RANGE_GENERATOR__LAST_GENERATED_VALUE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_GENERATOR__RANDOM_SEED = MGeneratorPackage.RANGE_GENERATOR__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_GENERATOR__DESCRIPTION = MGeneratorPackage.RANGE_GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_GENERATOR__ID = MGeneratorPackage.RANGE_GENERATOR__ID;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_GENERATOR__LOCALE = MGeneratorPackage.RANGE_GENERATOR__LOCALE;

	/**
	 * The feature id for the '<em><b>Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_GENERATOR__LOW = MGeneratorPackage.RANGE_GENERATOR__LOW;

	/**
	 * The feature id for the '<em><b>High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_GENERATOR__HIGH = MGeneratorPackage.RANGE_GENERATOR__HIGH;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_GENERATOR__STEP = MGeneratorPackage.RANGE_GENERATOR__STEP;

	/**
	 * The number of structural features of the '<em>Float Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_GENERATOR_FEATURE_COUNT = MGeneratorPackage.RANGE_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.opcoach.generator.basic.impl.MIDGeneratorImpl <em>ID Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.generator.basic.impl.MIDGeneratorImpl
	 * @see com.opcoach.generator.basic.impl.MBasicPackageImpl#getIDGenerator()
	 * @generated
	 */
	int ID_GENERATOR = 4;

	/**
	 * The feature id for the '<em><b>Bad Value Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GENERATOR__BAD_VALUE_PROPORTION = MGeneratorPackage.VALUE_GENERATOR__BAD_VALUE_PROPORTION;

	/**
	 * The feature id for the '<em><b>Bad Value Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GENERATOR__BAD_VALUE_GENERATOR = MGeneratorPackage.VALUE_GENERATOR__BAD_VALUE_GENERATOR;

	/**
	 * The feature id for the '<em><b>Last Generated Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GENERATOR__LAST_GENERATED_VALUE = MGeneratorPackage.VALUE_GENERATOR__LAST_GENERATED_VALUE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GENERATOR__RANDOM_SEED = MGeneratorPackage.VALUE_GENERATOR__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GENERATOR__DESCRIPTION = MGeneratorPackage.VALUE_GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GENERATOR__ID = MGeneratorPackage.VALUE_GENERATOR__ID;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GENERATOR__LOCALE = MGeneratorPackage.VALUE_GENERATOR__LOCALE;

	/**
	 * The feature id for the '<em><b>Key Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GENERATOR__KEY_LENGTH = MGeneratorPackage.VALUE_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GENERATOR__PREFIX = MGeneratorPackage.VALUE_GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GENERATOR_FEATURE_COUNT = MGeneratorPackage.VALUE_GENERATOR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.opcoach.generator.basic.impl.MIntGeneratorImpl <em>Int Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.generator.basic.impl.MIntGeneratorImpl
	 * @see com.opcoach.generator.basic.impl.MBasicPackageImpl#getIntGenerator()
	 * @generated
	 */
	int INT_GENERATOR = 5;

	/**
	 * The feature id for the '<em><b>Bad Value Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_GENERATOR__BAD_VALUE_PROPORTION = MGeneratorPackage.RANGE_GENERATOR__BAD_VALUE_PROPORTION;

	/**
	 * The feature id for the '<em><b>Bad Value Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_GENERATOR__BAD_VALUE_GENERATOR = MGeneratorPackage.RANGE_GENERATOR__BAD_VALUE_GENERATOR;

	/**
	 * The feature id for the '<em><b>Last Generated Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_GENERATOR__LAST_GENERATED_VALUE = MGeneratorPackage.RANGE_GENERATOR__LAST_GENERATED_VALUE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_GENERATOR__RANDOM_SEED = MGeneratorPackage.RANGE_GENERATOR__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_GENERATOR__DESCRIPTION = MGeneratorPackage.RANGE_GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_GENERATOR__ID = MGeneratorPackage.RANGE_GENERATOR__ID;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_GENERATOR__LOCALE = MGeneratorPackage.RANGE_GENERATOR__LOCALE;

	/**
	 * The feature id for the '<em><b>Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_GENERATOR__LOW = MGeneratorPackage.RANGE_GENERATOR__LOW;

	/**
	 * The feature id for the '<em><b>High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_GENERATOR__HIGH = MGeneratorPackage.RANGE_GENERATOR__HIGH;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_GENERATOR__STEP = MGeneratorPackage.RANGE_GENERATOR__STEP;

	/**
	 * The number of structural features of the '<em>Int Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_GENERATOR_FEATURE_COUNT = MGeneratorPackage.RANGE_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.opcoach.generator.basic.impl.MLongGeneratorImpl <em>Long Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.generator.basic.impl.MLongGeneratorImpl
	 * @see com.opcoach.generator.basic.impl.MBasicPackageImpl#getLongGenerator()
	 * @generated
	 */
	int LONG_GENERATOR = 6;

	/**
	 * The feature id for the '<em><b>Bad Value Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_GENERATOR__BAD_VALUE_PROPORTION = MGeneratorPackage.RANGE_GENERATOR__BAD_VALUE_PROPORTION;

	/**
	 * The feature id for the '<em><b>Bad Value Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_GENERATOR__BAD_VALUE_GENERATOR = MGeneratorPackage.RANGE_GENERATOR__BAD_VALUE_GENERATOR;

	/**
	 * The feature id for the '<em><b>Last Generated Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_GENERATOR__LAST_GENERATED_VALUE = MGeneratorPackage.RANGE_GENERATOR__LAST_GENERATED_VALUE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_GENERATOR__RANDOM_SEED = MGeneratorPackage.RANGE_GENERATOR__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_GENERATOR__DESCRIPTION = MGeneratorPackage.RANGE_GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_GENERATOR__ID = MGeneratorPackage.RANGE_GENERATOR__ID;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_GENERATOR__LOCALE = MGeneratorPackage.RANGE_GENERATOR__LOCALE;

	/**
	 * The feature id for the '<em><b>Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_GENERATOR__LOW = MGeneratorPackage.RANGE_GENERATOR__LOW;

	/**
	 * The feature id for the '<em><b>High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_GENERATOR__HIGH = MGeneratorPackage.RANGE_GENERATOR__HIGH;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_GENERATOR__STEP = MGeneratorPackage.RANGE_GENERATOR__STEP;

	/**
	 * The number of structural features of the '<em>Long Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_GENERATOR_FEATURE_COUNT = MGeneratorPackage.RANGE_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.opcoach.generator.basic.impl.MNullValueGeneratorImpl <em>Null Value Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.generator.basic.impl.MNullValueGeneratorImpl
	 * @see com.opcoach.generator.basic.impl.MBasicPackageImpl#getNullValueGenerator()
	 * @generated
	 */
	int NULL_VALUE_GENERATOR = 7;

	/**
	 * The feature id for the '<em><b>Bad Value Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_VALUE_GENERATOR__BAD_VALUE_PROPORTION = MGeneratorPackage.VALUE_GENERATOR__BAD_VALUE_PROPORTION;

	/**
	 * The feature id for the '<em><b>Bad Value Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_VALUE_GENERATOR__BAD_VALUE_GENERATOR = MGeneratorPackage.VALUE_GENERATOR__BAD_VALUE_GENERATOR;

	/**
	 * The feature id for the '<em><b>Last Generated Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_VALUE_GENERATOR__LAST_GENERATED_VALUE = MGeneratorPackage.VALUE_GENERATOR__LAST_GENERATED_VALUE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_VALUE_GENERATOR__RANDOM_SEED = MGeneratorPackage.VALUE_GENERATOR__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_VALUE_GENERATOR__DESCRIPTION = MGeneratorPackage.VALUE_GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_VALUE_GENERATOR__ID = MGeneratorPackage.VALUE_GENERATOR__ID;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_VALUE_GENERATOR__LOCALE = MGeneratorPackage.VALUE_GENERATOR__LOCALE;

	/**
	 * The number of structural features of the '<em>Null Value Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_VALUE_GENERATOR_FEATURE_COUNT = MGeneratorPackage.VALUE_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.opcoach.generator.basic.impl.MStringGeneratorImpl <em>String Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.generator.basic.impl.MStringGeneratorImpl
	 * @see com.opcoach.generator.basic.impl.MBasicPackageImpl#getStringGenerator()
	 * @generated
	 */
	int STRING_GENERATOR = 8;

	/**
	 * The feature id for the '<em><b>Bad Value Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_GENERATOR__BAD_VALUE_PROPORTION = MGeneratorPackage.REFERENCE_GENERATOR__BAD_VALUE_PROPORTION;

	/**
	 * The feature id for the '<em><b>Bad Value Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_GENERATOR__BAD_VALUE_GENERATOR = MGeneratorPackage.REFERENCE_GENERATOR__BAD_VALUE_GENERATOR;

	/**
	 * The feature id for the '<em><b>Last Generated Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_GENERATOR__LAST_GENERATED_VALUE = MGeneratorPackage.REFERENCE_GENERATOR__LAST_GENERATED_VALUE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_GENERATOR__RANDOM_SEED = MGeneratorPackage.REFERENCE_GENERATOR__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_GENERATOR__DESCRIPTION = MGeneratorPackage.REFERENCE_GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_GENERATOR__ID = MGeneratorPackage.REFERENCE_GENERATOR__ID;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_GENERATOR__LOCALE = MGeneratorPackage.REFERENCE_GENERATOR__LOCALE;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_GENERATOR__STEP = MGeneratorPackage.REFERENCE_GENERATOR__STEP;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_GENERATOR__VALUES = MGeneratorPackage.REFERENCE_GENERATOR__VALUES;

	/**
	 * The feature id for the '<em><b>Data Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_GENERATOR__DATA_FILENAME = MGeneratorPackage.REFERENCE_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Case Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_GENERATOR__CASE_POLICY = MGeneratorPackage.REFERENCE_GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>String Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_GENERATOR_FEATURE_COUNT = MGeneratorPackage.REFERENCE_GENERATOR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.opcoach.generator.basic.impl.MTrueGeneratorImpl <em>True Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.generator.basic.impl.MTrueGeneratorImpl
	 * @see com.opcoach.generator.basic.impl.MBasicPackageImpl#getTrueGenerator()
	 * @generated
	 */
	int TRUE_GENERATOR = 9;

	/**
	 * The feature id for the '<em><b>Bad Value Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_GENERATOR__BAD_VALUE_PROPORTION = BOOLEAN_GENERATOR__BAD_VALUE_PROPORTION;

	/**
	 * The feature id for the '<em><b>Bad Value Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_GENERATOR__BAD_VALUE_GENERATOR = BOOLEAN_GENERATOR__BAD_VALUE_GENERATOR;

	/**
	 * The feature id for the '<em><b>Last Generated Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_GENERATOR__LAST_GENERATED_VALUE = BOOLEAN_GENERATOR__LAST_GENERATED_VALUE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_GENERATOR__RANDOM_SEED = BOOLEAN_GENERATOR__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_GENERATOR__DESCRIPTION = BOOLEAN_GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_GENERATOR__ID = BOOLEAN_GENERATOR__ID;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_GENERATOR__LOCALE = BOOLEAN_GENERATOR__LOCALE;

	/**
	 * The number of structural features of the '<em>True Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_GENERATOR_FEATURE_COUNT = BOOLEAN_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.opcoach.generator.basic.impl.MFalseGeneratorImpl <em>False Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.generator.basic.impl.MFalseGeneratorImpl
	 * @see com.opcoach.generator.basic.impl.MBasicPackageImpl#getFalseGenerator()
	 * @generated
	 */
	int FALSE_GENERATOR = 10;

	/**
	 * The feature id for the '<em><b>Bad Value Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALSE_GENERATOR__BAD_VALUE_PROPORTION = BOOLEAN_GENERATOR__BAD_VALUE_PROPORTION;

	/**
	 * The feature id for the '<em><b>Bad Value Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALSE_GENERATOR__BAD_VALUE_GENERATOR = BOOLEAN_GENERATOR__BAD_VALUE_GENERATOR;

	/**
	 * The feature id for the '<em><b>Last Generated Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALSE_GENERATOR__LAST_GENERATED_VALUE = BOOLEAN_GENERATOR__LAST_GENERATED_VALUE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALSE_GENERATOR__RANDOM_SEED = BOOLEAN_GENERATOR__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALSE_GENERATOR__DESCRIPTION = BOOLEAN_GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALSE_GENERATOR__ID = BOOLEAN_GENERATOR__ID;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALSE_GENERATOR__LOCALE = BOOLEAN_GENERATOR__LOCALE;

	/**
	 * The number of structural features of the '<em>False Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALSE_GENERATOR_FEATURE_COUNT = BOOLEAN_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.opcoach.generator.basic.CasePolicyType <em>Case Policy Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.generator.basic.CasePolicyType
	 * @see com.opcoach.generator.basic.impl.MBasicPackageImpl#getCasePolicyType()
	 * @generated
	 */
	int CASE_POLICY_TYPE = 11;


	/**
	 * Returns the meta object for class '{@link com.opcoach.generator.basic.MBooleanGenerator <em>Boolean Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Generator</em>'.
	 * @see com.opcoach.generator.basic.MBooleanGenerator
	 * @generated
	 */
	EClass getBooleanGenerator();

	/**
	 * Returns the meta object for class '{@link com.opcoach.generator.basic.MDateGenerator <em>Date Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Generator</em>'.
	 * @see com.opcoach.generator.basic.MDateGenerator
	 * @generated
	 */
	EClass getDateGenerator();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.generator.basic.MDateGenerator#isGenerateNow <em>Generate Now</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate Now</em>'.
	 * @see com.opcoach.generator.basic.MDateGenerator#isGenerateNow()
	 * @see #getDateGenerator()
	 * @generated
	 */
	EAttribute getDateGenerator_GenerateNow();

	/**
	 * Returns the meta object for class '{@link com.opcoach.generator.basic.MDoubleGenerator <em>Double Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Generator</em>'.
	 * @see com.opcoach.generator.basic.MDoubleGenerator
	 * @generated
	 */
	EClass getDoubleGenerator();

	/**
	 * Returns the meta object for class '{@link com.opcoach.generator.basic.MFloatGenerator <em>Float Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float Generator</em>'.
	 * @see com.opcoach.generator.basic.MFloatGenerator
	 * @generated
	 */
	EClass getFloatGenerator();

	/**
	 * Returns the meta object for class '{@link com.opcoach.generator.basic.MIDGenerator <em>ID Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Generator</em>'.
	 * @see com.opcoach.generator.basic.MIDGenerator
	 * @generated
	 */
	EClass getIDGenerator();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.generator.basic.MIDGenerator#getKeyLength <em>Key Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Length</em>'.
	 * @see com.opcoach.generator.basic.MIDGenerator#getKeyLength()
	 * @see #getIDGenerator()
	 * @generated
	 */
	EAttribute getIDGenerator_KeyLength();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.generator.basic.MIDGenerator#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see com.opcoach.generator.basic.MIDGenerator#getPrefix()
	 * @see #getIDGenerator()
	 * @generated
	 */
	EAttribute getIDGenerator_Prefix();

	/**
	 * Returns the meta object for class '{@link com.opcoach.generator.basic.MIntGenerator <em>Int Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Generator</em>'.
	 * @see com.opcoach.generator.basic.MIntGenerator
	 * @generated
	 */
	EClass getIntGenerator();

	/**
	 * Returns the meta object for class '{@link com.opcoach.generator.basic.MLongGenerator <em>Long Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Long Generator</em>'.
	 * @see com.opcoach.generator.basic.MLongGenerator
	 * @generated
	 */
	EClass getLongGenerator();

	/**
	 * Returns the meta object for class '{@link com.opcoach.generator.basic.MNullValueGenerator <em>Null Value Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Null Value Generator</em>'.
	 * @see com.opcoach.generator.basic.MNullValueGenerator
	 * @generated
	 */
	EClass getNullValueGenerator();

	/**
	 * Returns the meta object for class '{@link com.opcoach.generator.basic.MStringGenerator <em>String Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Generator</em>'.
	 * @see com.opcoach.generator.basic.MStringGenerator
	 * @generated
	 */
	EClass getStringGenerator();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.generator.basic.MStringGenerator#getDataFilename <em>Data Filename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Filename</em>'.
	 * @see com.opcoach.generator.basic.MStringGenerator#getDataFilename()
	 * @see #getStringGenerator()
	 * @generated
	 */
	EAttribute getStringGenerator_DataFilename();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.generator.basic.MStringGenerator#getCasePolicy <em>Case Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Case Policy</em>'.
	 * @see com.opcoach.generator.basic.MStringGenerator#getCasePolicy()
	 * @see #getStringGenerator()
	 * @generated
	 */
	EAttribute getStringGenerator_CasePolicy();

	/**
	 * Returns the meta object for class '{@link com.opcoach.generator.basic.MTrueGenerator <em>True Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>True Generator</em>'.
	 * @see com.opcoach.generator.basic.MTrueGenerator
	 * @generated
	 */
	EClass getTrueGenerator();

	/**
	 * Returns the meta object for class '{@link com.opcoach.generator.basic.MFalseGenerator <em>False Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>False Generator</em>'.
	 * @see com.opcoach.generator.basic.MFalseGenerator
	 * @generated
	 */
	EClass getFalseGenerator();

	/**
	 * Returns the meta object for enum '{@link com.opcoach.generator.basic.CasePolicyType <em>Case Policy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Case Policy Type</em>'.
	 * @see com.opcoach.generator.basic.CasePolicyType
	 * @generated
	 */
	EEnum getCasePolicyType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MBasicFactory getBasicFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link com.opcoach.generator.basic.impl.MBooleanGeneratorImpl <em>Boolean Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.opcoach.generator.basic.impl.MBooleanGeneratorImpl
		 * @see com.opcoach.generator.basic.impl.MBasicPackageImpl#getBooleanGenerator()
		 * @generated
		 */
		EClass BOOLEAN_GENERATOR = eINSTANCE.getBooleanGenerator();

		/**
		 * The meta object literal for the '{@link com.opcoach.generator.basic.impl.MDateGeneratorImpl <em>Date Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.opcoach.generator.basic.impl.MDateGeneratorImpl
		 * @see com.opcoach.generator.basic.impl.MBasicPackageImpl#getDateGenerator()
		 * @generated
		 */
		EClass DATE_GENERATOR = eINSTANCE.getDateGenerator();

		/**
		 * The meta object literal for the '<em><b>Generate Now</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_GENERATOR__GENERATE_NOW = eINSTANCE.getDateGenerator_GenerateNow();

		/**
		 * The meta object literal for the '{@link com.opcoach.generator.basic.impl.MDoubleGeneratorImpl <em>Double Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.opcoach.generator.basic.impl.MDoubleGeneratorImpl
		 * @see com.opcoach.generator.basic.impl.MBasicPackageImpl#getDoubleGenerator()
		 * @generated
		 */
		EClass DOUBLE_GENERATOR = eINSTANCE.getDoubleGenerator();

		/**
		 * The meta object literal for the '{@link com.opcoach.generator.basic.impl.MFloatGeneratorImpl <em>Float Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.opcoach.generator.basic.impl.MFloatGeneratorImpl
		 * @see com.opcoach.generator.basic.impl.MBasicPackageImpl#getFloatGenerator()
		 * @generated
		 */
		EClass FLOAT_GENERATOR = eINSTANCE.getFloatGenerator();

		/**
		 * The meta object literal for the '{@link com.opcoach.generator.basic.impl.MIDGeneratorImpl <em>ID Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.opcoach.generator.basic.impl.MIDGeneratorImpl
		 * @see com.opcoach.generator.basic.impl.MBasicPackageImpl#getIDGenerator()
		 * @generated
		 */
		EClass ID_GENERATOR = eINSTANCE.getIDGenerator();

		/**
		 * The meta object literal for the '<em><b>Key Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_GENERATOR__KEY_LENGTH = eINSTANCE.getIDGenerator_KeyLength();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_GENERATOR__PREFIX = eINSTANCE.getIDGenerator_Prefix();

		/**
		 * The meta object literal for the '{@link com.opcoach.generator.basic.impl.MIntGeneratorImpl <em>Int Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.opcoach.generator.basic.impl.MIntGeneratorImpl
		 * @see com.opcoach.generator.basic.impl.MBasicPackageImpl#getIntGenerator()
		 * @generated
		 */
		EClass INT_GENERATOR = eINSTANCE.getIntGenerator();

		/**
		 * The meta object literal for the '{@link com.opcoach.generator.basic.impl.MLongGeneratorImpl <em>Long Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.opcoach.generator.basic.impl.MLongGeneratorImpl
		 * @see com.opcoach.generator.basic.impl.MBasicPackageImpl#getLongGenerator()
		 * @generated
		 */
		EClass LONG_GENERATOR = eINSTANCE.getLongGenerator();

		/**
		 * The meta object literal for the '{@link com.opcoach.generator.basic.impl.MNullValueGeneratorImpl <em>Null Value Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.opcoach.generator.basic.impl.MNullValueGeneratorImpl
		 * @see com.opcoach.generator.basic.impl.MBasicPackageImpl#getNullValueGenerator()
		 * @generated
		 */
		EClass NULL_VALUE_GENERATOR = eINSTANCE.getNullValueGenerator();

		/**
		 * The meta object literal for the '{@link com.opcoach.generator.basic.impl.MStringGeneratorImpl <em>String Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.opcoach.generator.basic.impl.MStringGeneratorImpl
		 * @see com.opcoach.generator.basic.impl.MBasicPackageImpl#getStringGenerator()
		 * @generated
		 */
		EClass STRING_GENERATOR = eINSTANCE.getStringGenerator();

		/**
		 * The meta object literal for the '<em><b>Data Filename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_GENERATOR__DATA_FILENAME = eINSTANCE.getStringGenerator_DataFilename();

		/**
		 * The meta object literal for the '<em><b>Case Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_GENERATOR__CASE_POLICY = eINSTANCE.getStringGenerator_CasePolicy();

		/**
		 * The meta object literal for the '{@link com.opcoach.generator.basic.impl.MTrueGeneratorImpl <em>True Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.opcoach.generator.basic.impl.MTrueGeneratorImpl
		 * @see com.opcoach.generator.basic.impl.MBasicPackageImpl#getTrueGenerator()
		 * @generated
		 */
		EClass TRUE_GENERATOR = eINSTANCE.getTrueGenerator();

		/**
		 * The meta object literal for the '{@link com.opcoach.generator.basic.impl.MFalseGeneratorImpl <em>False Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.opcoach.generator.basic.impl.MFalseGeneratorImpl
		 * @see com.opcoach.generator.basic.impl.MBasicPackageImpl#getFalseGenerator()
		 * @generated
		 */
		EClass FALSE_GENERATOR = eINSTANCE.getFalseGenerator();

		/**
		 * The meta object literal for the '{@link com.opcoach.generator.basic.CasePolicyType <em>Case Policy Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.opcoach.generator.basic.CasePolicyType
		 * @see com.opcoach.generator.basic.impl.MBasicPackageImpl#getCasePolicyType()
		 * @generated
		 */
		EEnum CASE_POLICY_TYPE = eINSTANCE.getCasePolicyType();

	}

} //MBasicPackage
