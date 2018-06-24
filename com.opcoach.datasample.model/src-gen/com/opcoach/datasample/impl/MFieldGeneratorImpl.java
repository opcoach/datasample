/**
 */
package com.opcoach.datasample.impl;

import com.opcoach.datasample.FieldGenerator;
import com.opcoach.datasample.MDatasamplePackage;

import com.opcoach.generator.ValueGenerator;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.opcoach.datasample.impl.MFieldGeneratorImpl#getEntityName <em>Entity Name</em>}</li>
 *   <li>{@link com.opcoach.datasample.impl.MFieldGeneratorImpl#getFieldName <em>Field Name</em>}</li>
 *   <li>{@link com.opcoach.datasample.impl.MFieldGeneratorImpl#getGenerator <em>Generator</em>}</li>
 *   <li>{@link com.opcoach.datasample.impl.MFieldGeneratorImpl#getStructuralFeature <em>Structural Feature</em>}</li>
 *   <li>{@link com.opcoach.datasample.impl.MFieldGeneratorImpl#getErrorRate <em>Error Rate</em>}</li>
 *   <li>{@link com.opcoach.datasample.impl.MFieldGeneratorImpl#getGeneratorName <em>Generator Name</em>}</li>
 *   <li>{@link com.opcoach.datasample.impl.MFieldGeneratorImpl#getErrorGeneratorName <em>Error Generator Name</em>}</li>
 *   <li>{@link com.opcoach.datasample.impl.MFieldGeneratorImpl#getErrorGenerator <em>Error Generator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MFieldGeneratorImpl extends MinimalEObjectImpl.Container implements FieldGenerator {
	/**
	 * The default value of the '{@link #getEntityName() <em>Entity Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityName()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTITY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntityName() <em>Entity Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityName()
	 * @generated
	 * @ordered
	 */
	protected String entityName = ENTITY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFieldName() <em>Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIELD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFieldName() <em>Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldName()
	 * @generated
	 * @ordered
	 */
	protected String fieldName = FIELD_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGenerator() <em>Generator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerator()
	 * @generated
	 * @ordered
	 */
	protected ValueGenerator<?> generator;

	/**
	 * The cached value of the '{@link #getStructuralFeature() <em>Structural Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuralFeature()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature structuralFeature;

	/**
	 * The default value of the '{@link #getErrorRate() <em>Error Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorRate()
	 * @generated
	 * @ordered
	 */
	protected static final int ERROR_RATE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getErrorRate() <em>Error Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorRate()
	 * @generated
	 * @ordered
	 */
	protected int errorRate = ERROR_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratorName() <em>Generator Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratorName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATOR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeneratorName() <em>Generator Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratorName()
	 * @generated
	 * @ordered
	 */
	protected String generatorName = GENERATOR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getErrorGeneratorName() <em>Error Generator Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorGeneratorName()
	 * @generated
	 * @ordered
	 */
	protected static final String ERROR_GENERATOR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErrorGeneratorName() <em>Error Generator Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorGeneratorName()
	 * @generated
	 * @ordered
	 */
	protected String errorGeneratorName = ERROR_GENERATOR_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getErrorGenerator() <em>Error Generator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorGenerator()
	 * @generated
	 * @ordered
	 */
	protected ValueGenerator<?> errorGenerator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MFieldGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MDatasamplePackage.Literals.FIELD_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEntityName() {
		return entityName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntityName(String newEntityName) {
		String oldEntityName = entityName;
		entityName = newEntityName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDatasamplePackage.FIELD_GENERATOR__ENTITY_NAME, oldEntityName, entityName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFieldName() {
		return fieldName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldName(String newFieldName) {
		String oldFieldName = fieldName;
		fieldName = newFieldName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDatasamplePackage.FIELD_GENERATOR__FIELD_NAME, oldFieldName, fieldName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueGenerator<?> getGenerator() {
		if (generator != null && generator.eIsProxy()) {
			InternalEObject oldGenerator = (InternalEObject)generator;
			generator = (ValueGenerator<?>)eResolveProxy(oldGenerator);
			if (generator != oldGenerator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MDatasamplePackage.FIELD_GENERATOR__GENERATOR, oldGenerator, generator));
			}
		}
		return generator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueGenerator<?> basicGetGenerator() {
		return generator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerator(ValueGenerator<?> newGenerator) {
		ValueGenerator<?> oldGenerator = generator;
		generator = newGenerator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDatasamplePackage.FIELD_GENERATOR__GENERATOR, oldGenerator, generator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature getStructuralFeature() {
		if (structuralFeature != null && structuralFeature.eIsProxy()) {
			InternalEObject oldStructuralFeature = (InternalEObject)structuralFeature;
			structuralFeature = (EStructuralFeature)eResolveProxy(oldStructuralFeature);
			if (structuralFeature != oldStructuralFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MDatasamplePackage.FIELD_GENERATOR__STRUCTURAL_FEATURE, oldStructuralFeature, structuralFeature));
			}
		}
		return structuralFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature basicGetStructuralFeature() {
		return structuralFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructuralFeature(EStructuralFeature newStructuralFeature) {
		EStructuralFeature oldStructuralFeature = structuralFeature;
		structuralFeature = newStructuralFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDatasamplePackage.FIELD_GENERATOR__STRUCTURAL_FEATURE, oldStructuralFeature, structuralFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getErrorRate() {
		return errorRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorRate(int newErrorRate) {
		int oldErrorRate = errorRate;
		errorRate = newErrorRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDatasamplePackage.FIELD_GENERATOR__ERROR_RATE, oldErrorRate, errorRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGeneratorName() {
		return generatorName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneratorName(String newGeneratorName) {
		String oldGeneratorName = generatorName;
		generatorName = newGeneratorName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDatasamplePackage.FIELD_GENERATOR__GENERATOR_NAME, oldGeneratorName, generatorName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getErrorGeneratorName() {
		return errorGeneratorName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorGeneratorName(String newErrorGeneratorName) {
		String oldErrorGeneratorName = errorGeneratorName;
		errorGeneratorName = newErrorGeneratorName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDatasamplePackage.FIELD_GENERATOR__ERROR_GENERATOR_NAME, oldErrorGeneratorName, errorGeneratorName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueGenerator<?> getErrorGenerator() {
		if (errorGenerator != null && errorGenerator.eIsProxy()) {
			InternalEObject oldErrorGenerator = (InternalEObject)errorGenerator;
			errorGenerator = (ValueGenerator<?>)eResolveProxy(oldErrorGenerator);
			if (errorGenerator != oldErrorGenerator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MDatasamplePackage.FIELD_GENERATOR__ERROR_GENERATOR, oldErrorGenerator, errorGenerator));
			}
		}
		return errorGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueGenerator<?> basicGetErrorGenerator() {
		return errorGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorGenerator(ValueGenerator<?> newErrorGenerator) {
		ValueGenerator<?> oldErrorGenerator = errorGenerator;
		errorGenerator = newErrorGenerator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDatasamplePackage.FIELD_GENERATOR__ERROR_GENERATOR, oldErrorGenerator, errorGenerator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MDatasamplePackage.FIELD_GENERATOR__ENTITY_NAME:
				return getEntityName();
			case MDatasamplePackage.FIELD_GENERATOR__FIELD_NAME:
				return getFieldName();
			case MDatasamplePackage.FIELD_GENERATOR__GENERATOR:
				if (resolve) return getGenerator();
				return basicGetGenerator();
			case MDatasamplePackage.FIELD_GENERATOR__STRUCTURAL_FEATURE:
				if (resolve) return getStructuralFeature();
				return basicGetStructuralFeature();
			case MDatasamplePackage.FIELD_GENERATOR__ERROR_RATE:
				return getErrorRate();
			case MDatasamplePackage.FIELD_GENERATOR__GENERATOR_NAME:
				return getGeneratorName();
			case MDatasamplePackage.FIELD_GENERATOR__ERROR_GENERATOR_NAME:
				return getErrorGeneratorName();
			case MDatasamplePackage.FIELD_GENERATOR__ERROR_GENERATOR:
				if (resolve) return getErrorGenerator();
				return basicGetErrorGenerator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MDatasamplePackage.FIELD_GENERATOR__ENTITY_NAME:
				setEntityName((String)newValue);
				return;
			case MDatasamplePackage.FIELD_GENERATOR__FIELD_NAME:
				setFieldName((String)newValue);
				return;
			case MDatasamplePackage.FIELD_GENERATOR__GENERATOR:
				setGenerator((ValueGenerator<?>)newValue);
				return;
			case MDatasamplePackage.FIELD_GENERATOR__STRUCTURAL_FEATURE:
				setStructuralFeature((EStructuralFeature)newValue);
				return;
			case MDatasamplePackage.FIELD_GENERATOR__ERROR_RATE:
				setErrorRate((Integer)newValue);
				return;
			case MDatasamplePackage.FIELD_GENERATOR__GENERATOR_NAME:
				setGeneratorName((String)newValue);
				return;
			case MDatasamplePackage.FIELD_GENERATOR__ERROR_GENERATOR_NAME:
				setErrorGeneratorName((String)newValue);
				return;
			case MDatasamplePackage.FIELD_GENERATOR__ERROR_GENERATOR:
				setErrorGenerator((ValueGenerator<?>)newValue);
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
			case MDatasamplePackage.FIELD_GENERATOR__ENTITY_NAME:
				setEntityName(ENTITY_NAME_EDEFAULT);
				return;
			case MDatasamplePackage.FIELD_GENERATOR__FIELD_NAME:
				setFieldName(FIELD_NAME_EDEFAULT);
				return;
			case MDatasamplePackage.FIELD_GENERATOR__GENERATOR:
				setGenerator((ValueGenerator<?>)null);
				return;
			case MDatasamplePackage.FIELD_GENERATOR__STRUCTURAL_FEATURE:
				setStructuralFeature((EStructuralFeature)null);
				return;
			case MDatasamplePackage.FIELD_GENERATOR__ERROR_RATE:
				setErrorRate(ERROR_RATE_EDEFAULT);
				return;
			case MDatasamplePackage.FIELD_GENERATOR__GENERATOR_NAME:
				setGeneratorName(GENERATOR_NAME_EDEFAULT);
				return;
			case MDatasamplePackage.FIELD_GENERATOR__ERROR_GENERATOR_NAME:
				setErrorGeneratorName(ERROR_GENERATOR_NAME_EDEFAULT);
				return;
			case MDatasamplePackage.FIELD_GENERATOR__ERROR_GENERATOR:
				setErrorGenerator((ValueGenerator<?>)null);
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
			case MDatasamplePackage.FIELD_GENERATOR__ENTITY_NAME:
				return ENTITY_NAME_EDEFAULT == null ? entityName != null : !ENTITY_NAME_EDEFAULT.equals(entityName);
			case MDatasamplePackage.FIELD_GENERATOR__FIELD_NAME:
				return FIELD_NAME_EDEFAULT == null ? fieldName != null : !FIELD_NAME_EDEFAULT.equals(fieldName);
			case MDatasamplePackage.FIELD_GENERATOR__GENERATOR:
				return generator != null;
			case MDatasamplePackage.FIELD_GENERATOR__STRUCTURAL_FEATURE:
				return structuralFeature != null;
			case MDatasamplePackage.FIELD_GENERATOR__ERROR_RATE:
				return errorRate != ERROR_RATE_EDEFAULT;
			case MDatasamplePackage.FIELD_GENERATOR__GENERATOR_NAME:
				return GENERATOR_NAME_EDEFAULT == null ? generatorName != null : !GENERATOR_NAME_EDEFAULT.equals(generatorName);
			case MDatasamplePackage.FIELD_GENERATOR__ERROR_GENERATOR_NAME:
				return ERROR_GENERATOR_NAME_EDEFAULT == null ? errorGeneratorName != null : !ERROR_GENERATOR_NAME_EDEFAULT.equals(errorGeneratorName);
			case MDatasamplePackage.FIELD_GENERATOR__ERROR_GENERATOR:
				return errorGenerator != null;
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
		result.append(" (entityName: ");
		result.append(entityName);
		result.append(", fieldName: ");
		result.append(fieldName);
		result.append(", errorRate: ");
		result.append(errorRate);
		result.append(", generatorName: ");
		result.append(generatorName);
		result.append(", errorGeneratorName: ");
		result.append(errorGeneratorName);
		result.append(')');
		return result.toString();
	}

} //MFieldGeneratorImpl
