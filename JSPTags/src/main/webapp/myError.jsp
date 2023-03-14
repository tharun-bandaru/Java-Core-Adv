<%@ page errorPage="myError.jsp" autoFlush="true" buffer="1kb"%>
<html>
<body>
	
	<%
		for(int i=0;i<100000;i++)
		{	out.println(" JSP classes");
		}	
	%>
	
</body>
</html>
