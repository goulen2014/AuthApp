<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Log out </title>
</head>
<body>
<%
	session.removeAttribute("uname");
	session.invalidate();
%>
	<h1>You have been successfully logged out!</h1>
	<a href="logIn.jsp">Log in again?</a>
</body>
</html>