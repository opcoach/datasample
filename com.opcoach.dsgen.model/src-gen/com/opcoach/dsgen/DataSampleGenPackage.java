/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.dsgen;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.opcoach.dsgen.DataSampleGenFactory
 * @model kind="package"
 * @generated
 */
public interface DataSampleGenPackage extends EPackage
{
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "© OPCoach 2012";

	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dsgen";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.opcoach.com/dsgen/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dsgen";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	DataSampleGenPackage eINSTANCE = com.opcoach.dsgen.impl.DataSampleGenPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.opcoach.dsgen.impl.DSGenBaseImpl
	 * <em>DS Gen Base</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see com.opcoach.dsgen.impl.DSGenBaseImpl
	 * @see com.opcoach.dsgen.impl.DataSampleGenPackageImpl#getDSGenBase()
	 * @generated
	 */
	int DS_GEN_BASE = 4;

	/**
	 * The number of structural features of the '<em>DS Gen Base</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_BASE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.opcoach.dsgen.impl.DSGenModelImpl
	 * <em>DS Gen Model</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see com.opcoach.dsgen.impl.DSGenModelImpl
	 * @see com.opcoach.dsgen.impl.DataSampleGenPackageImpl#getDSGenModel()
	 * @generated
	 */
	int DS_GEN_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Dsgen Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_MODEL__DSGEN_PACKAGES = DS_GEN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_MODEL__RANDOM_SEED = DS_GEN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_MODEL__NAME = DS_GEN_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_MODEL__LANGUAGE = DS_GEN_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>DS Gen Model</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_MODEL_FEATURE_COUNT = DS_GEN_BASE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link com.opcoach.dsgen.impl.DSGenPackageImpl <em>DS Gen Package</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see com.opcoach.dsgen.impl.DSGenPackageImpl
	 * @see com.opcoach.dsgen.impl.DataSampleGenPackageImpl#getDSGenPackage()
	 * @generated
	 */
	int DS_GEN_PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Ecore Package</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DS_GEN_PACKAGE__ECORE_PACKAGE = DS_GEN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dsgen Model</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_PACKAGE__DSGEN_MODEL = DS_GEN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dsgen Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_PACKAGE__DSGEN_CLASSIFIERS = DS_GEN_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>DS Gen Package</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_PACKAGE_FEATURE_COUNT = DS_GEN_BASE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.opcoach.dsgen.impl.DSGenClassifierImpl <em>DS Gen Classifier</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see com.opcoach.dsgen.impl.DSGenClassifierImpl
	 * @see com.opcoach.dsgen.impl.DataSampleGenPackageImpl#getDSGenClassifier()
	 * @generated
	 */
	int DS_GEN_CLASSIFIER = 6;

	/**
	 * The feature id for the '<em><b>Ecore Class</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DS_GEN_CLASSIFIER__ECORE_CLASS = DS_GEN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dsgen Features</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_CLASSIFIER__DSGEN_FEATURES = DS_GEN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dsgen Package</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_CLASSIFIER__DSGEN_PACKAGE = DS_GEN_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>DS Gen Classifier</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_CLASSIFIER_FEATURE_COUNT = DS_GEN_BASE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.opcoach.dsgen.impl.DSGenClassImpl
	 * <em>DS Gen Class</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see com.opcoach.dsgen.impl.DSGenClassImpl
	 * @see com.opcoach.dsgen.impl.DataSampleGenPackageImpl#getDSGenClass()
	 * @generated
	 */
	int DS_GEN_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Ecore Class</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DS_GEN_CLASS__ECORE_CLASS = DS_GEN_CLASSIFIER__ECORE_CLASS;

	/**
	 * The feature id for the '<em><b>Dsgen Features</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_CLASS__DSGEN_FEATURES = DS_GEN_CLASSIFIER__DSGEN_FEATURES;

	/**
	 * The feature id for the '<em><b>Dsgen Package</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_CLASS__DSGEN_PACKAGE = DS_GEN_CLASSIFIER__DSGEN_PACKAGE;

	/**
	 * The feature id for the '<em><b>Root Object</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DS_GEN_CLASS__ROOT_OBJECT = DS_GEN_CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nb Association Ref To</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_CLASS__NB_ASSOCIATION_REF_TO = DS_GEN_CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_CLASS__GENERATOR = DS_GEN_CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>DS Gen Class</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_CLASS_FEATURE_COUNT = DS_GEN_CLASSIFIER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.opcoach.dsgen.impl.DSGenTypedElementImpl <em>DS Gen Typed Element</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see com.opcoach.dsgen.impl.DSGenTypedElementImpl
	 * @see com.opcoach.dsgen.impl.DataSampleGenPackageImpl#getDSGenTypedElement()
	 * @generated
	 */
	int DS_GEN_TYPED_ELEMENT = 8;

	/**
	 * The number of structural features of the '<em>DS Gen Typed Element</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_TYPED_ELEMENT_FEATURE_COUNT = DS_GEN_BASE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.opcoach.dsgen.impl.DSGenFeatureImpl <em>DS Gen Feature</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see com.opcoach.dsgen.impl.DSGenFeatureImpl
	 * @see com.opcoach.dsgen.impl.DataSampleGenPackageImpl#getDSGenFeature()
	 * @generated
	 */
	int DS_GEN_FEATURE = 3;

