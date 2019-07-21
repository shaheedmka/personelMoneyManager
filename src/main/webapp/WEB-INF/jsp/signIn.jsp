<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Personel Money Manager</title>
</head>
<body>

	<center><font color="olive" size="13"><b>Personel Money Manager</b></font></center>
	<br/><br/>
	<form action="/validateSignIn" method="post">
		User Name : <input type="text" name="userName" />
		<br/>
		<br/>
		&nbsp;&nbsp;
		Password : <input type="password" name="password" />
		<br/>
		<br/> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="submit" name="submit" value="Sign In" />
	</form>
</body>
</html>