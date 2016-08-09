/**
 */
package com.opcoach.generator.basic.impl;

import com.opcoach.generator.basic.MBasicPackage;
import com.opcoach.generator.basic.IntGenerator;
import com.opcoach.generator.impl.RangeGeneratorImpl;
import org.eclipse.emf.ecore.EClass;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Int Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
 public class MIntGeneratorImpl extends RangeGeneratorImpl<Integer> implements IntGenerator
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MIntGeneratorImpl()
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
		return MBasicPackage.Literals.INT_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setLow(Integer newLow)
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
	public void setHigh(Integer newHigh)
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
	public void setStep(Integer newStep)
	{
		super.setStep(newStep);
	}

} //MIntGeneratorImpl
