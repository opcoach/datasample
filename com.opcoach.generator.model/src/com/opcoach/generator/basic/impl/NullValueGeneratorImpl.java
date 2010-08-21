/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.generator.basic.impl;

import com.opcoach.generator.basic.BasicPackage;
import com.opcoach.generator.basic.NullValueGenerator;

import com.opcoach.generator.impl.ValueGeneratorImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Null Value Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NullValueGeneratorImpl extends ValueGeneratorImpl<Object> implements NullValueGenerator
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NullValueGeneratorImpl()
	{
		super();
	}
	
	@Override
	protected Object generateRandomValue()
	{
		return null;
	}


	@Override
	protected Object generateSimpleValue()
	{
		return null;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return BasicPackage.Literals.NULL_VALUE_GENERATOR;
	}

} //NullValueGeneratorImpl
