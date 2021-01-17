 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 

<form:form action="submit" method="post">
    <div>
        <label for="">Tour ID</label>
        <form:input path="tourID"/>
    </div>
    <div>
        <label for="">Tour Name</label>
        <form:input path="tourName"/>
    </div>
    <div>
        <label for="">Duration</label>
        <form:input path="duration"/>
    </div>
    <div>
        <label for="">Cost</label>
        <form:input path="cost"/>
    </div>
    <div>
        <input type="submit" value="Add">
    </div>
</form:form>

 

</body>
</html>