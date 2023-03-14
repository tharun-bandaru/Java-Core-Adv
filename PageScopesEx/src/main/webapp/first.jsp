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
%>
<%
	out.println("This is working with pageContext object");
	String uname=request.getParameter("username");
	pageContext.setAttribute("uname",uname,pageContext.SESSION_SCOPE);
	out.println("<br><a href='second.jsp'>click here to get the details</a>");
%>
</body>
</html>