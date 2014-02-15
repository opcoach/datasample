/**
 * © OPCoach 2012
 */
package com.opcoach.dsgen.generator.impl;

import com.opcoach.dsgen.DataSampleGenPackage;

import com.opcoach.dsgen.generator.ChildrenGenerator;
import com.opcoach.dsgen.generator.DSGenGeneratorFactory;
import com.opcoach.dsgen.generator.DSGenGeneratorPackage;
import com.opcoach.dsgen.generator.EObjectGenerator;
import com.opcoach.dsgen.generator.MultipleAssociationGenerator;
import com.opcoach.dsgen.generator.SingleAssociationGenerator;

import com.opcoach.dsgen.impl.DataSampleGenPackageImpl;

import com.opcoach.generator.GeneratorPackage;

import java.util.Collection;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
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
public class DSGenGeneratorPackageImpl extends EPackageImpl implements DSGenGeneratorPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "© OPCoach 2012";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eObjectGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass childrenGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleAssociationGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multipleAssociationGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eObjectCollectionEDataType = null;

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
	 * @see com.opcoach.dsgen.generator.DSGenGeneratorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DSGenGeneratorPackageImpl()
	{
		super(eNS_URI, DSGenGeneratorFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DSGenGeneratorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DSGenGeneratorPackage init()
	{
		if (isInited)
			return (DSGenGeneratorPackage) EPackage.Registry.INSTANCE.getEPackage(DSGenGeneratorPackage.eNS_URI);

		// Obtain or create and register package
		DSGenGeneratorPackageImpl theDSGenGeneratorPackage = (DSGenGeneratorPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DSGenGeneratorPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new DSGenGeneratorPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		GeneratorPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		DataSampleGenPackageImpl theDataSampleGenPackage = (DataSampleGenPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(DataSampleGenPackage.eNS_URI) instanceof DataSampleGenPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(DataSampleGenPackage.eNS_URI) : DataSampleGenPackage.eINSTANCE);

		// Create package meta-data objects
		theDSGenGeneratorPackage.createPackageContents();
		theDataSampleGenPackage.createPackageContents();

		// Initialize created meta-data
		theDSGenGeneratorPackage.initializePackageContents();
		theDataSampleGenPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDSGenGeneratorPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DSGenGeneratorPackage.eNS_URI, theDSGenGeneratorPackage);
		return theDSGenGeneratorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEObjectGenerator()
	{
		return eObjectGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEObjectGenerator_TargetDSGenClass()
	{
		return (EReference) eObjectGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChildrenGenerator()
	{
		return childrenGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChildrenGenerator_MaxChildrenNumber()
	{
		return (EAttribute) childrenGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleAssociationGenerator()
	{
		return singleAssociationGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultipleAssociationGenerator()
	{
		return multipleAssociationGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultipleAssociationGenerator_MaxAssociationNumber()
	{
		return (EAttribute) multipleAssociationGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEObjectCollection()
	{
		return eObjectCollectionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSGenGeneratorFactory getDSGenGeneratorFactory()
	{
		return (DSGenGeneratorFactory) getEFactoryInstance();
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
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		eObjectGeneratorEClass = createEClass(EOBJECT_GENERATOR);
		createEReference(eObjectGeneratorEClass, EOBJECT_GENERATOR__TARGET_DS_GEN_CLASS);

		childrenGeneratorEClass = createEClass(CHILDREN_GENERATOR);
		createEAttribute(childrenGeneratorEClass, CHILDREN_GENERATOR__MAX_CHILDREN_NUMBER);

		singleAssociationGeneratorEClass = createEClass(SINGLE_ASSOCIATION_GENERATOR);

		multipleAssociationGeneratorEClass = createEClass(MULTIPLE_ASSOCIATION_GENERATOR);
		createEAttribute(multipleAssociationGeneratorEClass, MULTIPLE_ASSOCIATION_GENERATOR__MAX_ASSOCIATION_NUMBER);

		// Create data types
		eObjectCollectionEDataType = createEDataType(EOBJECT_COLLECTION);
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
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		GeneratorPackage theGeneratorPackage = (GeneratorPackage) EPackage.Registry.INSTANCE.getEPackage(GeneratorPackage.eNS_URI);
		DataSampleGenPackage theDataSampleGenPackage = (DataSampleGenPackage) EPackage.Registry.INSTANCE
				.getEPackage(DataSampleGenPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theGeneratorPackage.getValueGenerator());
		EGenericType g2 = createEGenericType(ecorePackage.getEObject());
		g1.getETypeArguments().add(g2);
		eObjectGeneratorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theGeneratorPackage.getValueGenerator());
		g2 = createEGenericType(this.getEObjectCollection());
		g1.getETypeArguments().add(g2);
		childrenGeneratorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theGeneratorPackage.getReferenceGenerator());
		g2 = createEGenericType(ecorePackage.getEObject());
		g1.getETypeArguments().add(g2);
		singleAssociationGeneratorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theGeneratorPackage.getValueGenerator());
		g2 = createEGenericType(this.getEObjectCollection());
		g1.getETypeArguments().add(g2);
		multipleAssociationGeneratorEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(eObjectGeneratorEClass, EObjectGenerator.class, "EObjectGenerator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEObjectGenerator_TargetDSGenClass(), theDataSampleGenPackage.getDSGenClass(), null, "targetDSGenClass",
				null, 0, 1, EObjectGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(eObjectGeneratorEClass, this.getEObjectCollection(), "getInstances", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theEcorePackage.getEClass(), "cl", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(childrenGeneratorEClass, ChildrenGenerator.class, "ChildrenGenerator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChildrenGenerator_MaxChildrenNumber(), ecorePackage.getEInt(), "maxChildrenNumber", "50", 0, 1,
				ChildrenGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(singleAssociationGeneratorEClass, SingleAssociationGenerator.class, "SingleAssociationGenerator", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multipleAssociationGeneratorEClass, MultipleAssociationGenerator.class, "MultipleAssociationGenerator",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultipleAssociationGenerator_MaxAssociationNumber(), ecorePackage.getEInt(), "maxAssociationNumber",
				"50", 0, 1, MultipleAssociationGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(eObjectCollectionEDataType, Collection.class, "EObjectCollection", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS, "java.util.Collection<org.eclipse.emf.ecore.EObject>");
	}

} //DSGenGeneratorPackageImpl
