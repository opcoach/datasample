/**
 * © OPCoach 2012
 */
package com.opcoach.dsgen.generator.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import com.opcoach.dsgen.generator.DSGenGeneratorFactory;
import com.opcoach.dsgen.generator.SingleAssociationGenerator;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Single Association Generator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SingleAssociationGeneratorTest extends TestCase
{

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "© OPCoach 2012";

	/**
	 * The fixture for this Single Association Generator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleAssociationGenerator fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args)
	{
		TestRunner.run(SingleAssociationGeneratorTest.class);
	}

	/**
	 * Constructs a new Single Association Generator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleAssociationGeneratorTest(String name)
	{
		super(name);
	}

	/**
	 * Sets the fixture for this Single Association Generator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SingleAssociationGenerator fixture)
	{
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Single Association Generator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleAssociationGenerator getFixture()
	{
		return fixture;
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
		setFixture(DSGenGeneratorFactory.eINSTANCE.createSingleAssociationGenerator());
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

} //SingleAssociationGeneratorTest
