<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Technical Test</title>
<link rel="stylesheet" href="style/css/style.css">
</head>
<body>

	<div class="login-card">
		<h1>Log-in</h1>
		<br>
		<form action="ControllerActions" method="post">
		    <input type="hidden" id="action" name="action" value="doLogin"/> 
			<input type="text" name="user" placeholder="Username"> 
			<input type="password" name="pass" placeholder="Password"> 
			<input type="submit" name="login" class="login login-submit" value="login">
		</form>
		<div class="login-help"></div>
	</div>

</body>
</html>