<%@ page language="java" contentType="text/html; charset=ISO-8859-1" info="today date printing" import="java.util.Date"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	Date d=null;
%>
<%
	d=new Date();
%>
today's date is<%=d%>
</body>
</html>