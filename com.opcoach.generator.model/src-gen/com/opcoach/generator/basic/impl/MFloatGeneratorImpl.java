/**
 */
package com.opcoach.generator.basic.impl;

import com.opcoach.generator.basic.MBasicPackage;
import com.opcoach.generator.basic.FloatGenerator;
import com.opcoach.generator.impl.RangeGeneratorImpl;
import org.eclipse.emf.ecore.EClass;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Float Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
 public class MFloatGeneratorImpl extends RangeGeneratorImpl<Float> implements FloatGenerator
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MFloatGeneratorImpl()
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
		return MBasicPackage.Literals.FLOAT_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setLow(Float newLow)
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
	public void setHigh(Float newHigh)
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
	public void setStep(Float newStep)
	{
		super.setStep(newStep);
	}

} //MFloatGeneratorImpl
