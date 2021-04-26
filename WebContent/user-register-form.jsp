<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
	<h1>User Register Form</h1>
	<form action="insert" method="get" enctype="multipart/form-data">
	<table>
		<tr>
			<td><input type='text' name='fisrtname' placeholder ='First Name'>
				<input type='text' name='lastname' placeholder ='Last Name'></td>	
		</tr>
		<tr >
			<td ><input size="46" type='text' name='email' placeholder ='Your Email'></td>	
		</tr>
		<tr>
			<td><input size="46" type='text' name='re-email' placeholder ='Re-enter Email'></td>	
		</tr>
		<tr>
			<td><input size="46" type='password' name='password' placeholder ='New Password'></td>	
		</tr>
		<tr>
			<td><input size="46" type='date' name='date'></td>	
		</tr>
		<tr>
			<td><input type='radio' name='gender' id='male' value='Male' />Male
		<input type='radio' name='gender' id='female' value='Female' />Female</td>	
		</tr>
	</table>
		<input type="submit" value="Sign Up" />	
		</form>
	</div>
	 
</body>
</html>