	/**
	 * The feature id for the '<em><b>Nullable Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DS_GEN_FEATURE__NULLABLE_VALUE = DS_GEN_TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nullable Percent</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DS_GEN_FEATURE__NULLABLE_PERCENT = DS_GEN_TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dsgen Class</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_FEATURE__DSGEN_CLASS = DS_GEN_TYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ecore Feature</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DS_GEN_FEATURE__ECORE_FEATURE = DS_GEN_TYPED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_FEATURE__GENERATOR = DS_GEN_TYPED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>DS Gen Feature</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_FEATURE_FEATURE_COUNT = DS_GEN_TYPED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link com.opcoach.dsgen.impl.DSGenEnumLiteralImpl <em>DS Gen Enum Literal</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see com.opcoach.dsgen.impl.DSGenEnumLiteralImpl
	 * @see com.opcoach.dsgen.impl.DataSampleGenPackageImpl#getDSGenEnumLiteral()
	 * @generated
	 */
	int DS_GEN_ENUM_LITERAL = 5;

	/**
	 * The number of structural features of the '<em>DS Gen Enum Literal</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_ENUM_LITERAL_FEATURE_COUNT = DS_GEN_BASE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.opcoach.dsgen.impl.DSGenDataTypeImpl <em>DS Gen Data Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see com.opcoach.dsgen.impl.DSGenDataTypeImpl
	 * @see com.opcoach.dsgen.impl.DataSampleGenPackageImpl#getDSGenDataType()
	 * @generated
	 */
	int DS_GEN_DATA_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Ecore Class</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DS_GEN_DATA_TYPE__ECORE_CLASS = DS_GEN_CLASSIFIER__ECORE_CLASS;

	/**
	 * The feature id for the '<em><b>Dsgen Features</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_DATA_TYPE__DSGEN_FEATURES = DS_GEN_CLASSIFIER__DSGEN_FEATURES;

	/**
	 * The feature id for the '<em><b>Dsgen Package</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_DATA_TYPE__DSGEN_PACKAGE = DS_GEN_CLASSIFIER__DSGEN_PACKAGE;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DS_GEN_DATA_TYPE__DATA_TYPE = DS_GEN_CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DS Gen Data Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_DATA_TYPE_FEATURE_COUNT = DS_GEN_CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.opcoach.dsgen.impl.DSGenAnnotationImpl <em>DS Gen Annotation</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see com.opcoach.dsgen.impl.DSGenAnnotationImpl
	 * @see com.opcoach.dsgen.impl.DataSampleGenPackageImpl#getDSGenAnnotation()
	 * @generated
	 */
	int DS_GEN_ANNOTATION = 9;

	/**
	 * The number of structural features of the '<em>DS Gen Annotation</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_ANNOTATION_FEATURE_COUNT = DS_GEN_BASE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.opcoach.dsgen.impl.DSGenTypeParameterImpl <em>DS Gen Type Parameter</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see com.opcoach.dsgen.impl.DSGenTypeParameterImpl
	 * @see com.opcoach.dsgen.impl.DataSampleGenPackageImpl#getDSGenTypeParameter()
	 * @generated
	 */
	int DS_GEN_TYPE_PARAMETER = 10;

	/**
	 * The number of structural features of the '<em>DS Gen Type Parameter</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_TYPE_PARAMETER_FEATURE_COUNT = DS_GEN_BASE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.opcoach.dsgen.impl.DSGenAttributeImpl <em>DS Gen Attribute</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see com.opcoach.dsgen.impl.DSGenAttributeImpl
	 * @see com.opcoach.dsgen.impl.DataSampleGenPackageImpl#getDSGenAttribute()
	 * @generated
	 */
	int DS_GEN_ATTRIBUTE = 11;

	/**
	 * The feature id for the '<em><b>Nullable Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DS_GEN_ATTRIBUTE__NULLABLE_VALUE = DS_GEN_FEATURE__NULLABLE_VALUE;

	/**
	 * The feature id for the '<em><b>Nullable Percent</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DS_GEN_ATTRIBUTE__NULLABLE_PERCENT = DS_GEN_FEATURE__NULLABLE_PERCENT;

	/**
	 * The feature id for the '<em><b>Dsgen Class</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_ATTRIBUTE__DSGEN_CLASS = DS_GEN_FEATURE__DSGEN_CLASS;

	/**
	 * The feature id for the '<em><b>Ecore Feature</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DS_GEN_ATTRIBUTE__ECORE_FEATURE = DS_GEN_FEATURE__ECORE_FEATURE;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_ATTRIBUTE__GENERATOR = DS_GEN_FEATURE__GENERATOR;

	/**
	 * The number of structural features of the '<em>DS Gen Attribute</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_ATTRIBUTE_FEATURE_COUNT = DS_GEN_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.opcoach.dsgen.impl.DSGenReferenceImpl <em>DS Gen Reference</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see com.opcoach.dsgen.impl.DSGenReferenceImpl
	 * @see com.opcoach.dsgen.impl.DataSampleGenPackageImpl#getDSGenReference()
	 * @generated
	 */
	int DS_GEN_REFERENCE = 12;

