<%@ page import="com.bean.Student"  %>

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
int id=Integer.parseInt(request.getParameter("id"));
String name=request.getParameter("name");
double marks=Double.parseDouble(request.getParameter("marks"));

Student student=new Student(); 
student.setId(id);
student.setName(name);
student.setMarks(marks);

%>

	<%=student %>
</body>
</html>