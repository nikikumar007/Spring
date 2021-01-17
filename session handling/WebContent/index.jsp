<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Session Handling</title>
</head>
<body>
<p>Session Id></p><c:out value="${pageContext.session.id}" />
<p>Session Is New></p><%= session.isNew() %>

<a href="book">Book</a>
</body>
</html>