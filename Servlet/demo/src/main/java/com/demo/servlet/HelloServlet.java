package com.demo.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.domain.User;

public class HelloServlet extends HttpServlet 
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("Hello");
		
		List<User> list = new ArrayList<>();
		User u1 = new User("Kevin"," kevin@demo.com");
		
		list.add(u1);
		
		request.setAttribute("users", list);
		
		request.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(request, response);
		
		//response.sendRedirect("home");
	}
}
