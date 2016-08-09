/**
 */
package com.opcoach.generator.basic.impl;

import com.opcoach.generator.basic.MBasicPackage;
import com.opcoach.generator.basic.BooleanGenerator;
import com.opcoach.generator.impl.ValueGeneratorImpl;
import org.eclipse.emf.ecore.EClass;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
 public class MBooleanGeneratorImpl extends ValueGeneratorImpl<Boolean> implements BooleanGenerator
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MBooleanGeneratorImpl()
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
		return MBasicPackage.Literals.BOOLEAN_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setLastGeneratedValue(Boolean newLastGeneratedValue)
	{
		super.setLastGeneratedValue(newLastGeneratedValue);
	}

} //MBooleanGeneratorImpl
