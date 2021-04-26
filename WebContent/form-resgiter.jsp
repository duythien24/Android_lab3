<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="background:#c3c3c3">
	<form action="RegistrationForm" name="formDangKy" method="get" >
		<table>
			<tr>
				<td>Fisrt Name</td>
				<td><input type='text' name='txtFName'/></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><input type='text' name='txtLName'/></td>
			</tr>
			<tr>
				<td>Date of birth</td>
				<td><input type='date' name='day'/></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type='text' name='txtEmail'/></td>
			</tr>
			<tr>
				<td>Mobile number</td>
				<td><input type='text' name='txtMobileNumber'/></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td><input type='radio' name='gender' id='male' value='Male' />Male
				<input type='radio' name='gender' id='female' value='Female' />Female</td>
			</tr>
			<tr>
				<td>Address</td>
				<td>
					<textarea rows='7' cols='40' name='taAddress'> 
					</textarea>
				</td>
			</tr>
			<tr>
				<td>City</td>
				<td><input type='text' name='txtCity'/></td>
			</tr>
			<tr>
				<td>Pin code</td>
				<td><input type='text' name='txtPinCode'/></td>
			</tr>
			<tr>
				<td>State</td>
				<td><input type='text' name='txtState'/></td>
			</tr>
			<tr>
				<td>Country</td>
				<td><input type='text' name='txtcountry'/></td>
			</tr>
			<tr>
				<td>Hobbies</td>
				<td>
					<input type='checkbox' name='ckHobbies'  value='Drawing'/>Drawing
					<input type='checkbox' name='ckHobbies' value='Singing'/>Singing
					<input type='checkbox' name='ckHobbies' value='Dancing'/>Dancing
					<input type='checkbox' name='ckHobbies' value='Sketching'/>Sketching
					Other
					<input type='text' name='ckHobbies'/>
				</td>
			</tr>
			<tr>
				<td>Qualification</td>
				<td>
					<table col width="100" span="2" style="border:1px solid blue;">
						<tr>
							<td>Sl.No.Examination</td>
							<td>Board</td>
							<td>Percentage</td>
							<td>Year of passing</td>							
						</tr>
						<tr >
							<td>1. Class X</td>
							<td><input type='text'/></td>
							<td><input type='text'/></td>
							<td><input type='text'/></td>							
						</tr>
						<tr>
							<td>2. Class XII</td>
							<td><input type='text'/></td>
							<td><input type='text'/></td>
							<td><input type='text'/></td>							
						</tr>
						<tr>
							<td>3. Gradution</td>
							<td><input type='text'/></td>
							<td><input type='text'/></td>
							<td><input type='text'/></td>							
						</tr>
							<tr>
							<td>4. Masters</td>
							<td><input type='text'/></td>
							<td><input type='text'/></td>
							<td><input type='text'/></td>							
						</tr>
					</table>
				</td>
			</tr>
			<tr>
				<td>Course applies for</td>
				<td><input type='radio' name='txtrCourse' id='a'/>BCA
				<input type='radio' name='txtrCourse' id='b' />B.Com
				<input type='radio' name='txtrCourse' id='c' />B.Sr
				<input type='radio' name='txtrCourse' id='d' />B.A</td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit" />
				<input type="reset" value="Reset" /></td>
			</tr>
		</table>
			
				
	</form>
</body>
</html>