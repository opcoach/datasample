/**
 * © OPCoach 2012
 */
package com.opcoach.dsgen.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

import com.opcoach.dsgen.generator.tests.DSGenGeneratorTests;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>DataSample</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataSampleAllTests extends TestSuite
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
		TestSuite suite = new DataSampleAllTests("DataSample Tests");
		suite.addTest(DataSampleGenTests.suite());
		suite.addTest(DSGenGeneratorTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSampleAllTests(String name)
	{
		super(name);
	}

} //DataSampleAllTests
