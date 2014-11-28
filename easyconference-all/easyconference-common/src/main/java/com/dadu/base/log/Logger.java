package com.dadu.base.log;

import org.slf4j.Marker;


public class Logger {

	private final static ILogger trace = LoggerFactory.getLogger(Logger.class);
	private final static ILogger debug = LoggerFactory.getLogger(Logger.class);
	private final static ILogger info = LoggerFactory.getLogger(Logger.class);
	private final static ILogger warn = LoggerFactory.getLogger(Logger.class);
	private final static ILogger error = LoggerFactory.getLogger(Logger.class);
	private final static ILogger chainLogger = LoggerFactory.getLogger(Logger.class);

	public String getName() {
		return chainLogger.getName();
	}

    //-------------------------------------------------------------------------
	// trace
	//-------------------------------------------------------------------------
	public static ILogger trace(String msg, Throwable t) {
		trace.trace(msg, t);
		return chainLogger;
	}

	public static ILogger trace(String msg) {
		trace.trace(msg);
		return chainLogger;
	}
	
	public static ILogger trace(String format, Object arg) {
		trace.trace(format, arg);
		return chainLogger;
	}

	public static ILogger trace(String format, Object arg1, Object arg2) {
		trace.trace(format, arg1, arg2);
		return chainLogger;
	}

	public static ILogger trace(String format, Object[] argArray) {
		trace.trace(format, argArray);
		return chainLogger;
	}
	
	public boolean isTraceEnabled(Marker marker) {
		return trace.isTraceEnabled(marker);
	}

	public static ILogger trace(Marker marker, String msg) {
		trace.trace(marker, msg);
		return chainLogger;
	}

	public static ILogger trace(Marker marker, String format, Object arg) {
		trace.trace(marker, format, arg);
		return chainLogger;
	}

	public static ILogger trace(Marker marker, String format, Object arg1, Object arg2) {
		trace.trace(marker, format, arg1, arg2);
		return chainLogger;
	}

	public static ILogger trace(Marker marker, String format, Object[] argArray) {
		trace.trace(marker, format, argArray);
		return chainLogger;
	}

	public static ILogger trace(Marker marker, String msg, Throwable t) {
		trace.trace(marker, msg, t);
		return chainLogger;
	}
	
    //-------------------------------------------------------------------------
	// debug
	//-------------------------------------------------------------------------
	public static ILogger debug(String msg, Throwable t) {
		debug.debug(msg, t);
		return chainLogger;
	}
	
	public static ILogger debug(String msg) {
		debug.debug(msg);
		return chainLogger;
	}
	
	public static ILogger debug(String format, Object arg) {
		debug.debug(format, arg);
		return chainLogger;
	}

	public static ILogger debug(String format, Object arg1, Object arg2) {
		debug.debug(format, arg1, arg2);
		return chainLogger;
	}

	public static ILogger debug(String format, Object[] argArray) {
		debug.debug(format, argArray);
		return chainLogger;
	}
	
	public boolean isDebugEnabled(Marker marker) {
		return debug.isDebugEnabled(marker);
	}

	public static ILogger debug(Marker marker, String msg) {
		debug.debug(marker, msg);
		return chainLogger;
	}

	public static ILogger debug(Marker marker, String format, Object arg) {
		debug.debug(marker, format, arg);
		return chainLogger;
	}

	public static ILogger debug(Marker marker, String format, Object arg1, Object arg2) {
		debug.debug(marker, format, arg1, arg2);
		return chainLogger;
	}

	public static ILogger debug(Marker marker, String format, Object[] argArray) {
		debug.debug(marker, format, argArray);
		return chainLogger;
	}

	public static ILogger debug(Marker marker, String msg, Throwable t) {
		debug.debug(marker, msg, t);
		return chainLogger;
	}

    //-------------------------------------------------------------------------
	// error
	//-------------------------------------------------------------------------
	public static ILogger error(String msg, Throwable t) {
		error.error(msg, t);
		return chainLogger;
	}

	public static ILogger error(String msg) {
		error.error(msg);
		return chainLogger;
	}
	
	public static ILogger error(String format, Object arg) {
		error.error(format, arg);
		return chainLogger;
	}

	public static ILogger error(String format, Object arg1, Object arg2) {
		error.error(format, arg1, arg2);
		return chainLogger;
	}

