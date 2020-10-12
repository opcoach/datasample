package com.opcoach.datasample.model.tests;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.stream.Stream;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.opcoach.datasample.ChildrenGenerator;
import com.opcoach.datasample.DataSample;
import com.opcoach.datasample.DatasampleFactory;
import com.opcoach.datasample.EntityGenerator;

class DataSampleTest  // extends to launch all tests together (bug in eclipse launch config)
{
	
	private static DataSample dataSample = null;
	private static EPackage generatedPackage = null;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		dataSample = DatasampleFactory.eINSTANCE.createDataSample();
		dataSample.setPackageURI("http://www.eclipse.org/emf/2002/Ecore");
		dataSample.setRootEntityName("EPackage");
		
		EntityGenerator rootGen = DatasampleFactory.eINSTANCE.createEntityGenerator();
		 rootGen.setEntityName("EPackage");
		 dataSample.setRootGenerator(rootGen);
		 
		 ChildrenGenerator eclassifierGen = DatasampleFactory.eINSTANCE.createChildrenGenerator();
		 eclassifierGen.setStructuralFeature(EcorePackage.Literals.EPACKAGE__ECLASSIFIERS);
		 
		 EntityGenerator eclassGen = DatasampleFactory.eINSTANCE.createEntityGenerator();
		 eclassGen.setEntity(EcorePackage.Literals.ECLASS);
		 eclassGen.setNumber(5);
		 
		 EntityGenerator datatypegen = DatasampleFactory.eINSTANCE.createEntityGenerator();
		 datatypegen.setEntity(EcorePackage.Literals.EDATA_TYPE);
		 datatypegen.setNumber(7);
		 
		 

		 eclassifierGen.getChildrenGenerators().add(eclassGen);
		 eclassifierGen.getChildrenGenerators().add(datatypegen);
		 
		 rootGen.getChildrenGenerators().add(eclassifierGen);
		 
		 generatedPackage = (EPackage) dataSample.generateValue();
		
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
		EClassifier gc = dataSample.getRootGenerator().getEntity();
		assertEquals(gc, EcorePackage.Literals.EPACKAGE, "EClass in first main generator must be set on EPackage");
		
	}

	@Test
	@DisplayName("Generated Package must contains 5 EClasses")
	void testPolymorphicGen1() {
		
		Stream<EClassifier> genClasses = generatedPackage.getEClassifiers().stream().filter((c) -> c instanceof EClass);
		assertEquals(genClasses.count(), 5, "The generated EPackage must contain 5 EClasses");
		
	}

	@Test
	@DisplayName("Generated Package must contains 7 Datatypes")
	void testPolymorphicGen2() {
		
		Stream<EClassifier> genClasses = generatedPackage.getEClassifiers().stream().filter((c) -> c instanceof EDataType);
		assertEquals(genClasses.count(), 7, "The generated EPackage must contain 7 EDataTypes");
		
	}




}
