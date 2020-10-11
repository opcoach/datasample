package com.opcoach.datasample;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.ecore.EObject;

// This interface overrides the generated interface and will be returned by factory
public interface EntityGenerator extends MEntityGenerator
{
	// You can write additional methods using an empty default java 8 notation 
	// because the generated implemented class extends this interface and is not abstract
	//
	// For instance : 
	// default public void addSomething(Something foo) {} ;
	
	
	default public DataSample getDataSample() { return null;  }  // Implemented in subclass
	
	/** Generate number values in a collection */
	default public Collection<EObject> generateValues() {return Collections.emptyList(); };

}
