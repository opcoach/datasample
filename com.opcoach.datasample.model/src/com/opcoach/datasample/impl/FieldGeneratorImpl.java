package com.opcoach.datasample.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.opcoach.datasample.EntityGenerator;
import com.opcoach.datasample.FieldGenerator;
import com.opcoach.generator.ValueGenerator;
import com.opcoach.generator.basic.BasicFactory;
import com.opcoach.generator.basic.BooleanGenerator;
import com.opcoach.generator.basic.DateGenerator;
import com.opcoach.generator.basic.DoubleGenerator;
import com.opcoach.generator.basic.FloatGenerator;
import com.opcoach.generator.basic.IntGenerator;
import com.opcoach.generator.basic.StringGenerator;

// This class overrides the generated class and will be instantiated by factory
public class FieldGeneratorImpl extends MFieldGeneratorImpl implements FieldGenerator {

	
	/** For field generator catalog is useless */
	 public Object generateValue(GenerationCatalog gcat) { return generateValue(); }


	@Override
	public Object generateValue() {
		Object result = null;

		ValueGenerator<?> gen = getGenerator();
		if (gen == null) {
			gen = getDefaultGenerator((EAttribute) getStructuralFeature());
			setGenerator(gen);
		}

		if (getNumber() == 1) {
			result = gen.generateValue();
		} else {
			Collection<Object> generatedValues = new ArrayList<>();
			for (int i = 0; i < getNumber(); i++)
				generatedValues.add(generateValue());
		}

		return result;
	}

	@Override
	public void setStructuralFeature(EStructuralFeature newStructuralFeature) {
		super.setStructuralFeature(newStructuralFeature);
		if (newStructuralFeature != null)
			setFieldName(newStructuralFeature.getName());
	}

	@Override
	public String toString() {
		EntityGenerator eg = (EntityGenerator) eContainer;
		StringBuilder sb = new StringBuilder("FieldGenerator for ").append(eg.getEntityName()).append(".")
				.append(getFieldName());
		ValueGenerator<?> gen = getGenerator();
		sb.append(
				"\n Generator : " + ((gen == null) ? " NO GENERATOR FOUND (will use default)" : gen.getDescription()));

		return sb.toString();
	}

	/** Find a default value generator according to attribute type */
	private ValueGenerator<?> getDefaultGenerator(EAttribute att) {

		switch (att.getEType().getName()) {

		case "EString": {
			StringGenerator sgen = BasicFactory.eINSTANCE.createStringGenerator();
			sgen.setID(getStructuralFeature().getName().toUpperCase());
			return sgen;
		}
		case "EInt":
		case "EIntegerObject": {
			IntGenerator igen = BasicFactory.eINSTANCE.createIntGenerator();
			igen.setBounds(0, 1000);
			return igen;
		}
		case "EFloat":
		case "EFloatObject": {
			FloatGenerator fgen = BasicFactory.eINSTANCE.createFloatGenerator();
			fgen.setBounds(0.0f, 1000.0f);
			return fgen;
		}
		case "EDouble":
		case "EDoubleObject": {
			DoubleGenerator fgen = BasicFactory.eINSTANCE.createDoubleGenerator();
			fgen.setBounds(0.0, 1000.0);
			return fgen;
		}
		case "EBoolean":
		case "EBooleanObject": {
			BooleanGenerator bgen = BasicFactory.eINSTANCE.createBooleanGenerator();
			bgen.setRandomSeed(10);
			return bgen;
		}

		case "EDate": {
			DateGenerator dgen = BasicFactory.eINSTANCE.createDateGenerator();
			dgen.setBounds(new Date(), new Date(System.currentTimeMillis() + 30 * 24 * 3600000L));
			return dgen;
		}

		}

		return BasicFactory.eINSTANCE.createNullValueGenerator();

	}

	/*
	 * @Override public ValueGenerator<?> getGenerator() { if (generator == null) {
	 * // String gname = getGeneratorName();
	 * //DSLogger.info("Must create generator for : " + gname);
	 * //DSLogger.info("Warning we create a Null value for the moment"); generator =
	 * null; // BasicFactory.eINSTANCE.createNullValueGenerator();
	 * 
	 * } return generator; }
	 */

}
