<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Dorm</title>
<link rel="stylesheet" href="/css/main.css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Radio+Canada:wght@300;400;500;600;700&display=swap"
	rel="stylesheet">
</head>
<body>
	<h1>New Dorm</h1>
	<div class="header">
		<a href="/dorms">Dashboard</a>
	</div>
	<form:form action="/dorms/new/submit" method="post" modelAttribute="dorm">
		<div class="row">
			<div class="box">
				<form:label path="name">Name:</form:label>
			</div>
			<div class="box">
				<form:input path="name" />
			</div>
		</div>
		<div class="row">
			<div class="box">
				<button>Add</button>
			</div>
		</div>
		<form:errors path="name" class="error" />
	</form:form>
</body>
</html>