	/**
	 * The feature id for the '<em><b>Nullable Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DS_GEN_REFERENCE__NULLABLE_VALUE = DS_GEN_FEATURE__NULLABLE_VALUE;

	/**
	 * The feature id for the '<em><b>Nullable Percent</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DS_GEN_REFERENCE__NULLABLE_PERCENT = DS_GEN_FEATURE__NULLABLE_PERCENT;

	/**
	 * The feature id for the '<em><b>Dsgen Class</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_REFERENCE__DSGEN_CLASS = DS_GEN_FEATURE__DSGEN_CLASS;

	/**
	 * The feature id for the '<em><b>Ecore Feature</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DS_GEN_REFERENCE__ECORE_FEATURE = DS_GEN_FEATURE__ECORE_FEATURE;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_REFERENCE__GENERATOR = DS_GEN_FEATURE__GENERATOR;

	/**
	 * The feature id for the '<em><b>Target DS Gen Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_REFERENCE__TARGET_DS_GEN_CLASS = DS_GEN_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DS Gen Reference</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_REFERENCE_FEATURE_COUNT = DS_GEN_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.opcoach.dsgen.impl.DSGenEnumImpl
	 * <em>DS Gen Enum</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see com.opcoach.dsgen.impl.DSGenEnumImpl
	 * @see com.opcoach.dsgen.impl.DataSampleGenPackageImpl#getDSGenEnum()
	 * @generated
	 */
	int DS_GEN_ENUM = 13;

	/**
	 * The feature id for the '<em><b>Ecore Class</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DS_GEN_ENUM__ECORE_CLASS = DS_GEN_DATA_TYPE__ECORE_CLASS;

	/**
	 * The feature id for the '<em><b>Dsgen Features</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_ENUM__DSGEN_FEATURES = DS_GEN_DATA_TYPE__DSGEN_FEATURES;

	/**
	 * The feature id for the '<em><b>Dsgen Package</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_ENUM__DSGEN_PACKAGE = DS_GEN_DATA_TYPE__DSGEN_PACKAGE;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DS_GEN_ENUM__DATA_TYPE = DS_GEN_DATA_TYPE__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Ecore Enum</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DS_GEN_ENUM__ECORE_ENUM = DS_GEN_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DS Gen Enum</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_ENUM_FEATURE_COUNT = DS_GEN_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.opcoach.dsgen.DSGenRuntimeVersion <em>DS Gen Runtime Version</em>}' enum.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see com.opcoach.dsgen.DSGenRuntimeVersion
	 * @see com.opcoach.dsgen.impl.DataSampleGenPackageImpl#getDSGenRuntimeVersion()
	 * @generated
	 */
	int DS_GEN_RUNTIME_VERSION = 14;

	/**
	 * The meta object id for the '{@link com.opcoach.dsgen.DSGenJDKLevel <em>DS Gen JDK Level</em>}' enum.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see com.opcoach.dsgen.DSGenJDKLevel
	 * @see com.opcoach.dsgen.impl.DataSampleGenPackageImpl#getDSGenJDKLevel()
	 * @generated
	 */
	int DS_GEN_JDK_LEVEL = 15;

	/**
	 * The meta object id for the '{@link com.opcoach.dsgen.DSGenDelegationKind <em>DS Gen Delegation Kind</em>}' enum.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see com.opcoach.dsgen.DSGenDelegationKind
	 * @see com.opcoach.dsgen.impl.DataSampleGenPackageImpl#getDSGenDelegationKind()
	 * @generated
	 */
	int DS_GEN_DELEGATION_KIND = 16;

	/**
	 * The meta object id for the '{@link com.opcoach.dsgen.DSGenPropertyKind <em>DS Gen Property Kind</em>}' enum.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see com.opcoach.dsgen.DSGenPropertyKind
	 * @see com.opcoach.dsgen.impl.DataSampleGenPackageImpl#getDSGenPropertyKind()
	 * @generated
	 */
	int DS_GEN_PROPERTY_KIND = 17;

	/**
	 * The meta object id for the '{@link com.opcoach.dsgen.DSGenResourceKind <em>DS Gen Resource Kind</em>}' enum.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see com.opcoach.dsgen.DSGenResourceKind
	 * @see com.opcoach.dsgen.impl.DataSampleGenPackageImpl#getDSGenResourceKind()
	 * @generated
	 */
	int DS_GEN_RESOURCE_KIND = 18;

	/**
	 * Returns the meta object for class '{@link com.opcoach.dsgen.DSGenModel <em>DS Gen Model</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>DS Gen Model</em>'.
	 * @see com.opcoach.dsgen.DSGenModel
	 * @generated
	 */
	EClass getDSGenModel();

