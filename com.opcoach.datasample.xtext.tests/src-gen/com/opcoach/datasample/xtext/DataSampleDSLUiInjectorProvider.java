/*
 * generated by Xtext
 */
package com.opcoach.datasample.xtext;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class DataSampleDSLUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return com.opcoach.datasample.xtext.ui.internal.DataSampleDSLActivator.getInstance().getInjector("com.opcoach.datasample.xtext.DataSampleDSL");
	}

}
