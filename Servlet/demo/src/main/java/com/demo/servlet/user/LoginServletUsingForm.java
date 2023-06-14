package com.demo.servlet.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.domain.Login;
import com.demo.domain.User;
import com.demo.service.LoginService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginfrom")
public class LoginServletUsingForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	LoginService loginService;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServletUsingForm() {
        super();
        loginService = new LoginService();   
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("Login servlet GET");
		//request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("LoginServlet post");
		
		String name = request.getParameter("username");
		
		String password = request.getParameter("password");
		
		Login login = new Login();
		login.setPassword(password);
		login.setUsername(name);
		
		System.out.println(login);
		
		try 
		{
			User u = loginService.login(login);
			
			response.setStatus(200);
			PrintWriter writer = response.getWriter();
			writer.write("Login successfull");
			
		} 
		catch (Exception e) 
		{
			response.setStatus(401);
			PrintWriter writer = response.getWriter();
			
			writer.write(e.getMessage());		
		}				
		
		//response.sendRedirect("home"); 
	}

}
