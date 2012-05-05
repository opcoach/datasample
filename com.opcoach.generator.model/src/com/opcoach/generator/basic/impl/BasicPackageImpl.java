/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.generator.basic.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import com.opcoach.generator.GeneratorPackage;
import com.opcoach.generator.basic.BasicFactory;
import com.opcoach.generator.basic.BasicPackage;
import com.opcoach.generator.basic.BooleanGenerator;
import com.opcoach.generator.basic.CasePolicyType;
import com.opcoach.generator.basic.DateGenerator;
import com.opcoach.generator.basic.DoubleGenerator;
import com.opcoach.generator.basic.FalseGenerator;
import com.opcoach.generator.basic.FloatGenerator;
import com.opcoach.generator.basic.IDGenerator;
import com.opcoach.generator.basic.IntGenerator;
import com.opcoach.generator.basic.LongGenerator;
import com.opcoach.generator.basic.NullValueGenerator;
import com.opcoach.generator.basic.StringGenerator;
import com.opcoach.generator.basic.TrueGenerator;
import com.opcoach.generator.impl.GeneratorPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BasicPackageImpl extends EPackageImpl implements BasicPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateGeneratorEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doubleGeneratorEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass longGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nullValueGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trueGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass falseGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum casePolicyTypeEEnum = null;

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
	 * @see com.opcoach.generator.basic.BasicPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BasicPackageImpl()
	{
		super(eNS_URI, BasicFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BasicPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BasicPackage init()
	{
		if (isInited) return (BasicPackage)EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI);

		// Obtain or create and register package
		BasicPackageImpl theBasicPackage = (BasicPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BasicPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BasicPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		GeneratorPackageImpl theGeneratorPackage = (GeneratorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GeneratorPackage.eNS_URI) instanceof GeneratorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GeneratorPackage.eNS_URI) : GeneratorPackage.eINSTANCE);

		// Create package meta-data objects
		theBasicPackage.createPackageContents();
		theGeneratorPackage.createPackageContents();

		// Initialize created meta-data
		theBasicPackage.initializePackageContents();
		theGeneratorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBasicPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BasicPackage.eNS_URI, theBasicPackage);
		return theBasicPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanGenerator()
	{
		return booleanGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateGenerator()
	{
		return dateGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateGenerator_GenerateNow()
	{
		return (EAttribute)dateGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoubleGenerator()
	{
		return doubleGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloatGenerator()
	{
		return floatGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIDGenerator()
	{
		return idGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIDGenerator_KeyLength()
	{
		return (EAttribute)idGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIDGenerator_Prefix()
	{
		return (EAttribute)idGeneratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntGenerator()
	{
		return intGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLongGenerator()
	{
		return longGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNullValueGenerator()
	{
		return nullValueGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringGenerator()
	{
		return stringGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringGenerator_DataFilename()
	{
		return (EAttribute)stringGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringGenerator_CasePolicy()
	{
		return (EAttribute)stringGeneratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrueGenerator()
	{
		return trueGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFalseGenerator()
	{
		return falseGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCasePolicyType()
	{
		return casePolicyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicFactory getBasicFactory()
	{
		return (BasicFactory)getEFactoryInstance();
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
		booleanGeneratorEClass = createEClass(BOOLEAN_GENERATOR);

		dateGeneratorEClass = createEClass(DATE_GENERATOR);
		createEAttribute(dateGeneratorEClass, DATE_GENERATOR__GENERATE_NOW);

		doubleGeneratorEClass = createEClass(DOUBLE_GENERATOR);

		floatGeneratorEClass = createEClass(FLOAT_GENERATOR);

		idGeneratorEClass = createEClass(ID_GENERATOR);
		createEAttribute(idGeneratorEClass, ID_GENERATOR__KEY_LENGTH);
		createEAttribute(idGeneratorEClass, ID_GENERATOR__PREFIX);

		intGeneratorEClass = createEClass(INT_GENERATOR);

		longGeneratorEClass = createEClass(LONG_GENERATOR);

		nullValueGeneratorEClass = createEClass(NULL_VALUE_GENERATOR);

		stringGeneratorEClass = createEClass(STRING_GENERATOR);
		createEAttribute(stringGeneratorEClass, STRING_GENERATOR__DATA_FILENAME);
		createEAttribute(stringGeneratorEClass, STRING_GENERATOR__CASE_POLICY);

		trueGeneratorEClass = createEClass(TRUE_GENERATOR);

		falseGeneratorEClass = createEClass(FALSE_GENERATOR);

		// Create enums
		casePolicyTypeEEnum = createEEnum(CASE_POLICY_TYPE);
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
		GeneratorPackage theGeneratorPackage = (GeneratorPackage)EPackage.Registry.INSTANCE.getEPackage(GeneratorPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theGeneratorPackage.getValueGenerator());
		EGenericType g2 = createEGenericType(ecorePackage.getEBooleanObject());
		g1.getETypeArguments().add(g2);
		booleanGeneratorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theGeneratorPackage.getRangeGenerator());
		g2 = createEGenericType(ecorePackage.getEDate());
		g1.getETypeArguments().add(g2);
		dateGeneratorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theGeneratorPackage.getRangeGenerator());
		g2 = createEGenericType(ecorePackage.getEDoubleObject());
		g1.getETypeArguments().add(g2);
		doubleGeneratorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theGeneratorPackage.getRangeGenerator());
		g2 = createEGenericType(ecorePackage.getEFloatObject());
		g1.getETypeArguments().add(g2);
		floatGeneratorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theGeneratorPackage.getValueGenerator());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		idGeneratorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theGeneratorPackage.getRangeGenerator());
		g2 = createEGenericType(ecorePackage.getEIntegerObject());
		g1.getETypeArguments().add(g2);
		intGeneratorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theGeneratorPackage.getRangeGenerator());
		g2 = createEGenericType(ecorePackage.getELongObject());
		g1.getETypeArguments().add(g2);
		longGeneratorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theGeneratorPackage.getValueGenerator());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		nullValueGeneratorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theGeneratorPackage.getReferenceGenerator());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		stringGeneratorEClass.getEGenericSuperTypes().add(g1);
		trueGeneratorEClass.getESuperTypes().add(this.getBooleanGenerator());
		falseGeneratorEClass.getESuperTypes().add(this.getBooleanGenerator());

		// Initialize classes and features; add operations and parameters
		initEClass(booleanGeneratorEClass, BooleanGenerator.class, "BooleanGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dateGeneratorEClass, DateGenerator.class, "DateGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateGenerator_GenerateNow(), ecorePackage.getEBoolean(), "generateNow", null, 0, 1, DateGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doubleGeneratorEClass, DoubleGenerator.class, "DoubleGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(floatGeneratorEClass, FloatGenerator.class, "FloatGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(idGeneratorEClass, IDGenerator.class, "IDGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIDGenerator_KeyLength(), ecorePackage.getEInt(), "keyLength", "10", 0, 1, IDGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIDGenerator_Prefix(), ecorePackage.getEString(), "prefix", null, 0, 1, IDGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intGeneratorEClass, IntGenerator.class, "IntGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(longGeneratorEClass, LongGenerator.class, "LongGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nullValueGeneratorEClass, NullValueGenerator.class, "NullValueGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringGeneratorEClass, StringGenerator.class, "StringGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringGenerator_DataFilename(), ecorePackage.getEString(), "dataFilename", null, 0, 1, StringGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringGenerator_CasePolicy(), this.getCasePolicyType(), "casePolicy", "DEFAULT", 0, 1, StringGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trueGeneratorEClass, TrueGenerator.class, "TrueGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(falseGeneratorEClass, FalseGenerator.class, "FalseGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(casePolicyTypeEEnum, CasePolicyType.class, "CasePolicyType");
		addEEnumLiteral(casePolicyTypeEEnum, CasePolicyType.DEFAULT);
		addEEnumLiteral(casePolicyTypeEEnum, CasePolicyType.UPPERCASE);
		addEEnumLiteral(casePolicyTypeEEnum, CasePolicyType.LOWERCASE);
	}

} //BasicPackageImpl
