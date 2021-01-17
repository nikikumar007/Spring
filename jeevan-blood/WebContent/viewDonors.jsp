<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
table,th,td {
  border: 1px solid black;
  
}
</style>
</head>
<body>
<h2 style="text-align:center">Donor List</h2>
<table>
  <tr>
     <th>Name</th>
     <th>Age</th>
     <th>BloodGroup</th>
     <th>Gender</th>
     <th>MobileNum</th>
     <th>Email</th>
     <th>DOB</th>
<c:forEach items="${donorlist}" var="eachDonor">   
  <tr>
    <td><c:out value="${eachDonor.name }"/></td>
    <td><c:out value="${eachDonor.age }"/></td>
    <td><c:out value="${eachDonor.bloodGroup }"/></td>
    <td><c:out value="${eachDonor.gender}"/></td>
    <td><c:out value="${eachDonor.phone }"/></td>
    <td><c:out value="${eachDonor.email }"/></td>
    <td><c:out value="${eachDonor.dob }"/></td>
    </tr>  
</c:forEach> 
</tr>

</table>
</body>
<footer>
<ul>
<li><a href="login.html">Go back to main menu</a>

  </li></ul>
</footer>

</html>