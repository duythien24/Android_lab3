<%@page import="bai2.model.Register"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix = "fn" uri = "http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Register List</h1>
	<div>
		<table border="1" cellpadding="5">
			<tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Email</th>
                <th>Password</th>
                <th>Date</th>
                <th>Gender</th>
            </tr>
            <c:forEach var="register" items="${listRegister}">
            <tr>
            	<td><c:out value="${register.firstName}"></c:out></td>
            	<td><c:out value="${register.lastName}"></c:out></td>
            	<td><c:out value="${register.email}"></c:out></td>
            	<td><c:out value="${register.passWord}"></c:out></td>
            	<td><c:out value="${register.date}"></c:out></td>
            	<td><c:out value="${register.geneder}"></c:out></td>
            </tr>
            </c:forEach>
		</table>
	</div>
</body>
</html>