/**
 * © OPCoach 2012
 */
package com.opcoach.dsgen.generator;

import com.opcoach.generator.GeneratorPackage;

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
 * @see com.opcoach.dsgen.generator.DSGenGeneratorFactory
 * @model kind="package"
 * @generated
 */
public interface DSGenGeneratorPackage extends EPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "© OPCoach 2012";

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
	String eNS_URI = "http://www.opcoach.com/dsgen/generator/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dsgenerator";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DSGenGeneratorPackage eINSTANCE = com.opcoach.dsgen.generator.impl.DSGenGeneratorPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.opcoach.dsgen.generator.impl.EObjectGeneratorImpl <em>EObject Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.dsgen.generator.impl.EObjectGeneratorImpl
	 * @see com.opcoach.dsgen.generator.impl.DSGenGeneratorPackageImpl#getEObjectGenerator()
	 * @generated
	 */
	int EOBJECT_GENERATOR = 0;

	/**
	 * The feature id for the '<em><b>Bad Value Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_GENERATOR__BAD_VALUE_PROPORTION = GeneratorPackage.VALUE_GENERATOR__BAD_VALUE_PROPORTION;

	/**
	 * The feature id for the '<em><b>Bad Value Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_GENERATOR__BAD_VALUE_GENERATOR = GeneratorPackage.VALUE_GENERATOR__BAD_VALUE_GENERATOR;

	/**
	 * The feature id for the '<em><b>Last Generated Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_GENERATOR__LAST_GENERATED_VALUE = GeneratorPackage.VALUE_GENERATOR__LAST_GENERATED_VALUE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_GENERATOR__RANDOM_SEED = GeneratorPackage.VALUE_GENERATOR__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_GENERATOR__DESCRIPTION = GeneratorPackage.VALUE_GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_GENERATOR__ID = GeneratorPackage.VALUE_GENERATOR__ID;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_GENERATOR__LOCALE = GeneratorPackage.VALUE_GENERATOR__LOCALE;

	/**
	 * The feature id for the '<em><b>Target DS Gen Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_GENERATOR__TARGET_DS_GEN_CLASS = GeneratorPackage.VALUE_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EObject Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_GENERATOR_FEATURE_COUNT = GeneratorPackage.VALUE_GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.opcoach.dsgen.generator.impl.ChildrenGeneratorImpl <em>Children Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.dsgen.generator.impl.ChildrenGeneratorImpl
	 * @see com.opcoach.dsgen.generator.impl.DSGenGeneratorPackageImpl#getChildrenGenerator()
	 * @generated
	 */
	int CHILDREN_GENERATOR = 1;

	/**
	 * The feature id for the '<em><b>Bad Value Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILDREN_GENERATOR__BAD_VALUE_PROPORTION = GeneratorPackage.VALUE_GENERATOR__BAD_VALUE_PROPORTION;

	/**
	 * The feature id for the '<em><b>Bad Value Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILDREN_GENERATOR__BAD_VALUE_GENERATOR = GeneratorPackage.VALUE_GENERATOR__BAD_VALUE_GENERATOR;

	/**
	 * The feature id for the '<em><b>Last Generated Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILDREN_GENERATOR__LAST_GENERATED_VALUE = GeneratorPackage.VALUE_GENERATOR__LAST_GENERATED_VALUE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILDREN_GENERATOR__RANDOM_SEED = GeneratorPackage.VALUE_GENERATOR__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILDREN_GENERATOR__DESCRIPTION = GeneratorPackage.VALUE_GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILDREN_GENERATOR__ID = GeneratorPackage.VALUE_GENERATOR__ID;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILDREN_GENERATOR__LOCALE = GeneratorPackage.VALUE_GENERATOR__LOCALE;

	/**
	 * The feature id for the '<em><b>Max Children Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILDREN_GENERATOR__MAX_CHILDREN_NUMBER = GeneratorPackage.VALUE_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Children Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILDREN_GENERATOR_FEATURE_COUNT = GeneratorPackage.VALUE_GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.opcoach.dsgen.generator.impl.SingleAssociationGeneratorImpl <em>Single Association Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.dsgen.generator.impl.SingleAssociationGeneratorImpl
	 * @see com.opcoach.dsgen.generator.impl.DSGenGeneratorPackageImpl#getSingleAssociationGenerator()
	 * @generated
	 */
	int SINGLE_ASSOCIATION_GENERATOR = 2;

	/**
	 * The feature id for the '<em><b>Bad Value Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ASSOCIATION_GENERATOR__BAD_VALUE_PROPORTION = GeneratorPackage.REFERENCE_GENERATOR__BAD_VALUE_PROPORTION;

	/**
	 * The feature id for the '<em><b>Bad Value Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ASSOCIATION_GENERATOR__BAD_VALUE_GENERATOR = GeneratorPackage.REFERENCE_GENERATOR__BAD_VALUE_GENERATOR;

	/**
	 * The feature id for the '<em><b>Last Generated Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ASSOCIATION_GENERATOR__LAST_GENERATED_VALUE = GeneratorPackage.REFERENCE_GENERATOR__LAST_GENERATED_VALUE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ASSOCIATION_GENERATOR__RANDOM_SEED = GeneratorPackage.REFERENCE_GENERATOR__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ASSOCIATION_GENERATOR__DESCRIPTION = GeneratorPackage.REFERENCE_GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ASSOCIATION_GENERATOR__ID = GeneratorPackage.REFERENCE_GENERATOR__ID;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ASSOCIATION_GENERATOR__LOCALE = GeneratorPackage.REFERENCE_GENERATOR__LOCALE;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ASSOCIATION_GENERATOR__STEP = GeneratorPackage.REFERENCE_GENERATOR__STEP;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ASSOCIATION_GENERATOR__VALUES = GeneratorPackage.REFERENCE_GENERATOR__VALUES;

	/**
	 * The number of structural features of the '<em>Single Association Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ASSOCIATION_GENERATOR_FEATURE_COUNT = GeneratorPackage.REFERENCE_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.opcoach.dsgen.generator.impl.MultipleAssociationGeneratorImpl <em>Multiple Association Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.dsgen.generator.impl.MultipleAssociationGeneratorImpl
	 * @see com.opcoach.dsgen.generator.impl.DSGenGeneratorPackageImpl#getMultipleAssociationGenerator()
	 * @generated
	 */
	int MULTIPLE_ASSOCIATION_GENERATOR = 3;

	/**
	 * The feature id for the '<em><b>Bad Value Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ASSOCIATION_GENERATOR__BAD_VALUE_PROPORTION = GeneratorPackage.VALUE_GENERATOR__BAD_VALUE_PROPORTION;

	/**
	 * The feature id for the '<em><b>Bad Value Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ASSOCIATION_GENERATOR__BAD_VALUE_GENERATOR = GeneratorPackage.VALUE_GENERATOR__BAD_VALUE_GENERATOR;

	/**
	 * The feature id for the '<em><b>Last Generated Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ASSOCIATION_GENERATOR__LAST_GENERATED_VALUE = GeneratorPackage.VALUE_GENERATOR__LAST_GENERATED_VALUE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ASSOCIATION_GENERATOR__RANDOM_SEED = GeneratorPackage.VALUE_GENERATOR__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ASSOCIATION_GENERATOR__DESCRIPTION = GeneratorPackage.VALUE_GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ASSOCIATION_GENERATOR__ID = GeneratorPackage.VALUE_GENERATOR__ID;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ASSOCIATION_GENERATOR__LOCALE = GeneratorPackage.VALUE_GENERATOR__LOCALE;

	/**
	 * The feature id for the '<em><b>Max Association Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ASSOCIATION_GENERATOR__MAX_ASSOCIATION_NUMBER = GeneratorPackage.VALUE_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multiple Association Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ASSOCIATION_GENERATOR_FEATURE_COUNT = GeneratorPackage.VALUE_GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '<em>EObject Collection</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Collection
	 * @see com.opcoach.dsgen.generator.impl.DSGenGeneratorPackageImpl#getEObjectCollection()
	 * @generated
	 */
	int EOBJECT_COLLECTION = 4;

	/**
	 * Returns the meta object for class '{@link com.opcoach.dsgen.generator.EObjectGenerator <em>EObject Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EObject Generator</em>'.
	 * @see com.opcoach.dsgen.generator.EObjectGenerator
	 * @generated
	 */
	EClass getEObjectGenerator();

	/**
	 * Returns the meta object for the reference '{@link com.opcoach.dsgen.generator.EObjectGenerator#getTargetDSGenClass <em>Target DS Gen Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target DS Gen Class</em>'.
	 * @see com.opcoach.dsgen.generator.EObjectGenerator#getTargetDSGenClass()
	 * @see #getEObjectGenerator()
	 * @generated
	 */
	EReference getEObjectGenerator_TargetDSGenClass();

	/**
	 * Returns the meta object for class '{@link com.opcoach.dsgen.generator.ChildrenGenerator <em>Children Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Children Generator</em>'.
	 * @see com.opcoach.dsgen.generator.ChildrenGenerator
	 * @generated
	 */
	EClass getChildrenGenerator();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.dsgen.generator.ChildrenGenerator#getMaxChildrenNumber <em>Max Children Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Children Number</em>'.
	 * @see com.opcoach.dsgen.generator.ChildrenGenerator#getMaxChildrenNumber()
	 * @see #getChildrenGenerator()
	 * @generated
	 */
	EAttribute getChildrenGenerator_MaxChildrenNumber();

	/**
	 * Returns the meta object for class '{@link com.opcoach.dsgen.generator.SingleAssociationGenerator <em>Single Association Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Association Generator</em>'.
	 * @see com.opcoach.dsgen.generator.SingleAssociationGenerator
	 * @generated
	 */
	EClass getSingleAssociationGenerator();

	/**
	 * Returns the meta object for class '{@link com.opcoach.dsgen.generator.MultipleAssociationGenerator <em>Multiple Association Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Association Generator</em>'.
	 * @see com.opcoach.dsgen.generator.MultipleAssociationGenerator
	 * @generated
	 */
	EClass getMultipleAssociationGenerator();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.dsgen.generator.MultipleAssociationGenerator#getMaxAssociationNumber <em>Max Association Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Association Number</em>'.
	 * @see com.opcoach.dsgen.generator.MultipleAssociationGenerator#getMaxAssociationNumber()
	 * @see #getMultipleAssociationGenerator()
	 * @generated
	 */
	EAttribute getMultipleAssociationGenerator_MaxAssociationNumber();

	/**
	 * Returns the meta object for data type '{@link java.util.Collection <em>EObject Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EObject Collection</em>'.
	 * @see java.util.Collection
	 * @model instanceClass="java.util.Collection<org.eclipse.emf.ecore.EObject>"
	 * @generated
	 */
	EDataType getEObjectCollection();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DSGenGeneratorFactory getDSGenGeneratorFactory();

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
		 * The meta object literal for the '{@link com.opcoach.dsgen.generator.impl.EObjectGeneratorImpl <em>EObject Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.opcoach.dsgen.generator.impl.EObjectGeneratorImpl
		 * @see com.opcoach.dsgen.generator.impl.DSGenGeneratorPackageImpl#getEObjectGenerator()
		 * @generated
		 */
		EClass EOBJECT_GENERATOR = eINSTANCE.getEObjectGenerator();

		/**
		 * The meta object literal for the '<em><b>Target DS Gen Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOBJECT_GENERATOR__TARGET_DS_GEN_CLASS = eINSTANCE.getEObjectGenerator_TargetDSGenClass();

		/**
		 * The meta object literal for the '{@link com.opcoach.dsgen.generator.impl.ChildrenGeneratorImpl <em>Children Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.opcoach.dsgen.generator.impl.ChildrenGeneratorImpl
		 * @see com.opcoach.dsgen.generator.impl.DSGenGeneratorPackageImpl#getChildrenGenerator()
		 * @generated
		 */
		EClass CHILDREN_GENERATOR = eINSTANCE.getChildrenGenerator();

		/**
		 * The meta object literal for the '<em><b>Max Children Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHILDREN_GENERATOR__MAX_CHILDREN_NUMBER = eINSTANCE.getChildrenGenerator_MaxChildrenNumber();

		/**
		 * The meta object literal for the '{@link com.opcoach.dsgen.generator.impl.SingleAssociationGeneratorImpl <em>Single Association Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.opcoach.dsgen.generator.impl.SingleAssociationGeneratorImpl
		 * @see com.opcoach.dsgen.generator.impl.DSGenGeneratorPackageImpl#getSingleAssociationGenerator()
		 * @generated
		 */
		EClass SINGLE_ASSOCIATION_GENERATOR = eINSTANCE.getSingleAssociationGenerator();

		/**
		 * The meta object literal for the '{@link com.opcoach.dsgen.generator.impl.MultipleAssociationGeneratorImpl <em>Multiple Association Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.opcoach.dsgen.generator.impl.MultipleAssociationGeneratorImpl
		 * @see com.opcoach.dsgen.generator.impl.DSGenGeneratorPackageImpl#getMultipleAssociationGenerator()
		 * @generated
		 */
		EClass MULTIPLE_ASSOCIATION_GENERATOR = eINSTANCE.getMultipleAssociationGenerator();

		/**
		 * The meta object literal for the '<em><b>Max Association Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLE_ASSOCIATION_GENERATOR__MAX_ASSOCIATION_NUMBER = eINSTANCE
				.getMultipleAssociationGenerator_MaxAssociationNumber();

		/**
		 * The meta object literal for the '<em>EObject Collection</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Collection
		 * @see com.opcoach.dsgen.generator.impl.DSGenGeneratorPackageImpl#getEObjectCollection()
		 * @generated
		 */
		EDataType EOBJECT_COLLECTION = eINSTANCE.getEObjectCollection();

	}

} //DSGenGeneratorPackage
