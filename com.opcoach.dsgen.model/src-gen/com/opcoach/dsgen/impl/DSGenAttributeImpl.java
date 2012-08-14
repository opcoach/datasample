/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.dsgen.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.opcoach.dsgen.DSGenAttribute;
import com.opcoach.dsgen.DataSampleGenPackage;
import com.opcoach.generator.ValueGenerator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>DS Gen Attribute</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DSGenAttributeImpl extends DSGenFeatureImpl implements DSGenAttribute
{
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "© OPCoach 2012";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DSGenAttributeImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return DataSampleGenPackage.Literals.DS_GEN_ATTRIBUTE;
	}

	@Override
	public String toString()
	{
		// TODO Auto-generated method stub
		return "DSGenAtt (for " + ((EClass) getEcoreFeature().eContainer()).getName() + "." + getEcoreFeature().getName() + ")";
	}

} // DSGenAttributeImpl
