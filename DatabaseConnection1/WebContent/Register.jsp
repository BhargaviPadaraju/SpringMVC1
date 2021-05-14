<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="saveuser" method="post">
		<table>
			<tr>
				<td>Name</td>
				<td>:</td>
				<td><input name="name"></td>
			</tr>
			<tr>
				<td>Age</td>
				<td>:</td>
				<td><input name="age"></td>
			</tr>
			<tr>
				<td>Phone</td>
				<td>:</td>
				<td><input name="phone"></td>
			</tr>

			<tr>
				<td>Email</td>
				<td>:</td>
				<td><input name="email"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td>:</td>
				<td><input name="password"></td>
			</tr>


			<tr>
				<td><input type="submit" value="login"></td>
			</tr>
		</table>
	</form>
</body>
</html>