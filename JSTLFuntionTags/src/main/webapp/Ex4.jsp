<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:set var="str1" value="Good morning ratan sir"/>
	<c:set var="str2" value="Good morning madam"/>
	
	${fn:indexOf(str1,'ratan')}<br>
	${fn:indexOf(str2,'morning')}<br>
	
	${fn:indexOf(str1,'r')}<br>
	${fn:indexOf(str2,'m')}<br>
	
	<c:set var="str3" value="   ratan sir   "/>
	Before Trimming :${fn:length(str3)}<br>
	<c:set var="newData" value="${fn:trim(str3)}"/>
	After Trimming : ${fn:length(newData)}<br>
	
</body>
</html>