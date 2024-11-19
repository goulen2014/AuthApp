<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Success</title>
</head>
<body>
<% 
	if(session.getAttribute("uname")==null) {
		response.sendRedirect("logIn.jsp");
	}
%>

	<h1>Welcome <%=session.getAttribute("uname")%>!</h1>
	<p>You are successfully logged in.</p>
	
	<form action=logOut.jsp>
		<input type="submit" value="Logout">
	</form>
</body>
</html>