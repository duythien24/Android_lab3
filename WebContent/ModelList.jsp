<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product List</title>
<style>
.a{
	width: 160px;
	height: 200pd;
	border: 1px solid black;
	padding: 5px;
	margin: 10px;
	float: left;
	text-align: center;
}
.hinh{
	width: 80px;
	height: 100px;
}
</style>
</head>
<body>
	<p><a href="ShoppingCart.jsp">View Cart</a></p>
	<c:forEach  items="${ds}" var="sp">
		<div class="a">
			<form name="modelDetail" action="CartController" method="post">
			${sp.model} <br/>
			<img src="${sp.imgURL}" class="hinh"> <br/>
			Price: ${sp.price}<br/>
			<input type="text" size="2" value="1" name="quantity"><br>
			<input type="hidden"  value="${sp.id}" name="modelNo">
			<input type="hidden" value="${sp.price}" name="price">
			<input type="hidden" value="${sp.model}" name="description">
			<input type="hidden"  value="add" name="action">
			<input type="submit"  value="Add To Cart" name="addToCart">
			</form>
		</div>
	</c:forEach>
</body>
</html>