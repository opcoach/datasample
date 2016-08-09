/**
 */
package com.opcoach.generator;

import java.util.Locale;
import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.opcoach.generator.MValueGenerator#getBadValueProportion <em>Bad Value Proportion</em>}</li>
 *   <li>{@link com.opcoach.generator.MValueGenerator#getBadValueGenerator <em>Bad Value Generator</em>}</li>
 *   <li>{@link com.opcoach.generator.MValueGenerator#getLastGeneratedValue <em>Last Generated Value</em>}</li>
 *   <li>{@link com.opcoach.generator.MValueGenerator#getRandomSeed <em>Random Seed</em>}</li>
 *   <li>{@link com.opcoach.generator.MValueGenerator#getDescription <em>Description</em>}</li>
 *   <li>{@link com.opcoach.generator.MValueGenerator#getID <em>ID</em>}</li>
 *   <li>{@link com.opcoach.generator.MValueGenerator#getLocale <em>Locale</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.opcoach.generator.MGeneratorPackage#getValueGenerator()
 * @model abstract="true"
 * @generated
 */
public interface MValueGenerator<T> extends EObject
{
	/**
	 * Returns the value of the '<em><b>Bad Value Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The badValueProportion is the percent of bad values to be generated.
	 * This is an int that must be in [0,100] (out of bounds values will be considered as bounds)
	 * If value is greater than 0, the badValueGenerator must be set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bad Value Proportion</em>' attribute.
	 * @see #setBadValueProportion(int)
	 * @see com.opcoach.generator.MGeneratorPackage#getValueGenerator_BadValueProportion()
	 * @model
	 * @generated
	 */
	int getBadValueProportion();

	/**
	 * Sets the value of the '{@link com.opcoach.generator.MValueGenerator#getBadValueProportion <em>Bad Value Proportion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bad Value Proportion</em>' attribute.
	 * @see #getBadValueProportion()
	 * @generated
	 */
	void setBadValueProportion(int value);

	/**
	 * Returns the value of the '<em><b>Bad Value Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A optionnal bad value generator when a bad value should be generated. 
	 * It can ben a NullValueGenerator, or any other generator which could generate an out of bound value.
	 * This generator must be set if the badValueProportion is defined (> 0)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bad Value Generator</em>' reference.
	 * @see #setBadValueGenerator(MValueGenerator)
	 * @see com.opcoach.generator.MGeneratorPackage#getValueGenerator_BadValueGenerator()
	 * @model
	 * @generated
	 */
	ValueGenerator<T> getBadValueGenerator();

	/**
	 * Sets the value of the '{@link com.opcoach.generator.MValueGenerator#getBadValueGenerator <em>Bad Value Generator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bad Value Generator</em>' reference.
	 * @see #getBadValueGenerator()
	 * @generated
	 */
	void setBadValueGenerator(ValueGenerator<T> value);

	/**
	 * Returns the value of the '<em><b>Last Generated Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Generated Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Generated Value</em>' attribute.
	 * @see #setLastGeneratedValue(Object)
	 * @see com.opcoach.generator.MGeneratorPackage#getValueGenerator_LastGeneratedValue()
	 * @model derived="true"
	 * @generated
	 */
	T getLastGeneratedValue();

	/**
	 * Sets the value of the '{@link com.opcoach.generator.MValueGenerator#getLastGeneratedValue <em>Last Generated Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Generated Value</em>' attribute.
	 * @see #getLastGeneratedValue()
	 * @generated
	 */
	void setLastGeneratedValue(T value);

	/**
	 * Returns the value of the '<em><b>Random Seed</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Random Seed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Random Seed</em>' attribute.
	 * @see #isSetRandomSeed()
	 * @see #unsetRandomSeed()
	 * @see #setRandomSeed(long)
	 * @see com.opcoach.generator.MGeneratorPackage#getValueGenerator_RandomSeed()
	 * @model default="0" unsettable="true"
	 * @generated
	 */
	long getRandomSeed();

	/**
	 * Sets the value of the '{@link com.opcoach.generator.MValueGenerator#getRandomSeed <em>Random Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Random Seed</em>' attribute.
	 * @see #isSetRandomSeed()
	 * @see #unsetRandomSeed()
	 * @see #getRandomSeed()
	 * @generated
	 */
	void setRandomSeed(long value);

	/**
	 * Unsets the value of the '{@link com.opcoach.generator.MValueGenerator#getRandomSeed <em>Random Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRandomSeed()
	 * @see #getRandomSeed()
	 * @see #setRandomSeed(long)
	 * @generated
	 */
	void unsetRandomSeed();

	/**
	 * Returns whether the value of the '{@link com.opcoach.generator.MValueGenerator#getRandomSeed <em>Random Seed</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Random Seed</em>' attribute is set.
	 * @see #unsetRandomSeed()
	 * @see #getRandomSeed()
	 * @see #setRandomSeed(long)
	 * @generated
	 */
	boolean isSetRandomSeed();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see com.opcoach.generator.MGeneratorPackage#getValueGenerator_Description()
	 * @model transient="true" changeable="false" derived="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see com.opcoach.generator.MGeneratorPackage#getValueGenerator_ID()
	 * @model
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link com.opcoach.generator.MValueGenerator#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locale</em>' attribute.
	 * @see #setLocale(Locale)
	 * @see com.opcoach.generator.MGeneratorPackage#getValueGenerator_Locale()
	 * @model dataType="com.opcoach.generator.Locale"
	 * @generated
	 */
	Locale getLocale();

	/**
	 * Sets the value of the '{@link com.opcoach.generator.MValueGenerator#getLocale <em>Locale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locale</em>' attribute.
	 * @see #getLocale()
	 * @generated
	 */
	void setLocale(Locale value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	T generateValue();

} // MValueGenerator
