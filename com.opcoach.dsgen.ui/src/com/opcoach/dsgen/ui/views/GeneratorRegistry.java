package com.opcoach.dsgen.ui.views;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;

import com.opcoach.generator.basic.BasicPackage;

/** This class associates EClass to a list of generator's EClass */
public class GeneratorRegistry
{

	private static Map<EDataType, EClass[]> gm = new HashMap<EDataType, EClass[]>();
	private static Map<EDataType, String[]> gs = new HashMap<EDataType, String[]>();

	static
	{
		// First init for primitive types
		gm.put(EcorePackage.Literals.EINT, new EClass[] { BasicPackage.Literals.INT_GENERATOR });
		gm.put(EcorePackage.Literals.EFLOAT, new EClass[] { BasicPackage.Literals.FLOAT_GENERATOR });
		gm.put(EcorePackage.Literals.EDOUBLE, new EClass[] { BasicPackage.Literals.DOUBLE_GENERATOR });
		gm.put(EcorePackage.Literals.ELONG, new EClass[] { BasicPackage.Literals.LONG_GENERATOR });
		gm.put(EcorePackage.Literals.EBOOLEAN, new EClass[] { BasicPackage.Literals.BOOLEAN_GENERATOR });
		
		// Then init for primitive object
		gm.put(EcorePackage.Literals.EINTEGER_OBJECT, new EClass[] { BasicPackage.Literals.INT_GENERATOR, BasicPackage.Literals.NULL_VALUE_GENERATOR });
		gm.put(EcorePackage.Literals.EFLOAT_OBJECT, new EClass[] { BasicPackage.Literals.FLOAT_GENERATOR, BasicPackage.Literals.NULL_VALUE_GENERATOR });
		gm.put(EcorePackage.Literals.EDOUBLE_OBJECT, new EClass[] { BasicPackage.Literals.DOUBLE_GENERATOR, BasicPackage.Literals.NULL_VALUE_GENERATOR });
		gm.put(EcorePackage.Literals.ELONG_OBJECT, new EClass[] { BasicPackage.Literals.LONG_GENERATOR, BasicPackage.Literals.NULL_VALUE_GENERATOR });
		gm.put(EcorePackage.Literals.EBOOLEAN_OBJECT, new EClass[] { BasicPackage.Literals.BOOLEAN_GENERATOR, BasicPackage.Literals.NULL_VALUE_GENERATOR });

		// Then for all other kind of objects
		gm.put(EcorePackage.Literals.EDATE, new EClass[] { BasicPackage.Literals.DATE_GENERATOR, BasicPackage.Literals.NULL_VALUE_GENERATOR });
		gm.put(EcorePackage.Literals.ESTRING, new EClass[] { BasicPackage.Literals.STRING_GENERATOR, BasicPackage.Literals.ID_GENERATOR, BasicPackage.Literals.NULL_VALUE_GENERATOR });
		gm.put(EcorePackage.Literals.EJAVA_OBJECT, new EClass[] {  BasicPackage.Literals.NULL_VALUE_GENERATOR });

		// Initialize gs hashmap
		for (EDataType dt : gm.keySet())
		{
			EClass[] cl = gm.get(dt);
			String[] names = new String[cl.length];
			int i = 0;
			for (EClass c : cl)
			{
				names[i++] = c.getName();
			}
			gs.put(dt, names);
		}
	
	}

	public static EClass[] getGeneratorsFor(EDataType dt)
	{
		return gm.get(dt);
	}

	public static String[] getGeneratorNamesFor(EDataType dt)
	{
		return gs.get(dt);
	}
	
	
	/** Code conservé pour mémoire...  */
	private void displayGeneratorTypes()
	{
		// Iterate on all subclasses of generator.Basic package
		BasicPackage p = BasicPackage.eINSTANCE;
		for (EObject c : p.eContents())
		{
			if (c instanceof EClass)
			{
				for (EGenericType gt : (((EClass) c).getEAllGenericSuperTypes()))
				{

					for (EGenericType t : gt.getETypeArguments())
					{
						if (t.getEClassifier() != null)
							System.out.println("Le generateur " + ((EClass) c).getName() + " génère des données pour le type : " + t.getEClassifier().getName());
					}

				}
			}
		}

	}

}
