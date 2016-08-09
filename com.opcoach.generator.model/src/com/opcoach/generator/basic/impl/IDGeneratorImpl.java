package com.opcoach.generator.basic.impl;

import com.opcoach.generator.basic.IDGenerator;

// This class overrides the generated class and will be instantiated by factory
public class IDGeneratorImpl extends MIDGeneratorImpl implements IDGenerator
{
	   /**  The last key returned */
 private static long __lastKey = 0L;

 /** The time that represents zero. */
 private static long __startTime = System.currentTimeMillis();

	protected static final String PREFIX_EDEFAULT = "";

	@Override
	protected String generateRandomValue()
	{
		// No random value
		return generateSimpleValue();
	}



	@Override
	protected String generateSimpleValue()
	{
		/** Generate a value base 36 encoded on 10 letters  */
        long value;
        // Find a new value
        synchronized (IDGenerator.class)
        {
            while ((value = System.currentTimeMillis() - __startTime) <= __lastKey)
            {
                // iterate
            }
            __lastKey = value;
        }

        // Convert it to a string using radix 36 (more compact)
        String longString = Long.toString(value, Character.MAX_RADIX);
    
        // And pad it right with zeroes according to the key length so that
        // alphabetical order is also numeric order.
        int longLength = longString.length() + prefix.length();

        StringBuffer result = new StringBuffer(prefix);
        for (int i = keyLength - longLength; i > 0; i--)
        {
            result.append('0');
        }
        result.append(longString);

        // Done
        return result.toString();
    
	}


}
