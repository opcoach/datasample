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
			addIDPropertyDescriptor(object);
			addLocalePropertyDescriptor(object);
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
				 true,
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
	 * This adds a property descriptor for the ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIDPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ValueGenerator_ID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ValueGenerator_ID_feature", "_UI_ValueGenerator_type"),
				 GeneratorPackage.Literals.VALUE_GENERATOR__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Locale feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocalePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ValueGenerator_locale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ValueGenerator_locale_feature", "_UI_ValueGenerator_type"),
				 GeneratorPackage.Literals.VALUE_GENERATOR__LOCALE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
		String label = ((ValueGenerator<?>)object).getID();
		return label == null || label.length() == 0 ?
			getString("_UI_ValueGenerator_type") :
			getString("_UI_ValueGenerator_type") + " " + label;
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
			case GeneratorPackage.VALUE_GENERATOR__ID:
			case GeneratorPackage.VALUE_GENERATOR__LOCALE:
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
