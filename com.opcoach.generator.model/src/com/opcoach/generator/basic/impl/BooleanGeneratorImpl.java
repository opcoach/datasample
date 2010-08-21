/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.generator.basic.impl;

import com.opcoach.generator.basic.BasicPackage;
import com.opcoach.generator.basic.BooleanGenerator;

import com.opcoach.generator.impl.ValueGeneratorImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BooleanGeneratorImpl extends ValueGeneratorImpl<Boolean> implements BooleanGenerator
{

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanGeneratorImpl()
	{
		super();
	}

	
	@Override
	protected Boolean generateRandomValue()
	{
		// TODO Auto-generated method stub
		return getRandomizer().nextBoolean();
	}


	@Override
	protected Boolean generateSimpleValue()
	{
		boolean last = lastGeneratedValue.booleanValue();
		return !last;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return BasicPackage.Literals.BOOLEAN_GENERATOR;
	}
	
	

} //BooleanGeneratorImpl
