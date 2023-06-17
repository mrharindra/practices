package com.example.demoboot.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ViewController 
{
	@GetMapping(path="/test")
	@ResponseBody
	public String test()
	{
		return "test";
	}
	
	@GetMapping(path="/test2")
	public String test2(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		throw new Exception("Error from View Controler");
		
		// /WEB-IB
		//request.getRequestDispatcher("/WEB-INF/jsp/test2.jsp").
		// forward(request, response);
		
		//return "test2";
	}
	
}
