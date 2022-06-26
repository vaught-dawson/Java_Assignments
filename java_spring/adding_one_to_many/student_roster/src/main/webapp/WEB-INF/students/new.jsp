<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Student</title>
<link rel="stylesheet" href="/css/main.css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Radio+Canada:wght@300;400;500;600;700&display=swap"
	rel="stylesheet">
</head>
<body>
	<h1>New Student</h1>
	<div class="header">
		<a href="/dorms">Dashboard</a>
	</div>
	<form:form action="/students/new/submit" method="post" modelAttribute="student">
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
				<form:label path="dorm">Select Dorm:</form:label>
			</div>
			<div class="box">
				<form:select path="dorm">
					<c:forEach var="dorm" items="${dorms}">
						<form:option value="${dorm}">
							<c:out value="${dorm.name}" />
						</form:option>
					</c:forEach>
				</form:select>
			</div>
		</div>
		<div class="row">
			<div class="box">
				<button>Add</button>
			</div>
		</div>
		<form:errors path="name" class="error" />
		<form:errors path="dorm" class="error" />
	</form:form>
</body>
</html>