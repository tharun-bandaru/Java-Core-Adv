<%@ page language="java" contentType="text/html; charset=ISO-8859-1" errorPage="myError.jsp"
    pageEncoding="ISO-8859-1" info="exception handling ex" import="java.util.*"  isErrorPage="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
  Date d=null;
%>
<%--null  pointer exception occurs --%>
<%=d.toString()%>
</body>
</html>