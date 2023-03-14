<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!
		String username;
		String password;
	%>
	<%
		//request and response implicit objects
	 username=request.getParameter("username");
	 password=request.getParameter("password");
	 if(username.equals("tharun") && password.equals("sai"))
	 {
		 response.sendRedirect("http://www.facebook.com");
	 }
	 else
	 {
		 response.sendError(777,"login failed try with valid sources");
	 }
	%>
</body>
</html>