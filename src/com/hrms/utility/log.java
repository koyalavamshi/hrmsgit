package com.hrms.utility;

import org.apache.log4j.Logger;

public class log {
	//Initalize Log4j logs 
	   private static Logger Log = Logger.getLogger(Logger.class.getName());
	   //Need to create these method ,so that they can be called 
	   public static void info(String message) {
		   Log.info(message);
	   }

}
 