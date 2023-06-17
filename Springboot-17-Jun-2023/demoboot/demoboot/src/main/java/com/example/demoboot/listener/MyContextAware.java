package com.example.demoboot.listener;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class MyContextAware implements ApplicationContextAware {
	
	public static ApplicationContext context;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException 
	{
		context = applicationContext;
		//System.out.println( context.getClass() );
		
	}
			
	
	
	
	
	
	
}
