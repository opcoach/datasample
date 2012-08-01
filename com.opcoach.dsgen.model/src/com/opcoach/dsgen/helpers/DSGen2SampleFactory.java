package com.opcoach.dsgen.helpers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.opcoach.dsgen.DSGenAttribute;
import com.opcoach.dsgen.DSGenClass;
import com.opcoach.dsgen.DSGenClassifier;
import com.opcoach.dsgen.DSGenDataType;
import com.opcoach.dsgen.DSGenFeature;
import com.opcoach.dsgen.DSGenModel;
import com.opcoach.dsgen.DSGenPackage;
import com.opcoach.dsgen.DSGenReference;
import com.opcoach.generator.ReferenceGenerator;
import com.opcoach.generator.ValueGenerator;

/**
 * Handler to generate the dsgen model from ecore model
 */
public class DSGen2SampleFactory implements DSGenConstants
{

	private ResourceSet rset = null;

	/**
	 * Generate the sample xmi file.
	 * 
	 * @param dsgenSource
	 *            the dsgen input model to read
	 * @throws IOException
	 */

	public void createDSGenSample(IFile dsgenSource) throws IOException
	{

		ResourceSet rset = new ResourceSetImpl();
		rset.getResourceFactoryRegistry().getExtensionToFactoryMap().put(ECORE_FILE_EXT, new XMIResourceFactoryImpl());

		System.out.println("Enter in createDSGenSample with file " + dsgenSource.getLocation().toString());

		Resource res = rset.getResource(org.eclipse.emf.common.util.URI.createFileURI(dsgenSource.getLocation().toString()), true);
		DSGenModel model = (DSGenModel) res.getContents().get(0);
		for (DSGenPackage p : model.getDsgenPackages())
		{
			System.out.println("Package trouvé " + p.getEcorePackage().getName());
			generateSampleForPackage(p);
		}

		/*
		 * 
		 * long seed = System.currentTimeMillis();
		 * model.setName(dsgenSource.getName
		 * ().substring(0,dsgenSource.getName().indexOf(DSGEN_FILE_EXT)-1));
		 * model.setRandomSeed(seed); model.setLanguage("en"); // the language
		 * to generate data
		 * 
		 * 
		 * DSGenPackage genPack =
		 * createDSGenPackage(dsgenSource.getLocationURI());
		 * model.getDsgenPackages().add(genPack);
		 * 
		 * String sampleFileName= dsgenSource.getProject().getLocation() + "/.."
		 * + model.getName() + "_" + model.getRandomSeed() + ".xmi";
		 * 
		 * // Store the dsgen model in dsgenname file
		 * rset.getResourceFactoryRegistry
		 * ().getExtensionToFactoryMap().put("dsgen", new
		 * XMIResourceFactoryImpl());
		 * 
		 * Resource res2 =
		 * rset.createResource(org.eclipse.emf.common.util.URI.createFileURI
		 * (sampleFileName)); res2.getContents().add(model); try { final
		 * Map<Object, Object> saveOptions = new HashMap<Object, Object>();
		 * saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED,
		 * Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
		 * res2.save(saveOptions); System.out.println("Dsgen model saved in : "
		 * + res2.getURI());
		 * 
		 * // refresh the folder containing the new generated file
		 * IWorkspaceRoot wroot = dsgenSource.getWorkspace().getRoot(); Path
		 * path = new Path(dsgenSource.getProject().getName()+"/.."+dsgenPath);
		 * IFile f = wroot.getFile(path); IProject project = f.getProject();
		 * project.refreshLocal(IResource.DEPTH_INFINITE, null);
		 * 
		 * } catch (IOException e) {
		 * System.out.println("---------- UNABLE TO STORE DSGEN MODEL in " +
		 * sampleFileName); e.printStackTrace(); throw new
		 * IOException("Unable to create dsgen model in  : " + sampleFileName,
		 * e); } catch (CoreException e) { e.printStackTrace();
		 * System.out.println("---------- UNABLE TO REFRESH FOLDER " +
		 * sampleFileName);
		 * 
		 * }
		 */
	}

	private EObject generateSampleForPackage(DSGenPackage p)
	{
		EObject result = null;
		// Create the root object
		DSGenClass rootGenClass = null;
		for (DSGenClassifier c : p.getDsgenClassifiers())
		{
			if (c instanceof DSGenClass)
			{
				if (((DSGenClass) c).isRootObject())
				{
					rootGenClass = (DSGenClass) c;
					break;
				}
			}
		}

		EClass rootClass = rootGenClass.getEcoreClass();
		result = rootClass.getEPackage().getEFactoryInstance().create(rootClass);
		System.out.println("----------------->Create the root object " + result);

		for (DSGenClassifier c : p.getDsgenClassifiers())
		{
			System.out.println("Found this classifier : " + c);
			if (c instanceof DSGenClass)
			{
				generateSampleForEClass((DSGenClass) c);
			}
			else if (c instanceof DSGenDataType)
				generateSampleForEDataType((DSGenDataType) c);
		}

		return result;

	}

	private Collection<EObject> generateSampleForEClass(DSGenClass c)
	{
		System.out.println("----->  Must create " + c.getInstanceNumber() + " instance(s) of : " + c);
		Collection<EObject> result = null;
		EObject obj = null;
		if (c.getInstanceNumber() == -1)
			return result;
		result = new ArrayList<EObject>(c.getInstanceNumber());
		EClass clToInstanciate = c.getEcoreClass();

		for (int i = 0; i < c.getInstanceNumber(); i++)
		{
			obj = clToInstanciate.getEPackage().getEFactoryInstance().create(clToInstanciate);
			System.out.println("Instaciate a new " + clToInstanciate.getName());
			result.add(obj);
			for (DSGenFeature ft : c.getDsgenFeatures())
			{
				if (ft instanceof DSGenAttribute)
				{
					ValueGenerator<?> gen = ((DSGenAttribute) ft).getGenerator();
					String genClass = (gen == null) ? "" : " generator class : " + gen.getClass().toString();
					Object genval = (gen == null) ? null : gen.generateValue();
					Object val = (gen == null) ? "NO GENERATOR" : genval;
					System.out.println("For the feature : " + ft.getEcoreFeature().getName() + " generate this value : " + val
							+ genClass);
				} else if (ft instanceof DSGenReference)
				{
					ReferenceGenerator<?> gen = ((DSGenReference) ft).getGenerator();
					String genClass = (gen == null) ? "" : " generator class : " + gen.getClass().toString();
					Object genval = (gen == null) ? null : gen.generateValue();
					Object val = (gen == null) ? "NO GENERATOR" : genval;
					System.out.println("For the feature : " + ft.getEcoreFeature().getName() + " generate this value : " + val
							+ genClass);
				}
			}
		}
		return result;
	}

	private void generateSampleForEDataType(DSGenDataType c)
	{
		// TODO Auto-generated method stub

	}

}
