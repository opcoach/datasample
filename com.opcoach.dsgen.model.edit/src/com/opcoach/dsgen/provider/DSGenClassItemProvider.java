/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.dsgen.provider;

import com.opcoach.dsgen.DSGenClass;
import com.opcoach.dsgen.DataSampleGenFactory;
import com.opcoach.dsgen.DataSampleGenPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemFontProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.opcoach.dsgen.DSGenClass} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class DSGenClassItemProvider extends DSGenClassifierItemProvider implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, IItemFontProvider
{
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "© OPCoach 2012";

	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DSGenClassItemProvider(AdapterFactory adapterFactory)
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

			addInstanceNumberPropertyDescriptor(object);
			addRootObjectPropertyDescriptor(object);
			addNbAssociationRefToPropertyDescriptor(object);
			addChildrenPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Instance Number feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addInstanceNumberPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DSGenClass_instanceNumber_feature"), getString("_UI_DSGenClass_instanceNumber_description"),
				DataSampleGenPackage.Literals.DS_GEN_CLASS__INSTANCE_NUMBER, true, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, getString("_UI_UserParameterPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Root Object feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addRootObjectPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DSGenClass_rootObject_feature"), getString("_UI_DSGenClass_rootObject_description"),
				DataSampleGenPackage.Literals.DS_GEN_CLASS__ROOT_OBJECT, false, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, getString("_UI_internalPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Nb Association Ref To feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNbAssociationRefToPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DSGenClass_nbAssociationRefTo_feature"), getString("_UI_DSGenClass_nbAssociationRefTo_description"),
				DataSampleGenPackage.Literals.DS_GEN_CLASS__NB_ASSOCIATION_REF_TO, false, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, getString("_UI_internalPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Children feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addChildrenPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DSGenClass_children_feature"), getString("_UI_DSGenClass_children_description"),
				DataSampleGenPackage.Literals.DS_GEN_CLASS__CHILDREN, false, false, false, null,
				getString("_UI_internalPropertyCategory"), null));
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
			childrenFeatures.add(DataSampleGenPackage.Literals.DS_GEN_CLASS__CHILDREN);
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
	 * This returns DSGenClass.gif. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DSGenClass"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getText(Object object)
	{
		DSGenClass dsGenClass = (DSGenClass) object;
		@SuppressWarnings("restriction")
		String name = dsGenClass.getEcoreClass().getName();
		String desc = dsGenClass.isRootObject() ? " is the Root Object " : "";
		String nbInst = dsGenClass.getInstanceNumber() == -1 ? "nb of instances defined by parent" : dsGenClass.getInstanceNumber()
				+ " instances";
		return name + " " + desc + nbInst;
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

		switch (notification.getFeatureID(DSGenClass.class))
		{
		case DataSampleGenPackage.DS_GEN_CLASS__INSTANCE_NUMBER:
		case DataSampleGenPackage.DS_GEN_CLASS__ROOT_OBJECT:
		case DataSampleGenPackage.DS_GEN_CLASS__NB_ASSOCIATION_REF_TO:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case DataSampleGenPackage.DS_GEN_CLASS__CHILDREN:
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
	}

}
