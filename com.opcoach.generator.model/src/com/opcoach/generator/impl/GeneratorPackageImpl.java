/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.generator.impl;

import com.opcoach.generator.GeneratorFactory;
import com.opcoach.generator.GeneratorPackage;
import com.opcoach.generator.RangeGenerator;
import com.opcoach.generator.ReferenceGenerator;
import com.opcoach.generator.ValueGenerator;

import com.opcoach.generator.basic.BasicPackage;
import com.opcoach.generator.basic.impl.BasicPackageImpl;
import java.util.Collection;
import java.util.Locale;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GeneratorPackageImpl extends EPackageImpl implements GeneratorPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType collectionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType localeEDataType = null;

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
	 * @see com.opcoach.generator.GeneratorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GeneratorPackageImpl()
	{
		super(eNS_URI, GeneratorFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GeneratorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GeneratorPackage init()
	{
		if (isInited) return (GeneratorPackage)EPackage.Registry.INSTANCE.getEPackage(GeneratorPackage.eNS_URI);

		// Obtain or create and register package
		GeneratorPackageImpl theGeneratorPackage = (GeneratorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GeneratorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GeneratorPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		BasicPackageImpl theBasicPackage = (BasicPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI) instanceof BasicPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI) : BasicPackage.eINSTANCE);

		// Create package meta-data objects
		theGeneratorPackage.createPackageContents();
		theBasicPackage.createPackageContents();

		// Initialize created meta-data
		theGeneratorPackage.initializePackageContents();
		theBasicPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGeneratorPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GeneratorPackage.eNS_URI, theGeneratorPackage);
		return theGeneratorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueGenerator()
	{
		return valueGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueGenerator_BadValueProportion()
	{
		return (EAttribute)valueGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueGenerator_BadValueGenerator()
	{
		return (EReference)valueGeneratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueGenerator_LastGeneratedValue()
	{
		return (EAttribute)valueGeneratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueGenerator_RandomSeed()
	{
		return (EAttribute)valueGeneratorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueGenerator_Description()
	{
		return (EAttribute)valueGeneratorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueGenerator_Type()
	{
		return (EAttribute)valueGeneratorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueGenerator_ID()
	{
		return (EAttribute)valueGeneratorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueGenerator_Locale()
	{
		return (EAttribute)valueGeneratorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRangeGenerator()
	{
		return rangeGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRangeGenerator_Low()
	{
		return (EAttribute)rangeGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRangeGenerator_High()
	{
		return (EAttribute)rangeGeneratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRangeGenerator_Step()
	{
		return (EAttribute)rangeGeneratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceGenerator()
	{
		return referenceGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceGenerator_Step()
	{
		return (EAttribute)referenceGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceGenerator_Values()
	{
		return (EAttribute)referenceGeneratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCollection()
	{
		return collectionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLocale()
	{
		return localeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorFactory getGeneratorFactory()
	{
		return (GeneratorFactory)getEFactoryInstance();
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
		valueGeneratorEClass = createEClass(VALUE_GENERATOR);
		createEAttribute(valueGeneratorEClass, VALUE_GENERATOR__BAD_VALUE_PROPORTION);
		createEReference(valueGeneratorEClass, VALUE_GENERATOR__BAD_VALUE_GENERATOR);
		createEAttribute(valueGeneratorEClass, VALUE_GENERATOR__LAST_GENERATED_VALUE);
		createEAttribute(valueGeneratorEClass, VALUE_GENERATOR__RANDOM_SEED);
		createEAttribute(valueGeneratorEClass, VALUE_GENERATOR__DESCRIPTION);
		createEAttribute(valueGeneratorEClass, VALUE_GENERATOR__TYPE);
		createEAttribute(valueGeneratorEClass, VALUE_GENERATOR__ID);
		createEAttribute(valueGeneratorEClass, VALUE_GENERATOR__LOCALE);

		rangeGeneratorEClass = createEClass(RANGE_GENERATOR);
		createEAttribute(rangeGeneratorEClass, RANGE_GENERATOR__LOW);
		createEAttribute(rangeGeneratorEClass, RANGE_GENERATOR__HIGH);
		createEAttribute(rangeGeneratorEClass, RANGE_GENERATOR__STEP);

		referenceGeneratorEClass = createEClass(REFERENCE_GENERATOR);
		createEAttribute(referenceGeneratorEClass, REFERENCE_GENERATOR__STEP);
		createEAttribute(referenceGeneratorEClass, REFERENCE_GENERATOR__VALUES);

		// Create data types
		collectionEDataType = createEDataType(COLLECTION);
		localeEDataType = createEDataType(LOCALE);
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
		BasicPackage theBasicPackage = (BasicPackage)EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theBasicPackage);

		// Create type parameters
		ETypeParameter valueGeneratorEClass_T = addETypeParameter(valueGeneratorEClass, "T");
		ETypeParameter rangeGeneratorEClass_T = addETypeParameter(rangeGeneratorEClass, "T");
		ETypeParameter referenceGeneratorEClass_T = addETypeParameter(referenceGeneratorEClass, "T");
		addETypeParameter(collectionEDataType, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(this.getValueGenerator());
		EGenericType g2 = createEGenericType(rangeGeneratorEClass_T);
		g1.getETypeArguments().add(g2);
		rangeGeneratorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getValueGenerator());
		g2 = createEGenericType(referenceGeneratorEClass_T);
		g1.getETypeArguments().add(g2);
		referenceGeneratorEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(valueGeneratorEClass, ValueGenerator.class, "ValueGenerator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueGenerator_BadValueProportion(), ecorePackage.getEInt(), "badValueProportion", null, 0, 1, ValueGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getValueGenerator());
		g2 = createEGenericType(valueGeneratorEClass_T);
		g1.getETypeArguments().add(g2);
		initEReference(getValueGenerator_BadValueGenerator(), g1, null, "badValueGenerator", null, 0, 1, ValueGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(valueGeneratorEClass_T);
		initEAttribute(getValueGenerator_LastGeneratedValue(), g1, "lastGeneratedValue", null, 0, 1, ValueGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueGenerator_RandomSeed(), ecorePackage.getELong(), "randomSeed", "0", 0, 1, ValueGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueGenerator_Description(), ecorePackage.getEString(), "description", null, 0, 1, ValueGenerator.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getValueGenerator_Type(), g1, "type", null, 0, 1, ValueGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueGenerator_ID(), ecorePackage.getEString(), "ID", null, 0, 1, ValueGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueGenerator_Locale(), this.getLocale(), "locale", null, 0, 1, ValueGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(valueGeneratorEClass, null, "generateValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(valueGeneratorEClass_T);
		initEOperation(op, g1);

		initEClass(rangeGeneratorEClass, RangeGenerator.class, "RangeGenerator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(rangeGeneratorEClass_T);
		initEAttribute(getRangeGenerator_Low(), g1, "low", null, 0, 1, RangeGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(rangeGeneratorEClass_T);
		initEAttribute(getRangeGenerator_High(), g1, "high", null, 0, 1, RangeGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(rangeGeneratorEClass_T);
		initEAttribute(getRangeGenerator_Step(), g1, "step", null, 0, 1, RangeGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(rangeGeneratorEClass, null, "setBounds", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(rangeGeneratorEClass_T);
		addEParameter(op, g1, "low", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(rangeGeneratorEClass_T);
		addEParameter(op, g1, "high", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(referenceGeneratorEClass, ReferenceGenerator.class, "ReferenceGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReferenceGenerator_Step(), ecorePackage.getEInt(), "step", "1", 0, 1, ReferenceGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getCollection());
		g2 = createEGenericType(referenceGeneratorEClass_T);
		g1.getETypeArguments().add(g2);
		initEAttribute(getReferenceGenerator_Values(), g1, "values", null, 0, 1, ReferenceGenerator.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(collectionEDataType, Collection.class, "Collection", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(localeEDataType, Locale.class, "Locale", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //GeneratorPackageImpl