	/**
	 * Returns the meta object for the containment reference list '{@link com.opcoach.dsgen.DSGenModel#getDsgenPackages <em>Dsgen Packages</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dsgen Packages</em>'.
	 * @see com.opcoach.dsgen.DSGenModel#getDsgenPackages()
	 * @see #getDSGenModel()
	 * @generated
	 */
	EReference getDSGenModel_DsgenPackages();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.dsgen.DSGenModel#getRandomSeed <em>Random Seed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Random Seed</em>'.
	 * @see com.opcoach.dsgen.DSGenModel#getRandomSeed()
	 * @see #getDSGenModel()
	 * @generated
	 */
	EAttribute getDSGenModel_RandomSeed();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.dsgen.DSGenModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.opcoach.dsgen.DSGenModel#getName()
	 * @see #getDSGenModel()
	 * @generated
	 */
	EAttribute getDSGenModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.dsgen.DSGenModel#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see com.opcoach.dsgen.DSGenModel#getLanguage()
	 * @see #getDSGenModel()
	 * @generated
	 */
	EAttribute getDSGenModel_Language();

	/**
	 * Returns the meta object for class '{@link com.opcoach.dsgen.DSGenPackage <em>DS Gen Package</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>DS Gen Package</em>'.
	 * @see com.opcoach.dsgen.DSGenPackage
	 * @generated
	 */
	EClass getDSGenPackage();

	/**
	 * Returns the meta object for the reference '{@link com.opcoach.dsgen.DSGenPackage#getEcorePackage <em>Ecore Package</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ecore Package</em>'.
	 * @see com.opcoach.dsgen.DSGenPackage#getEcorePackage()
	 * @see #getDSGenPackage()
	 * @generated
	 */
	EReference getDSGenPackage_EcorePackage();

	/**
	 * Returns the meta object for the container reference '{@link com.opcoach.dsgen.DSGenPackage#getDsgenModel <em>Dsgen Model</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Dsgen Model</em>'.
	 * @see com.opcoach.dsgen.DSGenPackage#getDsgenModel()
	 * @see #getDSGenPackage()
	 * @generated
	 */
	EReference getDSGenPackage_DsgenModel();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link com.opcoach.dsgen.DSGenPackage#getDsgenClassifiers
	 * <em>Dsgen Classifiers</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Dsgen Classifiers</em>'.
	 * @see com.opcoach.dsgen.DSGenPackage#getDsgenClassifiers()
	 * @see #getDSGenPackage()
	 * @generated
	 */
	EReference getDSGenPackage_DsgenClassifiers();

	/**
	 * Returns the meta object for class '{@link com.opcoach.dsgen.DSGenClass <em>DS Gen Class</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>DS Gen Class</em>'.
	 * @see com.opcoach.dsgen.DSGenClass
	 * @generated
	 */
	EClass getDSGenClass();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.dsgen.DSGenClass#isRootObject <em>Root Object</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root Object</em>'.
	 * @see com.opcoach.dsgen.DSGenClass#isRootObject()
	 * @see #getDSGenClass()
	 * @generated
	 */
	EAttribute getDSGenClass_RootObject();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.dsgen.DSGenClass#getNbAssociationRefTo <em>Nb Association Ref To</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Association Ref To</em>'.
	 * @see com.opcoach.dsgen.DSGenClass#getNbAssociationRefTo()
	 * @see #getDSGenClass()
	 * @generated
	 */
	EAttribute getDSGenClass_NbAssociationRefTo();

	/**
	 * Returns the meta object for the containment reference '{@link com.opcoach.dsgen.DSGenClass#getGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generator</em>'.
	 * @see com.opcoach.dsgen.DSGenClass#getGenerator()
	 * @see #getDSGenClass()
	 * @generated
	 */
	EReference getDSGenClass_Generator();

	/**
	 * Returns the meta object for class '{@link com.opcoach.dsgen.DSGenFeature <em>DS Gen Feature</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>DS Gen Feature</em>'.
	 * @see com.opcoach.dsgen.DSGenFeature
	 * @generated
	 */
	EClass getDSGenFeature();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.dsgen.DSGenFeature#isNullableValue <em>Nullable Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable Value</em>'.
	 * @see com.opcoach.dsgen.DSGenFeature#isNullableValue()
	 * @see #getDSGenFeature()
	 * @generated
	 */
	EAttribute getDSGenFeature_NullableValue();

	/**
	 * Returns the meta object for the attribute '
	 * {@link com.opcoach.dsgen.DSGenFeature#getNullablePercent
	 * <em>Nullable Percent</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the attribute '<em>Nullable Percent</em>'.
	 * @see com.opcoach.dsgen.DSGenFeature#getNullablePercent()
	 * @see #getDSGenFeature()
	 * @generated
	 */
	EAttribute getDSGenFeature_NullablePercent();

	/**
	 * Returns the meta object for the container reference '{@link com.opcoach.dsgen.DSGenFeature#getDsgenClass <em>Dsgen Class</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Dsgen Class</em>'.
	 * @see com.opcoach.dsgen.DSGenFeature#getDsgenClass()
	 * @see #getDSGenFeature()
	 * @generated
	 */
	EReference getDSGenFeature_DsgenClass();

