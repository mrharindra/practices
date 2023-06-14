package com.demo.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil 
{
	static ObjectMapper objectMapper = new ObjectMapper();
	
	public static <T> T parseJson(String json, Class<T> classz) throws Exception
	{
		ObjectMapper objectMapper = new ObjectMapper();		
		T object = objectMapper.readValue(json, classz);
		
		return object;
	}
	
	public static <T> T parseJson(InputStream is, Class<T> classz) 
	{
		
		try 
		{
			T object = objectMapper.readValue(is, classz);
			return object;
			
		} catch (StreamReadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DatabindException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
		
	}
	
	
	public static void objectToJson(OutputStream out, Object object)
	{
		try {
			
			objectMapper.writeValue(out, object);
			
		} catch (StreamWriteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DatabindException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	public static String objectToJson(Object object) 
	{
		try {
			return objectMapper.writeValueAsString(object);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}
