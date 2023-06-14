package com.demo.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Address 
{
	@JsonIgnoreProperties
	String city;

	public Address() 
	{
		
	}
	
	public Address(String string) 
	{
		city = string;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
		
}