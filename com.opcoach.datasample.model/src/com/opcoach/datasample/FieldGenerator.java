package com.opcoach.datasample;

import com.opcoach.datasample.impl.GenerationCatalog;

// This interface overrides the generated interface and will be returned by factory
public interface FieldGenerator extends MFieldGenerator {
	// You can write additional methods using an empty default java 8 notation
	// because the generated implemented class extends this interface and is not
	// abstract
	//
	// For instance :
	// default public void addSomething(Something foo) {} ;



	/** Return the entity name for which this field generator is used */
	default public String getParentEntityName() {
		return getParentEntityGenerator().getEntity().getName();
	}

	/** Return the parent entity generator for which this field generator is used */
	default public EntityGenerator getParentEntityGenerator() {
		EntityGenerator gen = (EntityGenerator) eContainer();
		return gen;
	}

	/** Return the root data sample for any field generator */
	default public DataSample getDataSample() {
		return getParentEntityGenerator().getDataSample();
	}

	default public boolean isMany() { return getNumber() > 1; }
	
	/** Use the generation catalog to generate... (useless for field, usefull for childrenGenerator */
	default public Object generateValue(GenerationCatalog gcat) { return null; }
	
}
