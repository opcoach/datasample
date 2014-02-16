package com.opcoach.generator.helper;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;

public class GeneratorLogger
{
	private static final String PLUGIN_ID = "com.opcoach.generator.model";
	static ILog log =  Platform.getLog(Platform.getBundle(PLUGIN_ID));
	
	public static void warn(String message)
	{
		IStatus status = new Status(IStatus.WARNING, PLUGIN_ID, message);
		log.log(status);
	}

}
