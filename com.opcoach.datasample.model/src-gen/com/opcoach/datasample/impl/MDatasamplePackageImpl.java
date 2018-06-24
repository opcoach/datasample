/**
 */
package com.opcoach.datasample.impl;

import com.opcoach.datasample.DataSample;
import com.opcoach.datasample.EntityGenerator;
import com.opcoach.datasample.FieldGenerator;
import com.opcoach.datasample.Language;
import com.opcoach.datasample.MDatasampleFactory;
import com.opcoach.datasample.MDatasamplePackage;

import com.opcoach.generator.MGeneratorPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MDatasamplePackageImpl extends EPackageImpl implements MDatasamplePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSampleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum languageEEnum = null;

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
	 * @see com.opcoach.datasample.MDatasamplePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MDatasamplePackageImpl() {
		super(eNS_URI, MDatasampleFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MDatasamplePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MDatasamplePackage init() {
		if (isInited) return (MDatasamplePackage)EPackage.Registry.INSTANCE.getEPackage(MDatasamplePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDatasamplePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MDatasamplePackageImpl theDatasamplePackage = registeredDatasamplePackage instanceof MDatasamplePackageImpl ? (MDatasamplePackageImpl)registeredDatasamplePackage : new MDatasamplePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		MGeneratorPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDatasamplePackage.createPackageContents();

		// Initialize created meta-data
		theDatasamplePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDatasamplePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MDatasamplePackage.eNS_URI, theDatasamplePackage);
		return theDatasamplePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSample() {
		return dataSampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSample_Name() {
		return (EAttribute)dataSampleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSample_Seed() {
		return (EAttribute)dataSampleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSample_Language() {
		return (EAttribute)dataSampleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSample_PackageURI() {
		return (EAttribute)dataSampleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSample_Package() {
		return (EReference)dataSampleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSample_EntityGenerators() {
		return (EReference)dataSampleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSample_FieldGenerators() {
		return (EReference)dataSampleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSample_RootEntity() {
		return (EReference)dataSampleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSample_BadValueGeneratorNames() {
		return (EAttribute)dataSampleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityGenerator() {
		return entityGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityGenerator_Number() {
		return (EAttribute)entityGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityGenerator_EntityName() {
		return (EAttribute)entityGeneratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityGenerator_Entity() {
		return (EReference)entityGeneratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldGenerator() {
		return fieldGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldGenerator_EntityName() {
		return (EAttribute)fieldGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldGenerator_FieldName() {
		return (EAttribute)fieldGeneratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldGenerator_Generator() {
		return (EReference)fieldGeneratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldGenerator_StructuralFeature() {
		return (EReference)fieldGeneratorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldGenerator_ErrorRate() {
		return (EAttribute)fieldGeneratorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldGenerator_GeneratorName() {
		return (EAttribute)fieldGeneratorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldGenerator_ErrorGeneratorName() {
		return (EAttribute)fieldGeneratorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldGenerator_ErrorGenerator() {
		return (EReference)fieldGeneratorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLanguage() {
		return languageEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDatasampleFactory getDatasampleFactory() {
		return (MDatasampleFactory)getEFactoryInstance();
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
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		dataSampleEClass = createEClass(DATA_SAMPLE);
		createEAttribute(dataSampleEClass, DATA_SAMPLE__NAME);
		createEAttribute(dataSampleEClass, DATA_SAMPLE__SEED);
		createEAttribute(dataSampleEClass, DATA_SAMPLE__LANGUAGE);
		createEAttribute(dataSampleEClass, DATA_SAMPLE__PACKAGE_URI);
		createEReference(dataSampleEClass, DATA_SAMPLE__PACKAGE);
		createEReference(dataSampleEClass, DATA_SAMPLE__ENTITY_GENERATORS);
		createEReference(dataSampleEClass, DATA_SAMPLE__FIELD_GENERATORS);
		createEReference(dataSampleEClass, DATA_SAMPLE__ROOT_ENTITY);
		createEAttribute(dataSampleEClass, DATA_SAMPLE__BAD_VALUE_GENERATOR_NAMES);

		entityGeneratorEClass = createEClass(ENTITY_GENERATOR);
		createEAttribute(entityGeneratorEClass, ENTITY_GENERATOR__NUMBER);
		createEAttribute(entityGeneratorEClass, ENTITY_GENERATOR__ENTITY_NAME);
		createEReference(entityGeneratorEClass, ENTITY_GENERATOR__ENTITY);

		fieldGeneratorEClass = createEClass(FIELD_GENERATOR);
		createEAttribute(fieldGeneratorEClass, FIELD_GENERATOR__ENTITY_NAME);
		createEAttribute(fieldGeneratorEClass, FIELD_GENERATOR__FIELD_NAME);
		createEReference(fieldGeneratorEClass, FIELD_GENERATOR__GENERATOR);
		createEReference(fieldGeneratorEClass, FIELD_GENERATOR__STRUCTURAL_FEATURE);
		createEAttribute(fieldGeneratorEClass, FIELD_GENERATOR__ERROR_RATE);
		createEAttribute(fieldGeneratorEClass, FIELD_GENERATOR__GENERATOR_NAME);
		createEAttribute(fieldGeneratorEClass, FIELD_GENERATOR__ERROR_GENERATOR_NAME);
		createEReference(fieldGeneratorEClass, FIELD_GENERATOR__ERROR_GENERATOR);

		// Create enums
		languageEEnum = createEEnum(LANGUAGE);
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
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		MGeneratorPackage theGeneratorPackage = (MGeneratorPackage)EPackage.Registry.INSTANCE.getEPackage(MGeneratorPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(dataSampleEClass, DataSample.class, "DataSample", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataSample_Name(), ecorePackage.getEString(), "name", null, 0, 1, DataSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSample_Seed(), ecorePackage.getEInt(), "seed", null, 0, 1, DataSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSample_Language(), this.getLanguage(), "language", null, 0, 1, DataSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSample_PackageURI(), ecorePackage.getEString(), "packageURI", null, 0, 1, DataSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSample_Package(), theEcorePackage.getEPackage(), null, "package", null, 0, 1, DataSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSample_EntityGenerators(), this.getEntityGenerator(), null, "entityGenerators", null, 0, -1, DataSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSample_FieldGenerators(), this.getFieldGenerator(), null, "fieldGenerators", null, 0, -1, DataSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSample_RootEntity(), theEcorePackage.getEClass(), null, "rootEntity", null, 0, 1, DataSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSample_BadValueGeneratorNames(), theEcorePackage.getEString(), "badValueGeneratorNames", null, 0, -1, DataSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityGeneratorEClass, EntityGenerator.class, "EntityGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntityGenerator_Number(), ecorePackage.getEInt(), "number", null, 0, 1, EntityGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityGenerator_EntityName(), ecorePackage.getEString(), "entityName", null, 0, 1, EntityGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityGenerator_Entity(), theEcorePackage.getEClass(), null, "entity", null, 0, 1, EntityGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldGeneratorEClass, FieldGenerator.class, "FieldGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFieldGenerator_EntityName(), ecorePackage.getEString(), "entityName", null, 0, 1, FieldGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFieldGenerator_FieldName(), ecorePackage.getEString(), "fieldName", null, 0, 1, FieldGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		EGenericType g1 = createEGenericType(theGeneratorPackage.getValueGenerator());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getFieldGenerator_Generator(), g1, null, "generator", null, 0, 1, FieldGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldGenerator_StructuralFeature(), theEcorePackage.getEStructuralFeature(), null, "structuralFeature", null, 0, 1, FieldGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFieldGenerator_ErrorRate(), ecorePackage.getEInt(), "errorRate", null, 0, 1, FieldGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFieldGenerator_GeneratorName(), ecorePackage.getEString(), "generatorName", null, 0, 1, FieldGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFieldGenerator_ErrorGeneratorName(), ecorePackage.getEString(), "errorGeneratorName", null, 0, 1, FieldGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(theGeneratorPackage.getValueGenerator());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getFieldGenerator_ErrorGenerator(), g1, null, "errorGenerator", null, 0, 1, FieldGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(languageEEnum, Language.class, "Language");
		addEEnumLiteral(languageEEnum, Language.FR);
		addEEnumLiteral(languageEEnum, Language.EN);
		addEEnumLiteral(languageEEnum, Language.DE);
		addEEnumLiteral(languageEEnum, Language.ES);
		addEEnumLiteral(languageEEnum, Language.IT);

		// Create resource
		createResource(eNS_URI);
	}

} //MDatasamplePackageImpl
