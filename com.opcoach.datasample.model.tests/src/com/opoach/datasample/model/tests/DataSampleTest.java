package com.opoach.datasample.model.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.opcoach.datasample.DataSample;
import com.opcoach.datasample.DatasampleFactory;

class DataSampleTest {
	
	private static DataSample dataSample = null;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		dataSample = DatasampleFactory.eINSTANCE.createDataSample();
		dataSample.setPackageURI("http://www.eclipse.org/emf/2002/Ecore");
		dataSample.setRootEntityName("EPackage");
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
	void testGetPackage() {
		// EPackage must be the same than ECorePackage
		EPackage p = dataSample.getPackage();
		assertNotNull("Package can not be null", p);
		assertEquals("Package must be Ecore Package", p, EcorePackage.eINSTANCE);
	}

	@Test
	void testGetRootEntity() {
		EClassifier c = dataSample.getPackage().getEClassifier(dataSample.getRootEntityName());
		assertEquals("Root entity must be the EPackage Eclass", c, EcorePackage.Literals.EPACKAGE);
	}
	
	@Test
	@DisplayName("Test a class leaf can only generate the leaf")
	void testGetExpectedChildren()
	{
		Set<EClass> result = dataSample.getExpectedChildren();
		// For EPackage we should have all classes from EPackage...
		result.forEach((c) -> { System.out.println("Found class " + c.getName()); });
			
	}

	@Test
	void testGenerateValue() {
		fail("Not yet implemented");
	}

}
