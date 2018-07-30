package com.opcoach.datasample.util;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.FrameworkUtil;

public class DSLogger {

	private static final String PLUGIN_ID = "com.opcoach.datasample.model";

	private static ILog logger = Platform.getLog(FrameworkUtil.getBundle(DSLogger.class));

	public static void info(String message) {
		info(message, null);
	}

	public static void info(String message, Throwable ex) {
		IStatus s = new Status(IStatus.INFO, PLUGIN_ID, message, ex);
		logger.log(s);
	}

	public static void warning(String message) {
		warning(message, null);
	}

	public static void warning(String message, Throwable ex) {
		IStatus s = new Status(IStatus.WARNING, PLUGIN_ID, message, ex);
		logger.log(s);
	}

	public static void error(String message) {
		error(message, null);
	}

	public static void error(String message, Throwable ex) {
		IStatus s = new Status(IStatus.ERROR, PLUGIN_ID, message, ex);
		logger.log(s);
	}
}
