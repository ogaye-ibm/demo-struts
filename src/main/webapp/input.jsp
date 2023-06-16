<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Demo Struts</title>
</head>
<body>
	<form method="get" action="car.action">
		<p>Welcome to Legacy Struts</p>
		<p>How do you want your customized greeting?</p>
		<p>Please choose english or french</p>
		<select name="language">
			<option value="French" label="french" />
			<option value="English" label="english" />
		</select> <input type="submit" value=" Enter! " />

	</form>
</body>
</html>