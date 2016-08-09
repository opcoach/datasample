package com.opcoach.generator.basic;

import com.opcoach.generator.basic.impl.BasicFactoryImpl;

/** This factory  overrides the generated factory and returns the new generated interfaces */
public interface BasicFactory extends MBasicFactory 
{
	
	/** Specialize the eINSTANCE initialization with the new interface type 
	  * (overridden in the override_factory extension)
	*/
	BasicFactory eINSTANCE = BasicFactoryImpl.init();
				
	public BooleanGenerator createBooleanGenerator();
	public DateGenerator createDateGenerator();
	public DoubleGenerator createDoubleGenerator();
	public FloatGenerator createFloatGenerator();
	public IDGenerator createIDGenerator();
	public IntGenerator createIntGenerator();
	public LongGenerator createLongGenerator();
	public NullValueGenerator createNullValueGenerator();
	public StringGenerator createStringGenerator();
	public TrueGenerator createTrueGenerator();
	public FalseGenerator createFalseGenerator();
}
