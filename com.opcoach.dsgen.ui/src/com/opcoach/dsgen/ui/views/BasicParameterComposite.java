package com.opcoach.dsgen.ui.views;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Tree;

public class BasicParameterComposite extends Composite
{

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public BasicParameterComposite(Composite parent, int style)
	{
		super(parent, style);
		
		SashForm sashForm = new SashForm(this, SWT.NONE);
		sashForm.setBounds(0, 0, 300, 300);
		
		Tree tree = new Tree(sashForm, SWT.BORDER);
		
		Composite composite = new Composite(sashForm, SWT.NONE);
		sashForm.setWeights(new int[] {1, 1});

	}

	@Override
	protected void checkSubclass()
	{
		// Disable the check that prevents subclassing of SWT components
	}
}
