<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Date"%>
<!DOCTYPE html>
<html>
<body>
	<font color='red'><h1>This is success jsp<%= new Date() %></h1></font><br>
	<%!
	 String username="tharun";
     String password="anu";
	%>
	<%
			for (int i=0;i<10;i++)
			{	out.println("this is jsp");
			}
		out.println(username);
		out.println(password);
		%>
</body>
</html>