	/**
	 * Returns the meta object for the reference '{@link com.opcoach.dsgen.DSGenFeature#getEcoreFeature <em>Ecore Feature</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ecore Feature</em>'.
	 * @see com.opcoach.dsgen.DSGenFeature#getEcoreFeature()
	 * @see #getDSGenFeature()
	 * @generated
	 */
	EReference getDSGenFeature_EcoreFeature();

	/**
	 * Returns the meta object for the containment reference '{@link com.opcoach.dsgen.DSGenFeature#getGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generator</em>'.
	 * @see com.opcoach.dsgen.DSGenFeature#getGenerator()
	 * @see #getDSGenFeature()
	 * @generated
	 */
	EReference getDSGenFeature_Generator();

	/**
	 * Returns the meta object for class '{@link com.opcoach.dsgen.DSGenBase <em>DS Gen Base</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>DS Gen Base</em>'.
	 * @see com.opcoach.dsgen.DSGenBase
	 * @generated
	 */
	EClass getDSGenBase();

	/**
	 * Returns the meta object for class '{@link com.opcoach.dsgen.DSGenEnumLiteral <em>DS Gen Enum Literal</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>DS Gen Enum Literal</em>'.
	 * @see com.opcoach.dsgen.DSGenEnumLiteral
	 * @generated
	 */
	EClass getDSGenEnumLiteral();

	/**
	 * Returns the meta object for class '{@link com.opcoach.dsgen.DSGenClassifier <em>DS Gen Classifier</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>DS Gen Classifier</em>'.
	 * @see com.opcoach.dsgen.DSGenClassifier
	 * @generated
	 */
	EClass getDSGenClassifier();

	/**
	 * Returns the meta object for the reference '{@link com.opcoach.dsgen.DSGenClassifier#getEcoreClass <em>Ecore Class</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ecore Class</em>'.
	 * @see com.opcoach.dsgen.DSGenClassifier#getEcoreClass()
	 * @see #getDSGenClassifier()
	 * @generated
	 */
	EReference getDSGenClassifier_EcoreClass();

	/**
	 * Returns the meta object for the containment reference list '{@link com.opcoach.dsgen.DSGenClassifier#getDsgenFeatures <em>Dsgen Features</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dsgen Features</em>'.
	 * @see com.opcoach.dsgen.DSGenClassifier#getDsgenFeatures()
	 * @see #getDSGenClassifier()
	 * @generated
	 */
	EReference getDSGenClassifier_DsgenFeatures();

	/**
	 * Returns the meta object for the container reference '{@link com.opcoach.dsgen.DSGenClassifier#getDsgenPackage <em>Dsgen Package</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Dsgen Package</em>'.
	 * @see com.opcoach.dsgen.DSGenClassifier#getDsgenPackage()
	 * @see #getDSGenClassifier()
	 * @generated
	 */
	EReference getDSGenClassifier_DsgenPackage();

	/**
	 * Returns the meta object for class '
	 * {@link com.opcoach.dsgen.DSGenDataType <em>DS Gen Data Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>DS Gen Data Type</em>'.
	 * @see com.opcoach.dsgen.DSGenDataType
	 * @generated
	 */
	EClass getDSGenDataType();

	/**
	 * Returns the meta object for the reference '{@link com.opcoach.dsgen.DSGenDataType#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Type</em>'.
	 * @see com.opcoach.dsgen.DSGenDataType#getDataType()
	 * @see #getDSGenDataType()
	 * @generated
	 */
	EReference getDSGenDataType_DataType();

	/**
	 * Returns the meta object for class '{@link com.opcoach.dsgen.DSGenTypedElement <em>DS Gen Typed Element</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>DS Gen Typed Element</em>'.
	 * @see com.opcoach.dsgen.DSGenTypedElement
	 * @generated
	 */
	EClass getDSGenTypedElement();

	/**
	 * Returns the meta object for class '{@link com.opcoach.dsgen.DSGenAnnotation <em>DS Gen Annotation</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>DS Gen Annotation</em>'.
	 * @see com.opcoach.dsgen.DSGenAnnotation
	 * @generated
	 */
	EClass getDSGenAnnotation();

	/**
	 * Returns the meta object for class '{@link com.opcoach.dsgen.DSGenTypeParameter <em>DS Gen Type Parameter</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>DS Gen Type Parameter</em>'.
	 * @see com.opcoach.dsgen.DSGenTypeParameter
	 * @generated
	 */
	EClass getDSGenTypeParameter();

	/**
	 * Returns the meta object for class '
	 * {@link com.opcoach.dsgen.DSGenAttribute <em>DS Gen Attribute</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>DS Gen Attribute</em>'.
	 * @see com.opcoach.dsgen.DSGenAttribute
	 * @generated
	 */
	EClass getDSGenAttribute();

	/**
	 * Returns the meta object for class '
	 * {@link com.opcoach.dsgen.DSGenReference <em>DS Gen Reference</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>DS Gen Reference</em>'.
	 * @see com.opcoach.dsgen.DSGenReference
	 * @generated
	 */
	EClass getDSGenReference();

	/**
	 * Returns the meta object for the reference '{@link com.opcoach.dsgen.DSGenReference#getTargetDSGenClass <em>Target DS Gen Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target DS Gen Class</em>'.
	 * @see com.opcoach.dsgen.DSGenReference#getTargetDSGenClass()
	 * @see #getDSGenReference()
	 * @generated
	 */
	EReference getDSGenReference_TargetDSGenClass();

