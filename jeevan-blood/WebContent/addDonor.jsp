<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>servlets example</title>

</head>
<body>
<form action="donor" method="post">
  <label for="">Name:</label>
    <input type="text" name="name" required><br>
    
   <label for="">Age</label>
   <input type="number" name="age" required><br>

   <label for="">Blood group</label>
    <select name="bgroup">
    <option value="Apos">Apos</option>
     <option value="Aneg">Aneg</option>
     <option value="Bpos">Bpos</option>
      <option value="Bneg">Bneg</option>
      <option value="Opos">Opos</option>
       <option value="Oneg">Oneg</option>
        <option value="ABneg">ABneg</option>
      
    </select>
  
   <label for="">Gender</label>
  <input type="text" name="gender" required><br>
  
   <label for="">Mobile Number</label>
  <input type="text" name="phone" required><br>
  
   <label for="">Email Id</label>
  <input type="email"  name="email" required><br>
  
   <label for="">Date of birth</label>
  <input type="date" name="dob" required><br>
  
 <input type="submit" value="Add">
</form>
<hr>

<c:out value="${donors}"></c:out>
</body>
<footer>
<ul>
<li><a href="admin.jsp">Go back to main menu</a>

  </li></ul>
</footer>
</html>