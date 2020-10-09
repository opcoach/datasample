/**
 */
package com.opcoach.datasample.impl;

import com.opcoach.datasample.DataSample;
import com.opcoach.datasample.EntityGenerator;
import com.opcoach.datasample.Language;
import com.opcoach.datasample.MDatasamplePackage;

import com.opcoach.generator.impl.ValueGeneratorImpl;
import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Sample</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.opcoach.datasample.impl.MDataSampleImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.opcoach.datasample.impl.MDataSampleImpl#getSeed <em>Seed</em>}</li>
 *   <li>{@link com.opcoach.datasample.impl.MDataSampleImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link com.opcoach.datasample.impl.MDataSampleImpl#getPackageURI <em>Package URI</em>}</li>
 *   <li>{@link com.opcoach.datasample.impl.MDataSampleImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link com.opcoach.datasample.impl.MDataSampleImpl#getEntityGenerators <em>Entity Generators</em>}</li>
 *   <li>{@link com.opcoach.datasample.impl.MDataSampleImpl#getRootEntity <em>Root Entity</em>}</li>
 *   <li>{@link com.opcoach.datasample.impl.MDataSampleImpl#getRootEntityName <em>Root Entity Name</em>}</li>
 *   <li>{@link com.opcoach.datasample.impl.MDataSampleImpl#getBadValueGeneratorNames <em>Bad Value Generator Names</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MDataSampleImpl extends ValueGeneratorImpl<EObject> implements DataSample {
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
	 * The default value of the '{@link #getSeed() <em>Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeed()
	 * @generated
	 * @ordered
	 */
	protected static final int SEED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSeed() <em>Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeed()
	 * @generated
	 * @ordered
	 */
	protected int seed = SEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final Language LANGUAGE_EDEFAULT = Language.FR;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected Language language = LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPackageURI() <em>Package URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageURI()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackageURI() <em>Package URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageURI()
	 * @generated
	 * @ordered
	 */
	protected String packageURI = PACKAGE_URI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected EPackage package_;

	/**
	 * The cached value of the '{@link #getEntityGenerators() <em>Entity Generators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityGenerators()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityGenerator> entityGenerators;

	/**
	 * The cached value of the '{@link #getRootEntity() <em>Root Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootEntity()
	 * @generated
	 * @ordered
	 */
	protected EClass rootEntity;

	/**
	 * The default value of the '{@link #getRootEntityName() <em>Root Entity Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootEntityName()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOT_ENTITY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRootEntityName() <em>Root Entity Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootEntityName()
	 * @generated
	 * @ordered
	 */
	protected String rootEntityName = ROOT_ENTITY_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBadValueGeneratorNames() <em>Bad Value Generator Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBadValueGeneratorNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> badValueGeneratorNames;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MDataSampleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MDatasamplePackage.Literals.DATA_SAMPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setLastGeneratedValue(EObject newLastGeneratedValue) {
		super.setLastGeneratedValue(newLastGeneratedValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDatasamplePackage.DATA_SAMPLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSeed() {
		return seed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeed(int newSeed) {
		int oldSeed = seed;
		seed = newSeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDatasamplePackage.DATA_SAMPLE__SEED, oldSeed, seed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Language getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLanguage(Language newLanguage) {
		Language oldLanguage = language;
		language = newLanguage == null ? LANGUAGE_EDEFAULT : newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDatasamplePackage.DATA_SAMPLE__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPackageURI() {
		return packageURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPackageURI(String newPackageURI) {
		String oldPackageURI = packageURI;
		packageURI = newPackageURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDatasamplePackage.DATA_SAMPLE__PACKAGE_URI, oldPackageURI, packageURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EPackage getPackage() {
		if (package_ != null && package_.eIsProxy()) {
			InternalEObject oldPackage = (InternalEObject)package_;
			package_ = (EPackage)eResolveProxy(oldPackage);
			if (package_ != oldPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MDatasamplePackage.DATA_SAMPLE__PACKAGE, oldPackage, package_));
			}
		}
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage basicGetPackage() {
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPackage(EPackage newPackage) {
		EPackage oldPackage = package_;
		package_ = newPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDatasamplePackage.DATA_SAMPLE__PACKAGE, oldPackage, package_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EntityGenerator> getEntityGenerators() {
		if (entityGenerators == null) {
			entityGenerators = new EObjectContainmentEList<EntityGenerator>(EntityGenerator.class, this, MDatasamplePackage.DATA_SAMPLE__ENTITY_GENERATORS);
		}
		return entityGenerators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRootEntity() {
		if (rootEntity != null && rootEntity.eIsProxy()) {
			InternalEObject oldRootEntity = (InternalEObject)rootEntity;
			rootEntity = (EClass)eResolveProxy(oldRootEntity);
			if (rootEntity != oldRootEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MDatasamplePackage.DATA_SAMPLE__ROOT_ENTITY, oldRootEntity, rootEntity));
			}
		}
		return rootEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetRootEntity() {
		return rootEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRootEntity(EClass newRootEntity) {
		EClass oldRootEntity = rootEntity;
		rootEntity = newRootEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDatasamplePackage.DATA_SAMPLE__ROOT_ENTITY, oldRootEntity, rootEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRootEntityName() {
		return rootEntityName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRootEntityName(String newRootEntityName) {
		String oldRootEntityName = rootEntityName;
		rootEntityName = newRootEntityName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDatasamplePackage.DATA_SAMPLE__ROOT_ENTITY_NAME, oldRootEntityName, rootEntityName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getBadValueGeneratorNames() {
		if (badValueGeneratorNames == null) {
			badValueGeneratorNames = new EDataTypeUniqueEList<String>(String.class, this, MDatasamplePackage.DATA_SAMPLE__BAD_VALUE_GENERATOR_NAMES);
		}
		return badValueGeneratorNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MDatasamplePackage.DATA_SAMPLE__ENTITY_GENERATORS:
				return ((InternalEList<?>)getEntityGenerators()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MDatasamplePackage.DATA_SAMPLE__NAME:
				return getName();
			case MDatasamplePackage.DATA_SAMPLE__SEED:
				return getSeed();
			case MDatasamplePackage.DATA_SAMPLE__LANGUAGE:
				return getLanguage();
			case MDatasamplePackage.DATA_SAMPLE__PACKAGE_URI:
				return getPackageURI();
			case MDatasamplePackage.DATA_SAMPLE__PACKAGE:
				if (resolve) return getPackage();
				return basicGetPackage();
			case MDatasamplePackage.DATA_SAMPLE__ENTITY_GENERATORS:
				return getEntityGenerators();
			case MDatasamplePackage.DATA_SAMPLE__ROOT_ENTITY:
				if (resolve) return getRootEntity();
				return basicGetRootEntity();
			case MDatasamplePackage.DATA_SAMPLE__ROOT_ENTITY_NAME:
				return getRootEntityName();
			case MDatasamplePackage.DATA_SAMPLE__BAD_VALUE_GENERATOR_NAMES:
				return getBadValueGeneratorNames();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MDatasamplePackage.DATA_SAMPLE__NAME:
				setName((String)newValue);
				return;
			case MDatasamplePackage.DATA_SAMPLE__SEED:
				setSeed((Integer)newValue);
				return;
			case MDatasamplePackage.DATA_SAMPLE__LANGUAGE:
				setLanguage((Language)newValue);
				return;
			case MDatasamplePackage.DATA_SAMPLE__PACKAGE_URI:
				setPackageURI((String)newValue);
				return;
			case MDatasamplePackage.DATA_SAMPLE__PACKAGE:
				setPackage((EPackage)newValue);
				return;
			case MDatasamplePackage.DATA_SAMPLE__ENTITY_GENERATORS:
				getEntityGenerators().clear();
				getEntityGenerators().addAll((Collection<? extends EntityGenerator>)newValue);
				return;
			case MDatasamplePackage.DATA_SAMPLE__ROOT_ENTITY:
				setRootEntity((EClass)newValue);
				return;
			case MDatasamplePackage.DATA_SAMPLE__ROOT_ENTITY_NAME:
				setRootEntityName((String)newValue);
				return;
			case MDatasamplePackage.DATA_SAMPLE__BAD_VALUE_GENERATOR_NAMES:
				getBadValueGeneratorNames().clear();
				getBadValueGeneratorNames().addAll((Collection<? extends String>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case MDatasamplePackage.DATA_SAMPLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MDatasamplePackage.DATA_SAMPLE__SEED:
				setSeed(SEED_EDEFAULT);
				return;
			case MDatasamplePackage.DATA_SAMPLE__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case MDatasamplePackage.DATA_SAMPLE__PACKAGE_URI:
				setPackageURI(PACKAGE_URI_EDEFAULT);
				return;
			case MDatasamplePackage.DATA_SAMPLE__PACKAGE:
				setPackage((EPackage)null);
				return;
			case MDatasamplePackage.DATA_SAMPLE__ENTITY_GENERATORS:
				getEntityGenerators().clear();
				return;
			case MDatasamplePackage.DATA_SAMPLE__ROOT_ENTITY:
				setRootEntity((EClass)null);
				return;
			case MDatasamplePackage.DATA_SAMPLE__ROOT_ENTITY_NAME:
				setRootEntityName(ROOT_ENTITY_NAME_EDEFAULT);
				return;
			case MDatasamplePackage.DATA_SAMPLE__BAD_VALUE_GENERATOR_NAMES:
				getBadValueGeneratorNames().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MDatasamplePackage.DATA_SAMPLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MDatasamplePackage.DATA_SAMPLE__SEED:
				return seed != SEED_EDEFAULT;
			case MDatasamplePackage.DATA_SAMPLE__LANGUAGE:
				return language != LANGUAGE_EDEFAULT;
			case MDatasamplePackage.DATA_SAMPLE__PACKAGE_URI:
				return PACKAGE_URI_EDEFAULT == null ? packageURI != null : !PACKAGE_URI_EDEFAULT.equals(packageURI);
			case MDatasamplePackage.DATA_SAMPLE__PACKAGE:
				return package_ != null;
			case MDatasamplePackage.DATA_SAMPLE__ENTITY_GENERATORS:
				return entityGenerators != null && !entityGenerators.isEmpty();
			case MDatasamplePackage.DATA_SAMPLE__ROOT_ENTITY:
				return rootEntity != null;
			case MDatasamplePackage.DATA_SAMPLE__ROOT_ENTITY_NAME:
				return ROOT_ENTITY_NAME_EDEFAULT == null ? rootEntityName != null : !ROOT_ENTITY_NAME_EDEFAULT.equals(rootEntityName);
			case MDatasamplePackage.DATA_SAMPLE__BAD_VALUE_GENERATOR_NAMES:
				return badValueGeneratorNames != null && !badValueGeneratorNames.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", seed: ");
		result.append(seed);
		result.append(", language: ");
		result.append(language);
		result.append(", packageURI: ");
		result.append(packageURI);
		result.append(", rootEntityName: ");
		result.append(rootEntityName);
		result.append(", badValueGeneratorNames: ");
		result.append(badValueGeneratorNames);
		result.append(')');
		return result.toString();
	}

} //MDataSampleImpl
