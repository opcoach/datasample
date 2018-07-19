package com.opcoach.datasample.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import com.opcoach.datasample.DataSample;

// This class overrides the generated class and will be instantiated by factory
public class DataSampleImpl extends MDataSampleImpl implements DataSample
{

	@Override
	public EObject generateValue() {
		EClass root = getRootEntity();
		EObject result = root.getEPackage().getEFactoryInstance().create(root);
		
		return result;
	}
	
	@Override
	public EPackage getPackage() {
		if (package_ == null)
		{
			package_ = EPackage.Registry.INSTANCE.getEPackage(packageURI);
		}
		return package_;
		
	}
	
	@Override
	public EClass getRootEntity() {
		if (rootEntity == null)
		{
			EPackage pack = getPackage();
			EClassifier cl =  pack.getEClassifier(getRootEntityName());
			if (cl instanceof EClass)
				rootEntity = (EClass) cl;
			
		}
		return rootEntity;
	}
	
	
}
