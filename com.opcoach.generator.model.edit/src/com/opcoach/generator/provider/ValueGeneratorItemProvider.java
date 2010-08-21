/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.generator.provider;


import com.opcoach.generator.GeneratorFactory;
import com.opcoach.generator.GeneratorPackage;
import com.opcoach.generator.ValueGenerator;

import com.opcoach.generator.basic.BasicFactory;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.opcoach.generator.ValueGenerator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ValueGeneratorItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueGeneratorItemProvider(AdapterFactory adapterFactory)
	{
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
	{
		if (itemPropertyDescriptors == null)
		{
			super.getPropertyDescriptors(object);

			addBadValueProportionPropertyDescriptor(object);
			addBadValueGeneratorPropertyDescriptor(object);
			addLastGeneratedValuePropertyDescriptor(object);
			addRandomSeedPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Bad Value Proportion feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBadValueProportionPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ValueGenerator_badValueProportion_feature"),
				 getString("_UI_ValueGenerator_badValueProportion_description"),
				 GeneratorPackage.Literals.VALUE_GENERATOR__BAD_VALUE_PROPORTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI_BadValuesPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Bad Value Generator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBadValueGeneratorPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ValueGenerator_badValueGenerator_feature"),
				 getString("_UI_ValueGenerator_badValueGenerator_description"),
				 GeneratorPackage.Literals.VALUE_GENERATOR__BAD_VALUE_GENERATOR,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_BadValuesPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Last Generated Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLastGeneratedValuePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ValueGenerator_lastGeneratedValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ValueGenerator_lastGeneratedValue_feature", "_UI_ValueGenerator_type"),
				 GeneratorPackage.Literals.VALUE_GENERATOR__LAST_GENERATED_VALUE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Random Seed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRandomSeedPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ValueGenerator_randomSeed_feature"),
				 getString("_UI_ValueGenerator_randomSeed_description"),
				 GeneratorPackage.Literals.VALUE_GENERATOR__RANDOM_SEED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI_RandomPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ValueGenerator_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ValueGenerator_description_feature", "_UI_ValueGenerator_type"),
				 GeneratorPackage.Literals.VALUE_GENERATOR__DESCRIPTION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ValueGenerator_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ValueGenerator_type_feature", "_UI_ValueGenerator_type"),
				 GeneratorPackage.Literals.VALUE_GENERATOR__TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
	{
		if (childrenFeatures == null)
		{
			super.getChildrenFeatures(object);
			childrenFeatures.add(GeneratorPackage.Literals.VALUE_GENERATOR__BAD_VALUE_GENERATOR);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child)
	{
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ValueGenerator.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ValueGenerator"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object)
	{
		ValueGenerator<?> valueGenerator = (ValueGenerator<?>)object;
		return getString("_UI_ValueGenerator_type") + " " + valueGenerator.getBadValueProportion();
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification)
	{
		updateChildren(notification);

		switch (notification.getFeatureID(ValueGenerator.class))
		{
			case GeneratorPackage.VALUE_GENERATOR__BAD_VALUE_PROPORTION:
			case GeneratorPackage.VALUE_GENERATOR__LAST_GENERATED_VALUE:
			case GeneratorPackage.VALUE_GENERATOR__RANDOM_SEED:
			case GeneratorPackage.VALUE_GENERATOR__DESCRIPTION:
			case GeneratorPackage.VALUE_GENERATOR__TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
	{
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(GeneratorPackage.Literals.VALUE_GENERATOR__BAD_VALUE_GENERATOR,
				 GeneratorFactory.eINSTANCE.createReferenceGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(GeneratorPackage.Literals.VALUE_GENERATOR__BAD_VALUE_GENERATOR,
				 BasicFactory.eINSTANCE.createBooleanGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(GeneratorPackage.Literals.VALUE_GENERATOR__BAD_VALUE_GENERATOR,
				 BasicFactory.eINSTANCE.createDateGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(GeneratorPackage.Literals.VALUE_GENERATOR__BAD_VALUE_GENERATOR,
				 BasicFactory.eINSTANCE.createDoubleGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(GeneratorPackage.Literals.VALUE_GENERATOR__BAD_VALUE_GENERATOR,
				 BasicFactory.eINSTANCE.createFloatGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(GeneratorPackage.Literals.VALUE_GENERATOR__BAD_VALUE_GENERATOR,
				 BasicFactory.eINSTANCE.createIDGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(GeneratorPackage.Literals.VALUE_GENERATOR__BAD_VALUE_GENERATOR,
				 BasicFactory.eINSTANCE.createIntGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(GeneratorPackage.Literals.VALUE_GENERATOR__BAD_VALUE_GENERATOR,
				 BasicFactory.eINSTANCE.createLongGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(GeneratorPackage.Literals.VALUE_GENERATOR__BAD_VALUE_GENERATOR,
				 BasicFactory.eINSTANCE.createNullValueGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(GeneratorPackage.Literals.VALUE_GENERATOR__BAD_VALUE_GENERATOR,
				 BasicFactory.eINSTANCE.createStringGenerator()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator()
	{
		return GeneratorEditPlugin.INSTANCE;
	}

}
