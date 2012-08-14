/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.generator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see com.opcoach.generator.GeneratorFactory
 * @model kind="package"
 * @generated
 */
public interface GeneratorPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "generator";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.opcoach.generator/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gen";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GeneratorPackage eINSTANCE = com.opcoach.generator.impl.GeneratorPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.opcoach.generator.impl.ValueGeneratorImpl <em>Value Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.generator.impl.ValueGeneratorImpl
	 * @see com.opcoach.generator.impl.GeneratorPackageImpl#getValueGenerator()
	 * @generated
	 */
	int VALUE_GENERATOR = 0;

	/**
	 * The feature id for the '<em><b>Bad Value Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_GENERATOR__BAD_VALUE_PROPORTION = 0;

	/**
	 * The feature id for the '<em><b>Bad Value Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_GENERATOR__BAD_VALUE_GENERATOR = 1;

	/**
	 * The feature id for the '<em><b>Last Generated Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_GENERATOR__LAST_GENERATED_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_GENERATOR__RANDOM_SEED = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_GENERATOR__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_GENERATOR__TYPE = 5;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_GENERATOR__ID = 6;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_GENERATOR__LOCALE = 7;

	/**
	 * The number of structural features of the '<em>Value Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_GENERATOR_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link com.opcoach.generator.impl.RangeGeneratorImpl <em>Range Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.generator.impl.RangeGeneratorImpl
	 * @see com.opcoach.generator.impl.GeneratorPackageImpl#getRangeGenerator()
	 * @generated
	 */
	int RANGE_GENERATOR = 1;

	/**
	 * The feature id for the '<em><b>Bad Value Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_GENERATOR__BAD_VALUE_PROPORTION = VALUE_GENERATOR__BAD_VALUE_PROPORTION;

	/**
	 * The feature id for the '<em><b>Bad Value Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_GENERATOR__BAD_VALUE_GENERATOR = VALUE_GENERATOR__BAD_VALUE_GENERATOR;

	/**
	 * The feature id for the '<em><b>Last Generated Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_GENERATOR__LAST_GENERATED_VALUE = VALUE_GENERATOR__LAST_GENERATED_VALUE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_GENERATOR__RANDOM_SEED = VALUE_GENERATOR__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_GENERATOR__DESCRIPTION = VALUE_GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_GENERATOR__TYPE = VALUE_GENERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_GENERATOR__ID = VALUE_GENERATOR__ID;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_GENERATOR__LOCALE = VALUE_GENERATOR__LOCALE;

	/**
	 * The feature id for the '<em><b>Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_GENERATOR__LOW = VALUE_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_GENERATOR__HIGH = VALUE_GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_GENERATOR__STEP = VALUE_GENERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Range Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_GENERATOR_FEATURE_COUNT = VALUE_GENERATOR_FEATURE_COUNT + 3;


	/**
	 * The meta object id for the '{@link com.opcoach.generator.impl.ReferenceGeneratorImpl <em>Reference Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.generator.impl.ReferenceGeneratorImpl
	 * @see com.opcoach.generator.impl.GeneratorPackageImpl#getReferenceGenerator()
	 * @generated
	 */
	int REFERENCE_GENERATOR = 2;

	/**
	 * The feature id for the '<em><b>Bad Value Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_GENERATOR__BAD_VALUE_PROPORTION = VALUE_GENERATOR__BAD_VALUE_PROPORTION;

	/**
	 * The feature id for the '<em><b>Bad Value Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_GENERATOR__BAD_VALUE_GENERATOR = VALUE_GENERATOR__BAD_VALUE_GENERATOR;

	/**
	 * The feature id for the '<em><b>Last Generated Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_GENERATOR__LAST_GENERATED_VALUE = VALUE_GENERATOR__LAST_GENERATED_VALUE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_GENERATOR__RANDOM_SEED = VALUE_GENERATOR__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_GENERATOR__DESCRIPTION = VALUE_GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_GENERATOR__TYPE = VALUE_GENERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_GENERATOR__ID = VALUE_GENERATOR__ID;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_GENERATOR__LOCALE = VALUE_GENERATOR__LOCALE;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_GENERATOR__STEP = VALUE_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_GENERATOR__VALUES = VALUE_GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reference Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_GENERATOR_FEATURE_COUNT = VALUE_GENERATOR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '<em>Collection</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Collection
	 * @see com.opcoach.generator.impl.GeneratorPackageImpl#getCollection()
	 * @generated
	 */
	int COLLECTION = 3;


	/**
	 * The meta object id for the '<em>Locale</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Locale
	 * @see com.opcoach.generator.impl.GeneratorPackageImpl#getLocale()
	 * @generated
	 */
	int LOCALE = 4;


	/**
	 * Returns the meta object for class '{@link com.opcoach.generator.ValueGenerator <em>Value Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Generator</em>'.
	 * @see com.opcoach.generator.ValueGenerator
	 * @generated
	 */
	EClass getValueGenerator();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.generator.ValueGenerator#getBadValueProportion <em>Bad Value Proportion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bad Value Proportion</em>'.
	 * @see com.opcoach.generator.ValueGenerator#getBadValueProportion()
	 * @see #getValueGenerator()
	 * @generated
	 */
	EAttribute getValueGenerator_BadValueProportion();

	/**
	 * Returns the meta object for the containment reference '{@link com.opcoach.generator.ValueGenerator#getBadValueGenerator <em>Bad Value Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bad Value Generator</em>'.
	 * @see com.opcoach.generator.ValueGenerator#getBadValueGenerator()
	 * @see #getValueGenerator()
	 * @generated
	 */
	EReference getValueGenerator_BadValueGenerator();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.generator.ValueGenerator#getLastGeneratedValue <em>Last Generated Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Generated Value</em>'.
	 * @see com.opcoach.generator.ValueGenerator#getLastGeneratedValue()
	 * @see #getValueGenerator()
	 * @generated
	 */
	EAttribute getValueGenerator_LastGeneratedValue();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.generator.ValueGenerator#getRandomSeed <em>Random Seed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Random Seed</em>'.
	 * @see com.opcoach.generator.ValueGenerator#getRandomSeed()
	 * @see #getValueGenerator()
	 * @generated
	 */
	EAttribute getValueGenerator_RandomSeed();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.generator.ValueGenerator#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.opcoach.generator.ValueGenerator#getDescription()
	 * @see #getValueGenerator()
	 * @generated
	 */
	EAttribute getValueGenerator_Description();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.generator.ValueGenerator#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.opcoach.generator.ValueGenerator#getType()
	 * @see #getValueGenerator()
	 * @generated
	 */
	EAttribute getValueGenerator_Type();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.generator.ValueGenerator#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see com.opcoach.generator.ValueGenerator#getID()
	 * @see #getValueGenerator()
	 * @generated
	 */
	EAttribute getValueGenerator_ID();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.generator.ValueGenerator#getLocale <em>Locale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locale</em>'.
	 * @see com.opcoach.generator.ValueGenerator#getLocale()
	 * @see #getValueGenerator()
	 * @generated
	 */
	EAttribute getValueGenerator_Locale();

	/**
	 * Returns the meta object for class '{@link com.opcoach.generator.RangeGenerator <em>Range Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range Generator</em>'.
	 * @see com.opcoach.generator.RangeGenerator
	 * @generated
	 */
	EClass getRangeGenerator();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.generator.RangeGenerator#getLow <em>Low</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Low</em>'.
	 * @see com.opcoach.generator.RangeGenerator#getLow()
	 * @see #getRangeGenerator()
	 * @generated
	 */
	EAttribute getRangeGenerator_Low();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.generator.RangeGenerator#getHigh <em>High</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>High</em>'.
	 * @see com.opcoach.generator.RangeGenerator#getHigh()
	 * @see #getRangeGenerator()
	 * @generated
	 */
	EAttribute getRangeGenerator_High();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.generator.RangeGenerator#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step</em>'.
	 * @see com.opcoach.generator.RangeGenerator#getStep()
	 * @see #getRangeGenerator()
	 * @generated
	 */
	EAttribute getRangeGenerator_Step();

	/**
	 * Returns the meta object for class '{@link com.opcoach.generator.ReferenceGenerator <em>Reference Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Generator</em>'.
	 * @see com.opcoach.generator.ReferenceGenerator
	 * @generated
	 */
	EClass getReferenceGenerator();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.generator.ReferenceGenerator#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step</em>'.
	 * @see com.opcoach.generator.ReferenceGenerator#getStep()
	 * @see #getReferenceGenerator()
	 * @generated
	 */
	EAttribute getReferenceGenerator_Step();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.generator.ReferenceGenerator#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Values</em>'.
	 * @see com.opcoach.generator.ReferenceGenerator#getValues()
	 * @see #getReferenceGenerator()
	 * @generated
	 */
	EAttribute getReferenceGenerator_Values();

	/**
	 * Returns the meta object for data type '{@link java.util.Collection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Collection</em>'.
	 * @see java.util.Collection
	 * @model instanceClass="java.util.Collection" typeParameters="T"
	 * @generated
	 */
	EDataType getCollection();

	/**
	 * Returns the meta object for data type '{@link java.util.Locale <em>Locale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Locale</em>'.
	 * @see java.util.Locale
	 * @model instanceClass="java.util.Locale"
	 * @generated
	 */
	EDataType getLocale();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GeneratorFactory getGeneratorFactory();

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
		 * The meta object literal for the '{@link com.opcoach.generator.impl.ValueGeneratorImpl <em>Value Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.opcoach.generator.impl.ValueGeneratorImpl
		 * @see com.opcoach.generator.impl.GeneratorPackageImpl#getValueGenerator()
		 * @generated
		 */
		EClass VALUE_GENERATOR = eINSTANCE.getValueGenerator();

		/**
		 * The meta object literal for the '<em><b>Bad Value Proportion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_GENERATOR__BAD_VALUE_PROPORTION = eINSTANCE.getValueGenerator_BadValueProportion();

		/**
		 * The meta object literal for the '<em><b>Bad Value Generator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_GENERATOR__BAD_VALUE_GENERATOR = eINSTANCE.getValueGenerator_BadValueGenerator();

		/**
		 * The meta object literal for the '<em><b>Last Generated Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_GENERATOR__LAST_GENERATED_VALUE = eINSTANCE.getValueGenerator_LastGeneratedValue();

		/**
		 * The meta object literal for the '<em><b>Random Seed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_GENERATOR__RANDOM_SEED = eINSTANCE.getValueGenerator_RandomSeed();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_GENERATOR__DESCRIPTION = eINSTANCE.getValueGenerator_Description();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_GENERATOR__TYPE = eINSTANCE.getValueGenerator_Type();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_GENERATOR__ID = eINSTANCE.getValueGenerator_ID();

		/**
		 * The meta object literal for the '<em><b>Locale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_GENERATOR__LOCALE = eINSTANCE.getValueGenerator_Locale();

		/**
		 * The meta object literal for the '{@link com.opcoach.generator.impl.RangeGeneratorImpl <em>Range Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.opcoach.generator.impl.RangeGeneratorImpl
		 * @see com.opcoach.generator.impl.GeneratorPackageImpl#getRangeGenerator()
		 * @generated
		 */
		EClass RANGE_GENERATOR = eINSTANCE.getRangeGenerator();

		/**
		 * The meta object literal for the '<em><b>Low</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE_GENERATOR__LOW = eINSTANCE.getRangeGenerator_Low();

		/**
		 * The meta object literal for the '<em><b>High</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE_GENERATOR__HIGH = eINSTANCE.getRangeGenerator_High();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE_GENERATOR__STEP = eINSTANCE.getRangeGenerator_Step();

		/**
		 * The meta object literal for the '{@link com.opcoach.generator.impl.ReferenceGeneratorImpl <em>Reference Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.opcoach.generator.impl.ReferenceGeneratorImpl
		 * @see com.opcoach.generator.impl.GeneratorPackageImpl#getReferenceGenerator()
		 * @generated
		 */
		EClass REFERENCE_GENERATOR = eINSTANCE.getReferenceGenerator();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_GENERATOR__STEP = eINSTANCE.getReferenceGenerator_Step();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_GENERATOR__VALUES = eINSTANCE.getReferenceGenerator_Values();

		/**
		 * The meta object literal for the '<em>Collection</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Collection
		 * @see com.opcoach.generator.impl.GeneratorPackageImpl#getCollection()
		 * @generated
		 */
		EDataType COLLECTION = eINSTANCE.getCollection();

		/**
		 * The meta object literal for the '<em>Locale</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Locale
		 * @see com.opcoach.generator.impl.GeneratorPackageImpl#getLocale()
		 * @generated
		 */
		EDataType LOCALE = eINSTANCE.getLocale();

	}

} //GeneratorPackage
