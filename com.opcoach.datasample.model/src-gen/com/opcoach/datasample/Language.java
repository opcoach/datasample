/**
 */
package com.opcoach.datasample;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Language</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.opcoach.datasample.MDatasamplePackage#getLanguage()
 * @model
 * @generated
 */
public enum Language implements Enumerator {
	/**
	 * The '<em><b>Fr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FR_VALUE
	 * @generated
	 * @ordered
	 */
	FR(0, "fr", "fr"),

	/**
	 * The '<em><b>En</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EN_VALUE
	 * @generated
	 * @ordered
	 */
	EN(1, "en", "en"),

	/**
	 * The '<em><b>De</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DE_VALUE
	 * @generated
	 * @ordered
	 */
	DE(2, "de", "de"),

	/**
	 * The '<em><b>Es</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ES_VALUE
	 * @generated
	 * @ordered
	 */
	ES(3, "es", "es"),

	/**
	 * The '<em><b>It</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IT_VALUE
	 * @generated
	 * @ordered
	 */
	IT(4, "it", "it");

	/**
	 * The '<em><b>Fr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fr</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FR
	 * @model name="fr"
	 * @generated
	 * @ordered
	 */
	public static final int FR_VALUE = 0;

	/**
	 * The '<em><b>En</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>En</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EN
	 * @model name="en"
	 * @generated
	 * @ordered
	 */
	public static final int EN_VALUE = 1;

	/**
	 * The '<em><b>De</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>De</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DE
	 * @model name="de"
	 * @generated
	 * @ordered
	 */
	public static final int DE_VALUE = 2;

	/**
	 * The '<em><b>Es</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Es</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ES
	 * @model name="es"
	 * @generated
	 * @ordered
	 */
	public static final int ES_VALUE = 3;

	/**
	 * The '<em><b>It</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>It</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IT
	 * @model name="it"
	 * @generated
	 * @ordered
	 */
	public static final int IT_VALUE = 4;

	/**
	 * An array of all the '<em><b>Language</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Language[] VALUES_ARRAY =
		new Language[] {
			FR,
			EN,
			DE,
			ES,
			IT,
		};

	/**
	 * A public read-only list of all the '<em><b>Language</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Language> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Language</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Language get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Language result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Language</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Language getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Language result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Language</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Language get(int value) {
		switch (value) {
			case FR_VALUE: return FR;
			case EN_VALUE: return EN;
			case DE_VALUE: return DE;
			case ES_VALUE: return ES;
			case IT_VALUE: return IT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Language(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Language
