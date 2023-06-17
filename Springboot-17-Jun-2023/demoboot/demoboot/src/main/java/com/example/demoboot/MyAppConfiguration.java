package com.example.demoboot;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.example.demoboot"})
@EnableAspectJAutoProxy
public class MyAppConfiguration implements WebMvcConfigurer 
{
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) 
	{
		System.out.println("hello jsp");
		// /jsp/test2.jsp
		
		registry.jsp("/WEB-INF/jsp/", ".jsp");
	}
	
}
