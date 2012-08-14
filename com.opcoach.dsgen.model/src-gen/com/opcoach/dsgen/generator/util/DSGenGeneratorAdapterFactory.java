/**
 * © OPCoach 2012
 */
package com.opcoach.dsgen.generator.util;

import com.opcoach.dsgen.generator.*;

import com.opcoach.generator.ReferenceGenerator;
import com.opcoach.generator.ValueGenerator;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.opcoach.dsgen.generator.DSGenGeneratorPackage
 * @generated
 */
public class DSGenGeneratorAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "© OPCoach 2012";

	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DSGenGeneratorPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSGenGeneratorAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = DSGenGeneratorPackage.eINSTANCE;
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
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DSGenGeneratorSwitch<Adapter> modelSwitch = new DSGenGeneratorSwitch<Adapter>()
		{
			@Override
			public Adapter caseEObjectGenerator(EObjectGenerator object)
			{
				return createEObjectGeneratorAdapter();
			}

			@Override
			public Adapter caseChildrenGenerator(ChildrenGenerator object)
			{
				return createChildrenGeneratorAdapter();
			}

			@Override
			public Adapter caseSingleAssociationGenerator(SingleAssociationGenerator object)
			{
				return createSingleAssociationGeneratorAdapter();
			}

			@Override
			public Adapter caseMultipleAssociationGenerator(MultipleAssociationGenerator object)
			{
				return createMultipleAssociationGeneratorAdapter();
			}

			@Override
			public <T> Adapter caseValueGenerator(ValueGenerator<T> object)
			{
				return createValueGeneratorAdapter();
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
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.opcoach.dsgen.generator.EObjectGenerator <em>EObject Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.opcoach.dsgen.generator.EObjectGenerator
	 * @generated
	 */
	public Adapter createEObjectGeneratorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.opcoach.dsgen.generator.ChildrenGenerator <em>Children Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.opcoach.dsgen.generator.ChildrenGenerator
	 * @generated
	 */
	public Adapter createChildrenGeneratorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.opcoach.dsgen.generator.SingleAssociationGenerator <em>Single Association Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.opcoach.dsgen.generator.SingleAssociationGenerator
	 * @generated
	 */
	public Adapter createSingleAssociationGeneratorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.opcoach.dsgen.generator.MultipleAssociationGenerator <em>Multiple Association Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.opcoach.dsgen.generator.MultipleAssociationGenerator
	 * @generated
	 */
	public Adapter createMultipleAssociationGeneratorAdapter()
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

} //DSGenGeneratorAdapterFactory
