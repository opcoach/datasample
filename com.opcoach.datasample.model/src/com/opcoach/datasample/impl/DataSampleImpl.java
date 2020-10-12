package com.opcoach.datasample.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import com.opcoach.datasample.DataSample;
import com.opcoach.datasample.EntityGenerator;
import com.opcoach.datasample.util.ClassifierComparator;
import com.opcoach.datasample.util.DataSampleUtil;

// This class overrides the generated class and will be instantiated by factory
public class DataSampleImpl extends MDataSampleImpl implements DataSample {

	@Override
	public EObject generateValue() {
		
		GenerationCatalog gcat = new GenerationCatalog();
		EntityGenerator gen = getRootGenerator();
		EObject result =  gen.generateValue(gcat);
		if (result != null)
			gcat.bindAssociations();
		
		return result;
	}

	@Override
	public EPackage getPackage() {
		if (package_ == null) {
			package_ = EPackage.Registry.INSTANCE.getEPackage(packageURI);
		}
		// getExpectedChildren();

		return package_;

	}

	@Override
	public EClass getRootEntity() {
		if (rootEntity == null) {
			EPackage pack = getPackage();
			EClassifier cl = pack.getEClassifier(getRootEntityName());
			if (cl instanceof EClass)
				rootEntity = (EClass) cl;

		}
		return rootEntity;
	}



}
