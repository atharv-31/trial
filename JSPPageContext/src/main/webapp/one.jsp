
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
List<String> list= new ArrayList<String>();

list.add("Sachin T");
list.add("M Dhoni");
list.add("Virat K");
list.add("Jasprit B");
%>

<% request.setAttribute("buddies",list); %>

<% pageContext.setAttribute("companion", list,pageContext.SESSION_SCOPE); %>

<h1>
<%= pageContext.getAttribute("companion") %>
</h1>
</body>
</html>