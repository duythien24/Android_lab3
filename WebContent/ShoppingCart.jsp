<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:useBean id="cart" scope="session" class="bai3.bean.CartBean" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Shopping Cart</title>
</head>
<body>
	<p>
		<a href="DSSP">Product List</a>
	</p>
	<table width="100%" border="1">
		<tr bgcolor="#CCCCCC">
			<td>Model Description</td>
			<td>Quantity</td>
			<td>Unit Price</td>
			<td>Total</td>
		</tr>

		<c:if test="${cart.lineItemCount==0}">
			<tr>
				<td colspan="4">Cart is currently empty -</td>
			</tr>
		</c:if>
		<c:forEach var="cartItem" items="${cart.cartItems}"
			varStatus="counter">
			<form name="item" method="post" action="CartController">
				<tr>
					<td>
						<c:out value="${cartItem.partNumber}"/></b><br />
						<c:out value="${cartItem.modelDescription}"/></td>
					<td>
						<input type="hidden" name="itemIndex"
						value='<c:out value="${counter.count}"/>'> 
						<input type="text" name="quantity"
						value='<c:out value="${cartItem.quantity}"/>' size="2">
						<input type="submit" value="Update" name="action"> 
						<input type="submit" value="Delete" name="action">
					</td>
					<td>$<c:out value="${cartItem.unitCost}"/>
					</td>
					<td>$<c:out value="${cartItem.totalCost}"/>
					</td>
				</tr>
			</form>
		</c:forEach>
		<tr>
			<td colspan="2"></td>
			<td></td>
			<td>Subtotal: $<c:out value="${cart.orderTotal}"/>
			</td>
		</tr>
	</table>
</body>
</html>