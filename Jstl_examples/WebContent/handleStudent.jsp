<%@page import="com.example.demo.Student"%>
<%@page import="java.util.ArrayList"%>
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
<header>
<%@ include file="menu.html" %>
</header>


<p> Following Details are</p>
<c:set value="${param.rollnum}" var="rollnum" />
<c:set value="${param.name}" />
<c:set value="${param.mark}" />

<jsp:forward page="showStudent.jsp">
<jsp:param value="${rollnum}" name="number"/>
</jsp:forward>


<footer>
<%@ include file="footer.jsp" %>
</footer>
</body>
</html>