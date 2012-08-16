/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.dsgen.impl;

import com.opcoach.dsgen.BadValueGeneratorRegistry;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.opcoach.dsgen.DSGenClass;
import com.opcoach.dsgen.DSGenClassifier;
import com.opcoach.dsgen.DSGenModel;
import com.opcoach.dsgen.DSGenPackage;
import com.opcoach.dsgen.DataSampleGenPackage;
import com.opcoach.generator.ValueGenerator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>DS Gen Model</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.opcoach.dsgen.impl.DSGenModelImpl#getDsgenPackages <em>Dsgen Packages</em>}</li>
 *   <li>{@link com.opcoach.dsgen.impl.DSGenModelImpl#getRandomSeed <em>Random Seed</em>}</li>
 *   <li>{@link com.opcoach.dsgen.impl.DSGenModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.opcoach.dsgen.impl.DSGenModelImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link com.opcoach.dsgen.impl.DSGenModelImpl#getBadGenerators <em>Bad Generators</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DSGenModelImpl extends DSGenBaseImpl implements DSGenModel
{
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "© OPCoach 2012";
	/**
	 * The cached value of the '{@link #getDsgenPackages() <em>Dsgen Packages</em>}' containment reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getDsgenPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<DSGenPackage> dsgenPackages;

	/**
	 * The default value of the '{@link #getRandomSeed() <em>Random Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRandomSeed()
	 * @generated
	 * @ordered
	 */
	protected static final long RANDOM_SEED_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getRandomSeed() <em>Random Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRandomSeed()
	 * @generated
	 * @ordered
	 */
	protected long randomSeed = RANDOM_SEED_EDEFAULT;
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBadGenerators() <em>Bad Generators</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBadGenerators()
	 * @generated
	 * @ordered
	 */
	protected BadValueGeneratorRegistry badGenerators;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DSGenModelImpl()
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
		return DataSampleGenPackage.Literals.DS_GEN_MODEL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DSGenPackage> getDsgenPackages()
	{
		if (dsgenPackages == null)
		{
			dsgenPackages = new EObjectContainmentWithInverseEList<DSGenPackage>(DSGenPackage.class, this,
					DataSampleGenPackage.DS_GEN_MODEL__DSGEN_PACKAGES, DataSampleGenPackage.DS_GEN_PACKAGE__DSGEN_MODEL);
		}
		return dsgenPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getRandomSeed()
	{
		return randomSeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRandomSeed(long newRandomSeed)
	{
		long oldRandomSeed = randomSeed;
		randomSeed = newRandomSeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataSampleGenPackage.DS_GEN_MODEL__RANDOM_SEED, oldRandomSeed,
					randomSeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataSampleGenPackage.DS_GEN_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguage()
	{
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(String newLanguage)
	{
		String oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataSampleGenPackage.DS_GEN_MODEL__LANGUAGE, oldLanguage,
					language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BadValueGeneratorRegistry getBadGenerators()
	{
		return badGenerators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBadGenerators(BadValueGeneratorRegistry newBadGenerators, NotificationChain msgs)
	{
		BadValueGeneratorRegistry oldBadGenerators = badGenerators;
		badGenerators = newBadGenerators;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DataSampleGenPackage.DS_GEN_MODEL__BAD_GENERATORS, oldBadGenerators, newBadGenerators);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBadGenerators(BadValueGeneratorRegistry newBadGenerators)
	{
		if (newBadGenerators != badGenerators)
		{
			NotificationChain msgs = null;
			if (badGenerators != null)
				msgs = ((InternalEObject) badGenerators).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- DataSampleGenPackage.DS_GEN_MODEL__BAD_GENERATORS, null, msgs);
			if (newBadGenerators != null)
				msgs = ((InternalEObject) newBadGenerators).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- DataSampleGenPackage.DS_GEN_MODEL__BAD_GENERATORS, null, msgs);
			msgs = basicSetBadGenerators(newBadGenerators, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataSampleGenPackage.DS_GEN_MODEL__BAD_GENERATORS,
					newBadGenerators, newBadGenerators));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public DSGenClass getRoot()
	{
		DSGenClass result = null;
		for (DSGenPackage p : getDsgenPackages())
		{
			for (DSGenClassifier c : p.getDsgenClassifiers())
			{
				if (c instanceof DSGenClass)
				{
					if (((DSGenClass) c).isRootObject())
					{
						result = (DSGenClass) c;
						break;
					}
				}
			}

		}
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
		case DataSampleGenPackage.DS_GEN_MODEL__DSGEN_PACKAGES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDsgenPackages()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
		case DataSampleGenPackage.DS_GEN_MODEL__DSGEN_PACKAGES:
			return ((InternalEList<?>) getDsgenPackages()).basicRemove(otherEnd, msgs);
		case DataSampleGenPackage.DS_GEN_MODEL__BAD_GENERATORS:
			return basicSetBadGenerators(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
		case DataSampleGenPackage.DS_GEN_MODEL__DSGEN_PACKAGES:
			return getDsgenPackages();
		case DataSampleGenPackage.DS_GEN_MODEL__RANDOM_SEED:
			return getRandomSeed();
		case DataSampleGenPackage.DS_GEN_MODEL__NAME:
			return getName();
		case DataSampleGenPackage.DS_GEN_MODEL__LANGUAGE:
			return getLanguage();
		case DataSampleGenPackage.DS_GEN_MODEL__BAD_GENERATORS:
			return getBadGenerators();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
		case DataSampleGenPackage.DS_GEN_MODEL__DSGEN_PACKAGES:
			getDsgenPackages().clear();
			getDsgenPackages().addAll((Collection<? extends DSGenPackage>) newValue);
			return;
		case DataSampleGenPackage.DS_GEN_MODEL__RANDOM_SEED:
			setRandomSeed((Long) newValue);
			return;
		case DataSampleGenPackage.DS_GEN_MODEL__NAME:
			setName((String) newValue);
			return;
		case DataSampleGenPackage.DS_GEN_MODEL__LANGUAGE:
			setLanguage((String) newValue);
			return;
		case DataSampleGenPackage.DS_GEN_MODEL__BAD_GENERATORS:
			setBadGenerators((BadValueGeneratorRegistry) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
		case DataSampleGenPackage.DS_GEN_MODEL__DSGEN_PACKAGES:
			getDsgenPackages().clear();
			return;
		case DataSampleGenPackage.DS_GEN_MODEL__RANDOM_SEED:
			setRandomSeed(RANDOM_SEED_EDEFAULT);
			return;
		case DataSampleGenPackage.DS_GEN_MODEL__NAME:
			setName(NAME_EDEFAULT);
			return;
		case DataSampleGenPackage.DS_GEN_MODEL__LANGUAGE:
			setLanguage(LANGUAGE_EDEFAULT);
			return;
		case DataSampleGenPackage.DS_GEN_MODEL__BAD_GENERATORS:
			setBadGenerators((BadValueGeneratorRegistry) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
		case DataSampleGenPackage.DS_GEN_MODEL__DSGEN_PACKAGES:
			return dsgenPackages != null && !dsgenPackages.isEmpty();
		case DataSampleGenPackage.DS_GEN_MODEL__RANDOM_SEED:
			return randomSeed != RANDOM_SEED_EDEFAULT;
		case DataSampleGenPackage.DS_GEN_MODEL__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case DataSampleGenPackage.DS_GEN_MODEL__LANGUAGE:
			return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
		case DataSampleGenPackage.DS_GEN_MODEL__BAD_GENERATORS:
			return badGenerators != null;
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
		result.append(" (randomSeed: ");
		result.append(randomSeed);
		result.append(", name: ");
		result.append(name);
		result.append(", language: ");
		result.append(language);
		result.append(')');
		return result.toString();
	}

} // DSGenModelImpl
