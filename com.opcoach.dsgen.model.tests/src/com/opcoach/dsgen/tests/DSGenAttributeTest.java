/**
 * © OPCoach 2012
 */
package com.opcoach.dsgen.tests;

import com.opcoach.dsgen.DSGenAttribute;
import com.opcoach.dsgen.DataSampleGenFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>DS Gen Attribute</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DSGenAttributeTest extends DSGenFeatureTest
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
		TestRunner.run(DSGenAttributeTest.class);
	}

	/**
	 * Constructs a new DS Gen Attribute test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSGenAttributeTest(String name)
	{
		super(name);
	}

	/**
	 * Returns the fixture for this DS Gen Attribute test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DSGenAttribute getFixture()
	{
		return (DSGenAttribute) fixture;
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
		setFixture(DataSampleGenFactory.eINSTANCE.createDSGenAttribute());
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

} //DSGenAttributeTest
