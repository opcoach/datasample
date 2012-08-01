package com.opcoach.dsgen.ui.handlers;

import java.io.IOException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import com.opcoach.dsgen.helpers.DSGen2SampleFactory;
import com.opcoach.dsgen.helpers.DSGenConstants;

public class GenerateDataSample extends AbstractHandler
{

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException
	{
		ISelection sel = HandlerUtil.getCurrentSelection(event);
		if (sel instanceof IStructuredSelection)
		{
			Object selected = ((IStructuredSelection) sel).getFirstElement();
			if (selected instanceof IFile)
			{
				IFile file = (IFile) selected;
				if (DSGenConstants.DSGEN_FILE_EXT.equals(file.getFileExtension()))
				{
					// This is a dsgen file, we can generate sample
					DSGen2SampleFactory factory = new DSGen2SampleFactory();
					try
					{
						factory.createDSGenSample(file);
					} catch (IOException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		return null;
	}

}
