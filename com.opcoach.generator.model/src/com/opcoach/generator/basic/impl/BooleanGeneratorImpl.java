package com.opcoach.generator.basic.impl;

import org.eclipse.emf.ecore.EClass;

import com.opcoach.generator.basic.BasicPackage;
import com.opcoach.generator.basic.BooleanGenerator;

// This class overrides the generated class and will be instantiated by factory
public class BooleanGeneratorImpl extends MBooleanGeneratorImpl implements BooleanGenerator
{


	
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
	
	



}
