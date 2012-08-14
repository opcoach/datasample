/**
 * © OPCoach 2012
 */
package com.opcoach.dsgen.generator.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.opcoach.dsgen.DSGenClass;
import com.opcoach.dsgen.DSGenReference;
import com.opcoach.dsgen.generator.DSGenGeneratorFactory;
import com.opcoach.dsgen.generator.DSGenGeneratorPackage;
import com.opcoach.dsgen.generator.EObjectGenerator;
import com.opcoach.dsgen.generator.MultipleAssociationGenerator;
import com.opcoach.generator.GeneratorFactory;
import com.opcoach.generator.ReferenceGenerator;
import com.opcoach.generator.impl.ValueGeneratorImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Multiple Association Generator</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.opcoach.dsgen.generator.impl.MultipleAssociationGeneratorImpl#getMaxAssociationNumber <em>Max Association Number
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class MultipleAssociationGeneratorImpl extends ValueGeneratorImpl<Collection<EObject>> implements
		MultipleAssociationGenerator
{
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String copyright = "© OPCoach 2012";

	/**
	 * The default value of the '{@link #getMaxAssociationNumber() <em>Max Association Number</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getMaxAssociationNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_ASSOCIATION_NUMBER_EDEFAULT = 50;
	/**
	 * The cached value of the '{@link #getMaxAssociationNumber() <em>Max Association Number</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getMaxAssociationNumber()
	 * @generated
	 * @ordered
	 */
	protected int maxAssociationNumber = MAX_ASSOCIATION_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected MultipleAssociationGeneratorImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return DSGenGeneratorPackage.Literals.MULTIPLE_ASSOCIATION_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getMaxAssociationNumber()
	{
		return maxAssociationNumber;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setMaxAssociationNumber(int newMaxAssociationNumber)
	{
		int oldMaxAssociationNumber = maxAssociationNumber;
		maxAssociationNumber = newMaxAssociationNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DSGenGeneratorPackage.MULTIPLE_ASSOCIATION_GENERATOR__MAX_ASSOCIATION_NUMBER, oldMaxAssociationNumber,
					maxAssociationNumber));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
		case DSGenGeneratorPackage.MULTIPLE_ASSOCIATION_GENERATOR__MAX_ASSOCIATION_NUMBER:
			return getMaxAssociationNumber();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
		case DSGenGeneratorPackage.MULTIPLE_ASSOCIATION_GENERATOR__MAX_ASSOCIATION_NUMBER:
			setMaxAssociationNumber((Integer) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
		case DSGenGeneratorPackage.MULTIPLE_ASSOCIATION_GENERATOR__MAX_ASSOCIATION_NUMBER:
			setMaxAssociationNumber(MAX_ASSOCIATION_NUMBER_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
		case DSGenGeneratorPackage.MULTIPLE_ASSOCIATION_GENERATOR__MAX_ASSOCIATION_NUMBER:
			return maxAssociationNumber != MAX_ASSOCIATION_NUMBER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (maxAssociationNumber: ");
		result.append(maxAssociationNumber);
		result.append(')');
		return result.toString();
	}

	@Override
	protected Collection<EObject> generateRandomValue()
	{
		return generateAssociation(getMaxNbAssociationToCreate());
	}

	@Override
	protected Collection<EObject> generateSimpleValue()
	{
		return generateAssociation(getMaxNbAssociationToCreate());
	}

	private Collection<EObject> generateAssociation(int nbAssociation)
	{
		
		ReferenceGenerator<EObject> generator = GeneratorFactory.eINSTANCE.createReferenceGenerator();
		if (isSetRandomSeed())
		    generator.setRandomSeed(getRandomSeed());

		Collection<EObject> result = new ArrayList<EObject>();
		// This generator is set in a dsgen reference
		DSGenReference dsgenref = (DSGenReference) eContainer;
		System.out.println("¡¡¡¡¡¡¡ Create association on field " + dsgenref.getEcoreFeature().getName() + " for class "
				+ dsgenref.getDsgenClass().getEcoreClass().getName());

		DSGenClass targetClass = dsgenref.getTargetDSGenClass();
		generator.setValues(EObjectGenerator.eInstance.getInstances(targetClass.getEcoreClass()));

		for (int i = 0; i < nbAssociation; i++)
		{
			EObject obj = generator.generateValue();
			result.add(obj);
		}

		return result;
	
	}
	
	private int getMaxNbAssociationToCreate()
	{
		DSGenReference dsgenref = (DSGenReference) eContainer;
		int upperBound = dsgenref.getEcoreFeature().getUpperBound();
		if (upperBound == -1)
		{
			upperBound = getMaxAssociationNumber();
		}
		
		int result = upperBound;
		if (isSetRandomSeed() && (upperBound > 1))
		{
			int lb = dsgenref.getEcoreFeature().getLowerBound();
			result =  lb + getRandomizer().nextInt(upperBound-lb);
		}
		return result;
	}

} // MultipleAssociationGeneratorImpl
