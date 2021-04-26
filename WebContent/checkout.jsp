<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:useBean id="cartDao" scope="session" class="bai5.Dao.CartDao" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product List</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<style>
.a {
	width: 200px;
	height: 200pd;
	border: 1px solid black;
	padding: 10px;
	margin: 25px;
	float: left;
	text-align: center;
}

.hinh {
	width: 80px;
	height: 100px;
}

.form {
	width: 150px;
	height: 250px;
}

td {
	height: 40px;
	padding: 10px;
	border-color: #c3c3c3;
}
</style>

</head>
<body>
	<header class="header">
		<nav class="navbar navbar-default">
			<div class="container-fluid">
				<div class="navbar-header">
					<a class="navbar-brand" href="List-Product">IUH BOOKSTORE</a>
				</div>
				<ul class="nav navbar-nav" style="float: right; margin-right: 50px">
					<li class="active"><a href="List-Product">Home</a></li>
					<li><a href="#">Examples</a></li>
					<li><a href="#">Services</a></li>
					<li><a href="#">Product</a></li>
					<li><a href="#">Contact</a></li>
				</ul>
			</div>
		</nav>

	</header>
	<div class="col-sm-4" style="height: 520px">
		<div style="background: #f0f0f0; height: 100px; padding-left: 10px">
			<h2 style="padding-top: 15px">ABOUT US</h2>
			<p>
				About us information will be here...<a href="#">Read more >></a>
			</p>
		</div>
		<div>
			<br />
			<h4 style="padding-left: 10px">SEARCH SITE</h4>
			<div class="form-group">
				<input type="text" class="form-control" />
			</div>
		</div>
	</div>
	<p>
		<a href="Cart.jsp">View Cart</a>
	</p>
	<div class="col-sm-8 ">
		<table width="100%" border="1" style="font-size: 15px;">
			<tr>
				<td>Fullname:</td>
				<td><input type="text" size="30" style="background: #dedcdc">
				</td>
			</tr>
			<tr>
				<td>Shipping address:</td>
				<td><input type="text" size="50" style="background: #dedcdc">
				</td>
			</tr>
			<tr>
				<td>Total price:</td>
				<td><input type="text" size="30" value="${cartDao.totalOrder}" style="background: #dedcdc">
				</td>
			</tr>
			<tr>
				<td>Paypal method</td>
				<td><input type="radio" name="pay" value="Paypal">Paypal
					<input type="radio" name="pay" value="ATM Debit">ATM Debit
					<input type="radio" name="pay" value="Visa Master Cart">Visa
					Master Cart</td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: center"><input type="submit"
					value="Save"> <input type="submit" value="Cancel">
				</td>

			</tr>
		</table>
	</div>
	<footer class="bg-light text-center text-lg-start">

		<div class="text-center col-sm-12"
			style="background-color: black; height: 30px; color: white; padding-top: 5px">
			@ IUH Bookstore 2016. All rights reversed.</div>

	</footer>

</body>
</html>