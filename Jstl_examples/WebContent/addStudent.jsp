<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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

<section>
<form action="handleStudent.jsp">
 <div>
   <label for="">Roll Number</label>
    <input type="text" name="rollnum" />
   </div>


<div>
   <label for="">Student Name</label>
    <input type="text" name="name" />
   </div>


<div>
   <label for="">Marks Score</label>
    <input type="text" name="mark" />
   </div>
   
   <div>
      <input type="submit" value="add" />
   </div>
   
   <footer>
<%@ include file="footer.jsp" %>
</footer>
</form>
</section>
</body>
</html>