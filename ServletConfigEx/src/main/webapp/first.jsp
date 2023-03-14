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
 String initparam1,initparam2;
 String contextparam1,contextparam2;
%>
<%
 initparam1=config.getInitParameter("homeloan");
 initparam2=config.getInitParameter("carloan");
 
 contextparam1=application.getInitParameter("username");
 contextparam2=application.getInitParameter("password");
%>

Init-param1<%=initparam1 %><br>
Init-param2<%=initparam2 %><br>
<br><br><br><br>

Context-param1<%=contextparam1 %><br>
Context-param2<%=contextparam2 %>

</body>
</html>