/**
 */
package com.opcoach.generator.basic.impl;

import com.opcoach.generator.basic.MBasicPackage;
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
 public class MDoubleGeneratorImpl extends RangeGeneratorImpl<Double> implements DoubleGenerator
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MDoubleGeneratorImpl()
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
		return MBasicPackage.Literals.DOUBLE_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setLow(Double newLow)
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
	public void setHigh(Double newHigh)
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
	public void setStep(Double newStep)
	{
		super.setStep(newStep);
	}

} //MDoubleGeneratorImpl
