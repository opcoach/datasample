/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.generator.basic.impl;

import org.eclipse.emf.ecore.EClass;

import com.opcoach.generator.basic.BasicPackage;
import com.opcoach.generator.basic.IntGenerator;
import com.opcoach.generator.impl.RangeGeneratorImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Int Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class IntGeneratorImpl extends RangeGeneratorImpl<Integer> implements IntGenerator
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected IntGeneratorImpl()
	{
		this(0, 1000);
	}
	
	
	  /**  Build it with low and high bounds */
	public IntGeneratorImpl(Integer vlow, Integer vhigh) 
	{
		super(vlow, vhigh);
		step = 1;
	}
	

	
	@Override
	protected Integer generateRandomValue()
	{
		 // Generate random value.
	   	  int result = low + getRandomizer().nextInt(high - low);

	   	  return result;
	}



	@Override
	protected Integer generateSimpleValue()
	{
		int result;
		
		if (lastGeneratedValue == null)
			result = low;
		else
		{
			result =  lastGeneratedValue + (int) step;
			// Restart ˆ low value if value to high.
			if (result > high)
				result = low + (result - high);
		}
		
		return result;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return BasicPackage.Literals.INT_GENERATOR;
	}

} //IntGeneratorImpl
