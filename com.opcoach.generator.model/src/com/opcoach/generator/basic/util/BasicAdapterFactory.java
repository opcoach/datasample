/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.generator.basic.util;

import com.opcoach.generator.RangeGenerator;
import com.opcoach.generator.ReferenceGenerator;
import com.opcoach.generator.ValueGenerator;

import com.opcoach.generator.basic.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.opcoach.generator.basic.BasicPackage
 * @generated
 */
public class BasicAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BasicPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = BasicPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object)
	{
		if (object == modelPackage)
		{
			return true;
		}
		if (object instanceof EObject)
		{
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicSwitch<Adapter> modelSwitch =
		new BasicSwitch<Adapter>()
		{
			@Override
			public Adapter caseBooleanGenerator(BooleanGenerator object)
			{
				return createBooleanGeneratorAdapter();
			}
			@Override
			public Adapter caseDateGenerator(DateGenerator object)
			{
				return createDateGeneratorAdapter();
			}
			@Override
			public Adapter caseDoubleGenerator(DoubleGenerator object)
			{
				return createDoubleGeneratorAdapter();
			}
			@Override
			public Adapter caseFloatGenerator(FloatGenerator object)
			{
				return createFloatGeneratorAdapter();
			}
			@Override
			public Adapter caseIDGenerator(IDGenerator object)
			{
				return createIDGeneratorAdapter();
			}
			@Override
			public Adapter caseIntGenerator(IntGenerator object)
			{
				return createIntGeneratorAdapter();
			}
			@Override
			public Adapter caseLongGenerator(LongGenerator object)
			{
				return createLongGeneratorAdapter();
			}
			@Override
			public Adapter caseNullValueGenerator(NullValueGenerator object)
			{
				return createNullValueGeneratorAdapter();
			}
			@Override
			public Adapter caseStringGenerator(StringGenerator object)
			{
				return createStringGeneratorAdapter();
			}
			@Override
			public Adapter caseTrueGenerator(TrueGenerator object)
			{
				return createTrueGeneratorAdapter();
			}
			@Override
			public Adapter caseFalseGenerator(FalseGenerator object)
			{
				return createFalseGeneratorAdapter();
			}
			@Override
			public <T> Adapter caseValueGenerator(ValueGenerator<T> object)
			{
				return createValueGeneratorAdapter();
			}
			@Override
			public <T> Adapter caseRangeGenerator(RangeGenerator<T> object)
			{
				return createRangeGeneratorAdapter();
			}
			@Override
			public <T> Adapter caseReferenceGenerator(ReferenceGenerator<T> object)
			{
				return createReferenceGeneratorAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object)
			{
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target)
	{
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.opcoach.generator.basic.BooleanGenerator <em>Boolean Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.opcoach.generator.basic.BooleanGenerator
	 * @generated
	 */
	public Adapter createBooleanGeneratorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.opcoach.generator.basic.DateGenerator <em>Date Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.opcoach.generator.basic.DateGenerator
	 * @generated
	 */
	public Adapter createDateGeneratorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.opcoach.generator.basic.DoubleGenerator <em>Double Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.opcoach.generator.basic.DoubleGenerator
	 * @generated
	 */
	public Adapter createDoubleGeneratorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.opcoach.generator.basic.FloatGenerator <em>Float Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.opcoach.generator.basic.FloatGenerator
	 * @generated
	 */
	public Adapter createFloatGeneratorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.opcoach.generator.basic.IDGenerator <em>ID Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.opcoach.generator.basic.IDGenerator
	 * @generated
	 */
	public Adapter createIDGeneratorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.opcoach.generator.basic.IntGenerator <em>Int Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.opcoach.generator.basic.IntGenerator
	 * @generated
	 */
	public Adapter createIntGeneratorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.opcoach.generator.basic.LongGenerator <em>Long Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.opcoach.generator.basic.LongGenerator
	 * @generated
	 */
	public Adapter createLongGeneratorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.opcoach.generator.basic.NullValueGenerator <em>Null Value Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.opcoach.generator.basic.NullValueGenerator
	 * @generated
	 */
	public Adapter createNullValueGeneratorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.opcoach.generator.basic.StringGenerator <em>String Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.opcoach.generator.basic.StringGenerator
	 * @generated
	 */
	public Adapter createStringGeneratorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.opcoach.generator.basic.TrueGenerator <em>True Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.opcoach.generator.basic.TrueGenerator
	 * @generated
	 */
	public Adapter createTrueGeneratorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.opcoach.generator.basic.FalseGenerator <em>False Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.opcoach.generator.basic.FalseGenerator
	 * @generated
	 */
	public Adapter createFalseGeneratorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.opcoach.generator.ValueGenerator <em>Value Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.opcoach.generator.ValueGenerator
	 * @generated
	 */
	public Adapter createValueGeneratorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.opcoach.generator.RangeGenerator <em>Range Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.opcoach.generator.RangeGenerator
	 * @generated
	 */
	public Adapter createRangeGeneratorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.opcoach.generator.ReferenceGenerator <em>Reference Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.opcoach.generator.ReferenceGenerator
	 * @generated
	 */
	public Adapter createReferenceGeneratorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter()
	{
		return null;
	}

} //BasicAdapterFactory
