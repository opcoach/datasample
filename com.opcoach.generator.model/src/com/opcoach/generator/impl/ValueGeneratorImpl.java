package com.opcoach.generator.impl;

import java.util.Random;

import com.opcoach.generator.ValueGenerator;

// This class overrides the generated class and will be instantiated by factory
public abstract class ValueGeneratorImpl<T> extends MValueGeneratorImpl<T> implements ValueGenerator<T>
{
	
	/** The generator randomizer (if null -> no random) */
	private Random randomizer = null;
	/** the randomizer for bad values */
	private Random badValueRandomizer = null;
	/** the bad value seed, set as private field, may be public in the future */
	private static final long BAD_VALUE_SEED = 1L;
	/** The default SEED value for 'no random' */
	public static long NO_SEED = -1L;

	/** random seed. If NO_SEED -> no random */
	private long randomSeed = NO_SEED;
	
	
	

	public void setID(String newID)
	{
		// Id are always managed in lower case, because used after for file name
		// detection.
		super.setID(newID.toLowerCase());
	}


	protected String computeDescription()
	{
		// Compute a default description...
		return (badValueProportion == 0) ? "with no errors" : "with " + badValueProportion + " % of errors";
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String getDescription()
	{
		if (description == null)
		{
			description = computeDescription();
		}

		return description;
	}


	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public T generateValue()
	{
		T result = null;
		if (generateNowABadValue())
		{
			result = generateBadValue();
		} else
		{
			// Generate random value ?
			if (randomizer != null)
				result = generateRandomValue();
			else
				result = generateSimpleValue();
		}

		lastGeneratedValue = result;
		return result;

	}

	/** @return true if it's time to generate a bad value */
	protected boolean generateNowABadValue()
	{
		if (badValueProportion == 100)
			return true;

		if (badValueProportion == 0)
			return false;

		int val = badValueRandomizer.nextInt(100);
		return (val <= badValueProportion);
	}

	/**
	 * A protected method to generate a bad value. Use the bad value generator
	 * if fixed. Can be overriden
	 * 
	 * @return a bad value for Type T
	 */
	protected T generateBadValue()
	{
		T result = (badValueGenerator == null) ? null : badValueGenerator.generateValue();
		return result;
	}

	/**
	 * Get the randomizer (for subclasses)
	 * 
	 * @return the randomizer to generate data
	 */
	protected Random getRandomizer()
	{
		return randomizer;
	}
	
	
	public void setBadValueProportion(int newBadValueProportion)
	{
		int boundedValue = Math.max(0, newBadValueProportion);
		boundedValue = Math.min(boundedValue, 100);

		super.setBadValueProportion(boundedValue);

		if (badValueProportion == 0)
			badValueRandomizer = null;
		else
			badValueRandomizer = new Random(BAD_VALUE_SEED);

		// Force description to be recomputed.
		description = null;
	}
	
	
	public void setRandomSeed(long newRandomSeed)
	{
		super.setRandomSeed(newRandomSeed);
		if (randomSeed == NO_SEED)
			randomizer = null;
		else
			randomizer = new Random(newRandomSeed);
	}



	/** Implements this method in subclasses to generate the next random value */
	 protected T generateRandomValue() {  return null; }

	/** Implements this method in subclasses to generate the next simple value */
	 protected T generateSimpleValue() {  return null; }


}
