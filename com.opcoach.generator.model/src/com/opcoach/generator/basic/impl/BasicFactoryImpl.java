package com.opcoach.generator.basic.impl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.opcoach.generator.basic.BooleanGenerator;
import com.opcoach.generator.basic.DateGenerator;
import com.opcoach.generator.basic.DoubleGenerator;
import com.opcoach.generator.basic.FloatGenerator;
import com.opcoach.generator.basic.IDGenerator;
import com.opcoach.generator.basic.IntGenerator;
import com.opcoach.generator.basic.LongGenerator;
import com.opcoach.generator.basic.NullValueGenerator;
import com.opcoach.generator.basic.StringGenerator;
import com.opcoach.generator.basic.TrueGenerator;
import com.opcoach.generator.basic.FalseGenerator;
import com.opcoach.generator.basic.BasicFactory;


// This factory  overrides the generated factory and returns the new generated interfaces
public class BasicFactoryImpl extends MBasicFactoryImpl implements BasicFactory
{
	
	public static BasicFactory init() {
		
		try {
			Object fact = MBasicFactoryImpl.init();
			if ((fact != null) && (fact instanceof BasicFactory))
					return (BasicFactory) fact;
			}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BasicFactoryImpl(); 
		 }
	
	public BooleanGenerator createBooleanGenerator()
	{
		BooleanGenerator result = new BooleanGeneratorImpl();
		return result;
	}
	public DateGenerator createDateGenerator()
	{
		DateGenerator result = new DateGeneratorImpl();
		return result;
	}
	public DoubleGenerator createDoubleGenerator()
	{
		DoubleGenerator result = new DoubleGeneratorImpl();
		return result;
	}
	public FloatGenerator createFloatGenerator()
	{
		FloatGenerator result = new FloatGeneratorImpl();
		return result;
	}
	public IDGenerator createIDGenerator()
	{
		IDGenerator result = new IDGeneratorImpl();
		return result;
	}
	public IntGenerator createIntGenerator()
	{
		IntGenerator result = new IntGeneratorImpl();
		return result;
	}
	public LongGenerator createLongGenerator()
	{
		LongGenerator result = new LongGeneratorImpl();
		return result;
	}
	public NullValueGenerator createNullValueGenerator()
	{
		NullValueGenerator result = new NullValueGeneratorImpl();
		return result;
	}
	public StringGenerator createStringGenerator()
	{
		StringGenerator result = new StringGeneratorImpl();
		return result;
	}
	public TrueGenerator createTrueGenerator()
	{
		TrueGenerator result = new TrueGeneratorImpl();
		return result;
	}
	public FalseGenerator createFalseGenerator()
	{
		FalseGenerator result = new FalseGeneratorImpl();
		return result;
	}
}
