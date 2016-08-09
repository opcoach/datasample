package com.opcoach.generator.basic.impl;

import com.opcoach.generator.basic.IntGenerator;

// This class overrides the generated class and will be instantiated by factory
public class IntGeneratorImpl extends MIntGeneratorImpl implements IntGenerator
{
	protected IntGeneratorImpl()
	{
		this(0, 1000);
	}
	
	
	  /**  Build it with low and high bounds */
	public IntGeneratorImpl(Integer vlow, Integer vhigh) 
	{
		setLow(vlow);
		setHigh(vhigh);
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
			// Restart � low value if value to high.
			if (result > high)
				result = low + (result - high);
		}
		
		return result;
	}



}
