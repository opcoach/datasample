package com.opcoach.datasample.model.tests;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

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
import com.opcoach.datasample.EntityGenerator;

class DataSampleTest extends DataSampleUtilTest {
	
	private static DataSample dataSample = null;
	private static EntityGenerator rootGen = null;
	private static EntityGenerator eclassGen = null;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		dataSample = DatasampleFactory.eINSTANCE.createDataSample();
		dataSample.setPackageURI("http://www.eclipse.org/emf/2002/Ecore");
		dataSample.setRootEntityName("EPackage");
		
		 rootGen = DatasampleFactory.eINSTANCE.createEntityGenerator();
		 rootGen.setEntityName("EPackage");
		 dataSample.getEntityGenerators().add(rootGen);
		 
		 eclassGen = DatasampleFactory.eINSTANCE.createEntityGenerator();
		 eclassGen.setEntityName("EClass");
		 rootGen.getChildGenerators().add(eclassGen);
		
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
	@DisplayName("Target package must be EPackage")
	void testGetPackage() {
		// EPackage must be the same than ECorePackage
		EPackage p = dataSample.getPackage();
		assertNotNull(p, "Package can not be null");
		assertEquals(p, EcorePackage.eINSTANCE, "Package must be Ecore Package");
	}

	@Test
	@DisplayName("Root generation EClass must be EPackage")
	void testGetRootEntity() {
		EClassifier c = dataSample.getRootEntity();
		assertEquals(c, EcorePackage.Literals.EPACKAGE, "Root entity must be the EPackage Eclass");
	}
	
	@Test
	@DisplayName("Entity generator must be set on EPackage")
	void testGetEClassInMainEntityGenerator() {
		EClassifier gc = dataSample.getEntityGenerators().get(0).getEntity();
		assertEquals(gc, EcorePackage.Literals.EPACKAGE, "EClass in first main generator must be set on EPackage");
	}

	@Test
	@DisplayName("Entity generator inside packageGenerator must be set on EClass")
	void testGetEClassInPackageGenerator() {
		EClassifier gc = dataSample.getEntityGenerators().get(0).getChildGenerators().get(0).getEntity();
		assertEquals(gc, EcorePackage.Literals.ECLASS, "EClass in first main generator must be set on EPackage");
	}

	@Test
	void testGenerateValue() {
		// fail("Not yet implemented");
	}

}
