/**
 * © OPCoach 2012
 */
package com.opcoach.dsgen.generator.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.opcoach.dsgen.DSGenClass;
import com.opcoach.dsgen.DSGenReference;
import com.opcoach.dsgen.generator.ChildrenGenerator;
import com.opcoach.dsgen.generator.DSGenGeneratorFactory;
import com.opcoach.dsgen.generator.DSGenGeneratorPackage;
import com.opcoach.dsgen.generator.EObjectGenerator;
import com.opcoach.generator.impl.ValueGeneratorImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Children Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.opcoach.dsgen.generator.impl.ChildrenGeneratorImpl#getMaxChildrenNumber <em>Max Children Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChildrenGeneratorImpl extends ValueGeneratorImpl<Collection<EObject>> implements ChildrenGenerator
{

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "© OPCoach 2012";

	/**
	 * The default value of the '{@link #getMaxChildrenNumber() <em>Max Children Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxChildrenNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_CHILDREN_NUMBER_EDEFAULT = 50;
	/**
	 * The cached value of the '{@link #getMaxChildrenNumber() <em>Max Children Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxChildrenNumber()
	 * @generated
	 * @ordered
	 */
	protected int maxChildrenNumber = MAX_CHILDREN_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildrenGeneratorImpl()
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
		return DSGenGeneratorPackage.Literals.CHILDREN_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxChildrenNumber()
	{
		return maxChildrenNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxChildrenNumber(int newMaxChildrenNumber)
	{
		int oldMaxChildrenNumber = maxChildrenNumber;
		maxChildrenNumber = newMaxChildrenNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSGenGeneratorPackage.CHILDREN_GENERATOR__MAX_CHILDREN_NUMBER,
					oldMaxChildrenNumber, maxChildrenNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
		case DSGenGeneratorPackage.CHILDREN_GENERATOR__MAX_CHILDREN_NUMBER:
			return getMaxChildrenNumber();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
		case DSGenGeneratorPackage.CHILDREN_GENERATOR__MAX_CHILDREN_NUMBER:
			setMaxChildrenNumber((Integer) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
		case DSGenGeneratorPackage.CHILDREN_GENERATOR__MAX_CHILDREN_NUMBER:
			setMaxChildrenNumber(MAX_CHILDREN_NUMBER_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
		case DSGenGeneratorPackage.CHILDREN_GENERATOR__MAX_CHILDREN_NUMBER:
			return maxChildrenNumber != MAX_CHILDREN_NUMBER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (maxChildrenNumber: ");
		result.append(maxChildrenNumber);
		result.append(')');
		return result.toString();
	}

	@Override
	protected Collection<EObject> generateRandomValue()
	{
		// Compute a random number of children
		return generateChildren(getMaxNbChildrenToCreate());
	}

	@Override
	protected Collection<EObject> generateSimpleValue()
	{
		return generateChildren(getMaxNbChildrenToCreate());
	}
	
	private int getMaxNbChildrenToCreate()
	{
		DSGenReference dsgenref = (DSGenReference) eContainer;
		int upperBound = dsgenref.getEcoreFeature().getUpperBound();
		if (upperBound == -1)
		{
			upperBound = getMaxChildrenNumber();
		}
		
		int result = upperBound;
		if (isSetRandomSeed() && (upperBound > 1))
		{
			int lb = dsgenref.getEcoreFeature().getLowerBound();
			result =  lb + getRandomizer().nextInt(upperBound-lb);
		}
		return result;
	}
	
	private Collection<EObject> generateChildren(int nbChildren)
	{

		EObjectGenerator generator = DSGenGeneratorFactory.eINSTANCE.createEObjectGenerator();

		Collection<EObject> result = new ArrayList<EObject>();
		// This generator is set in a dsgen reference
		DSGenReference dsgenref = (DSGenReference) eContainer;
		System.out.println("¡¡¡¡¡¡¡ Create " + nbChildren + " children on field " + dsgenref.getEcoreFeature().getName() + " for class "
				+ dsgenref.getDsgenClass().getEcoreClass().getName());

		DSGenClass targetClass = dsgenref.getTargetDSGenClass();
		generator.setTargetDSGenClass(targetClass);

		for (int i = 0; i < nbChildren; i++)
		{
			EObject obj = generator.generateValue();
			result.add(obj);
		}

		return result;
	}
	
	
	

} //ChildrenGeneratorImpl
