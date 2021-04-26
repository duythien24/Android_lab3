<%@page import="bai1.Student"%>
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
		Student svt=new Student();
		svt=(Student) request.getAttribute("student");
		out.println("First name:" + svt.getFirstName()
		+ "<br/> Last name: " + svt.getLastName()
		+ "<br/> Email : " + svt.getEmail()
		+ "<br/> Gender: " +svt.getGender()
		+ "<br/> Hobbies: " + svt.getHobbies()
		+ "<br/> Birthday: " + svt.getDateOfBirth()
		);
	%>
</body>
</html>