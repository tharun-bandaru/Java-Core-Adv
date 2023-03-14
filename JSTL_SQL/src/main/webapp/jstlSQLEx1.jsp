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
	connection created successfully......<br>
	<sql:update var="result" 
					sql="create table newemp(id number primary key,name varchar2(10),sal number)"/>
		<h1>Table created successfully.....${result}</h1>
	
	
	
</body>
</html>