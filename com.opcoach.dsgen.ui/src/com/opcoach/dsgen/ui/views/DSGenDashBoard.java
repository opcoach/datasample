package com.opcoach.dsgen.ui.views;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFDataBindingContext;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.jface.databinding.swt.ISWTObservableValue;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;

import com.opcoach.dsgen.core.Ecore2DSGenFactory;
import com.opcoach.dsgen.ui.DSGenUIActivator;
import com.opcoach.generator.GeneratorPackage;
import com.opcoach.generator.ValueGenerator;
import com.opcoach.generator.basic.BasicPackage;
import com.opcoach.generator.ecore.dsgen.DSGenAttribute;
import com.opcoach.generator.ecore.dsgen.DSGenPackage;
import com.opcoach.generator.ecore.dsgen.DSGenReference;
import com.opcoach.generator.ecore.dsgen.DataSampleGenPackage;

public class DSGenDashBoard extends DSGenDashboardFrame implements ISelectionListener
{

	private TreeViewer tv;

	// Attributes that must not be displayed (internal usage)
	private Map<EClass, Collection<String>> excludedProperties = new HashMap<EClass, Collection<String>>();

	// Associate an EClass to its composite parameters
	private Map<EClass, Composite> eclassToCompositeMap = new HashMap<EClass, Composite>();
	// Associate a composite to its editable fields
	private Map<Composite, Collection<Control>> compositeToControlsMap = new HashMap<Composite, Collection<Control>>();

	private StackLayout generatorGroupLayout;
	private StackLayout generationGroupLayout;

	// A context for emf databinding.
	private DataBindingContext context = null;

	@Override
	public void createPartControl(Composite parent)
	{
		super.createPartControl(parent);

		// Initialize tree viewer displaying ecore model
		tv = new TreeViewer(tree);
		tv.setContentProvider(new DSGenContentProvider());
		tv.setLabelProvider(new DSGenLabelProvider());
		getSite().setSelectionProvider(tv);

		initExcludedProperties();

		initContent();

		// Init the right part (3 composites according to ECore type, in a stack
		// layout).
		initRightPart();

	}

	private void initExcludedProperties()
	{
		// Exclude for DSGenClass
		Collection<String> exClass = new ArrayList<String>();
		exClass.add("ecoreClass");
		exClass.add("rootObject");
		exClass.add("nbAssociationRefTo");
		exClass.add("dsgenFeatures");
		exClass.add("dsgenPackage");
		exClass.add("children");
		excludedProperties.put(DataSampleGenPackage.eINSTANCE.getDSGenClass(), exClass);

		Collection<String> exAtt = new ArrayList<String>();
		exAtt.add("dsgenClass");
		exAtt.add("ecoreFeature");
		excludedProperties.put(DataSampleGenPackage.eINSTANCE.getDSGenAttribute(), exAtt);

		Collection<String> exRef = new ArrayList<String>();
		exRef.add("dsgenClass");
		exRef.add("ecoreFeature");
		excludedProperties.put(DataSampleGenPackage.eINSTANCE.getDSGenReference(), exRef);

	}

	@Override
	public void init(IViewSite site) throws PartInitException
	{
		super.init(site);
		// Listen to selection
		site.getPage().addSelectionListener(this);
	}

	/** A temp method to fill with a default ecore file */
	private void initContent()
	{
		URI u = null;
		try
		{
			u = DSGenUIActivator.getDefault().getBundle().getEntry("data/rental.ecore").toURI();
		} catch (URISyntaxException e)
		{
			e.printStackTrace();
		}

		Ecore2DSGenFactory factory = new Ecore2DSGenFactory();
		DSGenPackage dpack = factory.createDSGenPackage(u);

		Collection<DSGenPackage> cols = new ArrayList<DSGenPackage>();
		cols.add(dpack);
		tv.setInput(cols);

	}

