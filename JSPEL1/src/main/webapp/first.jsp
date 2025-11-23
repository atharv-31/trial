<%@ page import="com.bean.Student" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>One JSP</title>
</head>
<body>

<h1> One JSP</h1>

<%
    Student student = new Student(7, "MS Dhoni", 77.77);
    request.setAttribute("stud", student);
%>

<jsp:include page="second.jsp"></jsp:include>
</body>
</html>
