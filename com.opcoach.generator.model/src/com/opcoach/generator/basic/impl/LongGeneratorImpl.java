/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.generator.basic.impl;

import com.opcoach.generator.basic.BasicPackage;
import com.opcoach.generator.basic.LongGenerator;

import com.opcoach.generator.impl.RangeGeneratorImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Long Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class LongGeneratorImpl extends RangeGeneratorImpl<Long> implements LongGenerator
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected LongGeneratorImpl()
	{
		this(Long.MIN_VALUE, Long.MAX_VALUE);
	}
	
	/** Build it with low and high bounds */
	public LongGeneratorImpl( Long vlow, Long vhigh)
	{
		super(vlow, vhigh);
		step = 1L;
		setType(Long.class);
	}


	@Override
	protected Long generateRandomValue()
	{
		// Generate random value. Get a value between O,1 and compute value inside bounds
		double v = getRandomizer().nextDouble();

		// Must adjust the value.
		long result = low + (long) (v * (high - low));

		// Can return the result .
		return result;
	}

	@Override
	protected Long generateSimpleValue()
	{
		long result;

		if (lastGeneratedValue == null)
			result = low;
		else
		{
			result = lastGeneratedValue + step;
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
		return BasicPackage.Literals.LONG_GENERATOR;
	}

} //LongGeneratorImpl
