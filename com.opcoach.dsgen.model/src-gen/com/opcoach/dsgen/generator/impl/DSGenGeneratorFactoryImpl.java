/**
 * © OPCoach 2012
 */
package com.opcoach.dsgen.generator.impl;

import com.opcoach.dsgen.generator.*;

import java.util.Collection;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DSGenGeneratorFactoryImpl extends EFactoryImpl implements DSGenGeneratorFactory
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "© OPCoach 2012";

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DSGenGeneratorFactory init()
	{
		try
		{
			DSGenGeneratorFactory theDSGenGeneratorFactory = (DSGenGeneratorFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://www.opcoach.com/dsgen/generator/1.0");
			if (theDSGenGeneratorFactory != null)
			{
				return theDSGenGeneratorFactory;
			}
		} catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DSGenGeneratorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSGenGeneratorFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
		case DSGenGeneratorPackage.EOBJECT_GENERATOR:
			return createEObjectGenerator();
		case DSGenGeneratorPackage.CHILDREN_GENERATOR:
			return createChildrenGenerator();
		case DSGenGeneratorPackage.SINGLE_ASSOCIATION_GENERATOR:
			return createSingleAssociationGenerator();
		case DSGenGeneratorPackage.MULTIPLE_ASSOCIATION_GENERATOR:
			return createMultipleAssociationGenerator();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue)
	{
		switch (eDataType.getClassifierID())
		{
		case DSGenGeneratorPackage.EOBJECT_COLLECTION:
			return createEObjectCollectionFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue)
	{
		switch (eDataType.getClassifierID())
		{
		case DSGenGeneratorPackage.EOBJECT_COLLECTION:
			return convertEObjectCollectionToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectGenerator createEObjectGenerator()
	{
		EObjectGeneratorImpl eObjectGenerator = new EObjectGeneratorImpl();
		return eObjectGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChildrenGenerator createChildrenGenerator()
	{
		ChildrenGeneratorImpl childrenGenerator = new ChildrenGeneratorImpl();
		return childrenGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleAssociationGenerator createSingleAssociationGenerator()
	{
		SingleAssociationGeneratorImpl singleAssociationGenerator = new SingleAssociationGeneratorImpl();
		return singleAssociationGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleAssociationGenerator createMultipleAssociationGenerator()
	{
		MultipleAssociationGeneratorImpl multipleAssociationGenerator = new MultipleAssociationGeneratorImpl();
		return multipleAssociationGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Collection<EObject> createEObjectCollectionFromString(EDataType eDataType, String initialValue)
	{
		return (Collection<EObject>) super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEObjectCollectionToString(EDataType eDataType, Object instanceValue)
	{
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSGenGeneratorPackage getDSGenGeneratorPackage()
	{
		return (DSGenGeneratorPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DSGenGeneratorPackage getPackage()
	{
		return DSGenGeneratorPackage.eINSTANCE;
	}

} //DSGenGeneratorFactoryImpl
