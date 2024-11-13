<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign Up</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"></link>
<link rel="stylesheet" href="css/signUp.css"></link>

</head>
<body>

	<div class="title">
		<h1>Sign Up</h1>
	</div>
	<div class="container">
		<div class="left"></div>
		<div class="right">
			<form>
				<div class="formBox">
					<p>Name</p>
					<input type="text" name="name" placeholder="Enter your name">
					<p>Email</p>
					<input type="email" name="email" placeholder="Enter your email">
					<p>Password</p>
					<input type="password" name="pwd" placeholder="Your password">
					<p>Repeat Password</p>
					<input type="password" name="pwd" placeholder="Your password">
					<input type="submit" name="login" value="Sign Up">
					<input type="reset" name="cancel" value="Cancel"> 
					<br><a
						href="">Already have an account?</a>
				</div>
			</form>
		</div>

	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>