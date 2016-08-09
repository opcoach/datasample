package com.opcoach.generator.basic.impl;

import com.opcoach.generator.basic.FloatGenerator;

// This class overrides the generated class and will be instantiated by factory
public class FloatGeneratorImpl extends MFloatGeneratorImpl implements FloatGenerator
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected FloatGeneratorImpl()
	{
		this(0.0f, 100.0f);
	}

		
    /**  Build it with low and high bounds */
	public FloatGeneratorImpl(Float vlow, Float vhigh) 
	{
		setLow(vlow);
		setHigh(vhigh);
		step = 1.0f;  // must be adjusted if high-low < 1.0
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
			// Restart � low value if value to high.
			if (result > high)
				result = low + (result - high);
		}
		
		return result;
	}


}
