package com.opcoach.datasample;

import java.util.Collections;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;

// This interface overrides the generated interface and will be returned by factory
public interface DataSample extends MDataSample
{
	// You can write additional methods using an empty default java 8 notation 
	// because the generated implemented class extends this interface and is not abstract
	//
	// For instance : 
	// default public void addSomething(Something foo) {} ;
	
	/** This method returns all EClasses that are expected from the current root object
	 *   For instance an EPackage will expect EClass, EOperation ...
	 *   This method is recursive  */
	default public Set<EClass> getExpectedChildren() { return Collections.EMPTY_SET; }

}
