/**
 * © OPCoach 2012
 */
package com.opcoach.dsgen.generator.tests;

import com.opcoach.dsgen.generator.DSGenGeneratorFactory;
import com.opcoach.dsgen.generator.MultipleAssociationGenerator;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Multiple Association Generator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MultipleAssociationGeneratorTest extends TestCase
{

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "© OPCoach 2012";

	/**
	 * The fixture for this Multiple Association Generator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultipleAssociationGenerator fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args)
	{
		TestRunner.run(MultipleAssociationGeneratorTest.class);
	}

	/**
	 * Constructs a new Multiple Association Generator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleAssociationGeneratorTest(String name)
	{
		super(name);
	}

	/**
	 * Sets the fixture for this Multiple Association Generator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MultipleAssociationGenerator fixture)
	{
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Multiple Association Generator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultipleAssociationGenerator getFixture()
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
		setFixture(DSGenGeneratorFactory.eINSTANCE.createMultipleAssociationGenerator());
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

} //MultipleAssociationGeneratorTest
