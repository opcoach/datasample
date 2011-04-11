/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.generator.basic.impl;

import com.opcoach.generator.basic.BasicPackage;
import com.opcoach.generator.basic.FloatGenerator;

import com.opcoach.generator.impl.RangeGeneratorImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Float Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FloatGeneratorImpl extends RangeGeneratorImpl<Float> implements FloatGenerator
{

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected FloatGeneratorImpl()
	{
		this(0.0f, Float.MAX_VALUE);
	}

		
    /**  Build it with low and high bounds */
	public FloatGeneratorImpl(Float vlow, Float vhigh) 
	{
		super(vlow, vhigh);
		step = 1.0f;  // must be adjusted if high-low < 1.0
		setType(Float.class);
	}
	
	
	@Override
	protected Float generateRandomValue()
	{
		 // Generate random value.
	   	  float result =  getRandomizer().nextFloat();
	   	  if (result > (high - low))
	   	  {
	   		  // Must adjust the value. 
	   		  result = (float) (result - 0.5f);
	   	  }
	   	  // Can return the result .
	   	  return low + result;

	}



	@Override
	protected Float generateSimpleValue()
	{
		float result;
		
		if (lastGeneratedValue == null)
			result = low;
		else
		{
			result =  lastGeneratedValue + step;
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
		return BasicPackage.Literals.FLOAT_GENERATOR;
	}

} //FloatGeneratorImpl
