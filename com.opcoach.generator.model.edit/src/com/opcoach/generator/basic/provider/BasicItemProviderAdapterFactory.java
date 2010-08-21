/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.generator.basic.provider;

import com.opcoach.generator.basic.util.BasicAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BasicItemProviderAdapterFactory extends BasicAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable
{
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicItemProviderAdapterFactory()
	{
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.opcoach.generator.basic.BooleanGenerator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanGeneratorItemProvider booleanGeneratorItemProvider;

	/**
	 * This creates an adapter for a {@link com.opcoach.generator.basic.BooleanGenerator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBooleanGeneratorAdapter()
	{
		if (booleanGeneratorItemProvider == null)
		{
			booleanGeneratorItemProvider = new BooleanGeneratorItemProvider(this);
		}

		return booleanGeneratorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.opcoach.generator.basic.DateGenerator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DateGeneratorItemProvider dateGeneratorItemProvider;

	/**
	 * This creates an adapter for a {@link com.opcoach.generator.basic.DateGenerator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDateGeneratorAdapter()
	{
		if (dateGeneratorItemProvider == null)
		{
			dateGeneratorItemProvider = new DateGeneratorItemProvider(this);
		}

		return dateGeneratorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.opcoach.generator.basic.DoubleGenerator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoubleGeneratorItemProvider doubleGeneratorItemProvider;

	/**
	 * This creates an adapter for a {@link com.opcoach.generator.basic.DoubleGenerator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDoubleGeneratorAdapter()
	{
		if (doubleGeneratorItemProvider == null)
		{
			doubleGeneratorItemProvider = new DoubleGeneratorItemProvider(this);
		}

		return doubleGeneratorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.opcoach.generator.basic.FloatGenerator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FloatGeneratorItemProvider floatGeneratorItemProvider;

	/**
	 * This creates an adapter for a {@link com.opcoach.generator.basic.FloatGenerator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFloatGeneratorAdapter()
	{
		if (floatGeneratorItemProvider == null)
		{
			floatGeneratorItemProvider = new FloatGeneratorItemProvider(this);
		}

		return floatGeneratorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.opcoach.generator.basic.IDGenerator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IDGeneratorItemProvider idGeneratorItemProvider;

	/**
	 * This creates an adapter for a {@link com.opcoach.generator.basic.IDGenerator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIDGeneratorAdapter()
	{
		if (idGeneratorItemProvider == null)
		{
			idGeneratorItemProvider = new IDGeneratorItemProvider(this);
		}

		return idGeneratorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.opcoach.generator.basic.IntGenerator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntGeneratorItemProvider intGeneratorItemProvider;

	/**
	 * This creates an adapter for a {@link com.opcoach.generator.basic.IntGenerator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntGeneratorAdapter()
	{
		if (intGeneratorItemProvider == null)
		{
			intGeneratorItemProvider = new IntGeneratorItemProvider(this);
		}

		return intGeneratorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.opcoach.generator.basic.LongGenerator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LongGeneratorItemProvider longGeneratorItemProvider;

	/**
	 * This creates an adapter for a {@link com.opcoach.generator.basic.LongGenerator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLongGeneratorAdapter()
	{
		if (longGeneratorItemProvider == null)
		{
			longGeneratorItemProvider = new LongGeneratorItemProvider(this);
		}

		return longGeneratorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.opcoach.generator.basic.NullValueGenerator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NullValueGeneratorItemProvider nullValueGeneratorItemProvider;

	/**
	 * This creates an adapter for a {@link com.opcoach.generator.basic.NullValueGenerator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNullValueGeneratorAdapter()
	{
		if (nullValueGeneratorItemProvider == null)
		{
			nullValueGeneratorItemProvider = new NullValueGeneratorItemProvider(this);
		}

		return nullValueGeneratorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.opcoach.generator.basic.StringGenerator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringGeneratorItemProvider stringGeneratorItemProvider;

	/**
	 * This creates an adapter for a {@link com.opcoach.generator.basic.StringGenerator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStringGeneratorAdapter()
	{
		if (stringGeneratorItemProvider == null)
		{
			stringGeneratorItemProvider = new StringGeneratorItemProvider(this);
		}

		return stringGeneratorItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory()
	{
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory)
	{
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type)
	{
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type)
	{
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type)
	{
		if (isFactoryForType(type))
		{
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter)))
			{
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener)
	{
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener)
	{
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification)
	{
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null)
		{
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose()
	{
		if (booleanGeneratorItemProvider != null) booleanGeneratorItemProvider.dispose();
		if (dateGeneratorItemProvider != null) dateGeneratorItemProvider.dispose();
		if (doubleGeneratorItemProvider != null) doubleGeneratorItemProvider.dispose();
		if (floatGeneratorItemProvider != null) floatGeneratorItemProvider.dispose();
		if (idGeneratorItemProvider != null) idGeneratorItemProvider.dispose();
		if (intGeneratorItemProvider != null) intGeneratorItemProvider.dispose();
		if (longGeneratorItemProvider != null) longGeneratorItemProvider.dispose();
		if (nullValueGeneratorItemProvider != null) nullValueGeneratorItemProvider.dispose();
		if (stringGeneratorItemProvider != null) stringGeneratorItemProvider.dispose();
	}

}
