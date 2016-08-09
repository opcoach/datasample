/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.generator.basic.impl;

import java.util.Locale;

import org.eclipse.emf.ecore.EClass;

import com.opcoach.generator.basic.BasicPackage;
import com.opcoach.generator.basic.BooleanGenerator;
import com.opcoach.generator.impl.ValueGeneratorImpl;

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
	 * @generated NOT
	 */
	protected BooleanGeneratorImpl()
	{
		super();
		lastGeneratedValue = Boolean.FALSE;
	}

	
	@Override
	protected Boolean generateRandomValue()
	{
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


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setLastGeneratedValue(Boolean newLastGeneratedValue)
	{
		super.setLastGeneratedValue(newLastGeneratedValue);
	}
	
	

} //BooleanGeneratorImpl
