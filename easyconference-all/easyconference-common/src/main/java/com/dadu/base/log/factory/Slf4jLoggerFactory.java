package com.dadu.base.log.factory;

import com.dadu.base.log.ILogger;
import com.dadu.base.log.ILoggerFactory;
import org.slf4j.LoggerFactory;

public class Slf4jLoggerFactory implements ILoggerFactory {

	public ILogger getLogger(String name) {
		return new Slf4jLoggerImpl(LoggerFactory.getLogger(name));
	}

}
