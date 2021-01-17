<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! public String show() 
{
return "Hello from jsp";
}
%>

<%! int age=45; %>

<% String name="nikhil";
out.println("My name is "+name);
%>

<span>My Age </span><%=age %>
<%
out.println(show());
%>
</body>
</html>