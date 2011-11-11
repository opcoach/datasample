package com.opcoach.dsgen.ui.views;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import com.opcoach.generator.ecore.dsgen.DSGenClass;
import com.opcoach.generator.ecore.dsgen.DSGenPackage;

public class DSGenContentProvider implements ITreeContentProvider
{
	
	private static Object[] EMPTY_ARRAY= new Object[0];

	@Override
	public Object[] getElements(Object inputElement)
	{
		// Get a list of EPackages
		if (inputElement instanceof Collection)
			return ((Collection) inputElement).toArray();
		
		return EMPTY_ARRAY;
	}

	@Override
	public Object[] getChildren(Object parentElement)
	{
		// Pour un EPackage, on retourne la liste des classes
		// idem pour les EAttributes d'une genClass
		if (parentElement instanceof DSGenPackage)
		{
			return ((DSGenPackage) parentElement).eContents().toArray();
		}
		else if (parentElement instanceof DSGenClass)
		{
			return ((DSGenClass) parentElement).eContents().toArray();
		}
		return EMPTY_ARRAY;
	}

	@Override
	public Object getParent(Object element)
	{
		if (element instanceof EObject)
			return ((EObject) element).eContainer();
			
	     return null;
	}

	@Override
	public boolean hasChildren(Object element)
	{
		return ((element instanceof DSGenPackage) || (element instanceof DSGenClass));
	}

	@Override
	public void dispose()
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput)
	{
		// TODO Auto-generated method stub

	}
	
	
	

}