	/**
	 * Returns the meta object for class '{@link com.opcoach.dsgen.DSGenEnum <em>DS Gen Enum</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>DS Gen Enum</em>'.
	 * @see com.opcoach.dsgen.DSGenEnum
	 * @generated
	 */
	EClass getDSGenEnum();

	/**
	 * Returns the meta object for the reference '{@link com.opcoach.dsgen.DSGenEnum#getEcoreEnum <em>Ecore Enum</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ecore Enum</em>'.
	 * @see com.opcoach.dsgen.DSGenEnum#getEcoreEnum()
	 * @see #getDSGenEnum()
	 * @generated
	 */
	EReference getDSGenEnum_EcoreEnum();

	/**
	 * Returns the meta object for enum '{@link com.opcoach.dsgen.DSGenRuntimeVersion <em>DS Gen Runtime Version</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for enum '<em>DS Gen Runtime Version</em>'.
	 * @see com.opcoach.dsgen.DSGenRuntimeVersion
	 * @generated
	 */
	EEnum getDSGenRuntimeVersion();

	/**
	 * Returns the meta object for enum '{@link com.opcoach.dsgen.DSGenJDKLevel
	 * <em>DS Gen JDK Level</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for enum '<em>DS Gen JDK Level</em>'.
	 * @see com.opcoach.dsgen.DSGenJDKLevel
	 * @generated
	 */
	EEnum getDSGenJDKLevel();

	/**
	 * Returns the meta object for enum '{@link com.opcoach.dsgen.DSGenDelegationKind <em>DS Gen Delegation Kind</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for enum '<em>DS Gen Delegation Kind</em>'.
	 * @see com.opcoach.dsgen.DSGenDelegationKind
	 * @generated
	 */
	EEnum getDSGenDelegationKind();

	/**
	 * Returns the meta object for enum '{@link com.opcoach.dsgen.DSGenPropertyKind <em>DS Gen Property Kind</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DS Gen Property Kind</em>'.
	 * @see com.opcoach.dsgen.DSGenPropertyKind
	 * @generated
	 */
	EEnum getDSGenPropertyKind();

	/**
	 * Returns the meta object for enum '{@link com.opcoach.dsgen.DSGenResourceKind <em>DS Gen Resource Kind</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DS Gen Resource Kind</em>'.
	 * @see com.opcoach.dsgen.DSGenResourceKind
	 * @generated
	 */
	EEnum getDSGenResourceKind();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataSampleGenFactory getDataSampleGenFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that
	 * represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link com.opcoach.dsgen.impl.DSGenModelImpl <em>DS Gen Model</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see com.opcoach.dsgen.impl.DSGenModelImpl
		 * @see com.opcoach.dsgen.impl.DataSampleGenPackageImpl#getDSGenModel()
		 * @generated
		 */
		EClass DS_GEN_MODEL = eINSTANCE.getDSGenModel();

		/**
		 * The meta object literal for the '<em><b>Dsgen Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference DS_GEN_MODEL__DSGEN_PACKAGES = eINSTANCE.getDSGenModel_DsgenPackages();

		/**
		 * The meta object literal for the '<em><b>Random Seed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DS_GEN_MODEL__RANDOM_SEED = eINSTANCE.getDSGenModel_RandomSeed();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DS_GEN_MODEL__NAME = eINSTANCE.getDSGenModel_Name();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DS_GEN_MODEL__LANGUAGE = eINSTANCE.getDSGenModel_Language();

		/**
		 * The meta object literal for the '{@link com.opcoach.dsgen.impl.DSGenPackageImpl <em>DS Gen Package</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see com.opcoach.dsgen.impl.DSGenPackageImpl
		 * @see com.opcoach.dsgen.impl.DataSampleGenPackageImpl#getDSGenPackage()
		 * @generated
		 */
		EClass DS_GEN_PACKAGE = eINSTANCE.getDSGenPackage();

		/**
		 * The meta object literal for the '<em><b>Ecore Package</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference DS_GEN_PACKAGE__ECORE_PACKAGE = eINSTANCE.getDSGenPackage_EcorePackage();

		/**
		 * The meta object literal for the '<em><b>Dsgen Model</b></em>' container reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference DS_GEN_PACKAGE__DSGEN_MODEL = eINSTANCE.getDSGenPackage_DsgenModel();

		/**
		 * The meta object literal for the '<em><b>Dsgen Classifiers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference DS_GEN_PACKAGE__DSGEN_CLASSIFIERS = eINSTANCE.getDSGenPackage_DsgenClassifiers();

		/**
		 * The meta object literal for the '{@link com.opcoach.dsgen.impl.DSGenClassImpl <em>DS Gen Class</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see com.opcoach.dsgen.impl.DSGenClassImpl
		 * @see com.opcoach.dsgen.impl.DataSampleGenPackageImpl#getDSGenClass()
		 * @generated
		 */
		EClass DS_GEN_CLASS = eINSTANCE.getDSGenClass();

