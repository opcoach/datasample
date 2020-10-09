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
			sgen.setID("Sample");
			result = sgen;
		} else if ("EInt".equals(att.getEType().getName()) || "EInteger".equals(att.getEType().getName())) {
			IntGenerator igen = BasicFactory.eINSTANCE.createIntGenerator();
			igen.setBounds(0, 1000);
			result = igen;
		}
		return result;

	}
	
	/** Return the entity name for which this field generator is used */
	default public String getParentEntityName() { return getParentEntityGenerator().getEntity().getName();}

	/** Return the parent entity generator for which this field generator is used */
	default public EntityGenerator getParentEntityGenerator() { return (EntityGenerator) eContainer();}
	
	/** Return the root data sample for any field generator */
	default public DataSample getDataSample() { return getParentEntityGenerator().getDataSample();  } 



}
