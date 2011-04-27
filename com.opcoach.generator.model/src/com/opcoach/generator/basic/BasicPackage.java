/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.generator.basic;

import com.opcoach.generator.GeneratorPackage;

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
 * @see com.opcoach.generator.basic.BasicFactory
 * @model kind="package"
 * @generated
 */
public interface BasicPackage extends EPackage
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
	BasicPackage eINSTANCE = com.opcoach.generator.basic.impl.BasicPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.opcoach.generator.basic.impl.BooleanGeneratorImpl <em>Boolean Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.generator.basic.impl.BooleanGeneratorImpl
	 * @see com.opcoach.generator.basic.impl.BasicPackageImpl#getBooleanGenerator()
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
	int BOOLEAN_GENERATOR__BAD_VALUE_PROPORTION = GeneratorPackage.VALUE_GENERATOR__BAD_VALUE_PROPORTION;

	/**
	 * The feature id for the '<em><b>Bad Value Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_GENERATOR__BAD_VALUE_GENERATOR = GeneratorPackage.VALUE_GENERATOR__BAD_VALUE_GENERATOR;

	/**
	 * The feature id for the '<em><b>Last Generated Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_GENERATOR__LAST_GENERATED_VALUE = GeneratorPackage.VALUE_GENERATOR__LAST_GENERATED_VALUE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_GENERATOR__RANDOM_SEED = GeneratorPackage.VALUE_GENERATOR__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_GENERATOR__DESCRIPTION = GeneratorPackage.VALUE_GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_GENERATOR__TYPE = GeneratorPackage.VALUE_GENERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_GENERATOR__ID = GeneratorPackage.VALUE_GENERATOR__ID;

	/**
	 * The number of structural features of the '<em>Boolean Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_GENERATOR_FEATURE_COUNT = GeneratorPackage.VALUE_GENERATOR_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link com.opcoach.generator.basic.impl.DateGeneratorImpl <em>Date Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.generator.basic.impl.DateGeneratorImpl
	 * @see com.opcoach.generator.basic.impl.BasicPackageImpl#getDateGenerator()
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
	int DATE_GENERATOR__BAD_VALUE_PROPORTION = GeneratorPackage.RANGE_GENERATOR__BAD_VALUE_PROPORTION;

	/**
	 * The feature id for the '<em><b>Bad Value Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_GENERATOR__BAD_VALUE_GENERATOR = GeneratorPackage.RANGE_GENERATOR__BAD_VALUE_GENERATOR;

	/**
	 * The feature id for the '<em><b>Last Generated Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_GENERATOR__LAST_GENERATED_VALUE = GeneratorPackage.RANGE_GENERATOR__LAST_GENERATED_VALUE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_GENERATOR__RANDOM_SEED = GeneratorPackage.RANGE_GENERATOR__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_GENERATOR__DESCRIPTION = GeneratorPackage.RANGE_GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_GENERATOR__TYPE = GeneratorPackage.RANGE_GENERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_GENERATOR__ID = GeneratorPackage.RANGE_GENERATOR__ID;

	/**
	 * The feature id for the '<em><b>Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_GENERATOR__LOW = GeneratorPackage.RANGE_GENERATOR__LOW;

	/**
	 * The feature id for the '<em><b>High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_GENERATOR__HIGH = GeneratorPackage.RANGE_GENERATOR__HIGH;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_GENERATOR__STEP = GeneratorPackage.RANGE_GENERATOR__STEP;

	/**
	 * The feature id for the '<em><b>Generate Now</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_GENERATOR__GENERATE_NOW = GeneratorPackage.RANGE_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Date Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_GENERATOR_FEATURE_COUNT = GeneratorPackage.RANGE_GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.opcoach.generator.basic.impl.DoubleGeneratorImpl <em>Double Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.generator.basic.impl.DoubleGeneratorImpl
	 * @see com.opcoach.generator.basic.impl.BasicPackageImpl#getDoubleGenerator()
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
	int DOUBLE_GENERATOR__BAD_VALUE_PROPORTION = GeneratorPackage.RANGE_GENERATOR__BAD_VALUE_PROPORTION;

	/**
	 * The feature id for the '<em><b>Bad Value Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_GENERATOR__BAD_VALUE_GENERATOR = GeneratorPackage.RANGE_GENERATOR__BAD_VALUE_GENERATOR;

	/**
	 * The feature id for the '<em><b>Last Generated Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_GENERATOR__LAST_GENERATED_VALUE = GeneratorPackage.RANGE_GENERATOR__LAST_GENERATED_VALUE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_GENERATOR__RANDOM_SEED = GeneratorPackage.RANGE_GENERATOR__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_GENERATOR__DESCRIPTION = GeneratorPackage.RANGE_GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_GENERATOR__TYPE = GeneratorPackage.RANGE_GENERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_GENERATOR__ID = GeneratorPackage.RANGE_GENERATOR__ID;

	/**
	 * The feature id for the '<em><b>Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_GENERATOR__LOW = GeneratorPackage.RANGE_GENERATOR__LOW;

	/**
	 * The feature id for the '<em><b>High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_GENERATOR__HIGH = GeneratorPackage.RANGE_GENERATOR__HIGH;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_GENERATOR__STEP = GeneratorPackage.RANGE_GENERATOR__STEP;

	/**
	 * The number of structural features of the '<em>Double Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_GENERATOR_FEATURE_COUNT = GeneratorPackage.RANGE_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.opcoach.generator.basic.impl.FloatGeneratorImpl <em>Float Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.generator.basic.impl.FloatGeneratorImpl
	 * @see com.opcoach.generator.basic.impl.BasicPackageImpl#getFloatGenerator()
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
	int FLOAT_GENERATOR__BAD_VALUE_PROPORTION = GeneratorPackage.RANGE_GENERATOR__BAD_VALUE_PROPORTION;

	/**
	 * The feature id for the '<em><b>Bad Value Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_GENERATOR__BAD_VALUE_GENERATOR = GeneratorPackage.RANGE_GENERATOR__BAD_VALUE_GENERATOR;

	/**
	 * The feature id for the '<em><b>Last Generated Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_GENERATOR__LAST_GENERATED_VALUE = GeneratorPackage.RANGE_GENERATOR__LAST_GENERATED_VALUE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_GENERATOR__RANDOM_SEED = GeneratorPackage.RANGE_GENERATOR__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_GENERATOR__DESCRIPTION = GeneratorPackage.RANGE_GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_GENERATOR__TYPE = GeneratorPackage.RANGE_GENERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_GENERATOR__ID = GeneratorPackage.RANGE_GENERATOR__ID;

	/**
	 * The feature id for the '<em><b>Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_GENERATOR__LOW = GeneratorPackage.RANGE_GENERATOR__LOW;

	/**
	 * The feature id for the '<em><b>High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_GENERATOR__HIGH = GeneratorPackage.RANGE_GENERATOR__HIGH;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_GENERATOR__STEP = GeneratorPackage.RANGE_GENERATOR__STEP;

	/**
	 * The number of structural features of the '<em>Float Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_GENERATOR_FEATURE_COUNT = GeneratorPackage.RANGE_GENERATOR_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link com.opcoach.generator.basic.impl.IDGeneratorImpl <em>ID Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.generator.basic.impl.IDGeneratorImpl
	 * @see com.opcoach.generator.basic.impl.BasicPackageImpl#getIDGenerator()
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
	int ID_GENERATOR__BAD_VALUE_PROPORTION = GeneratorPackage.VALUE_GENERATOR__BAD_VALUE_PROPORTION;

	/**
	 * The feature id for the '<em><b>Bad Value Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GENERATOR__BAD_VALUE_GENERATOR = GeneratorPackage.VALUE_GENERATOR__BAD_VALUE_GENERATOR;

	/**
	 * The feature id for the '<em><b>Last Generated Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GENERATOR__LAST_GENERATED_VALUE = GeneratorPackage.VALUE_GENERATOR__LAST_GENERATED_VALUE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GENERATOR__RANDOM_SEED = GeneratorPackage.VALUE_GENERATOR__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GENERATOR__DESCRIPTION = GeneratorPackage.VALUE_GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GENERATOR__TYPE = GeneratorPackage.VALUE_GENERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GENERATOR__ID = GeneratorPackage.VALUE_GENERATOR__ID;

	/**
	 * The feature id for the '<em><b>Key Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GENERATOR__KEY_LENGTH = GeneratorPackage.VALUE_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GENERATOR__PREFIX = GeneratorPackage.VALUE_GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GENERATOR_FEATURE_COUNT = GeneratorPackage.VALUE_GENERATOR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.opcoach.generator.basic.impl.IntGeneratorImpl <em>Int Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.generator.basic.impl.IntGeneratorImpl
	 * @see com.opcoach.generator.basic.impl.BasicPackageImpl#getIntGenerator()
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
	int INT_GENERATOR__BAD_VALUE_PROPORTION = GeneratorPackage.RANGE_GENERATOR__BAD_VALUE_PROPORTION;

	/**
	 * The feature id for the '<em><b>Bad Value Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_GENERATOR__BAD_VALUE_GENERATOR = GeneratorPackage.RANGE_GENERATOR__BAD_VALUE_GENERATOR;

	/**
	 * The feature id for the '<em><b>Last Generated Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_GENERATOR__LAST_GENERATED_VALUE = GeneratorPackage.RANGE_GENERATOR__LAST_GENERATED_VALUE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_GENERATOR__RANDOM_SEED = GeneratorPackage.RANGE_GENERATOR__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_GENERATOR__DESCRIPTION = GeneratorPackage.RANGE_GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_GENERATOR__TYPE = GeneratorPackage.RANGE_GENERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_GENERATOR__ID = GeneratorPackage.RANGE_GENERATOR__ID;

	/**
	 * The feature id for the '<em><b>Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_GENERATOR__LOW = GeneratorPackage.RANGE_GENERATOR__LOW;

	/**
	 * The feature id for the '<em><b>High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_GENERATOR__HIGH = GeneratorPackage.RANGE_GENERATOR__HIGH;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_GENERATOR__STEP = GeneratorPackage.RANGE_GENERATOR__STEP;

	/**
	 * The number of structural features of the '<em>Int Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_GENERATOR_FEATURE_COUNT = GeneratorPackage.RANGE_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.opcoach.generator.basic.impl.LongGeneratorImpl <em>Long Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.generator.basic.impl.LongGeneratorImpl
	 * @see com.opcoach.generator.basic.impl.BasicPackageImpl#getLongGenerator()
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
	int LONG_GENERATOR__BAD_VALUE_PROPORTION = GeneratorPackage.RANGE_GENERATOR__BAD_VALUE_PROPORTION;

	/**
	 * The feature id for the '<em><b>Bad Value Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_GENERATOR__BAD_VALUE_GENERATOR = GeneratorPackage.RANGE_GENERATOR__BAD_VALUE_GENERATOR;

	/**
	 * The feature id for the '<em><b>Last Generated Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_GENERATOR__LAST_GENERATED_VALUE = GeneratorPackage.RANGE_GENERATOR__LAST_GENERATED_VALUE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_GENERATOR__RANDOM_SEED = GeneratorPackage.RANGE_GENERATOR__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_GENERATOR__DESCRIPTION = GeneratorPackage.RANGE_GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_GENERATOR__TYPE = GeneratorPackage.RANGE_GENERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_GENERATOR__ID = GeneratorPackage.RANGE_GENERATOR__ID;

	/**
	 * The feature id for the '<em><b>Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_GENERATOR__LOW = GeneratorPackage.RANGE_GENERATOR__LOW;

	/**
	 * The feature id for the '<em><b>High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_GENERATOR__HIGH = GeneratorPackage.RANGE_GENERATOR__HIGH;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_GENERATOR__STEP = GeneratorPackage.RANGE_GENERATOR__STEP;

	/**
	 * The number of structural features of the '<em>Long Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_GENERATOR_FEATURE_COUNT = GeneratorPackage.RANGE_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.opcoach.generator.basic.impl.NullValueGeneratorImpl <em>Null Value Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.generator.basic.impl.NullValueGeneratorImpl
	 * @see com.opcoach.generator.basic.impl.BasicPackageImpl#getNullValueGenerator()
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
	int NULL_VALUE_GENERATOR__BAD_VALUE_PROPORTION = GeneratorPackage.VALUE_GENERATOR__BAD_VALUE_PROPORTION;

	/**
	 * The feature id for the '<em><b>Bad Value Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_VALUE_GENERATOR__BAD_VALUE_GENERATOR = GeneratorPackage.VALUE_GENERATOR__BAD_VALUE_GENERATOR;

	/**
	 * The feature id for the '<em><b>Last Generated Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_VALUE_GENERATOR__LAST_GENERATED_VALUE = GeneratorPackage.VALUE_GENERATOR__LAST_GENERATED_VALUE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_VALUE_GENERATOR__RANDOM_SEED = GeneratorPackage.VALUE_GENERATOR__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_VALUE_GENERATOR__DESCRIPTION = GeneratorPackage.VALUE_GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_VALUE_GENERATOR__TYPE = GeneratorPackage.VALUE_GENERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_VALUE_GENERATOR__ID = GeneratorPackage.VALUE_GENERATOR__ID;

	/**
	 * The number of structural features of the '<em>Null Value Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_VALUE_GENERATOR_FEATURE_COUNT = GeneratorPackage.VALUE_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.opcoach.generator.basic.impl.StringGeneratorImpl <em>String Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.generator.basic.impl.StringGeneratorImpl
	 * @see com.opcoach.generator.basic.impl.BasicPackageImpl#getStringGenerator()
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
	int STRING_GENERATOR__BAD_VALUE_PROPORTION = GeneratorPackage.REFERENCE_GENERATOR__BAD_VALUE_PROPORTION;

	/**
	 * The feature id for the '<em><b>Bad Value Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_GENERATOR__BAD_VALUE_GENERATOR = GeneratorPackage.REFERENCE_GENERATOR__BAD_VALUE_GENERATOR;

	/**
	 * The feature id for the '<em><b>Last Generated Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_GENERATOR__LAST_GENERATED_VALUE = GeneratorPackage.REFERENCE_GENERATOR__LAST_GENERATED_VALUE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_GENERATOR__RANDOM_SEED = GeneratorPackage.REFERENCE_GENERATOR__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_GENERATOR__DESCRIPTION = GeneratorPackage.REFERENCE_GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_GENERATOR__TYPE = GeneratorPackage.REFERENCE_GENERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_GENERATOR__ID = GeneratorPackage.REFERENCE_GENERATOR__ID;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_GENERATOR__STEP = GeneratorPackage.REFERENCE_GENERATOR__STEP;

	/**
	 * The feature id for the '<em><b>Data Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_GENERATOR__DATA_FILENAME = GeneratorPackage.REFERENCE_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Case Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_GENERATOR__CASE_POLICY = GeneratorPackage.REFERENCE_GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>String Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_GENERATOR_FEATURE_COUNT = GeneratorPackage.REFERENCE_GENERATOR_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link com.opcoach.generator.basic.CasePolicyType <em>Case Policy Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.generator.basic.CasePolicyType
	 * @see com.opcoach.generator.basic.impl.BasicPackageImpl#getCasePolicyType()
	 * @generated
	 */
	int CASE_POLICY_TYPE = 9;

	/**
	 * Returns the meta object for class '{@link com.opcoach.generator.basic.BooleanGenerator <em>Boolean Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Generator</em>'.
	 * @see com.opcoach.generator.basic.BooleanGenerator
	 * @generated
	 */
	EClass getBooleanGenerator();

	/**
	 * Returns the meta object for class '{@link com.opcoach.generator.basic.DateGenerator <em>Date Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Generator</em>'.
	 * @see com.opcoach.generator.basic.DateGenerator
	 * @generated
	 */
	EClass getDateGenerator();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.generator.basic.DateGenerator#isGenerateNow <em>Generate Now</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate Now</em>'.
	 * @see com.opcoach.generator.basic.DateGenerator#isGenerateNow()
	 * @see #getDateGenerator()
	 * @generated
	 */
	EAttribute getDateGenerator_GenerateNow();

	/**
	 * Returns the meta object for class '{@link com.opcoach.generator.basic.DoubleGenerator <em>Double Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Generator</em>'.
	 * @see com.opcoach.generator.basic.DoubleGenerator
	 * @generated
	 */
	EClass getDoubleGenerator();

	/**
	 * Returns the meta object for class '{@link com.opcoach.generator.basic.FloatGenerator <em>Float Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float Generator</em>'.
	 * @see com.opcoach.generator.basic.FloatGenerator
	 * @generated
	 */
	EClass getFloatGenerator();

	/**
	 * Returns the meta object for class '{@link com.opcoach.generator.basic.IDGenerator <em>ID Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Generator</em>'.
	 * @see com.opcoach.generator.basic.IDGenerator
	 * @generated
	 */
	EClass getIDGenerator();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.generator.basic.IDGenerator#getKeyLength <em>Key Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Length</em>'.
	 * @see com.opcoach.generator.basic.IDGenerator#getKeyLength()
	 * @see #getIDGenerator()
	 * @generated
	 */
	EAttribute getIDGenerator_KeyLength();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.generator.basic.IDGenerator#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see com.opcoach.generator.basic.IDGenerator#getPrefix()
	 * @see #getIDGenerator()
	 * @generated
	 */
	EAttribute getIDGenerator_Prefix();

	/**
	 * Returns the meta object for class '{@link com.opcoach.generator.basic.IntGenerator <em>Int Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Generator</em>'.
	 * @see com.opcoach.generator.basic.IntGenerator
	 * @generated
	 */
	EClass getIntGenerator();

	/**
	 * Returns the meta object for class '{@link com.opcoach.generator.basic.LongGenerator <em>Long Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Long Generator</em>'.
	 * @see com.opcoach.generator.basic.LongGenerator
	 * @generated
	 */
	EClass getLongGenerator();

	/**
	 * Returns the meta object for class '{@link com.opcoach.generator.basic.NullValueGenerator <em>Null Value Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Null Value Generator</em>'.
	 * @see com.opcoach.generator.basic.NullValueGenerator
	 * @generated
	 */
	EClass getNullValueGenerator();

	/**
	 * Returns the meta object for class '{@link com.opcoach.generator.basic.StringGenerator <em>String Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Generator</em>'.
	 * @see com.opcoach.generator.basic.StringGenerator
	 * @generated
	 */
	EClass getStringGenerator();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.generator.basic.StringGenerator#getDataFilename <em>Data Filename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Filename</em>'.
	 * @see com.opcoach.generator.basic.StringGenerator#getDataFilename()
	 * @see #getStringGenerator()
	 * @generated
	 */
	EAttribute getStringGenerator_DataFilename();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.generator.basic.StringGenerator#getCasePolicy <em>Case Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Case Policy</em>'.
	 * @see com.opcoach.generator.basic.StringGenerator#getCasePolicy()
	 * @see #getStringGenerator()
	 * @generated
	 */
	EAttribute getStringGenerator_CasePolicy();

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
	BasicFactory getBasicFactory();

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
		 * The meta object literal for the '{@link com.opcoach.generator.basic.impl.BooleanGeneratorImpl <em>Boolean Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.opcoach.generator.basic.impl.BooleanGeneratorImpl
		 * @see com.opcoach.generator.basic.impl.BasicPackageImpl#getBooleanGenerator()
		 * @generated
		 */
		EClass BOOLEAN_GENERATOR = eINSTANCE.getBooleanGenerator();
		/**
		 * The meta object literal for the '{@link com.opcoach.generator.basic.impl.DateGeneratorImpl <em>Date Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.opcoach.generator.basic.impl.DateGeneratorImpl
		 * @see com.opcoach.generator.basic.impl.BasicPackageImpl#getDateGenerator()
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
		 * The meta object literal for the '{@link com.opcoach.generator.basic.impl.DoubleGeneratorImpl <em>Double Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.opcoach.generator.basic.impl.DoubleGeneratorImpl
		 * @see com.opcoach.generator.basic.impl.BasicPackageImpl#getDoubleGenerator()
		 * @generated
		 */
		EClass DOUBLE_GENERATOR = eINSTANCE.getDoubleGenerator();
		/**
		 * The meta object literal for the '{@link com.opcoach.generator.basic.impl.FloatGeneratorImpl <em>Float Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.opcoach.generator.basic.impl.FloatGeneratorImpl
		 * @see com.opcoach.generator.basic.impl.BasicPackageImpl#getFloatGenerator()
		 * @generated
		 */
		EClass FLOAT_GENERATOR = eINSTANCE.getFloatGenerator();
		/**
		 * The meta object literal for the '{@link com.opcoach.generator.basic.impl.IDGeneratorImpl <em>ID Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.opcoach.generator.basic.impl.IDGeneratorImpl
		 * @see com.opcoach.generator.basic.impl.BasicPackageImpl#getIDGenerator()
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
		 * The meta object literal for the '{@link com.opcoach.generator.basic.impl.IntGeneratorImpl <em>Int Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.opcoach.generator.basic.impl.IntGeneratorImpl
		 * @see com.opcoach.generator.basic.impl.BasicPackageImpl#getIntGenerator()
		 * @generated
		 */
		EClass INT_GENERATOR = eINSTANCE.getIntGenerator();
		/**
		 * The meta object literal for the '{@link com.opcoach.generator.basic.impl.LongGeneratorImpl <em>Long Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.opcoach.generator.basic.impl.LongGeneratorImpl
		 * @see com.opcoach.generator.basic.impl.BasicPackageImpl#getLongGenerator()
		 * @generated
		 */
		EClass LONG_GENERATOR = eINSTANCE.getLongGenerator();
		/**
		 * The meta object literal for the '{@link com.opcoach.generator.basic.impl.NullValueGeneratorImpl <em>Null Value Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.opcoach.generator.basic.impl.NullValueGeneratorImpl
		 * @see com.opcoach.generator.basic.impl.BasicPackageImpl#getNullValueGenerator()
		 * @generated
		 */
		EClass NULL_VALUE_GENERATOR = eINSTANCE.getNullValueGenerator();
		/**
		 * The meta object literal for the '{@link com.opcoach.generator.basic.impl.StringGeneratorImpl <em>String Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.opcoach.generator.basic.impl.StringGeneratorImpl
		 * @see com.opcoach.generator.basic.impl.BasicPackageImpl#getStringGenerator()
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
		 * The meta object literal for the '{@link com.opcoach.generator.basic.CasePolicyType <em>Case Policy Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.opcoach.generator.basic.CasePolicyType
		 * @see com.opcoach.generator.basic.impl.BasicPackageImpl#getCasePolicyType()
		 * @generated
		 */
		EEnum CASE_POLICY_TYPE = eINSTANCE.getCasePolicyType();

	}

} //BasicPackage
