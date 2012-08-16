/**
 * © OPCoach 2012
 */
package com.opcoach.dsgen.generator.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.opcoach.dsgen.DSGenAttribute;
import com.opcoach.dsgen.DSGenClass;
import com.opcoach.dsgen.DSGenFeature;
import com.opcoach.dsgen.DSGenReference;
import com.opcoach.dsgen.generator.DSGenGeneratorPackage;
import com.opcoach.dsgen.generator.EObjectGenerator;
import com.opcoach.generator.ValueGenerator;
import com.opcoach.generator.impl.ValueGeneratorImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>EObject Generator</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.opcoach.dsgen.generator.impl.EObjectGeneratorImpl#getTargetDSGenClass <em>Target DS Gen Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EObjectGeneratorImpl extends ValueGeneratorImpl<EObject> implements EObjectGenerator
{
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "© OPCoach 2012";

	/**
	 * The cached value of the '{@link #getTargetDSGenClass() <em>Target DS Gen Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDSGenClass()
	 * @generated
	 * @ordered
	 */
	protected DSGenClass targetDSGenClass;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EObjectGeneratorImpl()
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
		return DSGenGeneratorPackage.Literals.EOBJECT_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSGenClass getTargetDSGenClass()
	{
		if (targetDSGenClass != null && targetDSGenClass.eIsProxy())
		{
			InternalEObject oldTargetDSGenClass = (InternalEObject) targetDSGenClass;
			targetDSGenClass = (DSGenClass) eResolveProxy(oldTargetDSGenClass);
			if (targetDSGenClass != oldTargetDSGenClass)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DSGenGeneratorPackage.EOBJECT_GENERATOR__TARGET_DS_GEN_CLASS, oldTargetDSGenClass, targetDSGenClass));
			}
		}
		return targetDSGenClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Collection<EObject> getInstances(EClass cl)
	{
		return eobjectRegistry.get(cl);
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
		case DSGenGeneratorPackage.EOBJECT_GENERATOR__TARGET_DS_GEN_CLASS:
			if (resolve)
				return getTargetDSGenClass();
			return basicGetTargetDSGenClass();
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
		case DSGenGeneratorPackage.EOBJECT_GENERATOR__TARGET_DS_GEN_CLASS:
			setTargetDSGenClass((DSGenClass) newValue);
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
		case DSGenGeneratorPackage.EOBJECT_GENERATOR__TARGET_DS_GEN_CLASS:
			setTargetDSGenClass((DSGenClass) null);
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
		case DSGenGeneratorPackage.EOBJECT_GENERATOR__TARGET_DS_GEN_CLASS:
			return targetDSGenClass != null;
		}
		return super.eIsSet(featureID);
	}

	// The EObject Registry.
	private static Map<EClass, Collection<EObject>> eobjectRegistry = new HashMap<EClass, Collection<EObject>>();

	@Override
	protected EObject generateRandomValue()
	{
		// there is not really random values for EObjectGenerator.
		return generateSimpleValue();
	}

	@Override
	protected EObject generateSimpleValue()
	{
		// instanciate a sample EObject class from its description in dsgenclass and init all fields
		// Store this object in a static map used by the reference generators.

		DSGenClass c = findTargetDSGenClass();
		EClass clToInstanciate = c.getEcoreClass();
		EObject obj = EcoreUtil.create(clToInstanciate);
		System.out.println("Instaciate a new " + clToInstanciate.getName());

		// Initialize each feature found in DSGenClass
		for (DSGenFeature ft : c.getDsgenFeatures())
		{
			if (ft instanceof DSGenAttribute)
			{
				ValueGenerator<?> gen = ((DSGenAttribute) ft).getGenerator();
				if (gen != null)
					gen.setLocale(locale);
				String genClass = (gen == null) ? "" : " generator class : " + gen.getClass().toString();
				Object genval = (gen == null) ? null : gen.generateValue();
				Object val = (gen == null) ? null : genval;
				System.out.println("For the feature : " + ft.getEcoreFeature().getName() + " generate this value : " + val);
				obj.eSet(ft.getEcoreFeature(), val);
			} else if (ft instanceof DSGenReference)
			{
				DSGenReference dsgref = (DSGenReference) ft;
				EReference ref = (EReference) dsgref.getEcoreFeature();

				ValueGenerator<?> gen = dsgref.getGenerator();
				if (gen != null)
					gen.setLocale(locale);
				String genClass = (gen == null) ? "" : " generator class : " + gen.getClass().toString();
				Object genval = (gen == null) ? null : gen.generateValue();
				Object val = (gen == null) ? "NO GENERATOR" : genval;
				System.out.println("For the feature : " + ft.getEcoreFeature().getName() + " generate this value : " + val
						+ genClass);

				if (ref.getUpperBound() == 1)
					obj.eSet(ref, val);
				else
				{
					// For multiple values, get the Collection and add the result inside...
					System.out.println("classe du child " + obj.eGet(ref).getClass().toString());
					@SuppressWarnings("unchecked")
					Collection<Object> childrenListinRoot = (Collection<Object>) obj.eGet(ref);
					childrenListinRoot.addAll((Collection<?>) val);
				}

				// Set the values for the reference generator.
				//ReferenceGenerator<EObject> refgen = (ReferenceGenerator<EObject>) dsgenRef.getGenerator();
				//refgen.setValues(children);

			}
		}

		// Ok this object is instanciated, must register it for Association generators
		registerObject(clToInstanciate, obj);

		//addChildren(obj, c, l);

		return obj;
	}

	private DSGenClass findTargetDSGenClass()
	{
		// If set, return it
		DSGenClass result = getTargetDSGenClass();
		if (result != null)
			return result;

		// If not set try to find it using the parent (econtainer())			
		EObject parent = eContainer();
		if (parent instanceof DSGenClass)
			return ((DSGenClass) parent);
		else if (parent instanceof DSGenReference)
			return ((DSGenReference) parent).getTargetDSGenClass();

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSGenClass basicGetTargetDSGenClass()
	{
		return targetDSGenClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetDSGenClass(DSGenClass newTargetDSGenClass)
	{
		DSGenClass oldTargetDSGenClass = targetDSGenClass;
		targetDSGenClass = newTargetDSGenClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSGenGeneratorPackage.EOBJECT_GENERATOR__TARGET_DS_GEN_CLASS,
					oldTargetDSGenClass, targetDSGenClass));
	}

	private void registerObject(EClass c, EObject o)
	{
		Collection<EObject> values = eobjectRegistry.get(c);
		if (values == null)
		{
			values = new ArrayList<EObject>();
			eobjectRegistry.put(c, values);
		}
		values.add(o);
	}

} // EObjectGeneratorImpl
