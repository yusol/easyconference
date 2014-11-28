package com.dadu.base.log;

import com.dadu.base.log.factory.Slf4jLoggerFactory;

public class LoggerFactory {
	private static final String LOGGER_FACTORY_CLASS_PROPERY_NAME = "wigsys.logger.factory";

	public static String loggerFactoryClassName;
	public static ILoggerFactory loggerFactory;
	
	public static ILogger getLogger(Class<?> clazz) {
		return getLogger(clazz.getName());
	}

	public static ILogger getLogger(String name) {
		if (loggerFactory == null) {
			initLoggerFactory();
		}
		if (loggerFactory == null) return new SwallowLogger(name);
		else return loggerFactory.getLogger(name);
	}

	private static void initLoggerFactory() {
		if (loggerFactoryClassName == null) loggerFactoryClassName = System.getProperty(LOGGER_FACTORY_CLASS_PROPERY_NAME);
		if (loggerFactoryClassName == null) {
			if (hasClass("org.slf4j.LoggerFactory")) loggerFactory = new Slf4jLoggerFactory();
		} else {
			try {
				loggerFactory = (ILoggerFactory) Class.forName(loggerFactoryClassName).newInstance();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private static boolean hasClass(String name) {
		ClassLoader cl = LoggerFactory.class.getClassLoader();
		if (cl == null) cl = ClassLoader.getSystemClassLoader();
		try {
			Class<?> clazz = cl.loadClass(name);
			if (clazz != null) return true;
		} catch (ClassNotFoundException e) {
		}
		return false;
	}
}
