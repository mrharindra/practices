package com.example.demoboot.exception;

public class ItemNotFound extends Exception 
{
	long myErrorCode;
	
	public ItemNotFound(String string, long myerrorcode) 
	{
		super(string);
		myErrorCode = myerrorcode;
	}
	
	
	
	public long getMyErrorCode() {
		return myErrorCode;
	}

	public void setMyErrorCode(long myErrorCode) {
		this.myErrorCode = myErrorCode;
	}



	public ItemNotFound(String string) 
	{
		super(string);
	}



}
