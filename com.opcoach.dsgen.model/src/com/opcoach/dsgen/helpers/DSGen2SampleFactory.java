package com.opcoach.dsgen.helpers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.opcoach.dsgen.DSGenAttribute;
import com.opcoach.dsgen.DSGenChild;
import com.opcoach.dsgen.DSGenClass;
import com.opcoach.dsgen.DSGenDataType;
import com.opcoach.dsgen.DSGenFeature;
import com.opcoach.dsgen.DSGenModel;
import com.opcoach.dsgen.DSGenReference;
import com.opcoach.generator.ReferenceGenerator;
import com.opcoach.generator.ValueGenerator;

/**
 * Handler to generate the dsgen model from ecore model
 */
public class DSGen2SampleFactory implements DSGenConstants
{

	private ResourceSet rset = null;

	/** The created sample */
	private EObject root = null;

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

		DSGenClass dsgenrootClass = model.getRoot();
		root = instanciateEObject(dsgenrootClass);

		// Store the root object

		String sampleFileName = dsgenSource.getProject().getLocation() + "/" + model.getName() + "_" + model.getRandomSeed()
				+ ".xmi";
		// Store the dsgen model in dsgenname file
		rset.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource res2 = rset.createResource(org.eclipse.emf.common.util.URI.createFileURI(sampleFileName));
		res2.getContents().add(root);
		try
		{
			final Map<Object, Object> saveOptions = new HashMap<Object, Object>();
			//saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED, Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
			saveOptions.put(XMLResource.OPTION_KEEP_DEFAULT_CONTENT, Boolean.TRUE);
			res2.save(saveOptions);
			System.out.println("sample model saved in : " + res2.getURI());
			// refresh the folder containing the new generated file
			IProject project = dsgenSource.getProject();
			project.refreshLocal(IResource.DEPTH_INFINITE, null);

		} catch (IOException e)
		{
			System.out.println("---------- UNABLE TO STORE SAMPLE in " + sampleFileName);
			e.printStackTrace();
			throw new IOException("Unable to create sample model in  : " + sampleFileName, e);
		} catch (CoreException e)
		{
			e.printStackTrace();
			System.out.println("---------- UNABLE TO REFRESH FOLDER " + sampleFileName);

		}

	}

	private void addChildren(EObject parent, DSGenClass dsgc)
	{
		System.out.println("*$*$*$*$*$  --> Creating children for dsgenclass : " + dsgc.toString());
		for (DSGenChild child : dsgc.getChildren())
		{
			// Should iterate from lowest package to highest one !
			System.out.println("Child trouvé " + child.toString());
			Collection<EObject> children = generateSampleForEClass(child.getDsgenClass());
			// Add these children in parent reference
			if (children != null)
			{
				DSGenReference dsgenRef = child.getSourceReference();
				EReference ref = (EReference) dsgenRef.getEcoreFeature();
				EList<EObject> childrenListinRoot = (EList<EObject>) parent.eGet(ref);
				childrenListinRoot.addAll(children);
			}

		}
	}

	private Collection<EObject> generateSampleForEClass(DSGenClass c)
	{
		System.out.println("----->  Must create " + c.getInstanceNumber() + " instance(s) of : " + c);
		Collection<EObject> result = null;
		if (c.getInstanceNumber() == -1)
			return result;
		result = new ArrayList<EObject>();
		for (int i = 0; i < c.getInstanceNumber(); i++)
		{
			EObject obj = instanciateEObject(c);
			if (obj != null)
				result.add(obj);

		}
		return result;
	}

	/**
	 * instanciate a sample EObject class from its description in dsgenclass and
	 * init all fields
	 * 
	 * @param dsgc
	 * @return
	 */
	private EObject instanciateEObject(DSGenClass c)
	{
		EClass clToInstanciate = c.getEcoreClass();
		EObject obj = clToInstanciate.getEPackage().getEFactoryInstance().create(clToInstanciate);
		System.out.println("Instaciate a new " + clToInstanciate.getName()); // +
																				// " qui sera stocké dans "
																				// +
																				// /*((EClass)obj.eContainingFeature().eContainer()).getName()
																				// +
																				// "."
																				// +*/
																				// obj.eContainingFeature().getName());
		for (DSGenFeature ft : c.getDsgenFeatures())
		{
			if (ft instanceof DSGenAttribute)
			{
				ValueGenerator<?> gen = ((DSGenAttribute) ft).getGenerator();
				String genClass = (gen == null) ? "" : " generator class : " + gen.getClass().toString();
				Object genval = (gen == null) ? null : gen.generateValue();
				Object val = (gen == null) ? null : genval;
				System.out.println("For the feature : " + ft.getEcoreFeature().getName() + " generate this value : " + val
						+ genClass);
				obj.eSet(ft.getEcoreFeature(), val);
			} else if (ft instanceof DSGenReference)
			{
				// / A REVOIR-> Il faut pas créer les child, mais uniquement les
				// associations
				ReferenceGenerator<?> gen = ((DSGenReference) ft).getGenerator();
				String genClass = (gen == null) ? "" : " generator class : " + gen.getClass().toString();
				Object genval = (gen == null) ? null : gen.generateValue();
				Object val = (gen == null) ? "NO GENERATOR" : genval;
				System.out.println("For the feature : " + ft.getEcoreFeature().getName() + " generate this value : " + val
						+ genClass);
			}
		}

		addChildren(obj, c);

		return obj;
	}

	private void generateSampleForEDataType(DSGenDataType c)
	{
		// TODO Auto-generated method stub

	}

}
