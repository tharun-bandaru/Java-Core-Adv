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
 	<sql:update var="result" sql="insert into newemp values(?,?,?)">
 	 <sql:param value="555"/>
 	 <sql:param value="tharun"/>
 	 <sql:param value="5500"/>
 	</sql:update>
 	<h1>data inserted using prepared statement ${result}</h1>
	
	
	
</body>
</html>