package com.opcoach.datasample.impl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.opcoach.datasample.DatasampleFactory;


// This factory  renames the generated factory interface to use it as an overriden factory
public class DatasampleFactoryImpl extends MDatasampleFactoryImpl implements DatasampleFactory
{
	
	public static DatasampleFactory init() {
		
		try {
			Object fact = MDatasampleFactoryImpl.init();
			if ((fact != null) && (fact instanceof DatasampleFactory))
					return (DatasampleFactory) fact;
			}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DatasampleFactoryImpl(); 
		 }
	

}
