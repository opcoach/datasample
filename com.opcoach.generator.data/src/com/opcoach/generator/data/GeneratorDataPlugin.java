package com.opcoach.generator.data;

import java.util.Collection;
import java.util.HashMap;
import java.util.StringTokenizer;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class GeneratorDataPlugin implements BundleActivator {

	/** An hashmap containing : 
	 * key : locale + '-' + attributeName     Ex : fr_nom
	 * value : fileName for this attribute    Ex : file://....../data/fr/nom.txt
	 */
	private HashMap<String, String> dataFileNames;
	
	/** Another map associating locale to possible pattern
	 * key : locale
	 * value : list of possible patterns  :    ex : name*, *tmp, *name ...
	 */
	private HashMap<String, Collection<String>> fileNamesForPattern;
	
	
	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		GeneratorDataPlugin.context = bundleContext;
		readData();
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		GeneratorDataPlugin.context = null;
	}

	private void readData()
	{
		// Create data map
		System.out.println("Read the string data plugin");

		dataFileNames = new HashMap<String, String>();
		fileNamesForPattern = new HashMap<String, Collection<String>>();
		IExtensionRegistry reg = Platform.getExtensionRegistry();
		for (IConfigurationElement elt : reg.getConfigurationElementsFor("com.opcoach.generator.data.StringData"))
		{
			String localeStr = elt.getAttribute("locale");

			// Fill the maps
			String attNames = elt.getAttribute("attributeNames");
			StringTokenizer st = new StringTokenizer(attNames, ",");
			String name = st.nextToken();
			while (name != null)
			{
				System.out.println("Attribut courant : " + name);
				name=st.nextToken();
				String key = localeStr + "_" + name;
			}
		}
	}
}
