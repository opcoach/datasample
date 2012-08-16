package com.opcoach.dsgen.helpers;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.opcoach.dsgen.DSGenAttribute;
import com.opcoach.dsgen.DSGenReference;
import com.opcoach.generator.ValueGenerator;

public class DSGenToGeneratorFactory implements IAdapterFactory
{

	@Override
	public Object getAdapter(Object adaptableObject, Class adapterType)
	{
		if (adapterType == ValueGenerator.class)
		{
		if (adaptableObject instanceof DSGenAttribute)
		{
			DSGenAttribute dsgenAtt = (DSGenAttribute) adaptableObject;
			EStructuralFeature ft = dsgenAtt.getEcoreFeature();
			System.out.println("Pour la feature : " + ft.getName() +  " Type = " + ft.getEType().getName()  + "Class of this type : " + ft.getEType().getClass());
		}
		else if (adaptableObject instanceof DSGenReference)
		{
			DSGenReference dsgenRef = (DSGenReference) adaptableObject;
			EStructuralFeature ft = dsgenRef.getEcoreFeature();
			System.out.println("Pour la feature : " + ft.getName() +  " Type = " + ft.getEType().getName()  + "Class of this type : " + ft.getEType().getClass());
		}
			
		}
		return null;
	}

	@Override
	public Class[] getAdapterList()
	{
		// TODO Auto-generated method stub
		return new Class[] { ValueGenerator.class} ;
	}

}