		/**
		 * The meta object literal for the '<em><b>Root Object</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DS_GEN_CLASS__ROOT_OBJECT = eINSTANCE.getDSGenClass_RootObject();

		/**
		 * The meta object literal for the '
		 * <em><b>Nb Association Ref To</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DS_GEN_CLASS__NB_ASSOCIATION_REF_TO = eINSTANCE.getDSGenClass_NbAssociationRefTo();

		/**
		 * The meta object literal for the '<em><b>Generator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DS_GEN_CLASS__GENERATOR = eINSTANCE.getDSGenClass_Generator();

		/**
		 * The meta object literal for the '{@link com.opcoach.dsgen.impl.DSGenFeatureImpl <em>DS Gen Feature</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see com.opcoach.dsgen.impl.DSGenFeatureImpl
		 * @see com.opcoach.dsgen.impl.DataSampleGenPackageImpl#getDSGenFeature()
		 * @generated
		 */
		EClass DS_GEN_FEATURE = eINSTANCE.getDSGenFeature();

		/**
		 * The meta object literal for the '<em><b>Nullable Value</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DS_GEN_FEATURE__NULLABLE_VALUE = eINSTANCE.getDSGenFeature_NullableValue();

		/**
		 * The meta object literal for the '<em><b>Nullable Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DS_GEN_FEATURE__NULLABLE_PERCENT = eINSTANCE.getDSGenFeature_NullablePercent();

		/**
		 * The meta object literal for the '<em><b>Dsgen Class</b></em>' container reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference DS_GEN_FEATURE__DSGEN_CLASS = eINSTANCE.getDSGenFeature_DsgenClass();

		/**
		 * The meta object literal for the '<em><b>Ecore Feature</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference DS_GEN_FEATURE__ECORE_FEATURE = eINSTANCE.getDSGenFeature_EcoreFeature();

		/**
		 * The meta object literal for the '<em><b>Generator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DS_GEN_FEATURE__GENERATOR = eINSTANCE.getDSGenFeature_Generator();

		/**
		 * The meta object literal for the '{@link com.opcoach.dsgen.impl.DSGenBaseImpl <em>DS Gen Base</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see com.opcoach.dsgen.impl.DSGenBaseImpl
		 * @see com.opcoach.dsgen.impl.DataSampleGenPackageImpl#getDSGenBase()
		 * @generated
		 */
		EClass DS_GEN_BASE = eINSTANCE.getDSGenBase();

		/**
		 * The meta object literal for the '{@link com.opcoach.dsgen.impl.DSGenEnumLiteralImpl <em>DS Gen Enum Literal</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see com.opcoach.dsgen.impl.DSGenEnumLiteralImpl
		 * @see com.opcoach.dsgen.impl.DataSampleGenPackageImpl#getDSGenEnumLiteral()
		 * @generated
		 */
		EClass DS_GEN_ENUM_LITERAL = eINSTANCE.getDSGenEnumLiteral();

		/**
		 * The meta object literal for the '{@link com.opcoach.dsgen.impl.DSGenClassifierImpl <em>DS Gen Classifier</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see com.opcoach.dsgen.impl.DSGenClassifierImpl
		 * @see com.opcoach.dsgen.impl.DataSampleGenPackageImpl#getDSGenClassifier()
		 * @generated
		 */
		EClass DS_GEN_CLASSIFIER = eINSTANCE.getDSGenClassifier();

		/**
		 * The meta object literal for the '<em><b>Ecore Class</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference DS_GEN_CLASSIFIER__ECORE_CLASS = eINSTANCE.getDSGenClassifier_EcoreClass();

		/**
		 * The meta object literal for the '<em><b>Dsgen Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference DS_GEN_CLASSIFIER__DSGEN_FEATURES = eINSTANCE.getDSGenClassifier_DsgenFeatures();

		/**
		 * The meta object literal for the '<em><b>Dsgen Package</b></em>' container reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference DS_GEN_CLASSIFIER__DSGEN_PACKAGE = eINSTANCE.getDSGenClassifier_DsgenPackage();

		/**
		 * The meta object literal for the '{@link com.opcoach.dsgen.impl.DSGenDataTypeImpl <em>DS Gen Data Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see com.opcoach.dsgen.impl.DSGenDataTypeImpl
		 * @see com.opcoach.dsgen.impl.DataSampleGenPackageImpl#getDSGenDataType()
		 * @generated
		 */
		EClass DS_GEN_DATA_TYPE = eINSTANCE.getDSGenDataType();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference DS_GEN_DATA_TYPE__DATA_TYPE = eINSTANCE.getDSGenDataType_DataType();

		/**
		 * The meta object literal for the '{@link com.opcoach.dsgen.impl.DSGenTypedElementImpl <em>DS Gen Typed Element</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see com.opcoach.dsgen.impl.DSGenTypedElementImpl
		 * @see com.opcoach.dsgen.impl.DataSampleGenPackageImpl#getDSGenTypedElement()
		 * @generated
		 */
		EClass DS_GEN_TYPED_ELEMENT = eINSTANCE.getDSGenTypedElement();

