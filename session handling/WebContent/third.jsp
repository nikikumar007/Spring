<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
         <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>Session Id></p><c:out value="${pageContext.session.id}" />
<p>Session Is New></p><%= session.isNew() %>


<span>From Application</span><c:out value="${warning}"/>
<span>From Session</span><c:out value="${message}"/>
<span>From Request</span><c:out value="${info}"/>
<% session.invalidate(); %>
<a href="fourth.jsp">Next</a>
</body>
</html>