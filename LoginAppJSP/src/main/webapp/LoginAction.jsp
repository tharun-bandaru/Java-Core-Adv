<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Application</title>
</head>
<body bgcolor="red">
   <%-- this is declaration --%>
	<%!
      String username;
      String password;
      %>
    
	<!-- this is block of java code -->
    <%
	  username=request.getParameter("username");
	  password=request.getParameter("password");

      if(username.equals("tharun") &&  password.equals("sai"))
	{
		out.println("login success");
	}
	else{
		out.println("Login failed");
	}
    %>

   <%-- print the variables L expression --%>
  
     username:<%=username%>
     password:<%=password%>

</body>
</html>