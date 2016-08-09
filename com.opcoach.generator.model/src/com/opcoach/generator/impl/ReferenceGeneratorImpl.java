package com.opcoach.generator.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.opcoach.generator.GeneratorPackage;
import com.opcoach.generator.ReferenceGenerator;

// This class overrides the generated class and will be instantiated by factory
public class ReferenceGeneratorImpl<T> extends MReferenceGeneratorImpl<T> implements ReferenceGenerator<T>
{

	/** The last generated index */
	protected int lastGeneratedIndex = -1;
	
	
	protected Vector<T> values;

	public void addValue(T value)
	{
		if (values == null)
			values = new Vector<T>();
		values.add(value);
	}
	
	@Override
	protected T generateRandomValue()
	{
		// Get the values to check if there are samples 
		if (getValues().isEmpty())
			return null;

		// Find a random index in the array.
		lastGeneratedIndex = getRandomizer().nextInt(values.size());
		return (values == null) ? null : values.get(lastGeneratedIndex);

	}


	@Override
	protected T generateSimpleValue()
	{
		if (getValues().isEmpty())
			return null;
		
		if (lastGeneratedIndex == -1)
			lastGeneratedIndex = 0;
		else
		{
			lastGeneratedIndex += step;
			if (lastGeneratedIndex >= values.size())
			{
				lastGeneratedIndex = lastGeneratedIndex % values.size();
			}
		}
		
		return (values == null) ? null : values.get(lastGeneratedIndex);
	}

	
	@SuppressWarnings("unchecked")
	public Collection<T> getValues()
	{
		return (values == null) ? Collections.EMPTY_LIST : values;
	}
	
	
	public void setValues(Collection<T> newValues)
	{
		Collection<T> oldValues = values;
		values = new Vector<T>();
		values.addAll(newValues);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.REFERENCE_GENERATOR__VALUES, oldValues, values));
	}

}
