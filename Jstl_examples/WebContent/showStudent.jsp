<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Details</title>
</head>
<body>

<header>
<%@ include file="menu.html" %>
</header>


<h2>Student List</h2>
<h2><c:out value="${param.number}" />
</h2>
<table>
<tr>
	<th>Roll Number</th>
	<th>Student Name</th>
	<th> Marks Scored</th>
<c:forEach items="${studentList}" var="eachStudent">
	<tr>
		<td><c:out value="${eachStudent.rollnum}"/></td>
		<td><c:out value="${eachStudent.name}"/></td>
		<td><c:out value="${eachStudent.mark}"/></td>
	</tr>
	</c:forEach>
</tr>
</table>
<footer>
<%@ include file="footer.jsp" %>
</footer>
</body>
</html>