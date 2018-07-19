package com.opcoach.datasample.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import com.opcoach.datasample.DataSample;

// This class overrides the generated class and will be instantiated by factory
public class DataSampleImpl extends MDataSampleImpl implements DataSample
{

	@Override
	public EObject generateSample() {
		EClass root = getRootEntity();
		EObject result = root.getEPackage().getEFactoryInstance().create(root);
		
		return result;
		
	}
}
