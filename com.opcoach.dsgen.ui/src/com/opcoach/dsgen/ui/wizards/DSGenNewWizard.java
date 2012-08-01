package com.opcoach.dsgen.ui.wizards;

/**
 * Copyright (c) 2005-2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   IBM - Initial API and implementation
 */

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

import com.opcoach.dsgen.helpers.Ecore2DSGenFactory;
import com.opcoach.dsgen.ui.DSGenUIActivator;


public class DSGenNewWizard extends Wizard implements INewWizard
{

	public class NewDSGenModelFileCreationPage extends WizardNewFileCreationPage
	{

		protected boolean firstTime = true;

		/**
		 * Pass in the selection.
		 */
		public NewDSGenModelFileCreationPage(String pageId)
		{
			super(pageId, selection);
		}

		/**
		 * The framework calls this to see if the file is correct.
		 */
		@Override
		protected boolean validatePage()
		{
			if (super.validatePage())
			{
				String extension = new Path(getFileName()).getFileExtension();
				if (extension == null || !extension.equals(Ecore2DSGenFactory.DSGEN_FILE_EXT))
				{
					setErrorMessage("The filename must end with the dsgen suffix");
					return false;
				} else
				{
					dsgenModelContainerPath = getContainerFullPath();
					dsgenModelFileName = getFileName();
					return true;
				}
			} else
			{
				return false;
			}
		}

		@Override
		public void setVisible(boolean visible)
		{
			super.setVisible(visible);
			if (visible && firstTime)
			{
				firstTime = false;
				if (modelFile != null)
				{
					String fileName = modelFile.getFullPath().removeFileExtension().lastSegment();
					setFileName(fileName + Ecore2DSGenFactory.DSGEN_DOT_EXT);
				} else
				{
					if (getFileName() == null)
					{
						setFileName(getDefaultDSGenModelFileName());
					}
				}
			}
		}

		@Override
		public void setFileName(String value)
		{
			super.setFileName(value);
			dsgenModelFileName = value;
		}
	}

	protected IStructuredSelection selection;
	protected IWorkbench workbench;
	protected IPath dsgenModelContainerPath;
	protected String dsgenModelFileName;

	protected IFile modelFile;

	protected IPath defaultPath;

	public DSGenNewWizard()
	{
		super();
		setWindowTitle("DSGen Creation wizard");
	}

	/*
	 * public DSGenNewWizard(IFile reloadFile) { super();
	 * setWindowTitle(ImporterPlugin
	 * .INSTANCE.getString("_UI_ReloadWizard_title")); this.reloadFile =
	 * reloadFile; }
	 */

	@Override
	public void dispose()
	{
		selection = null;
		workbench = null;
		dsgenModelContainerPath = null;

		super.dispose();
	}

	protected ImageDescriptor getDefaultImageDescriptor()
	{
		return DSGenUIActivator.getDefault().getImageRegistry().getDescriptor(DSGenUIActivator.ECORE2DSGEN_IMG);
	}

	@Override
	public void addPages()
	{

		NewDSGenModelFileCreationPage page = new NewDSGenModelFileCreationPage("NewModelFileCreationPageID");
		page.setTitle("DSGen Creation wizard");
		page.setDescription("Create a new dsgen file from an ecore file");
		addPage(page);

		if (defaultPath != null)
		{
			page.setContainerFullPath(defaultPath.removeLastSegments(1));
			page.setFileName(defaultPath.lastSegment());
			page.setPageComplete(page.isPageComplete());
		}

	}

	public void init(IWorkbench workbench, IStructuredSelection selection)
	{
		this.workbench = workbench;
		this.selection = selection;
		init();
	}

	protected void init()
	{
		setDefaultPageImageDescriptor(getDefaultImageDescriptor());
		// Get the model file.
		Object selected = selection.getFirstElement();
		if (selected instanceof IFile)
		{
			if (Ecore2DSGenFactory.ECORE_FILE_EXT.equals(((IFile) selected).getFileExtension()))
			{
				System.out.println("On a trouvé le modèle");
				modelFile = (IFile) selected;
			}
		}
	}

	protected String getDefaultDSGenModelFileName()
	{
		//return defaultPath == null ? "My" + DOT_FILE_EXT_DSGEN : defaultPath.removeFirstSegments(defaultPath.segmentCount() - 1).toString();
		return modelFile == null ? "My" + Ecore2DSGenFactory.DSGEN_DOT_EXT : modelFile.getName() + Ecore2DSGenFactory.DSGEN_DOT_EXT;
		
	}

	protected boolean isValidNewValue(Object newValue, Object oldValue)
	{
		return newValue == null ? oldValue != null : !newValue.equals(oldValue);
	}

	@Override
	public boolean canFinish()
	{
		return true;
	}

	@Override
	public boolean performFinish()
	{
		boolean result = true;
 
		Ecore2DSGenFactory factory = new Ecore2DSGenFactory();
		try
		{
			factory.createDSGenFile(modelFile, dsgenModelContainerPath + "/" + dsgenModelFileName);
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = false;
		}
		return result;
	}



	/**
	 * Sets the path of the genmodel that will be used when this wizard is
	 * presented to the user. This method has to be invoke before the wizard
	 * pages are added.
	 * 
	 * @param path
	 *            The <b>absolute</b> path of the genmodel.
	 */
	public void setDefaultPath(IPath path)
	{
		defaultPath = path.makeAbsolute();
	}

	public IPath getDefaultPath()
	{
		return defaultPath;
	}
}
