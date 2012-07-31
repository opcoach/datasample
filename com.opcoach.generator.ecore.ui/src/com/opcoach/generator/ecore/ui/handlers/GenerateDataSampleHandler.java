package com.opcoach.generator.ecore.ui.handlers;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.ant.core.AntRunner;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.osgi.framework.Bundle;

import com.opcoach.dsgen.DSGenPackage;
import com.opcoach.dsgen.helpers.DSGenHelper;
import com.opcoach.generator.ecore.ui.GeneratorEcoreUIActivator;

/**
 * Handler to generate the dsgen model from ecore model
 */
public class GenerateDataSampleHandler extends AbstractHandler
{

	private static final String DSGEN2JAVA_BUNDLE_ID = "com.opcoach.generator.xpand.dsgen2java";
	private static final String GENERATOR_BUNDLE_ID = "com.opcoach.generator.model";
	private final static String ECORE_EXT = "ecore";

	/** The selected ecore file */
	//private IResource ecoreSelected;

	/**
	 * The constructor.
	 */
	public GenerateDataSampleHandler()
	{

	}

	public Object execute(ExecutionEvent event) throws ExecutionException
	{
		
		IResource ecoreSelected = getEcoreFromSelection(event);

		if (ecoreSelected == null)
			return null;
		
		// Create the target project
		IProject targetProject = createTargetProject(event, ecoreSelected);
		// Create the dsgen file inside target project
		createDSGenFile(targetProject, ecoreSelected, event);
		
		// refresh the target project
		try
		{
			targetProject.refreshLocal(IResource.DEPTH_INFINITE, null);
			
			// Open the folders of this project
			
			
		} catch (CoreException e)
		{
			// TODO Auto-generated catch block
			throw new ExecutionException("Unable to refresh the project " + targetProject.getName());
		}

		
		return null;
	}
	
	/**
	 * the command has been executed, so extract extract the needed information from the application context.
	 */
	public void createDSGenFile(IProject targetProj, IResource ecoreSource, ExecutionEvent event) throws ExecutionException
	{

		// Read the ecore file
		ResourceSet rset = new ResourceSetImpl();
		rset.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());

		Resource res = rset.getResource(URI.createFileURI(ecoreSource.getLocation().toString()), true);
		EPackage rootPackage = (EPackage) res.getContents().get(0);
		for (EClassifier ec : rootPackage.getEClassifiers())
		{
			if (ec instanceof EClass)
			{
				System.out.println("--> Classe : " + ec.getName());

			for (EStructuralFeature sf : ((EClass) ec).getEAllStructuralFeatures())
				{
					String t = (sf instanceof EReference) ? "   Reference : " : "   Field : ";
					System.out.println( t + sf.getName());
				}
				
				
				for (EReference ref : ((EClass) ec).getEReferences())
				{
					System.out.println( "Reference : "  + ref.getName());
				}

			}
		}

		// Create the dsgen model
		String ecoreName = ecoreSource.getName();
		int ecorePos = ecoreName.lastIndexOf(".ecore");
		String dsgenName = targetProj.getLocation() + "/src/" + ecoreName.substring(0,ecorePos) + ".dsgen";
		DSGenPackage genPack = null;
		try
		{
		 genPack = DSGenHelper.createDSGenPackage(rootPackage);
		}
		catch (Throwable t)
		{
			System.out.println("Erreur when creating DSGenPackage model");
			t.printStackTrace();
		}

		// Store the dsgen model in dsgenname file
		rset.getResourceFactoryRegistry().getExtensionToFactoryMap().put("dsgen", new XMIResourceFactoryImpl());

