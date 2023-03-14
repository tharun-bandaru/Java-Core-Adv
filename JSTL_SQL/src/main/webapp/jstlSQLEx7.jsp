<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@taglib uri="http://java.sun.com/jstl/sql_rt" prefix="sql"%>
<html>
	<body>
			<sql:setDataSource driver="com.mysql.cj.jdbc.Driver" 
								url="jdbc:mysql://localhost:3306/tharun" 
								user="root" password="root"/>
								
			<sql:query var="result" sql="select * from newemp"/>
			
			<table border="1" bgcolor="lightyellow">
			
			<!-- Reading the table column names -->
			<tr>
				<c:forEach var="columnName" items="${result.columnNames}">
					<th><c:out value="${columnName}"/></th>
				</c:forEach>
			</tr>
			
			<!-- This loop is storing all the table rows  -->
			<c:forEach var="row" items="${result.rowsByIndex}">
				<tr>
					<!-- This loop is processing each row data -->
					<c:forEach var="column" items="${row}">
						<td><c:out value="${column}"/></td>
					</c:forEach>
				</tr>
			</c:forEach>
			</table>
	</body>
</html>