package com.opcoach.dsgen.helpers;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.opcoach.dsgen.BadValueGeneratorRegistry;
import com.opcoach.dsgen.DSGenAttribute;
import com.opcoach.dsgen.DSGenClass;
import com.opcoach.dsgen.DSGenClassifier;
import com.opcoach.dsgen.DSGenDataType;
import com.opcoach.dsgen.DSGenEnum;
import com.opcoach.dsgen.DSGenFeature;
import com.opcoach.dsgen.DSGenModel;
import com.opcoach.dsgen.DSGenPackage;
import com.opcoach.dsgen.DSGenReference;
import com.opcoach.dsgen.DataSampleGenFactory;
import com.opcoach.dsgen.generator.ChildrenGenerator;
import com.opcoach.dsgen.generator.DSGenGeneratorFactory;
import com.opcoach.dsgen.generator.MultipleAssociationGenerator;
import com.opcoach.generator.ValueGenerator;
import com.opcoach.generator.basic.BasicFactory;
import com.opcoach.generator.basic.IDGenerator;
import com.opcoach.generator.basic.IntGenerator;

/**
 * Handler to generate the dsgen model from ecore model
 */
public class Ecore2DSGen implements DSGenConstants
{

	private ResourceSet rset = null;

	public void createDSGenFile(IResource ecoreSource, String dsgenPath) throws IOException
	{
		DSGenModel model = DataSampleGenFactory.eINSTANCE.createDSGenModel();
		long seed = System.currentTimeMillis();
		model.setName(ecoreSource.getName().substring(0, ecoreSource.getName().indexOf(DSGenConstants.ECORE_FILE_EXT) - 1));
		model.setRandomSeed(seed);
		model.setLanguage("en"); // the language to generate data
		initialiazeBadValueGenerators(model);

		DSGenPackage genPack = createDSGenPackage(ecoreSource.getLocationURI());
		model.getDsgenPackages().add(genPack);

		String dsgenName = ecoreSource.getProject().getLocation() + "/.." + dsgenPath;

		// Store the dsgen model in dsgenname file
		rset.getResourceFactoryRegistry().getExtensionToFactoryMap().put(DSGEN_FILE_EXT, new XMIResourceFactoryImpl());

		Resource res2 = rset.createResource(org.eclipse.emf.common.util.URI.createFileURI(dsgenName));
		res2.getContents().add(model);
		try
		{
			final Map<Object, Object> saveOptions = new HashMap<Object, Object>();
			saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED, Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
			res2.save(saveOptions);
			System.out.println("Dsgen model saved in : " + res2.getURI());

			// refresh the folder containing the new generated file
			IWorkspaceRoot wroot = ecoreSource.getWorkspace().getRoot();
			Path path = new Path(ecoreSource.getProject().getName() + "/.." + dsgenPath);
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

	protected void initialiazeBadValueGenerators(DSGenModel model)
	{
		BadValueGeneratorRegistry bvgr = DataSampleGenFactory.eINSTANCE.createBadValueGeneratorRegistry();
		bvgr.getGenerators().add(BasicFactory.eINSTANCE.createNullValueGenerator("nullValueBadGenerator"));
		bvgr.getGenerators().add(BasicFactory.eINSTANCE.createTrueGenerator("trueValueBadGenerator"));
		bvgr.getGenerators().add(BasicFactory.eINSTANCE.createFalseGenerator("falseValueBadGenerator"));
		IntGenerator intgen = BasicFactory.eINSTANCE.createIntGenerator("zeroValueBadGenerator");
		intgen.setLow(0);
		intgen.setHigh(0);
		intgen.setStep(0);
		bvgr.getGenerators().add(intgen);
		model.setBadGenerators(bvgr);
	}

	/**
	 * the command has been executed, so extract extract the needed information from the application context.
	 */
	public DSGenPackage createDSGenPackage(URI ecoreSourceURI)
	{

		// Create a new ResourceSet to forget previous calls
		rset = new ResourceSetImpl();
		rset.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(DSGenConstants.ECORE_FILE_EXT, new XMIResourceFactoryImpl());

		// Resource res = rset.getResource(URI.createFileURI(ecoreSource.getLocation().toString()), true);
		Resource res = rset.getResource(org.eclipse.emf.common.util.URI.createURI(ecoreSourceURI.toString()), true);
		EPackage rootPackage = (EPackage) res.getContents().get(0);
		return createDSGenPackage(rootPackage);

	}

	private static BasicFactory generatorFactory = BasicFactory.eINSTANCE;

	private static Map<EReference, DSGenReference> refCache = new HashMap<EReference, DSGenReference>();

	/**
	 * Create a DSGenPackage from an EPackage
	 * 
	 * @param rootPackage
	 *            the initial package used to create
	 * @return a datasample generation package
	 */
	public DSGenPackage createDSGenPackage(EPackage rootPackage)
	{
		// Intermediate array list of dsgen class that will be sorted before
		// added in package
		ArrayList<DSGenClassifier> classes = new ArrayList<DSGenClassifier>();

		// Creer le modèle dsgen en parcourant le modèle lu
		DataSampleGenFactory factory = DataSampleGenFactory.eINSTANCE;
		DSGenPackage dsPack = factory.createDSGenPackage();
		dsPack.setEcorePackage(rootPackage);
		for (EClassifier ec : rootPackage.getEClassifiers())
		{
			if (ec instanceof EClass)
			{
				DSGenClass dscl = createDSGenClass((EClass) ec);
				classes.add(dscl);
			} else if (ec instanceof EEnum)
			{
				DSGenEnum dsen = createDSGenEnum((EEnum) ec);
				classes.add(dsen);

			} else if (ec instanceof EDataType)
			{
				DSGenDataType dst = createDSGenDataType((EDataType) ec);
				classes.add(dst);
			}
		}

		// Then compute the nb of associations refering to each EClass
		for (DSGenClassifier dsc : classes)
		{
			if (dsc instanceof DSGenClass)
			{
				computeNbAssociationReferencesTo((DSGenClass) dsc, classes);
			}
		}

		// Sort the list of dsgenClass (less referenced before...)
		Collections.sort(classes, new DSGenClassifierComparator());

		// With the sort algorithm, the last class is the root object.
		DSGenClass rootClass = (DSGenClass) classes.get(classes.size() - 1);
		rootClass.setRootObject(true);

		// Add all in package
		dsPack.getDsgenClassifiers().addAll(classes);

		// Bind the targetDSGenClass for DSGenRef
		for (DSGenReference ref : refCache.values())
		{
			DSGenClass parent = (DSGenClass) ref.eContainer();
			String targetName = ref.getEcoreFeature().getEType().getName();
			DSGenClass targetDSGenClass = searchDSGenClass(parent.getDsgenPackage(), targetName);
			ref.setTargetDSGenClass(targetDSGenClass);
		}

		return dsPack;
	}

	/**
	 * @return the number of association references to dsc, looping on the classes list.
	 * @param dsc
	 *            : the dsgenclass that is computing the nb of association to itself
	 * @param classes
	 *            : the list of other EClasses to loop on
	 * @return nothing (init directly the nbAssociationRefTo field in dsc)
	 */
	private void computeNbAssociationReferencesTo(DSGenClass dsc, ArrayList<DSGenClassifier> classes)
	{

		EClass dsEcoreClass = dsc.getEcoreClass();
		int nbAssoRef = 0;
		for (DSGenClassifier c : classes)
		{
			if ((c instanceof DSGenClass) && (c != dsc))
			{
				for (EReference ref : c.getEcoreClass().getEReferences())
				{
					EClassifier target = ref.getEType();
					if ((target instanceof EClass) && !ref.isContainment())
					{
						EClass targetEClass = (EClass) target;
						if (targetEClass.equals(dsEcoreClass) || dsEcoreClass.isSuperTypeOf(targetEClass))
						{
							System.out.println("The class " + c.getEcoreClass().getName() + " refer to source DSC : "
									+ dsEcoreClass.getName() + " on field : " + ref.getName());
							nbAssoRef++;
						}
					}
				}
			}
		}

		dsc.setNbAssociationRefTo(nbAssoRef);

	}

	/**
	 * Create a DSGenClass from an EClass
	 * 
	 * @param rootClass
	 *            the initial class used to create
	 * @return a datasample generation class
	 */
	public DSGenClass createDSGenClass(EClass rootClass)
	{
		DSGenClass dscl = DataSampleGenFactory.eINSTANCE.createDSGenClass();
		dscl.setEcoreClass((EClass) rootClass);
		dscl.setGenerator(DSGenGeneratorFactory.eINSTANCE.createEObjectGenerator());
		Collection<DSGenFeature> features = dscl.getDsgenFeatures();

		for (EStructuralFeature sf : rootClass.getEStructuralFeatures())
		{
			DSGenFeature dsf = null;
			if (sf instanceof EAttribute)
			{
				dsf = createDSGenAttribute((EAttribute) sf);
			} else if (sf instanceof EReference)
			{
				EReference ref = (EReference) sf;
				dsf = createDSGenReference(dscl, ref);
			}
			if (dsf != null)
			{
				features.add(dsf);
			}

		}

		return dscl;
	}

	private static Map<String, DSGenClass> genClassMap = null;

	private DSGenClass searchDSGenClass(DSGenPackage pack, String name)
	{
		if (genClassMap == null)
		{
			genClassMap = new HashMap<String, DSGenClass>();
			// Init map
			for (DSGenClassifier dc : pack.getDsgenClassifiers())
			{
				if (dc instanceof DSGenClass)
					genClassMap.put(dc.getEcoreClass().getName(), (DSGenClass) dc);
			}
		}

		return genClassMap.get(name);
	}

	/**
	 * Create a DSGenEnum from an EEnum
	 * 
	 * @param rootEnum
	 *            the initial enum used to create
	 * @return a datasample generation class
	 */
	public DSGenEnum createDSGenEnum(EEnum rootEnum)
	{
		DataSampleGenFactory factory = DataSampleGenFactory.eINSTANCE;

		DSGenEnum dsen = factory.createDSGenEnum();
		dsen.setEcoreEnum((EEnum) rootEnum);

		return dsen;
	}

	/**
	 * Create a DSGenDataType from an EDataType
	 * 
	 * @param rootDataType
	 *            the initial dataType used to create
	 * @return a datasample generation class
	 */
	public DSGenDataType createDSGenDataType(EDataType rootDataType)
	{
		DataSampleGenFactory factory = DataSampleGenFactory.eINSTANCE;

		DSGenDataType dsdt = factory.createDSGenDataType();
		dsdt.setDataType((EDataType) rootDataType);

		return dsdt;
	}

	/**
	 * Create a DSGenAttribute from an EAttribute
	 * 
	 * @param rootAttr
	 *            the initial Attribute used to create
	 * @return a datasample generation class
	 */
	public DSGenAttribute createDSGenAttribute(EAttribute rootAttr)
	{
		DataSampleGenFactory factory = DataSampleGenFactory.eINSTANCE;

		DSGenAttribute result = factory.createDSGenAttribute();
		result.setEcoreFeature(rootAttr);

		// Add the generator according to the field type...

		ValueGenerator<?> gen = getGeneratorFromType(rootAttr);
		if (gen != null)
		{
			gen.setID(rootAttr.getEContainingClass().getName() + "." + rootAttr.getName());
		}
		result.setGenerator(gen);

		return result;
	}

	/**
	 * Create a DSGenAttribute from an EAttribute
	 * 
	 * @param rootAttr
	 *            the initial Attribute used to create
	 * @return a datasample generation class
	 */
	public DSGenReference createDSGenReference(DSGenClass parentClass, EReference rootRef)
	{
		if (isOpposite(rootRef))
			return null;

		DSGenReference result = DataSampleGenFactory.eINSTANCE.createDSGenReference();
		result.setEcoreFeature(rootRef);

		ValueGenerator<?> refGen = null;

		// Set the generator (no generator for opposite relations)
		refGen = getGeneratorForReference(rootRef);
		result.setGenerator(refGen);

		// Store it in a cache...
		refCache.put(rootRef, result);

		return result;
	}

	ValueGenerator<?> getGeneratorForReference(EReference rootRef)
	{
		if (isOpposite(rootRef))
			return null;

		ValueGenerator<?> refGen;

		if (isContainment(rootRef))
		{
			if (isMultipleRelation(rootRef))
			{
				ChildrenGenerator childGen = DSGenGeneratorFactory.eINSTANCE.createChildrenGenerator();
				childGen.setMaxChildrenNumber(MAX_CHILDREN);
				// Set random mode only for low level object (for root object let max children)
				if (rootRef.eContainer().eContainer() != null)
				{
					childGen.setRandomSeed(10L);
				}
				refGen = childGen;
			} else
			{
				// Single composition. Associates an EObjectGenerator
				refGen = DSGenGeneratorFactory.eINSTANCE.createEObjectGenerator();
			}

		} else
		{
			if (isMultipleRelation(rootRef))
			{
				MultipleAssociationGenerator mag = DSGenGeneratorFactory.eINSTANCE.createMultipleAssociationGenerator();
				mag.setMaxAssociationNumber(MAX_ASSOCIATION);
				mag.setRandomSeed(20L);
				refGen = mag;

			} else
			{
				// Single composition. Associates an EObjectGenerator
				refGen = DSGenGeneratorFactory.eINSTANCE.createSingleAssociationGenerator();
			}
		}

		String genID = rootRef.getEContainingClass().getName() + "." + rootRef.getName();
		refGen.setID(genID);

		return refGen;
	}

	// May be these constants are already defined somewhere ?
	private static final String STRING_TYPE = "EString";
	private static final String INT_TYPE = "EInt";
	private static final String INT_OBJECT_TYPE = "EInteger";
	private static final String LONG_TYPE = "ELong";
	private static final String LONG_OBJECT_TYPE = "ELongObject";
	private static final String FLOAT_TYPE = "EFloat";
	private static final String FLOAT_OBJECT_TYPE = "EFLoatObject";
	private static final String DOUBLE_TYPE = "EDouble";
	private static final String DOUBLE_OBJECT_TYPE = "EDoubleObject";
	private static final String DATE_TYPE = "EDate";
	private static final String BOOLEAN_TYPE = "EBoolean";
	private static final String BOOLEAN_OBJECT_TYPE = "EBooleanObject";

	protected ValueGenerator<?> getGeneratorFromType(EAttribute attr)
	{
		EDataType dt = (attr.getEAttributeType());

		String typeName = dt.getName();
		ValueGenerator<?> result = null;

		if (STRING_TYPE.equals(typeName))
		{
			if (attr.isID())
			{
				IDGenerator gen = generatorFactory.createIDGenerator();
				String pname = attr.getEContainingClass().getName();
				// Try to find upper case letters
				StringBuffer pref = new StringBuffer();
				for (int i = 0; i < pname.length(); i++)
				{
					char c = pname.charAt(i);
					if (Character.isUpperCase(c))
						pref.append(c);
				}
				gen.setPrefix(pref.toString());
				result = gen;
			} else
				result = generatorFactory.createStringGenerator();
		} else if (DATE_TYPE.equals(typeName))
		{
			result = generatorFactory.createDateGenerator();

		} else if (INT_TYPE.equals(typeName) || INT_OBJECT_TYPE.equals(typeName))
		{
			result = generatorFactory.createIntGenerator();

		} else if (LONG_TYPE.equals(typeName) || LONG_OBJECT_TYPE.equals(typeName))
		{
			result = generatorFactory.createLongGenerator();

		} else if (FLOAT_TYPE.equals(typeName) || FLOAT_OBJECT_TYPE.equals(typeName))
		{
			result = generatorFactory.createFloatGenerator();

		} else if (DOUBLE_TYPE.equals(typeName) || DOUBLE_OBJECT_TYPE.equals(typeName))
		{
			result = generatorFactory.createDoubleGenerator();

		} else if (BOOLEAN_TYPE.equals(typeName) || BOOLEAN_OBJECT_TYPE.equals(typeName))
		{
			result = generatorFactory.createBooleanGenerator();

		}
		return result;

	}

	boolean isContainment(EStructuralFeature sf)
	{
		return ((sf instanceof EReference) && ((EReference) sf).isContainment());
	}

	boolean isMultipleRelation(EStructuralFeature sf)
	{
		if (!(sf instanceof EReference))
			return false;

		EReference ref = (EReference) sf;
		boolean val = (ref.getUpperBound() > 1) || (ref.getUpperBound() == -1);
		// System.out.println("Valeur de isMultipleRelation pour sf " +
		// ref.getName() + " upper = " + ref.getUpperBound() + "  value = " +
		// val);
		return val;
	}

	boolean isOpposite(EStructuralFeature sf)
	{
		if (sf instanceof EAttribute)
			return false;

		EReference ref = (EReference) sf;
		EReference refOpp = ref.getEOpposite();

		System.out.println("Ref " + ref.getName() + " est il opposite de " + ((refOpp == null) ? "none" : refOpp.getName()));
		return (!ref.isContainment() && (refOpp != null) && refOpp.isContainment() && (refOpp.getEOpposite() == ref));
	}

}
