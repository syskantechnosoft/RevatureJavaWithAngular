package com.revature;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Logger;

public class Example {
	/* Get the class name to be printed on */
	static Logger log = Logger.getLogger(Example.class.getName());

	public static void main(String[] args) throws IOException, SQLException {
		//log.debug("Hello this is a debug message");
		log.info("Hello this is an info message");
		
	}
}
