<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Page A</title>
</head>
<body>
	<form name="f11" method="post" action="PageB.jsp">
		<center>
			<table border=1>
				<tr>
					<td><mark>Username</mark></td>
					<td><input type="text" name="uname" required></td>
				</tr>
				<tr>
					<td><mark>Password</mark></td>
					<td><input type="password" name="email" required></td>
				</tr>
				<tr>
					<td><input type="submit" value="Register"></td>
					<td><input type="reset" value="Cancel"></td>
				</tr>
			</table>
		</center>
	</form>
</body>
</html>