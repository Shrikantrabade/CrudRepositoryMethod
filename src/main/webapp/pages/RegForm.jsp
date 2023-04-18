<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>USER REG FORM</h1>

	<form action="/saveUser">
		<table>
			<tr>
				<td>USER FNAME</td>
				<td><input type="text" name="fName"></td>
			</tr>

			<tr>
				<td>USER LASTNAME</td>
				<td><input type="text" name="lname"></td>
			</tr>

			<tr>
				<td>EMAIL</td>
				<td><input type="text" name="email"></td>
			</tr>

			<tr>
				<td>USERNAME</td>
				<td><input type="text" name="uname"></td>
			</tr>

			<tr>
				<td>PASSWORD</td>
				<td><input type="text" name="password"></td>
			</tr>

			<tr>

				<td><input type="submit" value="REGISTER"></td>
			</tr>
		</table>
	</form>
</body>
</html>