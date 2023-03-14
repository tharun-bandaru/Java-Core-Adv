<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.List" %>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<html>
<body>
<c:forEach var="val" begin="1" end="10" step="2">
	<c:out value="hi how are you ${val }"/><br>
</c:forEach>
**********<br>
<c:forEach var="val" begin="1" end="25" step="5">
	<c:out value="hi how are you ${val }"/><br>
</c:forEach>
***********<br>
<%
List<String> names = List.of("ratan","anu","durga");
request.setAttribute("names", names);
%>
<c:forEach var="name" items="${names}">
  <c:out value="names is ${name}"></c:out><br>
</c:forEach>

</body>
</html>