	/**
	 * Initialize the 3 composite corresponding to EAttribute, EClass and
	 * EReference This method set a StackLayout on the right composite in the
	 * sash form
	 */
	private void initRightPart()
	{
		generationGroupLayout = new StackLayout();
		generationGroup.setLayout(generationGroupLayout);

		generatorGroupLayout = new StackLayout();
		generatorGroup.setLayout(generatorGroupLayout);

		generationGroup.setVisible(false);
		generatorGroup.setVisible(false);

	}

	/** Create the composite with label and text to edit attribute value */
	private Control createAttributeWidgets(EAttribute at, Composite parent, int index)
	{
		// Create a new composite to contain label and value.
		Composite attComposite = createParentPropertyComposite(parent, index);
		Control result = null;

		if (at.getEAttributeType() == EcorePackage.Literals.EBOOLEAN)
		{
			// For boolean create a button
			Button b = new Button(attComposite, SWT.CHECK);
			b.setText(getTextForFeature(at));
			b.setToolTipText("Aide sur attribut : " + getTextForFeature(at));
			result = b;
		} else
		{
			// Create title, and value
			Label attTitle = new Label(attComposite, SWT.NONE);
			attTitle.setText(getTextForFeature(at) + " : ");
			attTitle.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
			attTitle.setToolTipText("Aide sur attribut : " + getTextForFeature(at));

			/*
			 * if ((at.getEAttributeType() == EcorePackage.Literals.EINT) &&
			 * (at.getName().endsWith("Percent"))) { // Spinner not supported by
			 * databinding... :-/ Spinner s = new Spinner(attComposite,
			 * SWT.HORIZONTAL); s.setMinimum(0); s.setMaximum(100);
			 * s.setIncrement(1); result = s; } else {
			 */
			Text t = new Text(attComposite, SWT.NONE);
			t.setText(" ");
			t.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, true, 1, 1));
			result = t;
			// }
		}
		System.out.println("Création du composite pour l'att " + at.getName());

		result.setData(at);
		return result;
	}

	/** Create the composite with label and combo to edit reference value */
	private Control createReferenceWidgets(EReference ref, Composite parent, int index)
	{
		Composite refComposite = createParentPropertyComposite(parent, index);
		// Create title, and value
		Label attTitle = new Label(refComposite, SWT.NONE);
		attTitle.setText(getTextForFeature(ref) + " : ");
		attTitle.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		attTitle.setToolTipText("Aide sur attribut : " + getTextForFeature(ref));
		Combo c = new Combo(refComposite, SWT.NONE);
		c.setText(" ");
		c.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, true, 1, 1));
		c.setData(ref);
		System.out.println("Création du composite pour la ref " + ref.getName());

		return c;
	}

	private String getTextForFeature(EStructuralFeature f)
	{
		// To be translated in a few time..
		return (f.getName());
	}

	/** Create the property composite to put label and text or combo widgets */
	private Composite createParentPropertyComposite(Composite parent, int index)
	{
		// Create a new composite to contain label and value.
		Composite attComposite = new Composite(parent, SWT.BORDER);
		int colorIndex = ((index % 2) == 0) ? SWT.COLOR_GRAY : SWT.COLOR_DARK_GRAY;
		attComposite.setBackground(Display.getCurrent().getSystemColor(colorIndex));
		attComposite.setLayout(new GridLayout(2, true));
		attComposite.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false, 1, 1));
		return attComposite;
	}

	private Composite getCompositeForEClass(EClass genClass, Composite parent)
	{
		// Is it already created ?
		Composite result = eclassToCompositeMap.get(genClass);
		if (result != null)
			return result;

		result = new Composite(parent, SWT.NONE);
		result.setLayout(new GridLayout(1, true));

		// Get excluded properties
		Collection<String> excluded = excludedProperties.get(genClass);

		int i = 0;
		Collection<Control> ctrls = new ArrayList<Control>();
		for (EAttribute at : genClass.getEAllAttributes())
		{
			if ((excluded == null) || !excluded.contains(at.getName()))
			{
				Control c = createAttributeWidgets(at, result, i);
				ctrls.add(c);
			}
		}
		for (EReference ref : genClass.getEAllReferences())
		{
			if ((excluded == null) || !excluded.contains(ref.getName()))
			{
				Control c = createReferenceWidgets(ref, result, i);
				ctrls.add(c);
			}
		}

		// Add results in map
		eclassToCompositeMap.put(genClass, result);
		compositeToControlsMap.put(result, ctrls);

		return result;
	}

	/**
	 * Called by selectionListener, this method select the composite and bind
	 * values
	 */
	private void setRightData(EObject selected)
	{

		// ------------------------------------
		// -- Manage the generation group
		// ------------------------------------
		Composite panel = getCompositeForEClass(selected.eClass(), generationGroup);
		generationGroup.setVisible(true);
		generationGroupLayout.topControl = panel;
		generationGroup.layout();

		// Bind values on generationGroup
		if (context != null)
			context.dispose();
		context = new EMFDataBindingContext();
		bindValues(selected, compositeToControlsMap.get(panel));

		// ------------------------------------
		// -- Manage the generator group
		// ------------------------------------
		ValueGenerator<?> gen = null;
		if (selected instanceof DSGenAttribute)
			gen = ((DSGenAttribute) selected).getGenerator();
		else if (selected instanceof DSGenReference)
		{
			gen = ((DSGenReference) selected).getGenerator();
		}
		generatorGroup.setVisible(gen != null);
		if (gen != null)
		{
			Composite genPanel = getCompositeForEClass(gen.eClass(), generatorGroup);
			generatorGroupLayout.topControl = genPanel;
			generatorGroup.layout();

			// Bind generator data
			bindValues(gen, compositeToControlsMap.get(genPanel));

		}

		genGroupParent.layout();
		right.layout();

	}

	private void bindValues(EObject o, Collection<Control> ctrls)
	{
		if ((ctrls == null) || (o == null))
			return;

		for (Control c : ctrls)
		{
			IObservableValue observeEMF = EMFProperties.value((EStructuralFeature) c.getData()).observe(o);
			if (c instanceof Text)
			{
				ISWTObservableValue observeSWT = WidgetProperties.text(SWT.Modify).observe(c);
				context.bindValue(observeSWT, observeEMF);
			} else if (c instanceof Combo)
			{
				// Must set the items according to reference in EAttribute !
				EReference ref = (EReference) c.getData();
				if (ref.getEReferenceType() == GeneratorPackage.Literals.VALUE_GENERATOR || ref.getEReferenceType() == GeneratorPackage.Literals.RANGE_GENERATOR
						|| ref.getEReferenceType() == GeneratorPackage.Literals.REFERENCE_GENERATOR)
				{
					// Get the dataType of corresponding attribute. Selected object is probably  a DSGenAttribute
					if (o instanceof DSGenAttribute)
					{
						DSGenAttribute parentAttribute = (DSGenAttribute) o;
						EAttribute at = (EAttribute) parentAttribute.getEcoreFeature();
						EDataType dt = at.getEAttributeType();
						((Combo) c).setItems(GeneratorRegistry.getGeneratorNamesFor(dt));
					}
				}

				ISWTObservableValue observeSWT = WidgetProperties.selection().observe(c);
				context.bindValue(observeSWT, observeEMF);
			} else if (c instanceof Button)
			{
				ISWTObservableValue observeSWT = WidgetProperties.selection().observe(c);
				context.bindValue(observeSWT, observeEMF);
			}
		}
	}

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection)
	{
		if (selection instanceof IStructuredSelection)
		{
			Object selected = ((IStructuredSelection) selection).getFirstElement();
			if (selected instanceof EObject)
			{
				System.out.println("Init de l'objet de eClass :  " + ((EObject) selected).eClass().toString());
				setRightData((EObject) selected);
			}
		}

	}

}
