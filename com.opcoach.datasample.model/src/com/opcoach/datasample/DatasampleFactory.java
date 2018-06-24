package com.opcoach.datasample;

import com.opcoach.datasample.impl.DatasampleFactoryImpl;

/** This factory  overrides the generated factory and returns the new generated interfaces */
public interface DatasampleFactory extends MDatasampleFactory 
{
	
	/** Specialize the eINSTANCE initialization with the new interface type 
	  * (overridden in the override_factory extension)
	*/
	DatasampleFactory eINSTANCE = DatasampleFactoryImpl.init();
				
}
