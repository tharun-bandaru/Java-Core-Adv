<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL EXAMPLES</title>
</head>
<body>
 <c:catch var="e">
  <% 
 
				Date d = null;
				d = new Date();
				out.println(d.toString());
				%>
  </c:catch>
 The Exception info<c:out value="${e}"/>
</body>
</html>