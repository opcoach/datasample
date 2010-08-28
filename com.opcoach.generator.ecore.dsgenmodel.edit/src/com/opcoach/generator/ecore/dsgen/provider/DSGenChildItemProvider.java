/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.generator.ecore.dsgen.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
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

import com.opcoach.generator.ecore.dsgen.DSGenChild;
import com.opcoach.generator.ecore.dsgen.DSGenClass;
import com.opcoach.generator.ecore.dsgen.DataSampleGenPackage;

/**
 * This is the item provider adapter for a {@link com.opcoach.generator.ecore.dsgen.DSGenChild} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DSGenChildItemProvider
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
	public DSGenChildItemProvider(AdapterFactory adapterFactory)
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

			addDsgenClassPropertyDescriptor(object);
			addSinglePropertyDescriptor(object);
			addSourceReferencePropertyDescriptor(object);
			addOppositeReferencePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Dsgen Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDsgenClassPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DSGenChild_dsgenClass_feature"),
				 getString("_UI_DSGenChild_dsgenClass_description"),
				 DataSampleGenPackage.Literals.DS_GEN_CHILD__DSGEN_CLASS,
				 false,
				 false,
				 true,
				 null,
				 getString("_UI_internalPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Single feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSinglePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DSGenChild_single_feature"),
				 getString("_UI_DSGenChild_single_description"),
				 DataSampleGenPackage.Literals.DS_GEN_CHILD__SINGLE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_internalPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Opposite Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOppositeReferencePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DSGenChild_oppositeReference_feature"),
				 getString("_UI_DSGenChild_oppositeReference_description"),
				 DataSampleGenPackage.Literals.DS_GEN_CHILD__OPPOSITE_REFERENCE,
				 false,
				 false,
				 true,
				 null,
				 getString("_UI_internalPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Source Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceReferencePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DSGenChild_sourceReference_feature"),
				 getString("_UI_DSGenChild_sourceReference_description"),
				 DataSampleGenPackage.Literals.DS_GEN_CHILD__SOURCE_REFERENCE,
				 false,
				 false,
				 true,
				 null,
				 getString("_UI_internalPropertyCategory"),
				 null));
	}

	/**
	 * This returns DSGenChild.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DSGenChild"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("restriction")
	@Override
	public String getText(Object object)
	{
		DSGenChild dsGenChild = (DSGenChild)object;
		DSGenClass c = dsGenChild.getDsgenClass();
		String card = (dsGenChild.isSingle() ? "One " : "Many ");
		return card + c.getEcoreClass().getName() ;
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

		switch (notification.getFeatureID(DSGenChild.class))
		{
			case DataSampleGenPackage.DS_GEN_CHILD__SINGLE:
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
		return DataSampleEditPlugin.INSTANCE;
	}

}
