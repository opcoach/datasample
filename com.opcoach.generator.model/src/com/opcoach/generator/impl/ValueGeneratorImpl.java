/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.generator.impl;

import java.util.Random;

import com.opcoach.generator.GeneratorPackage;
import com.opcoach.generator.ValueGenerator;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.opcoach.generator.impl.ValueGeneratorImpl#getBadValueProportion <em>Bad Value Proportion</em>}</li>
 *   <li>{@link com.opcoach.generator.impl.ValueGeneratorImpl#getBadValueGenerator <em>Bad Value Generator</em>}</li>
 *   <li>{@link com.opcoach.generator.impl.ValueGeneratorImpl#getLastGeneratedValue <em>Last Generated Value</em>}</li>
 *   <li>{@link com.opcoach.generator.impl.ValueGeneratorImpl#getRandomSeed <em>Random Seed</em>}</li>
 *   <li>{@link com.opcoach.generator.impl.ValueGeneratorImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.opcoach.generator.impl.ValueGeneratorImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.opcoach.generator.impl.ValueGeneratorImpl#getID <em>ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ValueGeneratorImpl<T> extends EObjectImpl implements ValueGenerator<T>
{
	/**
	 * The default value of the '{@link #getBadValueProportion() <em>Bad Value Proportion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBadValueProportion()
	 * @generated
	 * @ordered
	 */
	protected static final int BAD_VALUE_PROPORTION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBadValueProportion() <em>Bad Value Proportion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBadValueProportion()
	 * @generated
	 * @ordered
	 */
	protected int badValueProportion = BAD_VALUE_PROPORTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBadValueGenerator() <em>Bad Value Generator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBadValueGenerator()
	 * @generated
	 * @ordered
	 */
	protected ValueGenerator<T> badValueGenerator;

	/**
	 * The cached value of the '{@link #getLastGeneratedValue() <em>Last Generated Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastGeneratedValue()
	 * @generated
	 * @ordered
	 */
	protected T lastGeneratedValue;
	
	
	 /**
	 * The default value of the '{@link #getRandomSeed() <em>Random Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRandomSeed()
	 * @generated
	 * @ordered
	 */
	protected static final long RANDOM_SEED_EDEFAULT = 0L;

		/** The default SEED value for 'no random' */
    public static long NO_SEED = -1L;
    
 
	/** random seed. If NO_SEED -> no random */
	private long randomSeed = NO_SEED;
	
	/**
	 * This is true if the Random Seed attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean randomSeedESet;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Class<?> type;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/** The generator randomizer (if null -> no random) */
	private Random randomizer = null;
	/** the randomizer for bad values */
	private Random badValueRandomizer = null;
	/** the bad value seed, set as private field, may be public in the future */
	private static final long BAD_VALUE_SEED = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueGeneratorImpl()
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
		return GeneratorPackage.Literals.VALUE_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBadValueProportion()
	{
		return badValueProportion;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setBadValueProportionGen(int newBadValueProportion)
	{
		int oldBadValueProportion = badValueProportion;
		badValueProportion = newBadValueProportion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.VALUE_GENERATOR__BAD_VALUE_PROPORTION, oldBadValueProportion, badValueProportion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setBadValueProportion(int newBadValueProportion)
	{
		int boundedValue = Math.max(0, newBadValueProportion);
		boundedValue = Math.min(boundedValue, 100);
		
		setBadValueProportionGen(boundedValue);
		
		if (badValueProportion == 0)
			badValueRandomizer = null;
		else
			badValueRandomizer = new Random(BAD_VALUE_SEED);
		
		// Force description to be recomputed.
		description = null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueGenerator<T> getBadValueGenerator()
	{
		return badValueGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBadValueGenerator(ValueGenerator<T> newBadValueGenerator, NotificationChain msgs)
	{
		ValueGenerator<T> oldBadValueGenerator = badValueGenerator;
		badValueGenerator = newBadValueGenerator;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeneratorPackage.VALUE_GENERATOR__BAD_VALUE_GENERATOR, oldBadValueGenerator, newBadValueGenerator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBadValueGenerator(ValueGenerator<T> newBadValueGenerator)
	{
		if (newBadValueGenerator != badValueGenerator)
		{
			NotificationChain msgs = null;
			if (badValueGenerator != null)
				msgs = ((InternalEObject)badValueGenerator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeneratorPackage.VALUE_GENERATOR__BAD_VALUE_GENERATOR, null, msgs);
			if (newBadValueGenerator != null)
				msgs = ((InternalEObject)newBadValueGenerator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeneratorPackage.VALUE_GENERATOR__BAD_VALUE_GENERATOR, null, msgs);
			msgs = basicSetBadValueGenerator(newBadValueGenerator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.VALUE_GENERATOR__BAD_VALUE_GENERATOR, newBadValueGenerator, newBadValueGenerator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T getLastGeneratedValue()
	{
		return lastGeneratedValue;
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setRandomSeedGen(long newRandomSeed)
	{
		long oldRandomSeed = randomSeed;
		randomSeed = newRandomSeed;
		boolean oldRandomSeedESet = randomSeedESet;
		randomSeedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.VALUE_GENERATOR__RANDOM_SEED, oldRandomSeed, randomSeed, !oldRandomSeedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setRandomSeed(long newRandomSeed)
	{
		setRandomSeedGen(newRandomSeed);
		if (randomSeed == NO_SEED)
			randomizer = null;
		else
			randomizer = new Random(newRandomSeed);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRandomSeed()
	{
		long oldRandomSeed = randomSeed;
		boolean oldRandomSeedESet = randomSeedESet;
		randomSeed = RANDOM_SEED_EDEFAULT;
		randomSeedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GeneratorPackage.VALUE_GENERATOR__RANDOM_SEED, oldRandomSeed, RANDOM_SEED_EDEFAULT, oldRandomSeedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRandomSeed()
	{
		return randomSeedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getDescription()
	{
		if (description == null)
		{
			description = computeDescription();
		}
		
		return description;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class<?> getType()
	{
		return type;
	}


	protected String computeDescription()
	{
		// Compute a default description...
		return (badValueProportion == 0) ? "with no errors" : "with " + badValueProportion + " % of errors";
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public T generateValue()
	{
		T result = null;
		if (generateNowABadValue())
		{
			    result = generateBadValue();
		}
		else
		{
			// Generate random value ? 
			if (randomizer != null)
				result = generateRandomValue();
			else
				result = generateSimpleValue();
		}

		lastGeneratedValue = result;
		return result;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
/*	public Class<?> getType()
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}*/

	/** @return true if it's time to generate a bad value */
	protected boolean generateNowABadValue()
	{
		if (badValueProportion == 100)
			return true;

		if (badValueProportion == 0)
			return false;

		int val = badValueRandomizer.nextInt(100 - badValueProportion);
		return (val == 0);
	}

	
	/** A protected method to generate a bad value. Use the badvaludgenerator if fixed. 
	 * Can be overriden
	 * 
	 * @return a bad value for Type T
	 */
	protected T generateBadValue()
	{
		T  result = (badValueGenerator == null) ? null : badValueGenerator.generateValue();
		return result;
	}
	
	
	/** Get the randomizer (for subclasses)
	 * @return the randomizer to generate data
	 */
	protected Random getRandomizer()
	{
		return randomizer;
	}


	/** Implements this method in subclasses to generate the next random value */
	abstract protected T generateRandomValue();

	/** Implements this method in subclasses to generate the next simple value */
	abstract protected T generateSimpleValue();

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
			case GeneratorPackage.VALUE_GENERATOR__BAD_VALUE_PROPORTION:
				return getBadValueProportion();
			case GeneratorPackage.VALUE_GENERATOR__BAD_VALUE_GENERATOR:
				return getBadValueGenerator();
			case GeneratorPackage.VALUE_GENERATOR__LAST_GENERATED_VALUE:
				return getLastGeneratedValue();
			case GeneratorPackage.VALUE_GENERATOR__RANDOM_SEED:
				return getRandomSeed();
			case GeneratorPackage.VALUE_GENERATOR__DESCRIPTION:
				return getDescription();
			case GeneratorPackage.VALUE_GENERATOR__TYPE:
				return getType();
			case GeneratorPackage.VALUE_GENERATOR__ID:
				return getID();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case GeneratorPackage.VALUE_GENERATOR__BAD_VALUE_PROPORTION:
				setBadValueProportion((Integer)newValue);
				return;
			case GeneratorPackage.VALUE_GENERATOR__BAD_VALUE_GENERATOR:
				setBadValueGenerator((ValueGenerator<T>)newValue);
				return;
			case GeneratorPackage.VALUE_GENERATOR__RANDOM_SEED:
				setRandomSeed((Long)newValue);
				return;
			case GeneratorPackage.VALUE_GENERATOR__TYPE:
				setType((Class<?>)newValue);
				return;
			case GeneratorPackage.VALUE_GENERATOR__ID:
				setID((String)newValue);
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
			case GeneratorPackage.VALUE_GENERATOR__BAD_VALUE_PROPORTION:
				setBadValueProportion(BAD_VALUE_PROPORTION_EDEFAULT);
				return;
			case GeneratorPackage.VALUE_GENERATOR__BAD_VALUE_GENERATOR:
				setBadValueGenerator((ValueGenerator<T>)null);
				return;
			case GeneratorPackage.VALUE_GENERATOR__RANDOM_SEED:
				unsetRandomSeed();
				return;
			case GeneratorPackage.VALUE_GENERATOR__TYPE:
				setType((Class<?>)null);
				return;
			case GeneratorPackage.VALUE_GENERATOR__ID:
				setID(ID_EDEFAULT);
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
			case GeneratorPackage.VALUE_GENERATOR__BAD_VALUE_PROPORTION:
				return badValueProportion != BAD_VALUE_PROPORTION_EDEFAULT;
			case GeneratorPackage.VALUE_GENERATOR__BAD_VALUE_GENERATOR:
				return badValueGenerator != null;
			case GeneratorPackage.VALUE_GENERATOR__LAST_GENERATED_VALUE:
				return lastGeneratedValue != null;
			case GeneratorPackage.VALUE_GENERATOR__RANDOM_SEED:
				return isSetRandomSeed();
			case GeneratorPackage.VALUE_GENERATOR__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case GeneratorPackage.VALUE_GENERATOR__TYPE:
				return type != null;
			case GeneratorPackage.VALUE_GENERATOR__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (badValueProportion: ");
		result.append(badValueProportion);
		result.append(", lastGeneratedValue: ");
		result.append(lastGeneratedValue);
		result.append(", randomSeed: ");
		if (randomSeedESet) result.append(randomSeed); else result.append("<unset>");
		result.append(", description: ");
		result.append(description);
		result.append(", type: ");
		result.append(type);
		result.append(", ID: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Class<?> newType)
	{
		Class<?> oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.VALUE_GENERATOR__TYPE, oldType, type));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID()
	{
		return id;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID)
	{
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.VALUE_GENERATOR__ID, oldID, id));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case GeneratorPackage.VALUE_GENERATOR__BAD_VALUE_GENERATOR:
				return basicSetBadValueGenerator(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

} //ValueGeneratorImpl
