/**
 * © OPCoach 2012
 */
package com.opcoach.dsgen.tests;

import com.opcoach.dsgen.DSGenEnumLiteral;
import com.opcoach.dsgen.DataSampleGenFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>DS Gen Enum Literal</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DSGenEnumLiteralTest extends DSGenBaseTest
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
		TestRunner.run(DSGenEnumLiteralTest.class);
	}

	/**
	 * Constructs a new DS Gen Enum Literal test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSGenEnumLiteralTest(String name)
	{
		super(name);
	}

	/**
	 * Returns the fixture for this DS Gen Enum Literal test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DSGenEnumLiteral getFixture()
	{
		return (DSGenEnumLiteral) fixture;
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
		setFixture(DataSampleGenFactory.eINSTANCE.createDSGenEnumLiteral());
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

} //DSGenEnumLiteralTest
