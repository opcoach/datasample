
package com.opcoach.datasample.template.generator.ui;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import com.opcoach.datasample.template.generator.DataSampleTemplateGenerator;

public class GenerateDataSampleTemplateHandler {

	@CanExecute
	public boolean execute(@Named(IServiceConstants.ACTIVE_SELECTION) Object o) {

		return (o instanceof EPackage) || ((o instanceof IStructuredSelection)
				&& ((IStructuredSelection) o).getFirstElement() instanceof EPackage);

	}

	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SELECTION) IStructuredSelection iss,
			@Named(IServiceConstants.ACTIVE_SHELL) Shell s) {

		Object selected = iss.getFirstElement();
		if (selected instanceof EPackage)
			execute((EPackage) selected, s);

	}

	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SELECTION) EPackage p,
			@Named(IServiceConstants.ACTIVE_SHELL) Shell s) {

		final DataSampleDialog dialog = new DataSampleDialog(s, "Select the root object for the sample", null,
				"Select in this box the root object for which you want to create a data set.", MessageDialog.QUESTION,
				0, new String[] { "Select", "Cancel" }, p);
		
		// Ask for the root EClass to generate
		if (dialog.open() == MessageDialog.OK) {

			DataSampleTemplateGenerator gen = new DataSampleTemplateGenerator();
			EClass toGenerate = (EClass) p.getEClassifier(dialog.className);
			String result = gen.generateSample(p, toGenerate).toString();

			Clipboard clipboard = new Clipboard(Display.getCurrent());
			clipboard.setContents(new Object[] { result }, new Transfer[] { TextTransfer.getInstance() });
			MessageDialog.openInformation(s, "Generation Result",
					"The following result has been copied in the Clipboard. : \n" + result.substring(0, 1000) + "\n...");

		}

	}

	class DataSampleDialog extends MessageDialog {
		private EPackage p;
		protected String className;

		public DataSampleDialog(Shell parentShell, String dialogTitle, Image dialogTitleImage, String dialogMessage,
				int dialogImageType, int defaultIndex, String[] dialogButtonLabels, EPackage p) {
			super(parentShell, dialogTitle, dialogTitleImage, dialogMessage, dialogImageType, defaultIndex,
					dialogButtonLabels);
			this.p = p;

		}

		@Override
		protected Control createCustomArea(Composite parent) {

			parent.setLayout(new GridLayout(1, true));
			Combo combo = new Combo(parent, SWT.NONE);
			combo.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, false));
			combo.setText("EClass :");
			List<String> classItems = new ArrayList<>();
			for (EClassifier c : p.getEClassifiers()) {
				if ((c instanceof EClass) && !((EClass) c).isAbstract()) {
					classItems.add(c.getName());
				}
			}
			// Must copy this list of string into a fixed size string array (null items are
			// refused !)...
			String[] stringItems = new String[classItems.size()];
			int i = 0;
			for (String s : classItems)
				stringItems[i++] = s;
			combo.setItems(stringItems);
			combo.addSelectionListener(new SelectionListener() {

				@Override
				public void widgetSelected(SelectionEvent e) {
					className = combo.getItem(combo.getSelectionIndex());
				}

				@Override
				public void widgetDefaultSelected(SelectionEvent e) {

				}
			});

			return combo;

		}
	}
}