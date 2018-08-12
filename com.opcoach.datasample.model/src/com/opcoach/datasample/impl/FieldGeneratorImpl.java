package com.opcoach.datasample.impl;

import java.util.Arrays;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;

import com.opcoach.datasample.EntityGenerator;
import com.opcoach.datasample.FieldGenerator;
import com.opcoach.datasample.util.DSLogger;
import com.opcoach.generator.GeneratorFactory;
import com.opcoach.generator.ReferenceGenerator;
import com.opcoach.generator.ValueGenerator;
import com.opcoach.generator.basic.BasicFactory;
import com.opcoach.generator.basic.IntGenerator;
import com.opcoach.generator.basic.StringGenerator;

// This class overrides the generated class and will be instantiated by factory
public class FieldGeneratorImpl extends MFieldGeneratorImpl implements FieldGenerator {
	@Override
	public Object generateValue() {
		Object result = null; 
		
		ValueGenerator<?> gen = getGenerator();
		if (gen == null)
		{
			DSLogger.warning("Unable to create generator for " + toString());
		}
		else
		{
			result = gen.generateValue();
		}
		return result; 
	}
	
	
	@Override
	public String toString() {
		EntityGenerator eg = (EntityGenerator) eContainer;
		StringBuilder sb = new StringBuilder("FieldGenerator for ").append(eg.getEntityName()).append(".").append(getFieldName());
		ValueGenerator<?> gen = getGenerator();
		sb.append("\n Generator : " + ((gen == null) ? " NO GENERATOR FOUND (will use default)" : gen.getDescription() )) ;
		
		return sb.toString();
	}
	
	/*@Override
	public ValueGenerator<?> getGenerator() {
		if (generator == null)
		{
			// String gname = getGeneratorName();
			//DSLogger.info("Must create generator for : " + gname);
			//DSLogger.info("Warning we create a Null value for the moment");
			generator = null; // BasicFactory.eINSTANCE.createNullValueGenerator();
			
		} 
		return generator;
	}*/
	
	
	
	
}
