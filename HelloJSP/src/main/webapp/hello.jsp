<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Hello</h1>

<% String name="Atharv"; %>

<h1><% out.print(name); %></h1>

<!-- Expression tag -->

<h2 style="font-family:cursive;  color: blue;">
<%=name.toUpperCase()%>
</h2>

<hr>

<h2> 
<%  int i=1;
for(i=1;i<10;i++){
%>
<b> <%=(7*i) %></b>
<br>

<%} %>
</h2>

<!-- Declaration Tag -->
<%! int num=10;  %>
</body>
</html>