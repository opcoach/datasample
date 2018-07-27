package com.opcoach.datasample.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.opcoach.datasample.DataSample;
import com.opcoach.datasample.EntityGenerator;

// This class overrides the generated class and will be instantiated by factory
public class EntityGeneratorImpl extends MEntityGeneratorImpl implements EntityGenerator {

	public EntityGeneratorImpl() {
		super();
		System.out.println("Create an EntityGeneratorImpl");
	}

	@Override
	public EClass getEntity() {
		
		EClass result = super.getEntity();
		if (result == null) {
			DataSample ds = (DataSample) EcoreUtil.getRootContainer(this);
			EPackage p = ds.getPackage();
			EClassifier cl = p.getEClassifier(getEntityName());
			if (cl instanceof EClass) {
				result = (EClass) cl;
				setEntity(result);
			}
		}
		System.out.println("Return EClass : " + result + " for entity name " + getEntityName());
		return result;

	}
}
