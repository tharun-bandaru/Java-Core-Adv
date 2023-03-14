<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<html>
	<body>
			<c:set var="num" value="100"/>
			<c:choose>
				<c:when test="${num==100}">
					TEN
				</c:when>
				<c:when test="${num==15}">
					FIFTEEN
				</c:when>
				<c:when test="${num==20}">
					TWENTY
				</c:when>
				<c:otherwise>
					Number is not in 10,15 and 20
				</c:otherwise>
			</c:choose>
	<body>
<html>