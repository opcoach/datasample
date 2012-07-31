/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.dsgen.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import com.opcoach.dsgen.DSGenAnnotation;
import com.opcoach.dsgen.DSGenAttribute;
import com.opcoach.dsgen.DSGenBase;
import com.opcoach.dsgen.DSGenChild;
import com.opcoach.dsgen.DSGenClass;
import com.opcoach.dsgen.DSGenClassifier;
import com.opcoach.dsgen.DSGenDataType;
import com.opcoach.dsgen.DSGenDelegationKind;
import com.opcoach.dsgen.DSGenEnum;
import com.opcoach.dsgen.DSGenEnumLiteral;
import com.opcoach.dsgen.DSGenFeature;
import com.opcoach.dsgen.DSGenJDKLevel;
import com.opcoach.dsgen.DSGenModel;
import com.opcoach.dsgen.DSGenPackage;
import com.opcoach.dsgen.DSGenPropertyKind;
import com.opcoach.dsgen.DSGenReference;
import com.opcoach.dsgen.DSGenResourceKind;
import com.opcoach.dsgen.DSGenRuntimeVersion;
import com.opcoach.dsgen.DSGenTypeParameter;
import com.opcoach.dsgen.DSGenTypedElement;
import com.opcoach.dsgen.DataSampleGenFactory;
import com.opcoach.dsgen.DataSampleGenPackage;
import com.opcoach.generator.GeneratorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataSampleGenPackageImpl extends EPackageImpl implements DataSampleGenPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsGenModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsGenPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsGenClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsGenFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsGenBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsGenEnumLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsGenClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsGenDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsGenTypedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsGenAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsGenTypeParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsGenAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsGenReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsGenEnumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsGenChildEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dsGenRuntimeVersionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dsGenJDKLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dsGenDelegationKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dsGenPropertyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dsGenResourceKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.opcoach.dsgen.DataSampleGenPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DataSampleGenPackageImpl()
	{
		super(eNS_URI, DataSampleGenFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DataSampleGenPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DataSampleGenPackage init()
	{
		if (isInited) return (DataSampleGenPackage)EPackage.Registry.INSTANCE.getEPackage(DataSampleGenPackage.eNS_URI);

		// Obtain or create and register package
		DataSampleGenPackageImpl theDataSampleGenPackage = (DataSampleGenPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DataSampleGenPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DataSampleGenPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		GeneratorPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDataSampleGenPackage.createPackageContents();

		// Initialize created meta-data
		theDataSampleGenPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDataSampleGenPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DataSampleGenPackage.eNS_URI, theDataSampleGenPackage);
		return theDataSampleGenPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSGenModel()
	{
		return dsGenModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSGenModel_DsgenPackages()
	{
		return (EReference)dsGenModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSGenPackage()
	{
		return dsGenPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSGenPackage_EcorePackage()
	{
		return (EReference)dsGenPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSGenPackage_DsgenModel()
	{
		return (EReference)dsGenPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSGenPackage_DsgenClassifiers()
	{
		return (EReference)dsGenPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSGenClass()
	{
		return dsGenClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDSGenClass_InstanceNumber()
	{
		return (EAttribute)dsGenClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDSGenClass_RootObject() {
		return (EAttribute)dsGenClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDSGenClass_NbAssociationRefTo() {
		return (EAttribute)dsGenClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSGenClass_Children()
	{
		return (EReference)dsGenClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSGenFeature()
	{
		return dsGenFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDSGenFeature_NullableValue()
	{
		return (EAttribute)dsGenFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDSGenFeature_NullablePercent()
	{
		return (EAttribute)dsGenFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSGenFeature_DsgenClass()
	{
		return (EReference)dsGenFeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSGenFeature_EcoreFeature()
	{
		return (EReference)dsGenFeatureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSGenBase()
	{
		return dsGenBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSGenEnumLiteral()
	{
		return dsGenEnumLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSGenClassifier()
	{
		return dsGenClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSGenClassifier_EcoreClass()
	{
		return (EReference)dsGenClassifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSGenClassifier_DsgenFeatures()
	{
		return (EReference)dsGenClassifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSGenClassifier_DsgenPackage()
	{
		return (EReference)dsGenClassifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSGenDataType()
	{
		return dsGenDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSGenDataType_DataType()
	{
		return (EReference)dsGenDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSGenTypedElement()
	{
		return dsGenTypedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSGenAnnotation()
	{
		return dsGenAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSGenTypeParameter()
	{
		return dsGenTypeParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSGenAttribute()
	{
		return dsGenAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSGenAttribute_Generator()
	{
		return (EReference)dsGenAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSGenReference()
	{
		return dsGenReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSGenReference_Generator()
	{
		return (EReference)dsGenReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSGenEnum()
	{
		return dsGenEnumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSGenEnum_EcoreEnum()
	{
		return (EReference)dsGenEnumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSGenChild()
	{
		return dsGenChildEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSGenChild_DsgenClass()
	{
		return (EReference)dsGenChildEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDSGenChild_Single()
	{
		return (EAttribute)dsGenChildEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSGenChild_OppositeReference()
	{
		return (EReference)dsGenChildEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSGenChild_SourceReference()
	{
		return (EReference)dsGenChildEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDSGenRuntimeVersion()
	{
		return dsGenRuntimeVersionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDSGenJDKLevel()
	{
		return dsGenJDKLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDSGenDelegationKind()
	{
		return dsGenDelegationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDSGenPropertyKind()
	{
		return dsGenPropertyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDSGenResourceKind()
	{
		return dsGenResourceKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSampleGenFactory getDataSampleGenFactory()
	{
		return (DataSampleGenFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents()
	{
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		dsGenModelEClass = createEClass(DS_GEN_MODEL);
		createEReference(dsGenModelEClass, DS_GEN_MODEL__DSGEN_PACKAGES);

		dsGenPackageEClass = createEClass(DS_GEN_PACKAGE);
		createEReference(dsGenPackageEClass, DS_GEN_PACKAGE__ECORE_PACKAGE);
		createEReference(dsGenPackageEClass, DS_GEN_PACKAGE__DSGEN_MODEL);
		createEReference(dsGenPackageEClass, DS_GEN_PACKAGE__DSGEN_CLASSIFIERS);

		dsGenClassEClass = createEClass(DS_GEN_CLASS);
		createEAttribute(dsGenClassEClass, DS_GEN_CLASS__INSTANCE_NUMBER);
		createEAttribute(dsGenClassEClass, DS_GEN_CLASS__ROOT_OBJECT);
		createEAttribute(dsGenClassEClass, DS_GEN_CLASS__NB_ASSOCIATION_REF_TO);
		createEReference(dsGenClassEClass, DS_GEN_CLASS__CHILDREN);

		dsGenFeatureEClass = createEClass(DS_GEN_FEATURE);
		createEAttribute(dsGenFeatureEClass, DS_GEN_FEATURE__NULLABLE_VALUE);
		createEAttribute(dsGenFeatureEClass, DS_GEN_FEATURE__NULLABLE_PERCENT);
		createEReference(dsGenFeatureEClass, DS_GEN_FEATURE__DSGEN_CLASS);
		createEReference(dsGenFeatureEClass, DS_GEN_FEATURE__ECORE_FEATURE);

		dsGenBaseEClass = createEClass(DS_GEN_BASE);

		dsGenEnumLiteralEClass = createEClass(DS_GEN_ENUM_LITERAL);

		dsGenClassifierEClass = createEClass(DS_GEN_CLASSIFIER);
		createEReference(dsGenClassifierEClass, DS_GEN_CLASSIFIER__ECORE_CLASS);
		createEReference(dsGenClassifierEClass, DS_GEN_CLASSIFIER__DSGEN_FEATURES);
		createEReference(dsGenClassifierEClass, DS_GEN_CLASSIFIER__DSGEN_PACKAGE);

		dsGenDataTypeEClass = createEClass(DS_GEN_DATA_TYPE);
		createEReference(dsGenDataTypeEClass, DS_GEN_DATA_TYPE__DATA_TYPE);

		dsGenTypedElementEClass = createEClass(DS_GEN_TYPED_ELEMENT);

		dsGenAnnotationEClass = createEClass(DS_GEN_ANNOTATION);

		dsGenTypeParameterEClass = createEClass(DS_GEN_TYPE_PARAMETER);

		dsGenAttributeEClass = createEClass(DS_GEN_ATTRIBUTE);
		createEReference(dsGenAttributeEClass, DS_GEN_ATTRIBUTE__GENERATOR);

		dsGenReferenceEClass = createEClass(DS_GEN_REFERENCE);
		createEReference(dsGenReferenceEClass, DS_GEN_REFERENCE__GENERATOR);

		dsGenEnumEClass = createEClass(DS_GEN_ENUM);
		createEReference(dsGenEnumEClass, DS_GEN_ENUM__ECORE_ENUM);

		dsGenChildEClass = createEClass(DS_GEN_CHILD);
		createEReference(dsGenChildEClass, DS_GEN_CHILD__DSGEN_CLASS);
		createEAttribute(dsGenChildEClass, DS_GEN_CHILD__SINGLE);
		createEReference(dsGenChildEClass, DS_GEN_CHILD__SOURCE_REFERENCE);
		createEReference(dsGenChildEClass, DS_GEN_CHILD__OPPOSITE_REFERENCE);

		// Create enums
		dsGenRuntimeVersionEEnum = createEEnum(DS_GEN_RUNTIME_VERSION);
		dsGenJDKLevelEEnum = createEEnum(DS_GEN_JDK_LEVEL);
		dsGenDelegationKindEEnum = createEEnum(DS_GEN_DELEGATION_KIND);
		dsGenPropertyKindEEnum = createEEnum(DS_GEN_PROPERTY_KIND);
		dsGenResourceKindEEnum = createEEnum(DS_GEN_RESOURCE_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents()
	{
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		GeneratorPackage theGeneratorPackage = (GeneratorPackage)EPackage.Registry.INSTANCE.getEPackage(GeneratorPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dsGenModelEClass.getESuperTypes().add(this.getDSGenBase());
		dsGenPackageEClass.getESuperTypes().add(this.getDSGenBase());
		dsGenClassEClass.getESuperTypes().add(this.getDSGenClassifier());
		dsGenFeatureEClass.getESuperTypes().add(this.getDSGenTypedElement());
		dsGenEnumLiteralEClass.getESuperTypes().add(this.getDSGenBase());
		dsGenClassifierEClass.getESuperTypes().add(this.getDSGenBase());
		dsGenDataTypeEClass.getESuperTypes().add(this.getDSGenClassifier());
		dsGenTypedElementEClass.getESuperTypes().add(this.getDSGenBase());
		dsGenAnnotationEClass.getESuperTypes().add(this.getDSGenBase());
		dsGenTypeParameterEClass.getESuperTypes().add(this.getDSGenBase());
		dsGenAttributeEClass.getESuperTypes().add(this.getDSGenFeature());
		dsGenReferenceEClass.getESuperTypes().add(this.getDSGenFeature());
		dsGenEnumEClass.getESuperTypes().add(this.getDSGenDataType());

		// Initialize classes and features; add operations and parameters
		initEClass(dsGenModelEClass, DSGenModel.class, "DSGenModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDSGenModel_DsgenPackages(), this.getDSGenPackage(), this.getDSGenPackage_DsgenModel(), "dsgenPackages", null, 0, -1, DSGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dsGenPackageEClass, DSGenPackage.class, "DSGenPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDSGenPackage_EcorePackage(), theEcorePackage.getEPackage(), null, "ecorePackage", null, 1, 1, DSGenPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDSGenPackage_DsgenModel(), this.getDSGenModel(), this.getDSGenModel_DsgenPackages(), "dsgenModel", null, 1, 1, DSGenPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDSGenPackage_DsgenClassifiers(), this.getDSGenClassifier(), this.getDSGenClassifier_DsgenPackage(), "dsgenClassifiers", null, 0, -1, DSGenPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dsGenClassEClass, DSGenClass.class, "DSGenClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDSGenClass_InstanceNumber(), ecorePackage.getEInt(), "instanceNumber", "50", 0, 1, DSGenClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDSGenClass_RootObject(), ecorePackage.getEBoolean(), "rootObject", "false", 0, 1, DSGenClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDSGenClass_NbAssociationRefTo(), ecorePackage.getEInt(), "nbAssociationRefTo", "0", 0, 1, DSGenClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDSGenClass_Children(), this.getDSGenChild(), null, "children", null, 0, -1, DSGenClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dsGenFeatureEClass, DSGenFeature.class, "DSGenFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDSGenFeature_NullableValue(), ecorePackage.getEBoolean(), "nullableValue", "false", 0, 1, DSGenFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDSGenFeature_NullablePercent(), ecorePackage.getEInt(), "nullablePercent", "10", 0, 1, DSGenFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDSGenFeature_DsgenClass(), this.getDSGenClassifier(), this.getDSGenClassifier_DsgenFeatures(), "dsgenClass", null, 1, 1, DSGenFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDSGenFeature_EcoreFeature(), theEcorePackage.getEStructuralFeature(), null, "ecoreFeature", null, 1, 1, DSGenFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dsGenBaseEClass, DSGenBase.class, "DSGenBase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dsGenEnumLiteralEClass, DSGenEnumLiteral.class, "DSGenEnumLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dsGenClassifierEClass, DSGenClassifier.class, "DSGenClassifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDSGenClassifier_EcoreClass(), theEcorePackage.getEClass(), null, "ecoreClass", null, 1, 1, DSGenClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDSGenClassifier_DsgenFeatures(), this.getDSGenFeature(), this.getDSGenFeature_DsgenClass(), "dsgenFeatures", null, 0, -1, DSGenClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDSGenClassifier_DsgenPackage(), this.getDSGenPackage(), this.getDSGenPackage_DsgenClassifiers(), "dsgenPackage", null, 1, 1, DSGenClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dsGenDataTypeEClass, DSGenDataType.class, "DSGenDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDSGenDataType_DataType(), theEcorePackage.getEDataType(), null, "dataType", null, 1, 1, DSGenDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dsGenTypedElementEClass, DSGenTypedElement.class, "DSGenTypedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dsGenAnnotationEClass, DSGenAnnotation.class, "DSGenAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dsGenTypeParameterEClass, DSGenTypeParameter.class, "DSGenTypeParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dsGenAttributeEClass, DSGenAttribute.class, "DSGenAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		EGenericType g1 = createEGenericType(theGeneratorPackage.getValueGenerator());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getDSGenAttribute_Generator(), g1, null, "generator", null, 0, 1, DSGenAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dsGenReferenceEClass, DSGenReference.class, "DSGenReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(theGeneratorPackage.getReferenceGenerator());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getDSGenReference_Generator(), g1, null, "generator", null, 0, 1, DSGenReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dsGenEnumEClass, DSGenEnum.class, "DSGenEnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDSGenEnum_EcoreEnum(), theEcorePackage.getEEnum(), null, "ecoreEnum", null, 1, 1, DSGenEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dsGenChildEClass, DSGenChild.class, "DSGenChild", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDSGenChild_DsgenClass(), this.getDSGenClass(), null, "dsgenClass", null, 1, 1, DSGenChild.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDSGenChild_Single(), ecorePackage.getEBoolean(), "single", null, 0, 1, DSGenChild.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDSGenChild_SourceReference(), this.getDSGenReference(), null, "sourceReference", null, 1, 1, DSGenChild.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDSGenChild_OppositeReference(), this.getDSGenReference(), null, "oppositeReference", null, 0, 1, DSGenChild.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(dsGenRuntimeVersionEEnum, DSGenRuntimeVersion.class, "DSGenRuntimeVersion");

		initEEnum(dsGenJDKLevelEEnum, DSGenJDKLevel.class, "DSGenJDKLevel");

		initEEnum(dsGenDelegationKindEEnum, DSGenDelegationKind.class, "DSGenDelegationKind");

		initEEnum(dsGenPropertyKindEEnum, DSGenPropertyKind.class, "DSGenPropertyKind");

		initEEnum(dsGenResourceKindEEnum, DSGenResourceKind.class, "DSGenResourceKind");

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// dsg
		createDsgAnnotations();
		// dsg.name
		createDsg_1Annotations();
	}

	/**
	 * Initializes the annotations for <b>dsg</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDsgAnnotations()
	{
		String source = "dsg";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });	
	}

	/**
	 * Initializes the annotations for <b>dsg.name</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDsg_1Annotations()
	{
		String source = "dsg.name";			
		addAnnotation
		  (dsGenPackageEClass, 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });
	}

} //DataSampleGenPackageImpl
