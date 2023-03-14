<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL Functional Tags</title>
</head>
<body>

<c:set var="str1" value="hi <xml>ratan<xml> how are you" />
<c:set var="str2" value="how are <h4> ratan sir <b>" />

<p> Before fn:escapeXML </p>
Message-1:${str1}<br>
Message-2:${str2}<br>

<p> After fn:escapeXML </p>
Message-1: ${fn:escapeXml(str1)}<br>
Message-2: ${fn:escapeXml(str2)}<br>

</body>
</html>