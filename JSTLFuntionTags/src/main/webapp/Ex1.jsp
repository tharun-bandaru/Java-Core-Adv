<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  

<html>
<body>
	<c:set var="data" value="hi sir Good Morning"/>
	Data in upper case: ${fn:toUpperCase(data)}<br>
	
	Length of the data: ${fn:length(data)}<br>
	
	Data start with hi: ${fn:startsWith(data,"hi")}<br>
	
	Data ends with Morning: ${fn:endsWith(data,"Morning")}<br>
	
	Data contains Good or not : ${fn:contains(data,"Good")}<br>
	
	Substring of the string: ${fn:substring(data,2,7)}<br>
</body>
</html>
