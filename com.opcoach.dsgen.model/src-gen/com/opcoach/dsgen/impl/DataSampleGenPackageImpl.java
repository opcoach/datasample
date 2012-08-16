/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.dsgen.impl;

import com.opcoach.dsgen.BadValueGeneratorRegistry;
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
import com.opcoach.dsgen.generator.DSGenGeneratorPackage;
import com.opcoach.dsgen.generator.impl.DSGenGeneratorPackageImpl;
import com.opcoach.generator.GeneratorPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class DataSampleGenPackageImpl extends EPackageImpl implements DataSampleGenPackage
{
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "© OPCoach 2012";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsGenModelEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsGenPackageEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsGenClassEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsGenFeatureEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsGenBaseEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsGenEnumLiteralEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsGenClassifierEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsGenDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsGenTypedElementEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsGenAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsGenTypeParameterEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsGenAttributeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsGenReferenceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsGenEnumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass badValueGeneratorRegistryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dsGenRuntimeVersionEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dsGenJDKLevelEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dsGenDelegationKindEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dsGenPropertyKindEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dsGenResourceKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory
	 * method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model,
	 * and for any others upon which it depends.
	 * 
	 * <p>
	 * This method is used to initialize {@link DataSampleGenPackage#eINSTANCE}
	 * when that field is accessed. Clients should not invoke it directly.
	 * Instead, they should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DataSampleGenPackage init()
	{
		if (isInited)
			return (DataSampleGenPackage) EPackage.Registry.INSTANCE.getEPackage(DataSampleGenPackage.eNS_URI);

		// Obtain or create and register package
		DataSampleGenPackageImpl theDataSampleGenPackage = (DataSampleGenPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DataSampleGenPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new DataSampleGenPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		GeneratorPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		DSGenGeneratorPackageImpl theDSGenGeneratorPackage = (DSGenGeneratorPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(DSGenGeneratorPackage.eNS_URI) instanceof DSGenGeneratorPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(DSGenGeneratorPackage.eNS_URI) : DSGenGeneratorPackage.eINSTANCE);

		// Create package meta-data objects
		theDataSampleGenPackage.createPackageContents();
		theDSGenGeneratorPackage.createPackageContents();

		// Initialize created meta-data
		theDataSampleGenPackage.initializePackageContents();
		theDSGenGeneratorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDataSampleGenPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DataSampleGenPackage.eNS_URI, theDataSampleGenPackage);
		return theDataSampleGenPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSGenModel()
	{
		return dsGenModelEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSGenModel_DsgenPackages()
	{
		return (EReference) dsGenModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDSGenModel_RandomSeed()
	{
		return (EAttribute) dsGenModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDSGenModel_Name()
	{
		return (EAttribute) dsGenModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDSGenModel_Language()
	{
		return (EAttribute) dsGenModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSGenModel_BadGenerators()
	{
		return (EReference) dsGenModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSGenPackage()
	{
		return dsGenPackageEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSGenPackage_EcorePackage()
	{
		return (EReference) dsGenPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSGenPackage_DsgenModel()
	{
		return (EReference) dsGenPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSGenPackage_DsgenClassifiers()
	{
		return (EReference) dsGenPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSGenClass()
	{
		return dsGenClassEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDSGenClass_RootObject()
	{
		return (EAttribute) dsGenClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDSGenClass_NbAssociationRefTo()
	{
		return (EAttribute) dsGenClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSGenClass_Generator()
	{
		return (EReference) dsGenClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSGenFeature()
	{
		return dsGenFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSGenFeature_DsgenClass()
	{
		return (EReference) dsGenFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSGenFeature_EcoreFeature()
	{
		return (EReference) dsGenFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSGenFeature_Generator()
	{
		return (EReference) dsGenFeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSGenBase()
	{
		return dsGenBaseEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSGenEnumLiteral()
	{
		return dsGenEnumLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSGenClassifier()
	{
		return dsGenClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSGenClassifier_EcoreClass()
	{
		return (EReference) dsGenClassifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSGenClassifier_DsgenFeatures()
	{
		return (EReference) dsGenClassifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSGenClassifier_DsgenPackage()
	{
		return (EReference) dsGenClassifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSGenDataType()
	{
		return dsGenDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSGenDataType_DataType()
	{
		return (EReference) dsGenDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSGenTypedElement()
	{
		return dsGenTypedElementEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSGenAnnotation()
	{
		return dsGenAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSGenTypeParameter()
	{
		return dsGenTypeParameterEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSGenAttribute()
	{
		return dsGenAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	public EReference getDSGenReference_TargetDSGenClass()
	{
		return (EReference) dsGenReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSGenEnum()
	{
		return dsGenEnumEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSGenEnum_EcoreEnum()
	{
		return (EReference) dsGenEnumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBadValueGeneratorRegistry()
	{
		return badValueGeneratorRegistryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBadValueGeneratorRegistry_Generators()
	{
		return (EReference) badValueGeneratorRegistryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDSGenRuntimeVersion()
	{
		return dsGenRuntimeVersionEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDSGenJDKLevel()
	{
		return dsGenJDKLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDSGenDelegationKind()
	{
		return dsGenDelegationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDSGenPropertyKind()
	{
		return dsGenPropertyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDSGenResourceKind()
	{
		return dsGenResourceKindEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DataSampleGenFactory getDataSampleGenFactory()
	{
		return (DataSampleGenFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		dsGenModelEClass = createEClass(DS_GEN_MODEL);
		createEReference(dsGenModelEClass, DS_GEN_MODEL__DSGEN_PACKAGES);
		createEAttribute(dsGenModelEClass, DS_GEN_MODEL__RANDOM_SEED);
		createEAttribute(dsGenModelEClass, DS_GEN_MODEL__NAME);
		createEAttribute(dsGenModelEClass, DS_GEN_MODEL__LANGUAGE);
		createEReference(dsGenModelEClass, DS_GEN_MODEL__BAD_GENERATORS);

		dsGenPackageEClass = createEClass(DS_GEN_PACKAGE);
		createEReference(dsGenPackageEClass, DS_GEN_PACKAGE__ECORE_PACKAGE);
		createEReference(dsGenPackageEClass, DS_GEN_PACKAGE__DSGEN_MODEL);
		createEReference(dsGenPackageEClass, DS_GEN_PACKAGE__DSGEN_CLASSIFIERS);

		dsGenClassEClass = createEClass(DS_GEN_CLASS);
		createEAttribute(dsGenClassEClass, DS_GEN_CLASS__ROOT_OBJECT);
		createEAttribute(dsGenClassEClass, DS_GEN_CLASS__NB_ASSOCIATION_REF_TO);
		createEReference(dsGenClassEClass, DS_GEN_CLASS__GENERATOR);

		dsGenFeatureEClass = createEClass(DS_GEN_FEATURE);
		createEReference(dsGenFeatureEClass, DS_GEN_FEATURE__DSGEN_CLASS);
		createEReference(dsGenFeatureEClass, DS_GEN_FEATURE__ECORE_FEATURE);
		createEReference(dsGenFeatureEClass, DS_GEN_FEATURE__GENERATOR);

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

		dsGenReferenceEClass = createEClass(DS_GEN_REFERENCE);
		createEReference(dsGenReferenceEClass, DS_GEN_REFERENCE__TARGET_DS_GEN_CLASS);

		dsGenEnumEClass = createEClass(DS_GEN_ENUM);
		createEReference(dsGenEnumEClass, DS_GEN_ENUM__ECORE_ENUM);

		badValueGeneratorRegistryEClass = createEClass(BAD_VALUE_GENERATOR_REGISTRY);
		createEReference(badValueGeneratorRegistryEClass, BAD_VALUE_GENERATOR_REGISTRY__GENERATORS);

		// Create enums
		dsGenRuntimeVersionEEnum = createEEnum(DS_GEN_RUNTIME_VERSION);
		dsGenJDKLevelEEnum = createEEnum(DS_GEN_JDK_LEVEL);
		dsGenDelegationKindEEnum = createEEnum(DS_GEN_DELEGATION_KIND);
		dsGenPropertyKindEEnum = createEEnum(DS_GEN_PROPERTY_KIND);
		dsGenResourceKindEEnum = createEEnum(DS_GEN_RESOURCE_KIND);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents()
	{
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		DSGenGeneratorPackage theDSGenGeneratorPackage = (DSGenGeneratorPackage) EPackage.Registry.INSTANCE
				.getEPackage(DSGenGeneratorPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		GeneratorPackage theGeneratorPackage = (GeneratorPackage) EPackage.Registry.INSTANCE.getEPackage(GeneratorPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theDSGenGeneratorPackage);

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
		initEReference(getDSGenModel_DsgenPackages(), this.getDSGenPackage(), this.getDSGenPackage_DsgenModel(), "dsgenPackages",
				null, 0, -1, DSGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDSGenModel_RandomSeed(), ecorePackage.getELong(), "randomSeed", null, 0, 1, DSGenModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDSGenModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, DSGenModel.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDSGenModel_Language(), ecorePackage.getEString(), "language", null, 0, 1, DSGenModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDSGenModel_BadGenerators(), this.getBadValueGeneratorRegistry(), null, "badGenerators", null, 1, 1,
				DSGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(dsGenModelEClass, this.getDSGenClass(), "getRoot", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dsGenPackageEClass, DSGenPackage.class, "DSGenPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDSGenPackage_EcorePackage(), theEcorePackage.getEPackage(), null, "ecorePackage", null, 1, 1,
				DSGenPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDSGenPackage_DsgenModel(), this.getDSGenModel(), this.getDSGenModel_DsgenPackages(), "dsgenModel", null,
				1, 1, DSGenPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDSGenPackage_DsgenClassifiers(), this.getDSGenClassifier(), this.getDSGenClassifier_DsgenPackage(),
				"dsgenClassifiers", null, 0, -1, DSGenPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dsGenClassEClass, DSGenClass.class, "DSGenClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDSGenClass_RootObject(), ecorePackage.getEBoolean(), "rootObject", "false", 0, 1, DSGenClass.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDSGenClass_NbAssociationRefTo(), ecorePackage.getEInt(), "nbAssociationRefTo", "0", 0, 1,
				DSGenClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED,
				IS_ORDERED);
		initEReference(getDSGenClass_Generator(), theDSGenGeneratorPackage.getEObjectGenerator(), null, "generator", null, 0, 1,
				DSGenClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dsGenFeatureEClass, DSGenFeature.class, "DSGenFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDSGenFeature_DsgenClass(), this.getDSGenClassifier(), this.getDSGenClassifier_DsgenFeatures(),
				"dsgenClass", null, 1, 1, DSGenFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDSGenFeature_EcoreFeature(), theEcorePackage.getEStructuralFeature(), null, "ecoreFeature", null, 1, 1,
				DSGenFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		EGenericType g1 = createEGenericType(theGeneratorPackage.getValueGenerator());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getDSGenFeature_Generator(), g1, null, "generator", null, 0, 1, DSGenFeature.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dsGenBaseEClass, DSGenBase.class, "DSGenBase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dsGenEnumLiteralEClass, DSGenEnumLiteral.class, "DSGenEnumLiteral", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(dsGenClassifierEClass, DSGenClassifier.class, "DSGenClassifier", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDSGenClassifier_EcoreClass(), theEcorePackage.getEClass(), null, "ecoreClass", null, 1, 1,
				DSGenClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDSGenClassifier_DsgenFeatures(), this.getDSGenFeature(), this.getDSGenFeature_DsgenClass(),
				"dsgenFeatures", null, 0, -1, DSGenClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDSGenClassifier_DsgenPackage(), this.getDSGenPackage(), this.getDSGenPackage_DsgenClassifiers(),
				"dsgenPackage", null, 1, 1, DSGenClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dsGenDataTypeEClass, DSGenDataType.class, "DSGenDataType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDSGenDataType_DataType(), theEcorePackage.getEDataType(), null, "dataType", null, 1, 1,
				DSGenDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dsGenTypedElementEClass, DSGenTypedElement.class, "DSGenTypedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(dsGenAnnotationEClass, DSGenAnnotation.class, "DSGenAnnotation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(dsGenTypeParameterEClass, DSGenTypeParameter.class, "DSGenTypeParameter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(dsGenAttributeEClass, DSGenAttribute.class, "DSGenAttribute", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(dsGenReferenceEClass, DSGenReference.class, "DSGenReference", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDSGenReference_TargetDSGenClass(), this.getDSGenClass(), null, "targetDSGenClass", null, 0, 1,
				DSGenReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dsGenEnumEClass, DSGenEnum.class, "DSGenEnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDSGenEnum_EcoreEnum(), theEcorePackage.getEEnum(), null, "ecoreEnum", null, 1, 1, DSGenEnum.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(badValueGeneratorRegistryEClass, BadValueGeneratorRegistry.class, "BadValueGeneratorRegistry", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(theGeneratorPackage.getValueGenerator());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getBadValueGeneratorRegistry_Generators(), g1, null, "generators", null, 0, -1,
				BadValueGeneratorRegistry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(dsGenRuntimeVersionEEnum, DSGenRuntimeVersion.class, "DSGenRuntimeVersion");

		initEEnum(dsGenJDKLevelEEnum, DSGenJDKLevel.class, "DSGenJDKLevel");

		initEEnum(dsGenDelegationKindEEnum, DSGenDelegationKind.class, "DSGenDelegationKind");

		initEEnum(dsGenPropertyKindEEnum, DSGenPropertyKind.class, "DSGenPropertyKind");

		initEEnum(dsGenResourceKindEEnum, DSGenResourceKind.class, "DSGenResourceKind");

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// dsg.name
		createDsgAnnotations();
	}

	/**
	 * Initializes the annotations for <b>dsg.name</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDsgAnnotations()
	{
		String source = "dsg.name";
		addAnnotation(dsGenPackageEClass, source, new String[] { "foo", "bar" });
	}

} // DataSampleGenPackageImpl
