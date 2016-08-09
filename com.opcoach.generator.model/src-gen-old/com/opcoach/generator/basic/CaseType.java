/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.generator.basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Case Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.opcoach.generator.basic.BasicPackage#getCaseType()
 * @model
 * @generated
 */
public enum CaseType implements Enumerator
{
	/**
	 * The '<em><b>DEFAULT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFAULT_VALUE
	 * @generated
	 * @ordered
	 */
	DEFAULT(0, "DEFAULT", "DEFAULT"),

	/**
	 * The '<em><b>UPPERCASE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPPERCASE_VALUE
	 * @generated
	 * @ordered
	 */
	UPPERCASE(1, "UPPERCASE", "UPPERCASE"),

	/**
	 * The '<em><b>LOWERCASE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOWERCASE_VALUE
	 * @generated
	 * @ordered
	 */
	LOWERCASE(2, "LOWERCASE", "LOWERCASE");

	/**
	 * The '<em><b>DEFAULT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEFAULT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEFAULT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEFAULT_VALUE = 0;

	/**
	 * The '<em><b>UPPERCASE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UPPERCASE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPPERCASE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UPPERCASE_VALUE = 1;

	/**
	 * The '<em><b>LOWERCASE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LOWERCASE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOWERCASE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOWERCASE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Case Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CaseType[] VALUES_ARRAY =
		new CaseType[]
		{
			DEFAULT,
			UPPERCASE,
			LOWERCASE,
		};

	/**
	 * A public read-only list of all the '<em><b>Case Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CaseType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Case Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CaseType get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			CaseType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Case Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CaseType getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			CaseType result = VALUES_ARRAY[i];
			if (result.getName().equals(name))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Case Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CaseType get(int value)
	{
		switch (value)
		{
			case DEFAULT_VALUE: return DEFAULT;
			case UPPERCASE_VALUE: return UPPERCASE;
			case LOWERCASE_VALUE: return LOWERCASE;
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
	private CaseType(int value, String name, String literal)
	{
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue()
	{
	  return value;
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
	public String getLiteral()
	{
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		return literal;
	}
	
} //CaseType
