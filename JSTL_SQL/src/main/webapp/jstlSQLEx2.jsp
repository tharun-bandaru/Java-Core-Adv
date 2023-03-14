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
	<sql:update var="r1" sql="insert into newemp values(111,'ratan',20000)"/>
	<sql:update var="r2" sql="insert into newemp values(222,'anu',30000)"/>
	<sql:update var="r3" sql="insert into newemp values(333,'durga',25000)"/>
	<h1>data inserted successfully......${r1},${r2},${r3}"</h1>
	
</body>
</html>