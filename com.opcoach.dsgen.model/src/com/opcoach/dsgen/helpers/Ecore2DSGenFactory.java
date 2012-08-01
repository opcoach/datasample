package com.opcoach.dsgen.helpers;

import java.io.IOException;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.opcoach.dsgen.DSGenPackage;


/**
 * Handler to generate the dsgen model from ecore model
 */
public class Ecore2DSGenFactory 
{

	private ResourceSet rset =null ;

	public static final String DSGEN_FILE_EXT = "dsgen";
	public static final String ECORE_FILE_EXT = "ecore";
	public static final String DSGEN_DOT_EXT = "." + DSGEN_FILE_EXT;


	public void createDSGenFile(IResource ecoreSource, String dsgenPath) throws IOException 
	{
		
		
		DSGenPackage genPack = createDSGenPackage(ecoreSource.getLocationURI());
		
		String dsgenName = ecoreSource.getProject().getLocation() + "/.." + dsgenPath;
		
		// Store the dsgen model in dsgenname file
		rset.getResourceFactoryRegistry().getExtensionToFactoryMap().put("dsgen", new XMIResourceFactoryImpl());

		Resource res2 = rset.createResource(org.eclipse.emf.common.util.URI.createFileURI(dsgenName));
		res2.getContents().add(genPack);
		try
		{
			final Map<Object, Object> saveOptions = new HashMap<Object, Object>();
			saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED, Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
			res2.save(saveOptions);
 			System.out.println("Dsgen model saved in : " + res2.getURI());
 			
 			// refresh the folder containing the new generated file
 			IWorkspaceRoot wroot = ecoreSource.getWorkspace().getRoot();
 			Path path = new Path(ecoreSource.getProject().getName()+"/.."+dsgenPath);
 			IFile f = wroot.getFile(path);
			IProject project = f.getProject();
			project.refreshLocal(IResource.DEPTH_INFINITE, null);
			
		} catch (IOException e)
		{
			System.out.println("---------- UNABLE TO STORE DSGEN MODEL in " + dsgenName);
			e.printStackTrace();
			throw new IOException("Unable to create dsgen model in  : " + dsgenName, e);
		} catch (CoreException e)
		{
			e.printStackTrace();
			System.out.println("---------- UNABLE TO REFRESH FOLDER " + dsgenName);

		}

	}
	
	/**
	 * the command has been executed, so extract extract the needed information from the application context.
	 */
	public DSGenPackage createDSGenPackage(URI ecoreSourceURI)
	{

		// Create a new ResourceSet to forget previous calls
		rset = new ResourceSetImpl();
		rset.getResourceFactoryRegistry().getExtensionToFactoryMap().put(ECORE_FILE_EXT, new XMIResourceFactoryImpl());

		//Resource res = rset.getResource(URI.createFileURI(ecoreSource.getLocation().toString()), true);
		Resource res = rset.getResource(org.eclipse.emf.common.util.URI.createURI(ecoreSourceURI.toString()), true);
		EPackage rootPackage = (EPackage) res.getContents().get(0);
		return createDSGenPackage(rootPackage);


	}
	/**
	 * the command has been executed, so extract extract the needed information from the application context.
	 */
	public DSGenPackage createDSGenPackage(EPackage rootPackage)
	{
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
		DSGenPackage genPack = null;
		try
		{
		 genPack = DSGenHelper.createDSGenPackage(rootPackage);
		}
		catch (Throwable t)
		{
			System.out.println("Error when creating DSGenPackage model");
			t.printStackTrace();
		}
		
		return genPack;



	}

	
	
}
