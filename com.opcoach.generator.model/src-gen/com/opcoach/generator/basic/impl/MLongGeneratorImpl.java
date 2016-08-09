/**
 */
package com.opcoach.generator.basic.impl;

import com.opcoach.generator.basic.MBasicPackage;
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
 public class MLongGeneratorImpl extends RangeGeneratorImpl<Long> implements LongGenerator
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MLongGeneratorImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return MBasicPackage.Literals.LONG_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setLow(Long newLow)
	{
		super.setLow(newLow);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setHigh(Long newHigh)
	{
		super.setHigh(newHigh);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setStep(Long newStep)
	{
		super.setStep(newStep);
	}

} //MLongGeneratorImpl
