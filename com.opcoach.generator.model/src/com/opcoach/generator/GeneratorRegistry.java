package com.opcoach.generator;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;

import com.opcoach.generator.helper.GeneratorLogger;

/** This class register all available generators.
 * 
 * @author olivier
 *
 */
public class GeneratorRegistry
{
	// Store a map of names and classes
	private Map<String, EClass> gr = new HashMap<String, EClass>();

	public GeneratorRegistry()
	{
		register("NullValueGenerator");
		
		
	}
	
	public Collection<String> getGeneratorNames()
	{
		return gr.keySet();
	}
	
	private void register(String name)
	{
		EClassifier eClassifier = GeneratorPackage.eINSTANCE.getEClassifier(name);
		
		if (eClassifier == null)
		{
			GeneratorLogger.warn("The generator with name '" + name + "' can not be found in generator.ecore");
		}

		if (eClassifier instanceof EClass)
			{
			   gr.put(name, (EClass) eClassifier);
			}
		else
		{
			GeneratorLogger.warn("The generator with name '" + name + "' can not be registered (not an EClass)");

		}
	}
	
	
	
	

}
