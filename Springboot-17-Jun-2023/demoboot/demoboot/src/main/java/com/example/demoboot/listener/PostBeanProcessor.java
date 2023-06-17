package com.example.demoboot.listener;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class PostBeanProcessor implements BeanPostProcessor
{
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException 
	{
		//System.out.println("Post: Before");
		//System.out.println( bean );		
		return bean;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException 
	{
		//System.out.println("Post: After");
		//System.out.println( bean );
		return bean;
	}
}
