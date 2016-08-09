package com.opcoach.generator.basic.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import com.opcoach.generator.basic.DateGenerator;

// This class overrides the generated class and will be instantiated by factory
public class DateGeneratorImpl extends MDateGeneratorImpl implements DateGenerator
{

	private long dateRange;
	private static final Date DEFAULT_START_DATE = new GregorianCalendar(2010,1,1).getTime();
	private static final Date DEFAULT_END_DATE = new GregorianCalendar(2020,1,1).getTime();
	
	
	protected DateGeneratorImpl()
	{
		this(DEFAULT_START_DATE, DEFAULT_END_DATE);
	}
	
	  /** Default javabean constructor. Build it with min and max date bounds */
	public DateGeneratorImpl(Date vlow, Date vhigh) 
	{
		super();
		setLow(vlow);
		setHigh(vhigh);
		dateRange = vhigh.getTime() - vlow.getTime();
		step = new Date(86400000L);  // By default one day
	}
	
	
	@Override
	protected Date generateRandomValue()
	{
		if (generateNow)
			return new Date();
		
		 // Generate random value.
	   	  long dateVal = getRandomizer().nextLong();
	   	  if (dateVal > (dateRange))
	   	  {
	   		  // Must adjust the value. 
	   		dateVal = (long) (dateVal * (dateRange)/(Long.MAX_VALUE - Long.MIN_VALUE));
	   	  }
	   	  // Can return the result .
	   	  dateVal +=  low.getTime();
	   	  
	   	  return new Date(dateVal);
	   	  
	}



	@Override
	protected Date generateSimpleValue()
	{
		
		if (generateNow)
			return new Date();

		Date result;
		
		if (lastGeneratedValue == null)
			result = low;
		else
		{
			long dateVal =  lastGeneratedValue.getTime() + step.getTime();
			// Restart � low value if value to high.
			if (dateVal > high.getTime())
				dateVal = low.getTime();
			result = new Date(dateVal);
		}
		
		return result;
	}

	/* (non-Javadoc)
	 * @see com.opcoach.generator.impl.RangeGeneratorImpl#computeBoundsAsString()
	 */
	@Override
	protected String computeDescription()
	{
		if (generateNow)
			return "Now Date";
		else
		{
			SimpleDateFormat df = new SimpleDateFormat("dd/MM/yy");
			String lowStr = df.format(getLow());
			String highStr = df.format(getHigh());
			return " [" + lowStr + "," + highStr + "] " + super.computeDescription();
		}
	}
	
}
