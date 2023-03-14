

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
	<body>
			<c:set var="num1" value="20"/>
			<c:set var="num2" value="10"/>
			
			<c:if test="${num1>num2}">
				Your Condition is working Good
			</c:if>
	<body>
<html>