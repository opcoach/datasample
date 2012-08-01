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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

import com.opcoach.dsgen.ui.DSGenUIActivator;

/**
 * @since 2.1.0
 */

public class DSGenNewWizard extends Wizard implements INewWizard
{
	private static final String FILE_EXT_DSGEN = "dsgen";
	private static final String FILE_EXT_ECORE = "ecore";
	private static final String DOT_FILE_EXT_DSGEN = "." + FILE_EXT_DSGEN;

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
				if (extension == null || !extension.equals(FILE_EXT_DSGEN))
				{
					setErrorMessage("The filename must end with the dsgen suffix");
					return false;
				} else
				{
					genModelContainerPath = getContainerFullPath();
					genModelFileName = getFileName();
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
					setFileName(fileName + DOT_FILE_EXT_DSGEN);
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
			genModelFileName = value;
		}
	}

	protected IStructuredSelection selection;
	protected IWorkbench workbench;
	protected IPath genModelContainerPath;
	protected String genModelFileName;

	protected IFile modelFile;
	// protected ModelConverterDescriptorSelectionPage selectionPage;

	protected IPath defaultPath;
	protected String defaultDescriptorID;

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
		genModelContainerPath = null;

		super.dispose();
	}

	protected ImageDescriptor getDefaultImageDescriptor()
	{
		return DSGenUIActivator.getDefault().getImageRegistry().getDescriptor(DSGenUIActivator.ECORE2DSGEN);
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
			if (FILE_EXT_ECORE.equals(((IFile) selected).getFileExtension()))
			{
				System.out.println("On a trouvé le modèle");
				modelFile = (IFile) selected;
			}
		}
	}

	protected String getDefaultDSGenModelFileName()
	{
		//return defaultPath == null ? "My" + DOT_FILE_EXT_DSGEN : defaultPath.removeFirstSegments(defaultPath.segmentCount() - 1).toString();
		return modelFile == null ? "My" + DOT_FILE_EXT_DSGEN : modelFile.getName() + DOT_FILE_EXT_DSGEN;
		
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
		return true;
	}

	/**
	 * Sets the model importer descriptor that will be selected when this wizard
	 * is presented to the user. This method has to be invoke before the wizard
	 * pages are added.
	 * 
	 * @param id
	 */
	public void setDefaultModelImporterDescriptorID(String id)
	{
		defaultDescriptorID = id;
	}

	public String getDefaultModelImporterDescriptorID()
	{
		return defaultDescriptorID;
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
