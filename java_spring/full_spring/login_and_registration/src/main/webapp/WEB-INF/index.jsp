<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login & Registration</title>
<link rel="stylesheet" href="/css/main.css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Radio+Canada:wght@300;400;500;600;700&display=swap"
	rel="stylesheet">
</head>
<body>
	<h1>Welcome!</h1>
	<h4>Join our growing community</h4>
	<div class="content">
		<div class="left">
			<form:form action="/register" method="post" modelAttribute="newUser">
				<h2>Register</h2>
				<div class="userName">
					<form:label path="userName">User Name:</form:label>
					<form:input path="userName" />
				</div>
					<form:errors path="userName" class="error" />
				<div class="email">
					<form:label path="email">Email:</form:label>
					<form:input path="email" />
				</div>
					<form:errors path="email" class="error" />
				<div class="password">
					<form:label path="password">Password:</form:label>
					<form:input path="password" />
				</div>
					<form:errors path="password" class="error" />
				<div class="confirm">
					<form:label path="confirm">Confirm PW:</form:label>
					<form:input path="confirm" />
				</div>
				<form:errors path="confirm" class="error" />
				<button>Submit</button>
			</form:form>
		</div>
		<div class="right">
			<form:form action="/login" method="post" modelAttribute="newLogin">
				<h2>Log in</h2>
				<div class="email">
					<form:label path="email">Email:</form:label>
					<form:input path="email" />
				</div>
					<form:errors path="email" class="error" />
				<div class="password">
					<form:label path="password">Password:</form:label>
					<form:input path="password" />
				</div>
					<form:errors path="password" class="error" />
				<button>Submit</button>
			</form:form>
		</div>
	</div>
</body>
</html>