	public static ILogger error(String format, Object[] argArray) {
		error.error(format, argArray);
		return chainLogger;
	}
	
	public boolean isErrorEnabled(Marker marker) {
		return error.isErrorEnabled(marker);
	}

	public static ILogger error(Marker marker, String msg) {
		error.error(marker, msg);
		return chainLogger;
	}

	public static ILogger error(Marker marker, String format, Object arg) {
		error.error(marker, format, arg);
		return chainLogger;
	}

	public static ILogger error(Marker marker, String format, Object arg1, Object arg2) {
		error.error(marker, format, arg1, arg2);
		return chainLogger;
	}

	public static ILogger error(Marker marker, String format, Object[] argArray) {
		error.error(marker, format, argArray);
		return chainLogger;
	}

	public static ILogger error(Marker marker, String msg, Throwable t) {
		error.error(marker, msg, t);
		return chainLogger;
	}

    //-------------------------------------------------------------------------
	// warn
	//-------------------------------------------------------------------------
	public static ILogger warn(String msg, Throwable t) {
		warn.warn(msg, t);
		return chainLogger;
	}

	public static ILogger warn(String msg) {
		warn.warn(msg);
		return chainLogger;
	}
	
	public static ILogger warn(String format, Object arg) {
		warn.warn(format, arg);
		return chainLogger;
	}

	public static ILogger warn(String format, Object[] argArray) {
		warn.warn(format, argArray);
		return chainLogger;
	}

	public static ILogger warn(String format, Object arg1, Object arg2) {
		warn.warn(format, arg1, arg2);
		return chainLogger;
	}
	
	public boolean isWarnEnabled(Marker marker) {
		return warn.isWarnEnabled(marker);
	}

	public static ILogger warn(Marker marker, String msg) {
		warn.warn(marker, msg);
		return chainLogger;
	}

	public static ILogger warn(Marker marker, String format, Object arg) {
		warn.warn(marker, format, arg);
		return chainLogger;
	}

	public static ILogger warn(Marker marker, String format, Object arg1, Object arg2) {
		warn.warn(marker, format, arg1, arg2);
		return chainLogger;
	}

	public static ILogger warn(Marker marker, String format, Object[] argArray) {
		warn.warn(marker, format, argArray);
		return chainLogger;
	}

	public static ILogger warn(Marker marker, String msg, Throwable t) {
		warn.warn(marker, msg, t);
		return chainLogger;
	}
	
    //-------------------------------------------------------------------------
	// info
	//-------------------------------------------------------------------------
	public static ILogger info(String msg, Throwable t) {
		info.info(msg, t);
		return chainLogger;
	}

	public static ILogger info(String msg) {
		info.info(msg);
		return chainLogger;
	}
	
	public static ILogger info(String format, Object arg) {
		info.info(format, arg);
		return chainLogger;
	}

	public static ILogger info(String format, Object arg1, Object arg2) {
		info.info(format, arg1, arg2);
		return chainLogger;
	}

	public static ILogger info(String format, Object[] argArray) {
		info.info(format, argArray);
		return chainLogger;
	}
	
	public boolean isInfoEnabled(Marker marker) {
		return info.isInfoEnabled(marker);
	}

	public static ILogger info(Marker marker, String msg) {
		info.info(marker, msg);
		return chainLogger;
	}

	public static ILogger info(Marker marker, String format, Object arg) {
		info.info(marker, format, arg);
		return chainLogger;
	}

	public static ILogger info(Marker marker, String format, Object arg1, Object arg2) {
		info.info(marker, format, arg1, arg2);
		return chainLogger;
	}

	public static ILogger info(Marker marker, String format, Object[] argArray) {
		info.info(marker, format, argArray);
		return chainLogger;
	}

	public static ILogger info(Marker marker, String msg, Throwable t) {
		info.info(marker, msg, t);
		return chainLogger;
	}

    //-------------------------------------------------------------------------
	// enabled
	//-------------------------------------------------------------------------
	public boolean isTraceEnabled() {
		return trace.isTraceEnabled();
	}
	
	public boolean isDebugEnabled() {
		return debug.isDebugEnabled();
	}

	public boolean isErrorEnabled() {
		return error.isErrorEnabled();
	}

	public boolean isInfoEnabled() {
		return error.isInfoEnabled();
	}

	public boolean isWarnEnabled() {
		return warn.isWarnEnabled();
	}
}
