<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  

<html>
<title>Functional Tags</title>
<body>
	<h3>Split Demo Example</h3>
	<c:set var="data" value="ratan,durga,anu,sai,tharun"/>
	
	<c:set var="NamesArray" value="${fn:split(data,',')}"/>
	<c:forEach var="res" items="${NamesArray}" >
			${res}<br>
	</c:forEach>
	
	<h3>Join Demo Example</h3>
	<c:set var="res" value="${fn:join(NamesArray,'*')}"/>
	Joining result: ${res}
</body>

</html>