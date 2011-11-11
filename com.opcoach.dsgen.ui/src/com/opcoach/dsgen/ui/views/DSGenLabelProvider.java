package com.opcoach.dsgen.ui.views;


import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

import com.opcoach.generator.ecore.dsgen.DSGenAttribute;
import com.opcoach.generator.ecore.dsgen.DSGenClass;
import com.opcoach.generator.ecore.dsgen.DSGenEnum;
import com.opcoach.generator.ecore.dsgen.DSGenPackage;
import com.opcoach.generator.ecore.dsgen.DSGenReference;

public class DSGenLabelProvider extends LabelProvider implements IColorProvider
{
	
	@Override
	public String getText(Object element)
	{
		if (element instanceof DSGenClass)
		{
			DSGenClass cl = (DSGenClass) element;
			String nbInstances;
			if (cl.isRootObject())
				nbInstances = " (Root object) ";
			else
				nbInstances = (cl.getInstanceNumber() == -1) ? " (defined by parent)" : " ("+ cl.getInstanceNumber() + ")";
			return cl.getEcoreClass().getName() + nbInstances;
		}
		else if (element instanceof DSGenPackage)
			return ((DSGenPackage) element).getEcorePackage().getName();
		else if (element instanceof DSGenAttribute)
			return ((DSGenAttribute) element).getEcoreFeature().getName();
		else if (element instanceof DSGenReference)
			return ((DSGenReference) element).getEcoreFeature().getName();
		else if (element instanceof DSGenEnum)
			return ((DSGenEnum) element).getEcoreEnum().getName();
			
		// TODO Auto-generated method stub
		return super.getText(element);
	}

	@Override
	public Color getForeground(Object element)
	{
		if (element instanceof DSGenClass)
		{
			DSGenClass cl = (DSGenClass) element;
			int c = SWT.COLOR_BLACK; 
			if (cl.isRootObject())
				c = SWT.COLOR_DARK_BLUE;
			else
				c = (cl.getInstanceNumber() == -1) ? SWT.COLOR_BLUE : SWT.COLOR_BLACK;
			return Display.getCurrent().getSystemColor(c);
		}
		
		return null;
	}

	@Override
	public Color getBackground(Object element)
	{
		return null;
	}
}
