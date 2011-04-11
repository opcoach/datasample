/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.generator.basic.impl;

import com.opcoach.generator.basic.BasicPackage;
import com.opcoach.generator.basic.DoubleGenerator;

import com.opcoach.generator.impl.RangeGeneratorImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Double Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DoubleGeneratorImpl extends RangeGeneratorImpl<Double> implements DoubleGenerator
{
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected DoubleGeneratorImpl()
	{
		this(0.0d, Double.MAX_VALUE);
	}
	
		
    /**  Build it with low and high bounds */
	public DoubleGeneratorImpl(Double vlow, Double vhigh) 
	{
		super(vlow, vhigh);
		step = 1.0d;
		setType(Double.class);
	}
	

	@Override
	protected Double generateRandomValue()
	{
		 // Generate random value.
	   	  double result = getRandomizer().nextDouble();
	   	  if (result > (high - low))
	   	  {
	   		  // Must adjust the value. 
	   		  result = (double) (result - 0.5d);
	   	  }
	   	  // Can return the result .
	   	  return low + result;

	}



	@Override
	protected Double generateSimpleValue()
	{
		double result;
		
		if (lastGeneratedValue == null)
			result = low;
		else
		{
			result =  lastGeneratedValue + step;
			// Restart ˆ low value if value to high.
			if (result > high)
				result = low + (result - high);
		}
		
		return result;
	}

	
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return BasicPackage.Literals.DOUBLE_GENERATOR;
	}



} //DoubleGeneratorImpl
