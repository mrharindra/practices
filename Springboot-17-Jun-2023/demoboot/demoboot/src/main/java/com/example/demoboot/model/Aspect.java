package com.example.demoboot.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//@Aspect
public class Aspect 
{
	Logger logger= LogManager.getLogger();
		
	public void before()
	{
		String method = "";
		logger.info(method + "get start");	
	}
	
	
	public void end()
	{
		logger.info("user get end");	
	}
}
