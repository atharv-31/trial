<%@ page import="com.bean.Student" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="student" class="com.bean.Student"></jsp:useBean>

<jsp:setProperty property="id" name="student" param="id"/>
<jsp:setProperty property="name" name="student" param="name"/>
<jsp:setProperty property="marks" name="student" param="marks"/>

<h1>

<jsp:getProperty property="id" name="student"/><br>
<jsp:getProperty property="name" name="student"/><br>
<jsp:getProperty property="marks" name="student"/><br>

</h1>

<%=student.getName() %>
</body>
</html>