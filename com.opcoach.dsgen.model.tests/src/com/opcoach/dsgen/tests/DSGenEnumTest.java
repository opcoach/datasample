/**
 * © OPCoach 2012
 */
package com.opcoach.dsgen.tests;

import junit.textui.TestRunner;

import com.opcoach.dsgen.DSGenEnum;
import com.opcoach.dsgen.DataSampleGenFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>DS Gen Enum</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DSGenEnumTest extends DSGenDataTypeTest
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
		TestRunner.run(DSGenEnumTest.class);
	}

	/**
	 * Constructs a new DS Gen Enum test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSGenEnumTest(String name)
	{
		super(name);
	}

	/**
	 * Returns the fixture for this DS Gen Enum test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DSGenEnum getFixture()
	{
		return (DSGenEnum) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception
	{
		setFixture(DataSampleGenFactory.eINSTANCE.createDSGenEnum());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception
	{
		setFixture(null);
	}

} //DSGenEnumTest
