<%@ page language="java" contentType="text/html; charset=ISO-8859-1" %>
<%@taglib uri="http://java.sun.com/jstl/sql_rt" prefix="sql"%>
<html>

<body>
	<sql:setDataSource
	 driver="oracle.jdbc.driver.OracleDriver"
	 url="jdbc:oracle:thin:@localhost:1521:xe"
	 user="system"
	 password="tharun123"
	/>
   <sql:update  var="d" sql="delete from newemp where id=?">
   	<sql:param>111</sql:param>
   </sql:update>
   
   <h1>Deleted row count ${d}</h1>
	
	
	
</body>
</html>