package com.demo.servlet.user;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.domain.Login;
import com.demo.domain.User;
import com.demo.service.LoginService;
import com.demo.util.JsonUtil;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login" )
public class LoginServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
	LoginService loginService;
	
	String username;
	
	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("Init");
	}
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        loginService = new LoginService();
        System.out.println("LoginServlet cons");
    }
           
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter()
		
		String contentType = request.getContentType();
		System.out.println("Content Type: " + contentType);
		
		InputStream is = request.getInputStream();
		
		Login login = JsonUtil.parseJson(is, Login.class);
		System.out.println(login);
		
		try 
		{
			User u = loginService.login(login);
			
			response.setStatus(200);
			response.setContentType("application/json");
		
			String str = JsonUtil.objectToJson(u);
			PrintWriter writer = response.getWriter();
			writer.write(str);
			
		} 
		catch (Exception e) 
		{
			response.setStatus(401);
			PrintWriter writer = response.getWriter();
			
			//response.sendError(401);
			writer.write(e.getMessage());		
		}				
		
		//response.sendRedirect("home"); 
	}

	@Override
	public void destroy() {
		System.out.println("Destroy");
	}
}
