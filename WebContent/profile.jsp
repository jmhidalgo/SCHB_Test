<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Profile</title>
<link rel="stylesheet" href="style/css/style.css">
</head>
<body>
    <%@ include file="userVerification.jsp" %>
	<h1>USER PROFILE</h1>
	<p>
		Wellcome,
		<%=request.getParameter("user")%></p>
</body>
</html>