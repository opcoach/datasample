/**
 * © OPCoach 2012
 */
package com.opcoach.dsgen.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>dsgen</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataSampleGenTests extends TestSuite
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
		TestSuite suite = new DataSampleGenTests("dsgen Tests");
		suite.addTestSuite(DSGenModelTest.class);
		suite.addTestSuite(DSGenClassTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSampleGenTests(String name)
	{
		super(name);
	}

} //DataSampleGenTests
