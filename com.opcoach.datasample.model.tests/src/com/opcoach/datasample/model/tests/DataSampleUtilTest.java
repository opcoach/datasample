package com.opcoach.datasample.model.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.opcoach.datasample.util.DataSampleUtil;

class DataSampleUtilTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("Find the subclasses of EClassifier")
	void testGetSubClassesOfEClassifier() {
		Set<EClass> subclasses = DataSampleUtil.getSubClasses(EcorePackage.Literals.ECLASSIFIER);

		// Must find EClass, EDataType and EEnum
		assertTrue(subclasses.contains(EcorePackage.Literals.ECLASS),
				"EClass must be found as subclass of EClassifier");
		assertTrue(subclasses.contains(EcorePackage.Literals.EDATA_TYPE),
				"EDataType must be found as subclass of EClassifier");
		assertTrue(subclasses.contains(EcorePackage.Literals.EENUM), "EEnum must be found as subclass of EClassifier");

	}

	@Test
	@DisplayName("Find the subclasses of EModelElement")
	void testGetSubClassesOfEModelElement() {
		Set<EClass> subclasses = DataSampleUtil.getSubClasses(EcorePackage.Literals.EMODEL_ELEMENT);

		// There must be 16 subclasses of model element

		assertEquals( subclasses.size(), 16, "There must be 16 subclasses of EModelElement in EcorePackage");

	}

	@Test
	@DisplayName("Test subclasses of EStructuralFeature")
	void testGetSubClassesOfEStructuralFeature() {
		Set<EClass> subclasses = DataSampleUtil.getSubClasses(EcorePackage.Literals.ESTRUCTURAL_FEATURE);

		
		  assertTrue(subclasses.contains(EcorePackage.Literals.EATTRIBUTE),
		  "EAttribute must be found as subclass of EStructuralFeature");
		  assertTrue(subclasses.contains(EcorePackage.Literals.EREFERENCE),
		  "EReference must be found as subclass of EStructuralFeature");
		 
	}

	@Test
	@DisplayName("Test children classes expected in EPackage")
	void testGetChildrenClassesForEPackage() {
		Set<EClass> childrenTypes = DataSampleUtil.getChildrenClasses(EcorePackage.Literals.EPACKAGE);
		// An EPackage must set : EClassifiers, EPackages
		childrenTypes.forEach((c) -> System.out.println("In EPackage, found this class  " + c.getName()));

		
		  assertEquals(childrenTypes.size(), 5,
		  "There must be 5 children concrete EClass for EPackage ");
		  
		  assertTrue(childrenTypes.contains(EcorePackage.Literals.ECLASS),
		  "EClass is contained in a EPackage");
		  assertTrue(childrenTypes.contains(EcorePackage.Literals.EDATA_TYPE),
		  "DataType is contained in a EPackage");
		  assertTrue(childrenTypes.contains(EcorePackage.Literals.EENUM),
		  "EEnum is contained in a EPackage");
		  assertTrue(childrenTypes.contains(EcorePackage.Literals.EPACKAGE),
		  "EPackage is contained in a EPackage");
		  assertTrue(childrenTypes.contains(EcorePackage.Literals.EANNOTATION),
		  "EAnnotation is contained in a EPackage");
		 
		
	}

	@Test
	@DisplayName("Test children classes expected in EClass")
	void testGetChildrenClassesForEClass() {
		Set<EClass> childrenTypes = DataSampleUtil.getChildrenClasses(EcorePackage.Literals.ECLASS);
		// An EClass must contains attributes, types, operations...
		childrenTypes.forEach((c) -> System.out.println("In EClass, found this class  " + c.getName()));

		
		  assertEquals(childrenTypes.size(), 6,
		  "There must be 6 children concrete EClass for EClass ");
		  
		  assertTrue(childrenTypes.contains(EcorePackage.Literals.EATTRIBUTE),
		  "EAttribute is contained in a EClass");
		  assertTrue(childrenTypes.contains(EcorePackage.Literals.EREFERENCE),
		  "EReference is contained in a EClass");
		  assertTrue(childrenTypes.contains(EcorePackage.Literals.EOPERATION),
		  "EOperation is contained in a EClass");
		  assertTrue(childrenTypes.contains(EcorePackage.Literals.EANNOTATION),
		  "EAnnotation is contained in a EClass");
		  assertTrue(childrenTypes.contains(EcorePackage.Literals.ETYPE_PARAMETER)
		  ,"ETypeParameter is contained in a EClass");
		  assertTrue(childrenTypes.contains(EcorePackage.Literals.EGENERIC_TYPE),
		  "EGenericType is contained in a EClass");
		 
	}

	@Test
	@DisplayName("Test children classes expected in EOperation")
	void testGetChildrenClassesForEOperation() {
		Set<EClass> childrenTypes = DataSampleUtil.getChildrenClasses(EcorePackage.Literals.EOPERATION);
		// An EPackage must set : EClassifiers, EPackages
		childrenTypes.forEach((c) -> System.out.println("In EOperation, found this class  " + c.getName()));

		
		  //JUNIT 5 Ready 
		  assertEquals(childrenTypes.size(), 4,
		  "There must be 4 child concrete EClass for EOperation ");
		  
		  assertTrue(childrenTypes.contains(EcorePackage.Literals.EPARAMETER),
		  "EParameter is contained in a EOPeration");
		  assertTrue(childrenTypes.contains(EcorePackage.Literals.EANNOTATION),
		  "EAnnotation is contained in a EClass");
		  assertTrue(childrenTypes.contains(EcorePackage.Literals.ETYPE_PARAMETER),
		  "ETypeParameter is contained in a EClass");
		  assertTrue(childrenTypes.contains(EcorePackage.Literals.EGENERIC_TYPE),
		  "EGenericType is contained in a EClass");
		 
	}

}
