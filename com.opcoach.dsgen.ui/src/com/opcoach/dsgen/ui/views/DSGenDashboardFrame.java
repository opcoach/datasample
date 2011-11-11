package com.opcoach.dsgen.ui.views;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.wb.swt.ResourceManager;
import org.eclipse.wb.swt.SWTResourceManager;

public class DSGenDashboardFrame extends ViewPart
{

	public static final String ID = "com.opcoach.dsgen.ui.views.DSGenDashboard"; //$NON-NLS-1$
	protected Composite container;
	protected SashForm sashForm;
	protected ScrolledComposite left;
	protected ScrolledComposite right;
	protected Tree tree;
	protected Group generationGroup;
	protected Group generatorGroup;
	protected SashForm genGroupParent;

	public DSGenDashboardFrame()
	{
	}

	/**
	 * Create contents of the view part.
	 * 
	 * @param parent
	 */
	@Override
	public void createPartControl(Composite parent)
	{
		parent.setLayout(new FillLayout(SWT.HORIZONTAL));
		container = new Composite(parent, SWT.NONE);
		container.setBackground(SWTResourceManager.getColor(new RGB(74, 164, 173)));
		GridLayout gl_container = new GridLayout(1, false);
		gl_container.horizontalSpacing = 1;
		container.setLayout(gl_container);
		{
			{
				Label opcoachImage = new Label(container, SWT.NONE);
				GridData gd_opcoachImage = new GridData(SWT.CENTER, SWT.CENTER, true, false, 1, 1);
				gd_opcoachImage.minimumWidth = 100;
				gd_opcoachImage.minimumHeight = 200;
				opcoachImage.setLayoutData(gd_opcoachImage);
				opcoachImage.setAlignment(SWT.CENTER);
				opcoachImage.setImage(ResourceManager.getPluginImage("com.opcoach.dsgen.ui", "icons/Logo5cm100dpi.png"));
			}

			Composite loadComposite = new Composite(container, SWT.NONE);
			GridData gd_loadComposite = new GridData(SWT.CENTER, SWT.CENTER, true, false, 1, 1);
			gd_loadComposite.minimumHeight = 50;
			loadComposite.setLayoutData(gd_loadComposite);
			loadComposite.setBackground(SWTResourceManager.getColor(new RGB(74, 164, 173)));
			loadComposite.setLayout(new GridLayout(2, false));
			{
				Button loadEcoreButton = new Button(loadComposite, SWT.CENTER);
				loadEcoreButton.setFont(SWTResourceManager.getFont("Century Gothic", 14, SWT.NORMAL));
				loadEcoreButton.addSelectionListener(new SelectionAdapter()
				{
					@Override
					public void widgetSelected(SelectionEvent e)
					{
					}
				});
				loadEcoreButton.setText("Load an Ecore Model");
			}
			{
				Label ecoreName = new Label(loadComposite, SWT.NONE);
				ecoreName.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
				ecoreName.setFont(SWTResourceManager.getFont("Century Gothic", 12, SWT.NORMAL));
				ecoreName.setText("Nom du modèle chargé");
			}

		}
		{
			Composite dataComposite = new Composite(container, SWT.NONE);
			dataComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
			dataComposite.setLayout(new FillLayout(SWT.VERTICAL));

			{
				sashForm = new SashForm(dataComposite, SWT.BORDER);
				{
					left = new ScrolledComposite(sashForm, SWT.H_SCROLL | SWT.V_SCROLL);
					left.setExpandVertical(true);
					left.setExpandHorizontal(true);
					left.setFont(SWTResourceManager.getFont("Century Gothic", 12, SWT.NORMAL));
					left.setLayout(new GridLayout(1, false));

					Composite content = new Composite(left, SWT.NONE);
					content.setLayout(new FillLayout());
					tree = new Tree(content, SWT.NONE);
					left.setContent(content);
				}
				{
					right = new ScrolledComposite(sashForm, SWT.H_SCROLL | SWT.V_SCROLL);
					right.setExpandVertical(true);
					right.setExpandHorizontal(true);
					right.setLayout(new FillLayout(SWT.VERTICAL));
					genGroupParent = new SashForm(right, SWT.BORDER | SWT.VERTICAL);
					{
						genGroupParent.setLayout(new FillLayout(SWT.VERTICAL));
						{
							generationGroup = new Group(genGroupParent, SWT.NONE);
							generationGroup.setLayout(new GridLayout(1,true));
							generationGroup.setText("Generation parameters");
						}
						{
							generatorGroup = new Group(genGroupParent, SWT.NONE);
							generatorGroup.setLayout(new GridLayout(1,true));
							generatorGroup.setText("Generator Parameters");
						}
					}
					genGroupParent.setWeights(new int[] { 40,60 });
					right.setContent(genGroupParent);
				}
				sashForm.setWeights(new int[] { 40, 60 });
			}
		}
		{
			Composite actionComposite = new Composite(container, SWT.NONE);
			actionComposite.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
			actionComposite.setBackground(SWTResourceManager.getColor(new RGB(74, 164, 173)));
			actionComposite.setLayout(new GridLayout(1, false));
			{
				Button button = new Button(actionComposite, SWT.CENTER);
				button.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
				button.addSelectionListener(new SelectionAdapter()
				{
					@Override
					public void widgetSelected(SelectionEvent e)
					{
					}
				});
				button.setText("Get the Sample Factory");
				button.setFont(SWTResourceManager.getFont("Century Gothic", 14, SWT.NORMAL));
			}
		}

		createActions();
		initializeToolBar();
		initializeMenu();
	}

	/**
	 * Create the actions.
	 */
	private void createActions()
	{
		// Create the actions
	}

	/**
	 * Initialize the toolbar.
	 */
	private void initializeToolBar()
	{
		IToolBarManager toolbarManager = getViewSite().getActionBars().getToolBarManager();
	}

	/**
	 * Initialize the menu.
	 */
	private void initializeMenu()
	{
		IMenuManager menuManager = getViewSite().getActionBars().getMenuManager();
	}

	@Override
	public void setFocus()
	{
		// Set the focus
	}
}
