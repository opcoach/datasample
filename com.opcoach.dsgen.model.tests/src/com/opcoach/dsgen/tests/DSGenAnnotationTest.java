/**
 * © OPCoach 2012
 */
package com.opcoach.dsgen.tests;

import com.opcoach.dsgen.DSGenAnnotation;
import com.opcoach.dsgen.DataSampleGenFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>DS Gen Annotation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DSGenAnnotationTest extends DSGenBaseTest
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
		TestRunner.run(DSGenAnnotationTest.class);
	}

	/**
	 * Constructs a new DS Gen Annotation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSGenAnnotationTest(String name)
	{
		super(name);
	}

	/**
	 * Returns the fixture for this DS Gen Annotation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DSGenAnnotation getFixture()
	{
		return (DSGenAnnotation) fixture;
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
		setFixture(DataSampleGenFactory.eINSTANCE.createDSGenAnnotation());
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

} //DSGenAnnotationTest
