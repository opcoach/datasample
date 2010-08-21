/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.generator.ecore.dsgen;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.opcoach.generator.ecore.dsgen.DataSampleGenFactory
 * @model kind="package"
 *        annotation="dsg foo='bar'"
 * @generated
 */
public interface DataSampleGenPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dsgen";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.opcoach.com/dsgen/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dsgen";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataSampleGenPackage eINSTANCE = com.opcoach.generator.ecore.dsgen.impl.DataSampleGenPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.opcoach.generator.ecore.dsgen.impl.DSGenBaseImpl <em>DS Gen Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.generator.ecore.dsgen.impl.DSGenBaseImpl
	 * @see com.opcoach.generator.ecore.dsgen.impl.DataSampleGenPackageImpl#getDSGenBase()
	 * @generated
	 */
	int DS_GEN_BASE = 4;

	/**
	 * The number of structural features of the '<em>DS Gen Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_BASE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.opcoach.generator.ecore.dsgen.impl.DSGenModelImpl <em>DS Gen Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.generator.ecore.dsgen.impl.DSGenModelImpl
	 * @see com.opcoach.generator.ecore.dsgen.impl.DataSampleGenPackageImpl#getDSGenModel()
	 * @generated
	 */
	int DS_GEN_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Dsgen Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_MODEL__DSGEN_PACKAGES = DS_GEN_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DS Gen Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_MODEL_FEATURE_COUNT = DS_GEN_BASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.opcoach.generator.ecore.dsgen.impl.DSGenPackageImpl <em>DS Gen Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.generator.ecore.dsgen.impl.DSGenPackageImpl
	 * @see com.opcoach.generator.ecore.dsgen.impl.DataSampleGenPackageImpl#getDSGenPackage()
	 * @generated
	 */
	int DS_GEN_PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Ecore Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_PACKAGE__ECORE_PACKAGE = DS_GEN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dsgen Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_PACKAGE__DSGEN_MODEL = DS_GEN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dsgen Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_PACKAGE__DSGEN_CLASSIFIERS = DS_GEN_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>DS Gen Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_PACKAGE_FEATURE_COUNT = DS_GEN_BASE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.opcoach.generator.ecore.dsgen.impl.DSGenClassifierImpl <em>DS Gen Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.generator.ecore.dsgen.impl.DSGenClassifierImpl
	 * @see com.opcoach.generator.ecore.dsgen.impl.DataSampleGenPackageImpl#getDSGenClassifier()
	 * @generated
	 */
	int DS_GEN_CLASSIFIER = 6;

	/**
	 * The feature id for the '<em><b>Ecore Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_CLASSIFIER__ECORE_CLASS = DS_GEN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dsgen Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_CLASSIFIER__DSGEN_FEATURES = DS_GEN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dsgen Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_CLASSIFIER__DSGEN_PACKAGE = DS_GEN_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>DS Gen Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_CLASSIFIER_FEATURE_COUNT = DS_GEN_BASE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.opcoach.generator.ecore.dsgen.impl.DSGenClassImpl <em>DS Gen Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.generator.ecore.dsgen.impl.DSGenClassImpl
	 * @see com.opcoach.generator.ecore.dsgen.impl.DataSampleGenPackageImpl#getDSGenClass()
	 * @generated
	 */
	int DS_GEN_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Ecore Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_CLASS__ECORE_CLASS = DS_GEN_CLASSIFIER__ECORE_CLASS;

	/**
	 * The feature id for the '<em><b>Dsgen Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_CLASS__DSGEN_FEATURES = DS_GEN_CLASSIFIER__DSGEN_FEATURES;

	/**
	 * The feature id for the '<em><b>Dsgen Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_CLASS__DSGEN_PACKAGE = DS_GEN_CLASSIFIER__DSGEN_PACKAGE;

	/**
	 * The feature id for the '<em><b>Instance Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_CLASS__INSTANCE_NUMBER = DS_GEN_CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DS Gen Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_CLASS_FEATURE_COUNT = DS_GEN_CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.opcoach.generator.ecore.dsgen.impl.DSGenTypedElementImpl <em>DS Gen Typed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.generator.ecore.dsgen.impl.DSGenTypedElementImpl
	 * @see com.opcoach.generator.ecore.dsgen.impl.DataSampleGenPackageImpl#getDSGenTypedElement()
	 * @generated
	 */
	int DS_GEN_TYPED_ELEMENT = 8;

	/**
	 * The number of structural features of the '<em>DS Gen Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_TYPED_ELEMENT_FEATURE_COUNT = DS_GEN_BASE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.opcoach.generator.ecore.dsgen.impl.DSGenFeatureImpl <em>DS Gen Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.generator.ecore.dsgen.impl.DSGenFeatureImpl
	 * @see com.opcoach.generator.ecore.dsgen.impl.DataSampleGenPackageImpl#getDSGenFeature()
	 * @generated
	 */
	int DS_GEN_FEATURE = 3;

	/**
	 * The feature id for the '<em><b>Nullable Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_FEATURE__NULLABLE_VALUE = DS_GEN_TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nullable Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_FEATURE__NULLABLE_PERCENT = DS_GEN_TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dsgen Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_FEATURE__DSGEN_CLASS = DS_GEN_TYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ecore Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_FEATURE__ECORE_FEATURE = DS_GEN_TYPED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>DS Gen Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_FEATURE_FEATURE_COUNT = DS_GEN_TYPED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link com.opcoach.generator.ecore.dsgen.impl.DSGenEnumLiteralImpl <em>DS Gen Enum Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.generator.ecore.dsgen.impl.DSGenEnumLiteralImpl
	 * @see com.opcoach.generator.ecore.dsgen.impl.DataSampleGenPackageImpl#getDSGenEnumLiteral()
	 * @generated
	 */
	int DS_GEN_ENUM_LITERAL = 5;

	/**
	 * The number of structural features of the '<em>DS Gen Enum Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_ENUM_LITERAL_FEATURE_COUNT = DS_GEN_BASE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.opcoach.generator.ecore.dsgen.impl.DSGenDataTypeImpl <em>DS Gen Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.generator.ecore.dsgen.impl.DSGenDataTypeImpl
	 * @see com.opcoach.generator.ecore.dsgen.impl.DataSampleGenPackageImpl#getDSGenDataType()
	 * @generated
	 */
	int DS_GEN_DATA_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Ecore Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_DATA_TYPE__ECORE_CLASS = DS_GEN_CLASSIFIER__ECORE_CLASS;

	/**
	 * The feature id for the '<em><b>Dsgen Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_DATA_TYPE__DSGEN_FEATURES = DS_GEN_CLASSIFIER__DSGEN_FEATURES;

	/**
	 * The feature id for the '<em><b>Dsgen Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_DATA_TYPE__DSGEN_PACKAGE = DS_GEN_CLASSIFIER__DSGEN_PACKAGE;

	/**
	 * The number of structural features of the '<em>DS Gen Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_DATA_TYPE_FEATURE_COUNT = DS_GEN_CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.opcoach.generator.ecore.dsgen.impl.DSGenAnnotationImpl <em>DS Gen Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.generator.ecore.dsgen.impl.DSGenAnnotationImpl
	 * @see com.opcoach.generator.ecore.dsgen.impl.DataSampleGenPackageImpl#getDSGenAnnotation()
	 * @generated
	 */
	int DS_GEN_ANNOTATION = 9;

	/**
	 * The number of structural features of the '<em>DS Gen Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_ANNOTATION_FEATURE_COUNT = DS_GEN_BASE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.opcoach.generator.ecore.dsgen.impl.DSGenTypeParameterImpl <em>DS Gen Type Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.generator.ecore.dsgen.impl.DSGenTypeParameterImpl
	 * @see com.opcoach.generator.ecore.dsgen.impl.DataSampleGenPackageImpl#getDSGenTypeParameter()
	 * @generated
	 */
	int DS_GEN_TYPE_PARAMETER = 10;

	/**
	 * The number of structural features of the '<em>DS Gen Type Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_TYPE_PARAMETER_FEATURE_COUNT = DS_GEN_BASE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.opcoach.generator.ecore.dsgen.impl.DSGenAttributeImpl <em>DS Gen Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.generator.ecore.dsgen.impl.DSGenAttributeImpl
	 * @see com.opcoach.generator.ecore.dsgen.impl.DataSampleGenPackageImpl#getDSGenAttribute()
	 * @generated
	 */
	int DS_GEN_ATTRIBUTE = 11;

	/**
	 * The feature id for the '<em><b>Nullable Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_ATTRIBUTE__NULLABLE_VALUE = DS_GEN_FEATURE__NULLABLE_VALUE;

	/**
	 * The feature id for the '<em><b>Nullable Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_ATTRIBUTE__NULLABLE_PERCENT = DS_GEN_FEATURE__NULLABLE_PERCENT;

	/**
	 * The feature id for the '<em><b>Dsgen Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_ATTRIBUTE__DSGEN_CLASS = DS_GEN_FEATURE__DSGEN_CLASS;

	/**
	 * The feature id for the '<em><b>Ecore Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_ATTRIBUTE__ECORE_FEATURE = DS_GEN_FEATURE__ECORE_FEATURE;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_ATTRIBUTE__GENERATOR = DS_GEN_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DS Gen Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_ATTRIBUTE_FEATURE_COUNT = DS_GEN_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.opcoach.generator.ecore.dsgen.impl.DSGenReferenceImpl <em>DS Gen Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.generator.ecore.dsgen.impl.DSGenReferenceImpl
	 * @see com.opcoach.generator.ecore.dsgen.impl.DataSampleGenPackageImpl#getDSGenReference()
	 * @generated
	 */
	int DS_GEN_REFERENCE = 12;

	/**
	 * The feature id for the '<em><b>Nullable Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_REFERENCE__NULLABLE_VALUE = DS_GEN_FEATURE__NULLABLE_VALUE;

	/**
	 * The feature id for the '<em><b>Nullable Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_REFERENCE__NULLABLE_PERCENT = DS_GEN_FEATURE__NULLABLE_PERCENT;

	/**
	 * The feature id for the '<em><b>Dsgen Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_REFERENCE__DSGEN_CLASS = DS_GEN_FEATURE__DSGEN_CLASS;

	/**
	 * The feature id for the '<em><b>Ecore Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_REFERENCE__ECORE_FEATURE = DS_GEN_FEATURE__ECORE_FEATURE;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_REFERENCE__GENERATOR = DS_GEN_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DS Gen Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_GEN_REFERENCE_FEATURE_COUNT = DS_GEN_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.opcoach.generator.ecore.dsgen.DSGenRuntimeVersion <em>DS Gen Runtime Version</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.generator.ecore.dsgen.DSGenRuntimeVersion
	 * @see com.opcoach.generator.ecore.dsgen.impl.DataSampleGenPackageImpl#getDSGenRuntimeVersion()
	 * @generated
	 */
	int DS_GEN_RUNTIME_VERSION = 13;

	/**
	 * The meta object id for the '{@link com.opcoach.generator.ecore.dsgen.DSGenJDKLevel <em>DS Gen JDK Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.generator.ecore.dsgen.DSGenJDKLevel
	 * @see com.opcoach.generator.ecore.dsgen.impl.DataSampleGenPackageImpl#getDSGenJDKLevel()
	 * @generated
	 */
	int DS_GEN_JDK_LEVEL = 14;

	/**
	 * The meta object id for the '{@link com.opcoach.generator.ecore.dsgen.DSGenDelegationKind <em>DS Gen Delegation Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.generator.ecore.dsgen.DSGenDelegationKind
	 * @see com.opcoach.generator.ecore.dsgen.impl.DataSampleGenPackageImpl#getDSGenDelegationKind()
	 * @generated
	 */
	int DS_GEN_DELEGATION_KIND = 15;

	/**
	 * The meta object id for the '{@link com.opcoach.generator.ecore.dsgen.DSGenPropertyKind <em>DS Gen Property Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.generator.ecore.dsgen.DSGenPropertyKind
	 * @see com.opcoach.generator.ecore.dsgen.impl.DataSampleGenPackageImpl#getDSGenPropertyKind()
	 * @generated
	 */
	int DS_GEN_PROPERTY_KIND = 16;

	/**
	 * The meta object id for the '{@link com.opcoach.generator.ecore.dsgen.DSGenResourceKind <em>DS Gen Resource Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.generator.ecore.dsgen.DSGenResourceKind
	 * @see com.opcoach.generator.ecore.dsgen.impl.DataSampleGenPackageImpl#getDSGenResourceKind()
	 * @generated
	 */
	int DS_GEN_RESOURCE_KIND = 17;


	/**
	 * Returns the meta object for class '{@link com.opcoach.generator.ecore.dsgen.DSGenModel <em>DS Gen Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DS Gen Model</em>'.
	 * @see com.opcoach.generator.ecore.dsgen.DSGenModel
	 * @generated
	 */
	EClass getDSGenModel();

	/**
	 * Returns the meta object for the containment reference list '{@link com.opcoach.generator.ecore.dsgen.DSGenModel#getDsgenPackages <em>Dsgen Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dsgen Packages</em>'.
	 * @see com.opcoach.generator.ecore.dsgen.DSGenModel#getDsgenPackages()
	 * @see #getDSGenModel()
	 * @generated
	 */
	EReference getDSGenModel_DsgenPackages();

	/**
	 * Returns the meta object for class '{@link com.opcoach.generator.ecore.dsgen.DSGenPackage <em>DS Gen Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DS Gen Package</em>'.
	 * @see com.opcoach.generator.ecore.dsgen.DSGenPackage
	 * @generated
	 */
	EClass getDSGenPackage();

	/**
	 * Returns the meta object for the reference '{@link com.opcoach.generator.ecore.dsgen.DSGenPackage#getEcorePackage <em>Ecore Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ecore Package</em>'.
	 * @see com.opcoach.generator.ecore.dsgen.DSGenPackage#getEcorePackage()
	 * @see #getDSGenPackage()
	 * @generated
	 */
	EReference getDSGenPackage_EcorePackage();

	/**
	 * Returns the meta object for the container reference '{@link com.opcoach.generator.ecore.dsgen.DSGenPackage#getDsgenModel <em>Dsgen Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Dsgen Model</em>'.
	 * @see com.opcoach.generator.ecore.dsgen.DSGenPackage#getDsgenModel()
	 * @see #getDSGenPackage()
	 * @generated
	 */
	EReference getDSGenPackage_DsgenModel();

	/**
	 * Returns the meta object for the containment reference list '{@link com.opcoach.generator.ecore.dsgen.DSGenPackage#getDsgenClassifiers <em>Dsgen Classifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dsgen Classifiers</em>'.
	 * @see com.opcoach.generator.ecore.dsgen.DSGenPackage#getDsgenClassifiers()
	 * @see #getDSGenPackage()
	 * @generated
	 */
	EReference getDSGenPackage_DsgenClassifiers();

	/**
	 * Returns the meta object for class '{@link com.opcoach.generator.ecore.dsgen.DSGenClass <em>DS Gen Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DS Gen Class</em>'.
	 * @see com.opcoach.generator.ecore.dsgen.DSGenClass
	 * @generated
	 */
	EClass getDSGenClass();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.generator.ecore.dsgen.DSGenClass#getInstanceNumber <em>Instance Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Number</em>'.
	 * @see com.opcoach.generator.ecore.dsgen.DSGenClass#getInstanceNumber()
	 * @see #getDSGenClass()
	 * @generated
	 */
	EAttribute getDSGenClass_InstanceNumber();

	/**
	 * Returns the meta object for class '{@link com.opcoach.generator.ecore.dsgen.DSGenFeature <em>DS Gen Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DS Gen Feature</em>'.
	 * @see com.opcoach.generator.ecore.dsgen.DSGenFeature
	 * @generated
	 */
	EClass getDSGenFeature();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.generator.ecore.dsgen.DSGenFeature#isNullableValue <em>Nullable Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable Value</em>'.
	 * @see com.opcoach.generator.ecore.dsgen.DSGenFeature#isNullableValue()
	 * @see #getDSGenFeature()
	 * @generated
	 */
	EAttribute getDSGenFeature_NullableValue();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.generator.ecore.dsgen.DSGenFeature#getNullablePercent <em>Nullable Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable Percent</em>'.
	 * @see com.opcoach.generator.ecore.dsgen.DSGenFeature#getNullablePercent()
	 * @see #getDSGenFeature()
	 * @generated
	 */
	EAttribute getDSGenFeature_NullablePercent();

	/**
	 * Returns the meta object for the container reference '{@link com.opcoach.generator.ecore.dsgen.DSGenFeature#getDsgenClass <em>Dsgen Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Dsgen Class</em>'.
	 * @see com.opcoach.generator.ecore.dsgen.DSGenFeature#getDsgenClass()
	 * @see #getDSGenFeature()
	 * @generated
	 */
	EReference getDSGenFeature_DsgenClass();

	/**
	 * Returns the meta object for the reference '{@link com.opcoach.generator.ecore.dsgen.DSGenFeature#getEcoreFeature <em>Ecore Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ecore Feature</em>'.
	 * @see com.opcoach.generator.ecore.dsgen.DSGenFeature#getEcoreFeature()
	 * @see #getDSGenFeature()
	 * @generated
	 */
	EReference getDSGenFeature_EcoreFeature();

	/**
	 * Returns the meta object for class '{@link com.opcoach.generator.ecore.dsgen.DSGenBase <em>DS Gen Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DS Gen Base</em>'.
	 * @see com.opcoach.generator.ecore.dsgen.DSGenBase
	 * @generated
	 */
	EClass getDSGenBase();

	/**
	 * Returns the meta object for class '{@link com.opcoach.generator.ecore.dsgen.DSGenEnumLiteral <em>DS Gen Enum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DS Gen Enum Literal</em>'.
	 * @see com.opcoach.generator.ecore.dsgen.DSGenEnumLiteral
	 * @generated
	 */
	EClass getDSGenEnumLiteral();

	/**
	 * Returns the meta object for class '{@link com.opcoach.generator.ecore.dsgen.DSGenClassifier <em>DS Gen Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DS Gen Classifier</em>'.
	 * @see com.opcoach.generator.ecore.dsgen.DSGenClassifier
	 * @generated
	 */
	EClass getDSGenClassifier();

	/**
	 * Returns the meta object for the reference '{@link com.opcoach.generator.ecore.dsgen.DSGenClassifier#getEcoreClass <em>Ecore Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ecore Class</em>'.
	 * @see com.opcoach.generator.ecore.dsgen.DSGenClassifier#getEcoreClass()
	 * @see #getDSGenClassifier()
	 * @generated
	 */
	EReference getDSGenClassifier_EcoreClass();

	/**
	 * Returns the meta object for the containment reference list '{@link com.opcoach.generator.ecore.dsgen.DSGenClassifier#getDsgenFeatures <em>Dsgen Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dsgen Features</em>'.
	 * @see com.opcoach.generator.ecore.dsgen.DSGenClassifier#getDsgenFeatures()
	 * @see #getDSGenClassifier()
	 * @generated
	 */
	EReference getDSGenClassifier_DsgenFeatures();

	/**
	 * Returns the meta object for the container reference '{@link com.opcoach.generator.ecore.dsgen.DSGenClassifier#getDsgenPackage <em>Dsgen Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Dsgen Package</em>'.
	 * @see com.opcoach.generator.ecore.dsgen.DSGenClassifier#getDsgenPackage()
	 * @see #getDSGenClassifier()
	 * @generated
	 */
	EReference getDSGenClassifier_DsgenPackage();

	/**
	 * Returns the meta object for class '{@link com.opcoach.generator.ecore.dsgen.DSGenDataType <em>DS Gen Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DS Gen Data Type</em>'.
	 * @see com.opcoach.generator.ecore.dsgen.DSGenDataType
	 * @generated
	 */
	EClass getDSGenDataType();

	/**
	 * Returns the meta object for class '{@link com.opcoach.generator.ecore.dsgen.DSGenTypedElement <em>DS Gen Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DS Gen Typed Element</em>'.
	 * @see com.opcoach.generator.ecore.dsgen.DSGenTypedElement
	 * @generated
	 */
	EClass getDSGenTypedElement();

	/**
	 * Returns the meta object for class '{@link com.opcoach.generator.ecore.dsgen.DSGenAnnotation <em>DS Gen Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DS Gen Annotation</em>'.
	 * @see com.opcoach.generator.ecore.dsgen.DSGenAnnotation
	 * @generated
	 */
	EClass getDSGenAnnotation();

	/**
	 * Returns the meta object for class '{@link com.opcoach.generator.ecore.dsgen.DSGenTypeParameter <em>DS Gen Type Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DS Gen Type Parameter</em>'.
	 * @see com.opcoach.generator.ecore.dsgen.DSGenTypeParameter
	 * @generated
	 */
	EClass getDSGenTypeParameter();

	/**
	 * Returns the meta object for class '{@link com.opcoach.generator.ecore.dsgen.DSGenAttribute <em>DS Gen Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DS Gen Attribute</em>'.
	 * @see com.opcoach.generator.ecore.dsgen.DSGenAttribute
	 * @generated
	 */
	EClass getDSGenAttribute();

	/**
	 * Returns the meta object for the containment reference '{@link com.opcoach.generator.ecore.dsgen.DSGenAttribute#getGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generator</em>'.
	 * @see com.opcoach.generator.ecore.dsgen.DSGenAttribute#getGenerator()
	 * @see #getDSGenAttribute()
	 * @generated
	 */
	EReference getDSGenAttribute_Generator();

	/**
	 * Returns the meta object for class '{@link com.opcoach.generator.ecore.dsgen.DSGenReference <em>DS Gen Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DS Gen Reference</em>'.
	 * @see com.opcoach.generator.ecore.dsgen.DSGenReference
	 * @generated
	 */
	EClass getDSGenReference();

	/**
	 * Returns the meta object for the containment reference '{@link com.opcoach.generator.ecore.dsgen.DSGenReference#getGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generator</em>'.
	 * @see com.opcoach.generator.ecore.dsgen.DSGenReference#getGenerator()
	 * @see #getDSGenReference()
	 * @generated
	 */
	EReference getDSGenReference_Generator();

	/**
	 * Returns the meta object for enum '{@link com.opcoach.generator.ecore.dsgen.DSGenRuntimeVersion <em>DS Gen Runtime Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DS Gen Runtime Version</em>'.
	 * @see com.opcoach.generator.ecore.dsgen.DSGenRuntimeVersion
	 * @generated
	 */
	EEnum getDSGenRuntimeVersion();

	/**
	 * Returns the meta object for enum '{@link com.opcoach.generator.ecore.dsgen.DSGenJDKLevel <em>DS Gen JDK Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DS Gen JDK Level</em>'.
	 * @see com.opcoach.generator.ecore.dsgen.DSGenJDKLevel
	 * @generated
	 */
	EEnum getDSGenJDKLevel();

	/**
	 * Returns the meta object for enum '{@link com.opcoach.generator.ecore.dsgen.DSGenDelegationKind <em>DS Gen Delegation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DS Gen Delegation Kind</em>'.
	 * @see com.opcoach.generator.ecore.dsgen.DSGenDelegationKind
	 * @generated
	 */
	EEnum getDSGenDelegationKind();

	/**
	 * Returns the meta object for enum '{@link com.opcoach.generator.ecore.dsgen.DSGenPropertyKind <em>DS Gen Property Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DS Gen Property Kind</em>'.
	 * @see com.opcoach.generator.ecore.dsgen.DSGenPropertyKind
	 * @generated
	 */
	EEnum getDSGenPropertyKind();

	/**
	 * Returns the meta object for enum '{@link com.opcoach.generator.ecore.dsgen.DSGenResourceKind <em>DS Gen Resource Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DS Gen Resource Kind</em>'.
	 * @see com.opcoach.generator.ecore.dsgen.DSGenResourceKind
	 * @generated
	 */
	EEnum getDSGenResourceKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataSampleGenFactory getDataSampleGenFactory();

} //DataSampleGenPackage
