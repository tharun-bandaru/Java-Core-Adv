<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<body>
<%--This is for login --%>
<%!
   String username;
   String password;
%>
<%
  username=request.getParameter("username");
  password=request.getParameter("password");
  if(username.equals("tharun") && password.equals("sai"))
  {
	//  out.println("Login successfull.........");
	response.sendRedirect("http://www.youtube.com");
  }
  else
  {
	  //out.println("Login Failed....");
	  response.sendError(808,"Invalid username or password");
  }
%>
<br>Thank you for join in durgasoft <%= username %>

</body>
</html>