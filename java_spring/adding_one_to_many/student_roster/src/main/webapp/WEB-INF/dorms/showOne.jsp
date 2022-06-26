<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${dorm.name}</title>
<link rel="stylesheet" href="/css/main.css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Radio+Canada:wght@300;400;500;600;700&display=swap"
	rel="stylesheet">
</head>
<body>
	<h1><c:out value="${dorm.name}" /> Students</h1>
	<div class="header">
		<a href="/dorms">Dashboard</a>
	</div>
	<form action="/students/update/submit" method="post">
		<input type="hidden" name="_method" value="put">
		<input type="hidden" name="dorm" value="${dorm.id}" />
		<div class="row">
			<div class="box column">
				<label class="bold">Students:</label>
				<select name="student">
					<c:forEach var="student" items="${students}">
						<option value="${student.id}">
							<c:out value="${student.name}" />
							(<c:out value="${student.dorm.name}" />)
						</option>
					</c:forEach>
				</select>
			</div>
			<div class="box">
				<button>Add</button>
			</div>
		</div>
	</form>
	<div class="hr"></div>
	<table>
		<thead>
			<tr>
				<th>Student</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="student" items="${dorm.students}">
				<tr>
					<td><c:out value="${student.name}" /></td>
					<td><a href="/students/destroy/${student.id}">Remove</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>