		Resource res2 = rset.createResource(URI.createFileURI(dsgenName));
		res2.getContents().add(genPack);
		try
		{
			final Map<Object, Object> saveOptions = new HashMap<Object, Object>();
			saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED, Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
			res2.save(saveOptions);
 			System.out.println("Dsgen model saved in : " + res2.getURI());
		} catch (IOException e)
		{
			System.out.println("---------- UNABLE TO STORE DSGEN MODEL in " + dsgenName);
			e.printStackTrace();
			throw new ExecutionException("Unable to create dsgen model in  : " + dsgenName, e);
		}


	}

	/**
	 * Convert the ISelection into the ecoreSelected
	 * 
	 * @return null it selection is not an ecore file.
	 */
	private IResource getEcoreFromSelection(ExecutionEvent event)
	{
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection == null)
			return null;

		IResource ecoreSelected = null;
		if (selection instanceof IStructuredSelection)
		{
			Object selected = ((IStructuredSelection) selection).getFirstElement();
			if (selected instanceof IFile)
			{
				IFile fSelected = (IFile) selected;
				String name = fSelected.getFileExtension();
				if (ECORE_EXT.equals(name))
				{
					ecoreSelected = fSelected;
					System.out.println("The resource " + fSelected.getName() + " is selected");
				}

			}

		}
		return ecoreSelected;

	}
	
	
	
	
	public IProject createTargetProject(ExecutionEvent event, IResource ecoreSource) throws ExecutionException
	{

		IProgressMonitor monitor = new NullProgressMonitor();
		//-------------------------------------------------------
		// Extract the build from this bundle so as to run it
		//-------------------------------------------------------
		String buildFile = extractFile("ant/build.xml");
		
		
		//-------------------------------------------------------
		// Extract the files from dsgen2java so as to copy them into new project
		//-------------------------------------------------------
		Bundle b = Platform.getBundle(DSGEN2JAVA_BUNDLE_ID);
		
		// Voir si l'extraction des fichiers est nécessaire... Si le bundle est livré sous la forme d'un répertoire
		// c'est inutile de faire tout ca...
		
	/*	extractFile(b,"src/workflow/generator.mwe");
		extractFile(b,"src/template/Template.xpt");
	    extractFile(b,"plugin.xml");
		extractFile(b,".classpath");
		extractFile(b,"META-INF/MANIFEST.MF");
		*/
		
		//-------------------------------------------------------
		// Get the bundle location for workflow and templates
		//-------------------------------------------------------
		String homedsgen2java = "UNDEFINED";
		try {
			homedsgen2java = FileLocator.toFileURL(b.getEntry("/")).getFile();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}  // On retourne directement l'endroit où est intallé le bundle.

		//-------------------------------------------------------
		// Get the bundle location for generator model and its sample data
		//-------------------------------------------------------
		Bundle bgen = Platform.getBundle(GENERATOR_BUNDLE_ID);
		String homeForStringData = "UNDEFINED";
		try {
			homeForStringData = FileLocator.toFileURL(bgen.getEntry("data")).getFile();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}  // On retourne directement l'endroit où est intallé le bundle.

		//-------------------------------------------------------
		// Create the new generation project before calling ant
		//-------------------------------------------------------
		String rootProject = ecoreSource.getProject().getName();
		String projectName = rootProject + ".datasample";
		IProject proj = createNewProject(projectName);
		
		//-------------------------------------------------------
		// Call the ant file with new project as target
		//-------------------------------------------------------
		AntRunner runner = new AntRunner();
		runner.setBuildFileLocation(buildFile);
		
		String[] args = new String[] { "-verbose", 
				//"-DworkflowPath="+workflowPath,
				// "-DtemplatePath="+templatePath,
				"-DhomeWorkspace="+getHomeWorkspace(),
				"-Dhomedsgen2java="+homedsgen2java,
				"-DhomeForStringData="+homeForStringData,
				"-DrootProject="+rootProject,
				"-DprojectName="+proj.getName(),
				"-DpackagePath="+proj.getName().replace('.','/'),
				"-Ddsgen2javaBundleName=" + DSGEN2JAVA_BUNDLE_ID,
				"-DecoreSource=" + ecoreSource.getName(),
				"-DecoreSourceProject=" + ecoreSource.getProject().getName(),
				"-DecoreSourceLocation=" + ecoreSource.getLocation()
				};
		runner.setArguments(args);
		runner.setMessageOutputLevel(org.apache.tools.ant.Project.MSG_DEBUG);
		runner.addBuildLogger("org.apache.tools.ant.DefaultLogger");
	
		
		try
		{
			runner.run(monitor);
		} catch (CoreException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
		/*	File f = new File(homedsgen2java);
			if (f.exists())
			{
				System.out.println("Deleting the directory " + f.getAbsolutePath());
				f.delete();
			}
			*/
		}
		
		return proj;

	}
	

	
	/** @return the path to the home project. Get it in the workspace root */
	private String getHomeWorkspace()
	{
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = workspace.getRoot();
		return root.getLocation().toString();
	}
	
	private String extractFile(String entryPath) throws ExecutionException
	{
		return extractFile(GeneratorEcoreUIActivator.getDefault().getBundle(), entryPath);
	}

	
	private String extractFile(Bundle b, String entryPath) throws ExecutionException
	{
		URL u = b.getEntry(entryPath);
		String destDir = getDestDirForBundle(b);
		
		String destFile = null;
		try
		{
			destFile = extractFile(u.openStream(), entryPath, destDir);
		} catch (IOException e1)
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
			throw new ExecutionException("Unable to extract " + entryPath + " file from bundle");
		}
		
		return destFile;

	}
	
	private String getDestDirForBundle(Bundle b)
	{
		String destDir = System.getProperty("java.io.tmpdir");

		if (!(destDir.endsWith("/") || destDir.endsWith("\\")))
			destDir = destDir + File.separator;
		
		destDir = destDir + b.getSymbolicName() + File.separator;
		return destDir;
	}

	/**
	 * Extract a file from an URI into a temp file.
	 * 
	 * @param input the input stream to extract
	 * @param name the name of the file to generate
	 * @param destDir the destination directory
	 * @return file name created (null if error).
	 */
	private String extractFile(InputStream input, String name, String destDir)
	{
		String fileResult = null;
		try
		{

			File efile = new File(destDir, name);
			if (!efile.exists())
			{
				efile.mkdirs();
				efile.delete();
			}

			InputStream in = new BufferedInputStream(input);
			OutputStream out = new BufferedOutputStream(new FileOutputStream(efile));
			byte[] buffer = new byte[2048];
			for (;;)
			{
				int nBytes = in.read(buffer);
				if (nBytes <= 0)
					break;
				out.write(buffer, 0, nBytes);
			}
			out.flush();
			out.close();
			in.close();
			fileResult = efile.getAbsolutePath();
		} catch (Exception e)
		{
			e.printStackTrace();
			fileResult = null;
		}
		return fileResult;
	}
	
	private IProject createNewProject(String projectName)
	{
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		try
		{
			project.create(null);
			project.open(null);

		} catch (CoreException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return project;
		
	/*	IProjectDescription description = project.getDescription();
		String[] ids = description.getNatureIds();
		String[] newIds = new String[ids.length+1];
		System.arraycopy(ids, 0, newIds, 0, ids.length);
		newIds[newIds.length-1] = JavaCore.NATURE_ID;
		description.setNatureIds(newIds);
		project.setDescription(description, null);
		*/
	}



}
