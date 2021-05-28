<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
		<h3>Login</h3>
		<form id="loginForm" class="" action="LoginServlet" onsubmit="login()"
			novalidate="novalidate">
			<div class="mb-5 col-4">
				<input type="text" name="username" id="username"
					class="form-control" required placeholder="Enter username" />
				<div class="invalid-feedback">Please choose a username.</div>
			</div>
			<div class="mb-5 col-4">
				<input type="password" name="password" id="password"
					class="form-control" required placeholder="Enter password" />
				<div class="invalid-feedback">Please choose a password.</div>
			</div>
			<div class="mb-5 col-4">
				<button class="btn btn-success">Submit</button>
			</div>
		</form>
	</main>
	<script>
		function login() {
			event.preventDefault();
			// Step 1: Get Form Values
			let loginForm = document.querySelector("#loginForm");
			let username = document.querySelector("#username");
			let password = document.querySelector("#password");
			console.log(username + "-" + password);
			// 2. Check form is valid
			if (loginForm.checkValidity()) {
				loginForm.classList.remove("was-validated");
				loginForm.submit(); //if valid, then submit the form( which will call the LoginServlet)
			} else {
				loginForm.classList.add("was-validated"); 
				//field errors
				if (username.value.length == 0) {
					username.classList.add("is-invalid");
				}
				else{
					username.classList.add("is-valid");
				}
			}
		}
	</script>
</body>
</html>