		/**
		 * The meta object literal for the '{@link com.opcoach.dsgen.impl.DSGenAnnotationImpl <em>DS Gen Annotation</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see com.opcoach.dsgen.impl.DSGenAnnotationImpl
		 * @see com.opcoach.dsgen.impl.DataSampleGenPackageImpl#getDSGenAnnotation()
		 * @generated
		 */
		EClass DS_GEN_ANNOTATION = eINSTANCE.getDSGenAnnotation();

		/**
		 * The meta object literal for the '{@link com.opcoach.dsgen.impl.DSGenTypeParameterImpl <em>DS Gen Type Parameter</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see com.opcoach.dsgen.impl.DSGenTypeParameterImpl
		 * @see com.opcoach.dsgen.impl.DataSampleGenPackageImpl#getDSGenTypeParameter()
		 * @generated
		 */
		EClass DS_GEN_TYPE_PARAMETER = eINSTANCE.getDSGenTypeParameter();

		/**
		 * The meta object literal for the '{@link com.opcoach.dsgen.impl.DSGenAttributeImpl <em>DS Gen Attribute</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see com.opcoach.dsgen.impl.DSGenAttributeImpl
		 * @see com.opcoach.dsgen.impl.DataSampleGenPackageImpl#getDSGenAttribute()
		 * @generated
		 */
		EClass DS_GEN_ATTRIBUTE = eINSTANCE.getDSGenAttribute();

		/**
		 * The meta object literal for the '{@link com.opcoach.dsgen.impl.DSGenReferenceImpl <em>DS Gen Reference</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see com.opcoach.dsgen.impl.DSGenReferenceImpl
		 * @see com.opcoach.dsgen.impl.DataSampleGenPackageImpl#getDSGenReference()
		 * @generated
		 */
		EClass DS_GEN_REFERENCE = eINSTANCE.getDSGenReference();

		/**
		 * The meta object literal for the '<em><b>Target DS Gen Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DS_GEN_REFERENCE__TARGET_DS_GEN_CLASS = eINSTANCE.getDSGenReference_TargetDSGenClass();

		/**
		 * The meta object literal for the '{@link com.opcoach.dsgen.impl.DSGenEnumImpl <em>DS Gen Enum</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see com.opcoach.dsgen.impl.DSGenEnumImpl
		 * @see com.opcoach.dsgen.impl.DataSampleGenPackageImpl#getDSGenEnum()
		 * @generated
		 */
		EClass DS_GEN_ENUM = eINSTANCE.getDSGenEnum();

		/**
		 * The meta object literal for the '<em><b>Ecore Enum</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference DS_GEN_ENUM__ECORE_ENUM = eINSTANCE.getDSGenEnum_EcoreEnum();

		/**
		 * The meta object literal for the '{@link com.opcoach.dsgen.DSGenRuntimeVersion <em>DS Gen Runtime Version</em>}' enum.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see com.opcoach.dsgen.DSGenRuntimeVersion
		 * @see com.opcoach.dsgen.impl.DataSampleGenPackageImpl#getDSGenRuntimeVersion()
		 * @generated
		 */
		EEnum DS_GEN_RUNTIME_VERSION = eINSTANCE.getDSGenRuntimeVersion();

		/**
		 * The meta object literal for the '{@link com.opcoach.dsgen.DSGenJDKLevel <em>DS Gen JDK Level</em>}' enum.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see com.opcoach.dsgen.DSGenJDKLevel
		 * @see com.opcoach.dsgen.impl.DataSampleGenPackageImpl#getDSGenJDKLevel()
		 * @generated
		 */
		EEnum DS_GEN_JDK_LEVEL = eINSTANCE.getDSGenJDKLevel();

		/**
		 * The meta object literal for the '{@link com.opcoach.dsgen.DSGenDelegationKind <em>DS Gen Delegation Kind</em>}' enum.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see com.opcoach.dsgen.DSGenDelegationKind
		 * @see com.opcoach.dsgen.impl.DataSampleGenPackageImpl#getDSGenDelegationKind()
		 * @generated
		 */
		EEnum DS_GEN_DELEGATION_KIND = eINSTANCE.getDSGenDelegationKind();

		/**
		 * The meta object literal for the '{@link com.opcoach.dsgen.DSGenPropertyKind <em>DS Gen Property Kind</em>}' enum.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see com.opcoach.dsgen.DSGenPropertyKind
		 * @see com.opcoach.dsgen.impl.DataSampleGenPackageImpl#getDSGenPropertyKind()
		 * @generated
		 */
		EEnum DS_GEN_PROPERTY_KIND = eINSTANCE.getDSGenPropertyKind();

		/**
		 * The meta object literal for the '{@link com.opcoach.dsgen.DSGenResourceKind <em>DS Gen Resource Kind</em>}' enum.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see com.opcoach.dsgen.DSGenResourceKind
		 * @see com.opcoach.dsgen.impl.DataSampleGenPackageImpl#getDSGenResourceKind()
		 * @generated
		 */
		EEnum DS_GEN_RESOURCE_KIND = eINSTANCE.getDSGenResourceKind();

	}

} // DataSampleGenPackage
