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
	<sql:update var="rowcount" sql="update newemp set sal=sal+? where sal>?">
	<sql:param>500</sql:param>
	<sql:param>20000</sql:param>
	</sql:update>
	<h1>Updated row count of the table ${rowcount}</h1>
	
</body>
</html>