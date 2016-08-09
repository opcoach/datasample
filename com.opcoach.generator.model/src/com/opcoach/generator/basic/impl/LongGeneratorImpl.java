package com.opcoach.generator.basic.impl;

import com.opcoach.generator.basic.LongGenerator;

// This class overrides the generated class and will be instantiated by factory
public class LongGeneratorImpl extends MLongGeneratorImpl implements LongGenerator
{
	protected LongGeneratorImpl()
	{
		this(0L, 100000L);
	}
	
	/** Build it with low and high bounds */
	public LongGeneratorImpl( Long vlow, Long vhigh)
	{
		setLow(vlow);
		setHigh(vhigh);
		step = 1L;
	}


	@Override
	protected Long generateRandomValue()
	{
		// Generate random value. Get a value between O,1 and compute value inside bounds
		double v = getRandomizer().nextDouble();

		// Must adjust the value.
		long result = low + (long) (v * (high - low));

		// Can return the result .
		return result;
	}

	@Override
	protected Long generateSimpleValue()
	{
		long result;

		if (lastGeneratedValue == null)
			result = low;
		else
		{
			result = lastGeneratedValue + step;
			// Restart � low value if value to high.
			if (result > high)
				result = low + (result - high);
		}

		return result;
	}

}
