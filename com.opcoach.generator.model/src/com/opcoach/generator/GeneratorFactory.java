package com.opcoach.generator;

import com.opcoach.generator.impl.GeneratorFactoryImpl;

/** This factory  overrides the generated factory and returns the new generated interfaces */
public interface GeneratorFactory extends MGeneratorFactory 
{
	
	/** Specialize the eINSTANCE initialization with the new interface type 
	  * (overridden in the override_factory extension)
	*/
	GeneratorFactory eINSTANCE = GeneratorFactoryImpl.init();
				
	public <T> ReferenceGenerator<T> createReferenceGenerator();
}
