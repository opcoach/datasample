package com.opcoach.datasample.model.tests;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.opcoach.datasample.DataSampleUtil;

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
		/* JUNIT 5 Ready
	     assertTrue(subclasses.contains(EcorePackage.Literals.ECLASS), "EClass must be found as subclass of EClassifier" );
		assertTrue(subclasses.contains(EcorePackage.Literals.EDATA_TYPE), "EDataType must be found as subclass of EClassifier");
		assertTrue(subclasses.contains(EcorePackage.Literals.EENUM), "EEnum must be found as subclass of EClassifier");
		*/
		assertTrue( "EClass must be found as subclass of EClassifier" , subclasses.contains(EcorePackage.Literals.ECLASS));
		assertTrue("EDataType must be found as subclass of EClassifier", subclasses.contains(EcorePackage.Literals.EDATA_TYPE));
		assertTrue("EEnum must be found as subclass of EClassifier", subclasses.contains(EcorePackage.Literals.EENUM) );
		
	}

	@Test
	@DisplayName("Find the subclasses of EModelElement")
	void testGetSubClassesOfEModelElement() {
		Set<EClass> subclasses = DataSampleUtil.getSubClasses(EcorePackage.Literals.EMODEL_ELEMENT);

		// There must be 16 subclasses of model element	
		// JUNIT5 Ready assertEquals(subclasses.size(), 16, "There must be 16 subclasses of EModelElement in EcorePackage");
		assertEquals("There must be 16 subclasses of EModelElement in EcorePackage", subclasses.size(), 16);

	}
	
	@Test
	@DisplayName("Test subclasses of EStructuralFeature")
	void testGetSubClassesOfEStructuralFeature() {
		Set<EClass> subclasses = DataSampleUtil.getSubClasses(EcorePackage.Literals.ESTRUCTURAL_FEATURE);
				
	/*  JUNIT 5 Ready
	 	assertTrue(subclasses.contains(EcorePackage.Literals.EATTRIBUTE), "EAttribute must be found as subclass of EStructuralFeature");
		assertTrue(subclasses.contains(EcorePackage.Literals.EREFERENCE), "EReference must be found as subclass of EStructuralFeature");
		*/
		assertTrue("EAttribute must be found as subclass of EStructuralFeature", subclasses.contains(EcorePackage.Literals.EATTRIBUTE));
		assertTrue("EReference must be found as subclass of EStructuralFeature", subclasses.contains(EcorePackage.Literals.EREFERENCE));
		

	}
	
	
	
	@Test
	@DisplayName("Test children classes expected in EPackage")
	void testGetChildrenClassesForEPackage() {
		System.out.println("Enter in testGetChildrenClassesForEPackage");
		Set<EClass> childrenTypes = DataSampleUtil.getChildrenClasses(EcorePackage.Literals.EPACKAGE);
		// An EPackage must set : EClassifiers, EPackages
		childrenTypes.forEach((c) -> System.out.println("In EPackage, found this class  " + c.getName()));
		
		/*  JUNIT 5 Ready 
		assertEquals(childrenTypes.size(), 5, "There must be 5 children concrete EClass for EPackage ");
		
		assertTrue(childrenTypes.contains(EcorePackage.Literals.ECLASS), "EClass is contained in a EPackage");
		assertTrue(childrenTypes.contains(EcorePackage.Literals.EDATA_TYPE), "DataType is contained in a EPackage");
		assertTrue(childrenTypes.contains(EcorePackage.Literals.EENUM), "EEnum is contained in a EPackage");
		assertTrue(childrenTypes.contains(EcorePackage.Literals.EPACKAGE), "EPackage is contained in a EPackage");
		assertTrue(childrenTypes.contains(EcorePackage.Literals.EANNOTATION), "EAnnotation is contained in a EPackage");
*/
	assertEquals("There must be 5 children concrete EClass for EPackage ", childrenTypes.size(), 5);
		
		assertTrue("EClass is contained in a EPackage", childrenTypes.contains(EcorePackage.Literals.ECLASS));
		assertTrue("DataType is contained in a EPackage", childrenTypes.contains(EcorePackage.Literals.EDATA_TYPE));
		assertTrue("EEnum is contained in a EPackage", childrenTypes.contains(EcorePackage.Literals.EENUM));
		assertTrue("EPackage is contained in a EPackage", childrenTypes.contains(EcorePackage.Literals.EPACKAGE));
		assertTrue("EAnnotation is contained in a EPackage", childrenTypes.contains(EcorePackage.Literals.EANNOTATION));
		
	}
	
	@Test
	@DisplayName("Test children classes expected in EClass")
	void testGetChildrenClassesForEClass() {
		System.out.println("Enter in testGetChildrenClassesForEClass");
		Set<EClass> childrenTypes = DataSampleUtil.getChildrenClasses(EcorePackage.Literals.ECLASS);
		// An EClass must contains attributes, types, operations... 
		childrenTypes.forEach((c) -> System.out.println("In EClass, found this class  " + c.getName()));
		
		/*  JUNIT 5 Ready
		assertEquals(childrenTypes.size(), 6, "There must be 6 children concrete EClass for EClass ");
		
		assertTrue(childrenTypes.contains(EcorePackage.Literals.EATTRIBUTE), "EAttribute is contained in a EClass");
		assertTrue(childrenTypes.contains(EcorePackage.Literals.EREFERENCE), "EReference is contained in a EClass");
		assertTrue(childrenTypes.contains(EcorePackage.Literals.EOPERATION), "EOperation is contained in a EClass");
		assertTrue(childrenTypes.contains(EcorePackage.Literals.EANNOTATION), "EAnnotation is contained in a EClass");
		assertTrue(childrenTypes.contains(EcorePackage.Literals.ETYPE_PARAMETER),"ETypeParameter is contained in a EClass");
		assertTrue(childrenTypes.contains(EcorePackage.Literals.EGENERIC_TYPE), "EGenericType is contained in a EClass");
*/
		assertEquals("There must be 6 children concrete EClass for EClass ", childrenTypes.size(), 6);
		
		assertTrue("EAttribute is contained in a EClass", childrenTypes.contains(EcorePackage.Literals.EATTRIBUTE));
		assertTrue("EReference is contained in a EClass", childrenTypes.contains(EcorePackage.Literals.EREFERENCE));
		assertTrue("EOperation is contained in a EClass", childrenTypes.contains(EcorePackage.Literals.EOPERATION));
		assertTrue("EAnnotation is contained in a EClass", childrenTypes.contains(EcorePackage.Literals.EANNOTATION));
		assertTrue("ETypeParameter is contained in a EClass", childrenTypes.contains(EcorePackage.Literals.ETYPE_PARAMETER));
		assertTrue("EGenericType is contained in a EClass", childrenTypes.contains(EcorePackage.Literals.EGENERIC_TYPE));

	}
	
	@Test
	@DisplayName("Test children classes expected in EOperation")
	void testGetChildrenClassesForEOperation() {
		System.out.println("Enter in testGetChildrenClassesForEOperation");
		Set<EClass> childrenTypes = DataSampleUtil.getChildrenClasses(EcorePackage.Literals.EOPERATION);
		// An EPackage must set : EClassifiers, EPackages
		childrenTypes.forEach((c) -> System.out.println("In EOperation, found this class  " + c.getName()));
		
		/*  JUNIT 5 Ready
		assertEquals(childrenTypes.size(), 4, "There must be 4 child concrete EClass for EOperation ");
		
		assertTrue(childrenTypes.contains(EcorePackage.Literals.EPARAMETER), "EParameter is contained in a EOPeration");
		assertTrue(childrenTypes.contains(EcorePackage.Literals.EANNOTATION), "EAnnotation is contained in a EClass");
		assertTrue(childrenTypes.contains(EcorePackage.Literals.ETYPE_PARAMETER), "ETypeParameter is contained in a EClass");
		assertTrue(childrenTypes.contains(EcorePackage.Literals.EGENERIC_TYPE), "EGenericType is contained in a EClass");
	*/
		
		assertEquals("There must be 4 child concrete EClass for EOperation ", childrenTypes.size(), 4);
		
		assertTrue("EParameter is contained in a EOPeration", childrenTypes.contains(EcorePackage.Literals.EPARAMETER));
		assertTrue("EAnnotation is contained in a EClass", childrenTypes.contains(EcorePackage.Literals.EANNOTATION));
		assertTrue("ETypeParameter is contained in a EClass", childrenTypes.contains(EcorePackage.Literals.ETYPE_PARAMETER));
		assertTrue("EGenericType is contained in a EClass", childrenTypes.contains(EcorePackage.Literals.EGENERIC_TYPE));

	}
	



}
