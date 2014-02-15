/**
 * © OPCoach 2012
 */
package com.opcoach.dsgen.tests;

import com.opcoach.dsgen.DSGenModel;
import com.opcoach.dsgen.DataSampleGenFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>DS Gen Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link com.opcoach.dsgen.DSGenModel#getRoot() <em>Get Root</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class DSGenModelTest extends DSGenBaseTest
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
		TestRunner.run(DSGenModelTest.class);
	}

	/**
	 * Constructs a new DS Gen Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSGenModelTest(String name)
	{
		super(name);
	}

	/**
	 * Returns the fixture for this DS Gen Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DSGenModel getFixture()
	{
		return (DSGenModel) fixture;
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
		setFixture(DataSampleGenFactory.eINSTANCE.createDSGenModel());
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

	/**
	 * Tests the '{@link com.opcoach.dsgen.DSGenModel#getRoot() <em>Get Root</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.dsgen.DSGenModel#getRoot()
	 * @generated
	 */
	public void testGetRoot()
	{
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //DSGenModelTest
