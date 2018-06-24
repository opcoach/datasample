/**
 * © OPCoach 2012
 */
package com.opcoach.dsgen.generator.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>generator</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class DSGenGeneratorTests extends TestSuite
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
	public static void main(String[] args)
	{
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite()
	{
		TestSuite suite = new DSGenGeneratorTests("generator Tests");
		suite.addTestSuite(EObjectGeneratorTest.class);
		suite.addTestSuite(ChildrenGeneratorTest.class);
		suite.addTestSuite(SingleAssociationGeneratorTest.class);
		suite.addTestSuite(MultipleAssociationGeneratorTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSGenGeneratorTests(String name)
	{
		super(name);
	}

} //DSGenGeneratorTests
