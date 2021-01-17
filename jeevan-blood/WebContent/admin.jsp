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
<h2><c:out value="Welcome to Jeevan Blood Bank ${user}"></c:out></h2>
<ul>
<li><a href="valid">Add Donors</a>
  </li> </ul> 
<ul>

  <li><a href="logout.jsp">Logout</a>
</body>

</body>
</html>