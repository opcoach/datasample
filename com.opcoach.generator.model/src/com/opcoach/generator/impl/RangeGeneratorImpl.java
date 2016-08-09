package com.opcoach.generator.impl;

import com.opcoach.generator.RangeGenerator;

// This class overrides the generated class and will be instantiated by factory
public abstract class RangeGeneratorImpl<T> extends MRangeGeneratorImpl<T> implements RangeGenerator<T>
{
	public RangeGeneratorImpl()
	{
		
	}
	
	public RangeGeneratorImpl(T vlow, T vhigh)
	{
		super();
		low = vlow;
		high = vhigh;
	}
	
	/** Default implementation for bounds */
	protected String computeDescription()
	{

		// TODO Auto-generated method stub
		return "[" + low.toString() + "," + high.toString() + "] " + super.computeDescription();

	}
	
	
	public void setBounds(T low, T high)
	{
		if (low instanceof Comparable<?> && high instanceof Comparable<?>)
			{
			  if (((Comparable<T>) low).compareTo(high) >= 0)
			throw new IllegalArgumentException("Low value ("+low+") must be lesser than high value("+high+")");
			}
		setLow(low);
		setHigh(high);
	}
	
	
	public void setHigh(T newHigh)
	{
		super.setHigh(newHigh);
		description = null;

	}

	public void setLow(T newLow)
	{
		super.setLow(newLow);
		description = null;
	}
}
