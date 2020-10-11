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
import com.opcoach.datasample.DataSampleUtil;
import com.opcoach.datasample.EntityGenerator;
import com.opcoach.datasample.util.ClassifierComparator;

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

	@Override
	public Set<EClass> getExpectedChildren() {
		Set<EClass> result = new HashSet<>();

		// Sort the list of dsgenClass (less referenced before...)
		List<EClassifier> dest = new ArrayList<>();
		for (EClassifier c : getPackage().getEClassifiers())
			dest.add(c);

		Collections.sort(dest, new ClassifierComparator());

		System.out.println("------ Sorted list -----");
		for (EClassifier c : dest)
			System.out.println(" Class = " + c.getName());
		System.out.println("------ Sorted list -----");

		getExpectedChildren(getRootEntity(), result);

		return result;
	}

	public void getExpectedChildren(EClass c, Set<EClass> result) {

		if (result.contains(c))
			return;

		for (EClass ec : getFirstLevelTypes(c)) {
			if (!result.contains(ec) && !ec.isAbstract()) {
				result.add(ec);
				getExpectedChildren(ec, result);
			}

			for (EClass sc : DataSampleUtil.getSubClasses(ec))
				if (!result.contains(sc) && !sc.isAbstract()) {
					result.add(ec);
					getExpectedChildren(ec, result);
				}

		}

	}

	/**
	 * Get all EClass contained in EReference types at first level of current EClass
	 * 
	 * @param c the class to be analyzed
	 * @return the EReferences types used by this EClass at first level
	 */
	private Collection<EClass> getFirstLevelTypes(EClass c) {
		Collection<EClass> result = new ArrayList<>();

		System.out.println(" --> Eclass " + c.getName() + " refers to ");
		for (EReference ref : c.getEAllReferences()) {
			EClass refType = ref.getEReferenceType();
			System.out.println("         * " + refType.getName()
					+ ((result.contains(refType) ? " present" : " not present -> Add it")));
			if (!result.contains(refType))
				result.add(refType);
		}

		return result;
	}

}
