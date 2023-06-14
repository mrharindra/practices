<%@page import="com.demo.domain.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	This is hello JSP
	
	<% 	
		List<User> users = (List<User>) request.getAttribute("users");
		for(User u: users)
		{
			System.out.println("User: " + u.getName());		
	%>
			<p style="color:red">
				Name: <%=u.getName()%> Email: <%=u.getEmail()%>
			</p>
		
	<%
		}
	%>
	
	
	
</body>
</html>