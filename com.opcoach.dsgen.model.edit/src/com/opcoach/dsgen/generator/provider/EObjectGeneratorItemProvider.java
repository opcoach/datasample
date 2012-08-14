/**
 * © OPCoach 2012
 */
package com.opcoach.dsgen.generator.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemFontProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import com.opcoach.dsgen.generator.DSGenGeneratorFactory;
import com.opcoach.dsgen.generator.DSGenGeneratorPackage;
import com.opcoach.dsgen.generator.EObjectGenerator;
import com.opcoach.dsgen.provider.DataSampleEditPlugin;
import com.opcoach.generator.GeneratorPackage;
import com.opcoach.generator.provider.ValueGeneratorItemProvider;

/**
 * This is the item provider adapter for a {@link com.opcoach.dsgen.generator.EObjectGenerator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EObjectGeneratorItemProvider extends ValueGeneratorItemProvider implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, IItemFontProvider
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "© OPCoach 2012";

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectGeneratorItemProvider(AdapterFactory adapterFactory)
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

			addTargetDSGenClassPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Target DS Gen Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetDSGenClassPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_EObjectGenerator_targetDSGenClass_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_EObjectGenerator_targetDSGenClass_feature",
						"_UI_EObjectGenerator_type"), DSGenGeneratorPackage.Literals.EOBJECT_GENERATOR__TARGET_DS_GEN_CLASS, true,
				false, true, null, null, null));
	}

	/**
	 * This returns EObjectGenerator.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EObjectGenerator"));
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
		String label = ((EObjectGenerator) object).getID();
		return label == null || label.length() == 0 ? getString("_UI_EObjectGenerator_type")
				: getString("_UI_EObjectGenerator_type") + " " + label;
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

		newChildDescriptors.add(createChildParameter(GeneratorPackage.Literals.VALUE_GENERATOR__BAD_VALUE_GENERATOR,
				DSGenGeneratorFactory.eINSTANCE.createEObjectGenerator()));

		newChildDescriptors.add(createChildParameter(GeneratorPackage.Literals.VALUE_GENERATOR__BAD_VALUE_GENERATOR,
				DSGenGeneratorFactory.eINSTANCE.createChildrenGenerator()));

		newChildDescriptors.add(createChildParameter(GeneratorPackage.Literals.VALUE_GENERATOR__BAD_VALUE_GENERATOR,
				DSGenGeneratorFactory.eINSTANCE.createSingleAssociationGenerator()));

		newChildDescriptors.add(createChildParameter(GeneratorPackage.Literals.VALUE_GENERATOR__BAD_VALUE_GENERATOR,
				DSGenGeneratorFactory.eINSTANCE.createMultipleAssociationGenerator()));
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
		return DataSampleEditPlugin.INSTANCE;
	}

}
