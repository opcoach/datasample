package com.opcoach.generator.impl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.opcoach.generator.ReferenceGenerator;
import com.opcoach.generator.GeneratorFactory;


// This factory  overrides the generated factory and returns the new generated interfaces
public class GeneratorFactoryImpl extends MGeneratorFactoryImpl implements GeneratorFactory
{
	
	public static GeneratorFactory init() {
		
		try {
			Object fact = MGeneratorFactoryImpl.init();
			if ((fact != null) && (fact instanceof GeneratorFactory))
					return (GeneratorFactory) fact;
			}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GeneratorFactoryImpl(); 
		 }
	
	public <T> ReferenceGenerator<T> createReferenceGenerator()
	{
		ReferenceGenerator<T> result = new ReferenceGeneratorImpl<T>();
		return result;
	}
}
