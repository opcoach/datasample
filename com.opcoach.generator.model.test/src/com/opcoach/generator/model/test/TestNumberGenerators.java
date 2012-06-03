package com.opcoach.generator.model.test;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.opcoach.generator.RangeGenerator;
import com.opcoach.generator.basic.BasicFactory;
import com.opcoach.generator.basic.FloatGenerator;
import com.opcoach.generator.basic.IntGenerator;
import com.opcoach.generator.basic.LongGenerator;

/**
 * @author olivier
 */
public class TestNumberGenerators
{
	private BasicFactory f = BasicFactory.eINSTANCE;
	private IntGenerator genInt;
	private LongGenerator genLong;
	private FloatGenerator genFloat;

	@Before
	public void setUp() throws Exception
	{
		genInt = f.createIntGenerator();
		genLong = f.createLongGenerator();
		genFloat = f.createFloatGenerator();
	}
	
	@Test(expected= IllegalArgumentException.class)
	public void testLowGreaterThanHigh()
	{
		genInt.setBounds(10,4);
		
	}
	
	@Test
	public void testLowLesserThanHigh()
	{
		genInt.setBounds(4,10);
		
	}
	
	@Test
	public void testIntGeneratorSansBornes()
	{
		Integer i = genInt.generateValue();
		Integer j = genInt.generateValue();
		assertNotSame("Deux entiers simultanés générés doivent être différents", i, j);
	}

	@Test
	public void testIntGeneratorSerialAvecBornes()
	{
		testGen(genInt, 10, 30, false);
		
	}

	
	@Test
	public void testIntGeneratorRandomAvecBornes()
	{
		testGen(genInt, 10, 30, true);
	}


	@Test
	public void testLongGeneratorSansBornes()
	{
		Long i = genLong.generateValue();
		Long j = genLong.generateValue();
		assertNotSame("Deux long simultanés doivent être différents", i, j);
	}

	@Test
	public void testLongGeneratorSerialAvecBornes()
	{
		testGen(genLong, 1L, 5000L, false);		
	}
	
	@Test
	public void testLongGeneratorRandomAvecBornes()
	{
		testGen(genLong, 4500L, 5000L, false);
	}
	
	
	@Test
	public void testFloatGeneratorSansBornes()
	{
		Float i = genFloat.generateValue();
		Float j = genFloat.generateValue();
		assertNotSame("Deux flottants simultanés générés doivent être différents", i, j);
	}

	@Test
	public void testFloatGeneratorSerialAvecBornesInf1()
	{
		genFloat.setStep(0.05f);
		testGen(genFloat, (float) 0.452, (float) 0.99, false);
		
	}

	@Test
	public void testFloatGeneratorSerialAvecBornesSup1()
	{
		testGen(genFloat, (float) 17.5, (float) 45.87, false);
		
	}

	
	@Test
	public void testFloatGeneratorRandomAvecBornesInf1()
	{
		genFloat.setStep(0.05f);
		testGen(genFloat, (float) 0.452, (float) 0.99, true);
	}
	
	@Test
	public void testFloatGeneratorRandomAvecBornesSup1()
	{
		testGen(genFloat, (float) 14.359, (float) 287.12, true);
	}
	
	
	
	private  <T extends Comparable<T>> void testGen(RangeGenerator<T> gen, T low,  T high, boolean random)
	{
		gen.setBounds(low, high);
		if (random)
			gen.setRandomSeed(1L);
		
		for (int k = 0; k < 800; k++)
		{
			T i = gen.generateValue();
			System.out.println("valeur " + k + " in [" + low + "," + high+ "] : " + i);
			int lc = i.compareTo(low);
			int lh = i.compareTo(high);
			assertTrue("value " + i + " must be in bounds [" + low + "," + high + "]", (lc >= 0) && (lh <= 0));
		}
	}
	
	
}
