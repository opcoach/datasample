package com.opoach.datasample.model.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EcorePackage;
import org.junit.jupiter.api.Test;

import com.opcoach.datasample.DataSampleUtil;

class DataSampleUtilTest {

/*	@BeforeAll
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
	*/

	@Test
	void testGetSubClassesOfEClassifier() {
		Set<EClass> subclasses = DataSampleUtil.getSubClasses(EcorePackage.Literals.ECLASSIFIER);

		// Must find EClass, EDataType and EEnum
		assertTrue("EClass must be found as subclass of EClassifier", subclasses.contains(EcorePackage.Literals.ECLASS));
		assertTrue("EDataType must be found as subclass of EClassifier", subclasses.contains(EcorePackage.Literals.EDATA_TYPE));
		assertTrue("EEnum must be found as subclass of EClassifier", subclasses.contains(EcorePackage.Literals.EENUM));
		
	}

	@Test
	void testGetSubClassesOfEModelElement() {
		Set<EClass> subclasses = DataSampleUtil.getSubClasses(EcorePackage.Literals.EMODEL_ELEMENT);

		// There must be 16 subclasses of model element	
		assertEquals("There must be 16 subclasses of EModelElement in EcorePackage", subclasses.size(), 16);
		
	}
	
	@Test
	void testGetSubClassesOfEStructuralFeature() {
		Set<EClass> subclasses = DataSampleUtil.getSubClasses(EcorePackage.Literals.ESTRUCTURAL_FEATURE);
				
		assertTrue("EAttribute must be found as subclass of EStructuralFeature", subclasses.contains(EcorePackage.Literals.EATTRIBUTE));
		assertTrue("EReference must be found as subclass of EStructuralFeature", subclasses.contains(EcorePackage.Literals.EREFERENCE));
		
	}
	
	@Test
	void testGetSortedClasses() {
		List<EClassifier> subclasses = DataSampleUtil.getSortedClasses(EcorePackage.eINSTANCE);
				
		
	}


}
