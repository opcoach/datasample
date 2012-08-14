/**
 * © OPCoach 2012
 */
package com.opcoach.dsgen.generator.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import com.opcoach.dsgen.DSGenClass;
import com.opcoach.dsgen.DSGenReference;
import com.opcoach.dsgen.generator.DSGenGeneratorPackage;
import com.opcoach.dsgen.generator.EObjectGenerator;
import com.opcoach.dsgen.generator.SingleAssociationGenerator;
import com.opcoach.generator.GeneratorFactory;
import com.opcoach.generator.ReferenceGenerator;
import com.opcoach.generator.impl.ReferenceGeneratorImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Association Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SingleAssociationGeneratorImpl extends ReferenceGeneratorImpl<EObject> implements SingleAssociationGenerator
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "© OPCoach 2012";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleAssociationGeneratorImpl()
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
		return DSGenGeneratorPackage.Literals.SINGLE_ASSOCIATION_GENERATOR;
	}
	
	@Override
	protected EObject generateRandomValue()
	{
		initializeValues();
		return super.generateRandomValue();
	}
	
	@Override
	protected EObject generateSimpleValue()
	{
		initializeValues();
		return super.generateSimpleValue();
	
	}

	private void initializeValues()
	{
		// This generator is set in a dsgen reference
		DSGenReference dsgenref = (DSGenReference) eContainer;
		System.out.println("¡¡¡¡¡¡¡ Create association on field " + dsgenref.getEcoreFeature().getName() + " for class "
				+ dsgenref.getDsgenClass().getEcoreClass().getName());

		DSGenClass targetClass = dsgenref.getTargetDSGenClass();
		setValues(EObjectGenerator.eInstance.getInstances(targetClass.getEcoreClass()));
	}

} //SingleAssociationGeneratorImpl
