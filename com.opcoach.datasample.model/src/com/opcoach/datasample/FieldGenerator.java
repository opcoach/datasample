package com.opcoach.datasample;

import org.eclipse.emf.ecore.EAttribute;

import com.opcoach.generator.ValueGenerator;
import com.opcoach.generator.basic.BasicFactory;
import com.opcoach.generator.basic.IntGenerator;
import com.opcoach.generator.basic.StringGenerator;

// This interface overrides the generated interface and will be returned by factory
public interface FieldGenerator extends MFieldGenerator {
	// You can write additional methods using an empty default java 8 notation
	// because the generated implemented class extends this interface and is not
	// abstract
	//
	// For instance :
	// default public void addSomething(Something foo) {} ;

	public static final ValueGenerator<?> NULL_GENERATOR = BasicFactory.eINSTANCE.createNullValueGenerator();

	static ValueGenerator<?> getDefaultGenerator(EAttribute att) {
		ValueGenerator<?> result = NULL_GENERATOR;
		if ("EString".equals(att.getEType().getName())) {
			StringGenerator sgen = BasicFactory.eINSTANCE.createStringGenerator();
			sgen.addValue("Sample1 (defaultStringGenerator");
			result = sgen;
		} else if ("EInt".equals(att.getEType().getName()) || "EInteger".equals(att.getEType().getName())) {
			IntGenerator igen = BasicFactory.eINSTANCE.createIntGenerator();
			igen.setBounds(0, 1000);
			result = igen;
		}
		return result;

	}


}
