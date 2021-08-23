<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login do usuário</title>
</head>
<body>
	<div align="center">
		<h1>Ordemi</h1>
		<h2>Login</h2>

		<form action="login" method="post">
			<table>
				<tr>
					<td>Email:</td>
					<td><input type="text" name="email" /></td>
				</tr>

				<tr>
					<td></td>
					<td><button type="submit">Login</button></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>
