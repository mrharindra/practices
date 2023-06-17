package com.example.demoboot.listener;

import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AppListener 
{
	
	@EventListener
	public void contextCreated(ContextRefreshedEvent event)
	{
		System.out.println("Context created");
		
	}
	
	@EventListener
	public void contextClosed(ContextClosedEvent event)
	{
		System.out.println("Context Stopped");
		
	}
	
	@EventListener
	public void contextStopped(ContextStoppedEvent event)
	{
		System.out.println("Context Stopped");
		
	}
	
	
}
