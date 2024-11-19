<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Log In</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"></link>
<link rel="stylesheet" href="css/logIn.css">
</head>
<body>
<!-- 	<form action="LoginServlet" method="post"> -->
		<div class="title">
			<h1>Log In</h1>
		</div>
		<div class="container">
			<div class="left"></div>
			<div class="right">
				<form action="LoginServlet" method="post" class="formBox">
					<p>Username</p>
					<input type="text" name="name" placeholder="Enter your name">
					<p>Password</p>
					<input type="password" name="pwd" placeholder="Your password">
					<input type="submit" name="login" value="Log In"> <a
						href="">Forget Password</a>
				</form>
			</div>

		</div>
<!-- 	</form> -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>