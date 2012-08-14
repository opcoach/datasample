package com.opcoach.generator.model.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import org.junit.Before;
import org.junit.Test;

import com.opcoach.generator.basic.BasicFactory;
import com.opcoach.generator.basic.CasePolicyType;
import com.opcoach.generator.basic.StringGenerator;

/**
 * @author olivier
 */
public class TestStringGenerators
{
	private BasicFactory f = BasicFactory.eINSTANCE;
	private StringGenerator gen;
	
	private String[] possibleValues = new String[]{ "Mr", "Mme", "Melle", "Mr le Directeur", "Mr le prefet" };
	private List<String> valuesList = Arrays.asList(possibleValues);

	@Before
	public void setUp() throws Exception
	{
		gen = f.createStringGenerator();
		for (String s : possibleValues)
			gen.addValue(s)	;
		
	}
	
	@Test
	public void testStringGenInValues()
	{
		String v = gen.generateValue();
		System.out.println("Generate : " + v);
		assertTrue("Generated value (" + v + ") must be in registered list of possible values : " + valuesList, valuesList.contains(v));
	}
	
	@Test
	public void testStringGenInValuesWithRandom()
	{
		gen.setRandomSeed(10);
		String v = gen.generateValue();
		System.out.println("Generate : " + v);
		assertTrue("Generated value (" + v + ") must be in registered list of possible values : " + valuesList, valuesList.contains(v));
	}
	
	@Test
	public void testSerialStringGen()
	{
		for (int i = 0; i < possibleValues.length; i++)
		{
			// First generated value must be first in array... until end of array
			String v = gen.generateValue();
			System.out.println("Generate : " + v);
			assertEquals("#" + i + " generated value (" + v + ") must be the #"+i+" in array of possible values : " + possibleValues, v, possibleValues[i]);
		}
		
		// And we must come back to first value when all values have been selected
		String v = gen.generateValue();
		assertEquals("The #" + possibleValues.length + " generated value (" + v + ") must be equals to the first in array of possible values : " + possibleValues, v, possibleValues[0]);


	}
	
	@Test
	public void testRandomStringGen()
	{
		for (int i = 0; i < possibleValues.length * 2; i++)
		{
			// First generated value must be first in array... until end of array
			String v = gen.generateValue();
			System.out.println("Generate : " + v);
			assertTrue("Generated value (" + v + ") must be in registered list of possible values : " + valuesList, valuesList.contains(v));
			
		}

	}
	
	
	@Test
	public void testGenStringWithAFile()
	{
		gen = f.createStringGenerator();
		gen.setID("firstname");
		gen.setLocale(Locale.ENGLISH);
		System.out.println("---->  Valeurs possibles : " + gen.getValues());
		for (int i = 0; i < gen.getValues().size() ; i++)
		{
			// First generated value must be first in array... until end of array
			String v = gen.generateValue();
			System.out.println("Generate : " + v);
			assertTrue("Generated value (" + v + ") must be in registered list of possible values : " + gen.getValues(), gen.getValues().contains(v));
			
		}

	}
	
	@Test
	public void testGenStringWithAFileCustomerFirstname()
	{
		// Create a gen Ref containing the firstname sample values...
		StringGenerator genRef = f.createStringGenerator();
		genRef.setLocale(Locale.ENGLISH);
		genRef.setID("FirstName");
		
		// Create the real generator which must use the same values than genRef, because Customer.firstname does not exists
		gen = f.createStringGenerator();
		gen.setID("Customer.Firstname");
		gen.setLocale(Locale.ENGLISH);
		assertTrue("There must be values in generator ", gen.getValues().size() > 0);
		System.out.println("---->  Valeurs possibles : " + gen.getValues());
		for (int i = 0; i < gen.getValues().size() ; i++)
		{
			// First generated value must be first in array... until end of array
			String v = gen.generateValue();
			System.out.println("Generate : " + v);
			assertTrue("Generated value (" + v + ") must be in registered list of possible values : " + genRef.getValues(), genRef.getValues().contains(v));
			
		}

	}

	
	@Test
	public void testGenRandomStringWithAnEnglishFile()
	{
		gen = f.createStringGenerator();
		gen.setRandomSeed(10);
		gen.setID("firstname");
		gen.setLocale(Locale.ENGLISH);
		assertTrue("There must be values in generator ", gen.getValues().size() > 0);
		System.out.println("---->  Valeurs possibles : " + gen.getValues());
		for (int i = 0; i < gen.getValues().size() * 4 ; i++)
		{
			// First generated value must be first in array... until end of array
			String v = gen.generateValue();
			System.out.println("Generate : " + v);
			assertTrue("Generated value (" + v + ") must be in registered list of possible values : " + gen.getValues(), gen.getValues().contains(v));
			
		}

	}
	
	@Test
	public void testGenRandomStringWithAFrenchFile()
	{
		gen = f.createStringGenerator();
		gen.setRandomSeed(10);
		gen.setID("prenom");
		gen.setLocale(Locale.FRANCE);
		assertTrue("There must be values in generator ", gen.getValues().size() > 0);
		System.out.println("---->  Valeurs possibles : " + gen.getValues());
		for (int i = 0; i < gen.getValues().size() * 4 ; i++)
		{
			// First generated value must be first in array... until end of array
			String v = gen.generateValue();
			System.out.println("Generate : " + v);
			assertTrue("Generated value (" + v + ") must be in registered list of possible values : " + gen.getValues(), gen.getValues().contains(v));
			
		}

	}
	
	
	@Test
	public void testUpperCaseGen()
	{
		gen = f.createStringGenerator();
		gen.setRandomSeed(10);
		gen.setID("lastname");
		gen.setCasePolicy(CasePolicyType.UPPERCASE);
		String v = gen.generateValue();
		
		assertEquals("Generated value must be in uppercase", v, v.toUpperCase());

	}

	@Test
	public void testLowerCaseGen()
	{
		gen = f.createStringGenerator();
		gen.setRandomSeed(10);
		gen.setID("lastname");
		gen.setCasePolicy(CasePolicyType.LOWERCASE);
		String v = gen.generateValue();
		assertEquals("Generated value must be in lowercase", v, v.toLowerCase());

	}

	
	
}
