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

import com.opcoach.dsgen.DSGenFeature;
import com.opcoach.dsgen.DataSampleGenPackage;
import com.opcoach.dsgen.generator.DSGenGeneratorFactory;
import com.opcoach.generator.GeneratorFactory;
import com.opcoach.generator.basic.BasicFactory;

/**
 * This is the item provider adapter for a {@link com.opcoach.dsgen.DSGenFeature} object.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * @generated
 */
public class DSGenFeatureItemProvider extends DSGenTypedElementItemProvider implements IEditingDomainItemProvider,
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
	public DSGenFeatureItemProvider(AdapterFactory adapterFactory)
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

			addEcoreFeaturePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Ecore Feature feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addEcoreFeaturePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DSGenFeature_ecoreFeature_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_DSGenFeature_ecoreFeature_feature", "_UI_DSGenFeature_type"),
				DataSampleGenPackage.Literals.DS_GEN_FEATURE__ECORE_FEATURE, false, false, true, null, null, null));
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
			childrenFeatures.add(DataSampleGenPackage.Literals.DS_GEN_FEATURE__GENERATOR);
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
	 * This returns DSGenFeature.gif. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DSGenFeature"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object)
	{
		return ((DSGenFeature) object).getEcoreFeature().getName();
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

		switch (notification.getFeatureID(DSGenFeature.class))
		{
		case DataSampleGenPackage.DS_GEN_FEATURE__GENERATOR:
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

		newChildDescriptors.add(createChildParameter(DataSampleGenPackage.Literals.DS_GEN_FEATURE__GENERATOR,
				DSGenGeneratorFactory.eINSTANCE.createEObjectGenerator()));

		newChildDescriptors.add(createChildParameter(DataSampleGenPackage.Literals.DS_GEN_FEATURE__GENERATOR,
				DSGenGeneratorFactory.eINSTANCE.createChildrenGenerator()));

		newChildDescriptors.add(createChildParameter(DataSampleGenPackage.Literals.DS_GEN_FEATURE__GENERATOR,
				DSGenGeneratorFactory.eINSTANCE.createSingleAssociationGenerator()));

		newChildDescriptors.add(createChildParameter(DataSampleGenPackage.Literals.DS_GEN_FEATURE__GENERATOR,
				DSGenGeneratorFactory.eINSTANCE.createMultipleAssociationGenerator()));

		newChildDescriptors.add(createChildParameter(DataSampleGenPackage.Literals.DS_GEN_FEATURE__GENERATOR,
				GeneratorFactory.eINSTANCE.createReferenceGenerator()));

		newChildDescriptors.add(createChildParameter(DataSampleGenPackage.Literals.DS_GEN_FEATURE__GENERATOR,
				BasicFactory.eINSTANCE.createBooleanGenerator()));

		newChildDescriptors.add(createChildParameter(DataSampleGenPackage.Literals.DS_GEN_FEATURE__GENERATOR,
				BasicFactory.eINSTANCE.createDateGenerator()));

		newChildDescriptors.add(createChildParameter(DataSampleGenPackage.Literals.DS_GEN_FEATURE__GENERATOR,
				BasicFactory.eINSTANCE.createDoubleGenerator()));

		newChildDescriptors.add(createChildParameter(DataSampleGenPackage.Literals.DS_GEN_FEATURE__GENERATOR,
				BasicFactory.eINSTANCE.createFloatGenerator()));

		newChildDescriptors.add(createChildParameter(DataSampleGenPackage.Literals.DS_GEN_FEATURE__GENERATOR,
				BasicFactory.eINSTANCE.createIDGenerator()));

		newChildDescriptors.add(createChildParameter(DataSampleGenPackage.Literals.DS_GEN_FEATURE__GENERATOR,
				BasicFactory.eINSTANCE.createIntGenerator()));

		newChildDescriptors.add(createChildParameter(DataSampleGenPackage.Literals.DS_GEN_FEATURE__GENERATOR,
				BasicFactory.eINSTANCE.createLongGenerator()));

		newChildDescriptors.add(createChildParameter(DataSampleGenPackage.Literals.DS_GEN_FEATURE__GENERATOR,
				BasicFactory.eINSTANCE.createNullValueGenerator()));

		newChildDescriptors.add(createChildParameter(DataSampleGenPackage.Literals.DS_GEN_FEATURE__GENERATOR,
				BasicFactory.eINSTANCE.createStringGenerator()));

		newChildDescriptors.add(createChildParameter(DataSampleGenPackage.Literals.DS_GEN_FEATURE__GENERATOR,
				BasicFactory.eINSTANCE.createTrueGenerator()));

		newChildDescriptors.add(createChildParameter(DataSampleGenPackage.Literals.DS_GEN_FEATURE__GENERATOR,
				BasicFactory.eINSTANCE.createFalseGenerator()));
	}

}
