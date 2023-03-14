<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <c:set var="num1" value="10"/>
   <c:set var="num2" value="20"/>
   <c:out value="Addtion of two numbers ${num1+num2}"></c:out>
   <br><br>
   <c:remove var="num1"/>
   <c:out value="Addtion of two number ${num1+num2 }"/>
</body>
</html>