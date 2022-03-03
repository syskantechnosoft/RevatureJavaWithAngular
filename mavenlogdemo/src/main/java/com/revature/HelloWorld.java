package com.revature;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class HelloWorld {

	private static final Logger logger = LogManager.getLogger(HelloWorld.class);

	public static void main(String[] args) {
		// basic log4j configurator
		BasicConfigurator.configure();
		logger.info("Hello world");
		logger.info("we are in logger info mode");
		
		logger.warn("This is a warning message");
		logger.error("This is a Error message");

	}

}