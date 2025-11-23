<%@ page import="com.bean.Student" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Two JSP</title>
</head>
<body>

<h2> Two JSP</h2>

<%
    Student student = (Student) request.getAttribute("stud");
%>

<h1>
<%= student.getId() %><br>
<%= student.getName() %><br>
<%= student.getMarks() %><br>
</h1>

<hr>

<h1>${requestScope.stud}</h1>

<hr>

${requestScope.stud.id}<br>
${requestScope.stud.name}<br>
${requestScope.stud.marks}<br>

</body>
</html>
