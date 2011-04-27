package com.opcoach.generator;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class GeneratorActivator implements BundleActivator
{
	private static Bundle bundle;
	
	@Override
	public void start(BundleContext context) throws Exception
	{
		bundle = context.getBundle();
	}

	@Override
	public void stop(BundleContext context) throws Exception
	{
		bundle = null;
	}
	
	public static Bundle getBundle()
	{
		return bundle;
	}

}
