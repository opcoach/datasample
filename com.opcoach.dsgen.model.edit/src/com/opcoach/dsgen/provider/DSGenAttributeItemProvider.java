/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.dsgen.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemFontProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import com.opcoach.dsgen.DSGenAttribute;
import com.opcoach.dsgen.DataSampleGenPackage;
import com.opcoach.generator.GeneratorFactory;
import com.opcoach.generator.basic.BasicFactory;

/**
 * This is the item provider adapter for a {@link com.opcoach.dsgen.DSGenAttribute} object.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * @generated
 */
public class DSGenAttributeItemProvider extends DSGenFeatureItemProvider implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, IItemFontProvider
{
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "� OPCoach 2012";

	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DSGenAttributeItemProvider(AdapterFactory adapterFactory)
	{
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
	{
		if (itemPropertyDescriptors == null)
		{
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
	{
		if (childrenFeatures == null)
		{
			super.getChildrenFeatures(object);
			childrenFeatures.add(DataSampleGenPackage.Literals.DS_GEN_ATTRIBUTE__GENERATOR);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * This returns DSGenAttribute.gif.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DSGenAttribute"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@SuppressWarnings("restriction")
	@Override
	public String getText(Object object)
	{
		DSGenAttribute dsGenAttribute = (DSGenAttribute) object;
		return dsGenAttribute.getEcoreFeature().getName() + " " + dsGenAttribute.isNullableValue();
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification)
	{
		updateChildren(notification);

		switch (notification.getFeatureID(DSGenAttribute.class))
		{
		case DataSampleGenPackage.DS_GEN_ATTRIBUTE__GENERATOR:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children that can be created under this object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
	{
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(DataSampleGenPackage.Literals.DS_GEN_ATTRIBUTE__GENERATOR,
				GeneratorFactory.eINSTANCE.createReferenceGenerator()));

		newChildDescriptors.add(createChildParameter(DataSampleGenPackage.Literals.DS_GEN_ATTRIBUTE__GENERATOR,
				BasicFactory.eINSTANCE.createBooleanGenerator()));

		newChildDescriptors.add(createChildParameter(DataSampleGenPackage.Literals.DS_GEN_ATTRIBUTE__GENERATOR,
				BasicFactory.eINSTANCE.createDateGenerator()));

		newChildDescriptors.add(createChildParameter(DataSampleGenPackage.Literals.DS_GEN_ATTRIBUTE__GENERATOR,
				BasicFactory.eINSTANCE.createDoubleGenerator()));

		newChildDescriptors.add(createChildParameter(DataSampleGenPackage.Literals.DS_GEN_ATTRIBUTE__GENERATOR,
				BasicFactory.eINSTANCE.createFloatGenerator()));

		newChildDescriptors.add(createChildParameter(DataSampleGenPackage.Literals.DS_GEN_ATTRIBUTE__GENERATOR,
				BasicFactory.eINSTANCE.createIDGenerator()));

		newChildDescriptors.add(createChildParameter(DataSampleGenPackage.Literals.DS_GEN_ATTRIBUTE__GENERATOR,
				BasicFactory.eINSTANCE.createIntGenerator()));

		newChildDescriptors.add(createChildParameter(DataSampleGenPackage.Literals.DS_GEN_ATTRIBUTE__GENERATOR,
				BasicFactory.eINSTANCE.createLongGenerator()));

		newChildDescriptors.add(createChildParameter(DataSampleGenPackage.Literals.DS_GEN_ATTRIBUTE__GENERATOR,
				BasicFactory.eINSTANCE.createNullValueGenerator()));

		newChildDescriptors.add(createChildParameter(DataSampleGenPackage.Literals.DS_GEN_ATTRIBUTE__GENERATOR,
				BasicFactory.eINSTANCE.createStringGenerator()));

		newChildDescriptors.add(createChildParameter(DataSampleGenPackage.Literals.DS_GEN_ATTRIBUTE__GENERATOR,
				BasicFactory.eINSTANCE.createTrueGenerator()));

		newChildDescriptors.add(createChildParameter(DataSampleGenPackage.Literals.DS_GEN_ATTRIBUTE__GENERATOR,
				BasicFactory.eINSTANCE.createFalseGenerator()));
	}

}
