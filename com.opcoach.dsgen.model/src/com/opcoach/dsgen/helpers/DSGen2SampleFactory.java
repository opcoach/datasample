package com.opcoach.dsgen.helpers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
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
import com.opcoach.dsgen.DSGenFeature;
import com.opcoach.dsgen.DSGenModel;
import com.opcoach.dsgen.DSGenReference;
import com.opcoach.dsgen.generator.EObjectGenerator;
import com.opcoach.generator.ValueGenerator;

/**
 * Handler to generate the dsgen model from ecore model
 */
public class DSGen2SampleFactory implements DSGenConstants
{

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
		createDSGenSample(dsgenSource, Locale.ENGLISH);
	}

	public void createDSGenSample(IFile dsgenSource, Locale locale) throws IOException
	{

		ResourceSet rset = new ResourceSetImpl();
		rset.getResourceFactoryRegistry().getExtensionToFactoryMap().put(ECORE_FILE_EXT, new XMIResourceFactoryImpl());

		System.out.println("Enter in createDSGenSample with file " + dsgenSource.getLocation().toString() + " for locale "
				+ locale.toString());

		Resource res = rset.getResource(org.eclipse.emf.common.util.URI.createFileURI(dsgenSource.getLocation().toString()), true);
		DSGenModel model = (DSGenModel) res.getContents().get(0);

		DSGenClass dsgenrootClass = model.getRoot();
		EObjectGenerator gen = dsgenrootClass.getGenerator();
		gen.setLocale(locale);
		root = gen.generateValue();

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
			// saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED,
			// Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
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

	/*private void addChildren(EObject parent, DSGenClass dsgc, Locale l)
	{
		System.out.println("*$*$*$*$*$  --> Creating children for dsgenclass : " + dsgc.toString());
		for (DSGenChild child : dsgc.getChildren())
		{
			// Should iterate from lowest package to highest one !
			System.out.println("Child trouvé " + child.toString());
			Collection<EObject> children = generateSampleForEClass(child.getDsgenClass(), l);
			// Add these children in parent reference
			if ((children != null) && !children.isEmpty())
			{

				DSGenReference dsgenRef = child.getSourceReference();
				EReference ref = (EReference) dsgenRef.getEcoreFeature();
				if (ref.getUpperBound() == 1)
					parent.eSet(ref, children.iterator().next());
				else
				{
					Object sss = parent.eGet(ref);
					System.out.println("classe du child " + sss.getClass().toString());
					EList<EObject> childrenListinRoot = (EList<EObject>) sss;
					childrenListinRoot.addAll(children);
				}

				// Set the values for the reference generator.
				ReferenceGenerator<EObject> refgen = (ReferenceGenerator<EObject>) dsgenRef.getGenerator();
				refgen.setValues(children);
			}

		}
	} */

	/*private Collection<EObject> generateSampleForEClass(DSGenClass c, Locale l)
	{
		System.out.println("----->  Must create " + c.getInstanceNumber() + " instance(s) of : " + c);
		Collection<EObject> result = new ArrayList<EObject>();
		int nbInstanceToCreate = c.getInstanceNumber();
		if (nbInstanceToCreate == -1 && c.getNbAssociationRefTo() == 0)
			nbInstanceToCreate = 1;

		for (int i = 0; i < nbInstanceToCreate; i++)
		{
			EObject obj = instanciateEObject(c, l);
			if (obj != null)
				result.add(obj);

		}
		return result;
	} */

	/**
	 * instanciate a sample EObject class from its description in dsgenclass and init all fields
	 * 
	 * @param dsgc
	 * @return
	 */
	/*private EObject instanciateEObject(DSGenClass c, Locale l)
	{
		EClass clToInstanciate = c.getEcoreClass();
		EObject obj = clToInstanciate.getEPackage().getEFactoryInstance().create(clToInstanciate);
		System.out.println("Instaciate a new " + clToInstanciate.getName());
		for (DSGenFeature ft : c.getDsgenFeatures())
		{
			if (ft instanceof DSGenAttribute)
			{
				ValueGenerator<?> gen = ((DSGenAttribute) ft).getGenerator();
				if (gen != null)
					gen.setLocale(l);
				String genClass = (gen == null) ? "" : " generator class : " + gen.getClass().toString();
				Object genval = (gen == null) ? null : gen.generateValue();
				Object val = (gen == null) ? null : genval;
				System.out.println("For the feature : " + ft.getEcoreFeature().getName() + " generate this value : " + val);
				obj.eSet(ft.getEcoreFeature(), val);
			} else if (ft instanceof DSGenReference)
			{
				EReference ref = (EReference) ((DSGenReference)ft).getEcoreFeature();
				
					ValueGenerator<?> gen = ((DSGenReference) ft).getGenerator();
					String genClass = (gen == null) ? "" : " generator class : " + gen.getClass().toString();
					Object genval = (gen == null) ? null : gen.generateValue();
					Object val = (gen == null) ? "NO GENERATOR" : genval;
					System.out.println("For the reference : " + ft.getEcoreFeature().getName() + " generate this value : " + val
							+ genClass);
					if (ref.getUpperBound() == 1)
					{
						obj.eSet(ref, val);

					}
					else
					{
						// val is a collection, must call addAll
						Collection<Object> childrenListinRoot = (Collection<Object>)obj.eGet(ref);
						System.out.println("classe du child " + obj.eGet(ref).getClass().toString());
						childrenListinRoot.addAll((Collection<Object>)val);
					}
				
			}
		}

		// addChildren(obj, c, l);

		return obj;
	}

	private boolean isChildren(DSGenReference ref, DSGenClass parent)
	{
		for (DSGenChild c : parent.getChildren())
		{
			if (c.getSourceReference() == ref)
				return true;
		}
		return false;

	} */

}
