<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Read Share</title>
<link rel="stylesheet" href="/css/main.css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Radio+Canada:wght@300;400;500;600;700&display=swap"
	rel="stylesheet">
</head>
<body>
	<div class="flex between header">
		<div class="left column">
			<h1>Welcome, <c:out value="${user.name}"></c:out></h1>
			<p>Books from everyone's shelves:</p>
		</div>
		<div class="right column">
			<a href="/logout" class="mb-8">logout</a>
			<a href="/books/new">+ Add to my shelf!</a>
		</div>
	</div>
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>Title</th>
				<th>Author Name</th>
				<th>Posted By</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="book" items="${books}">
				<tr>
					<td><c:out value="${book.id}" /></td>
					<td>
						<a href="/books/${book.id}"><c:out value="${book.title}" /></a>
					</td>
					<td><c:out value="${book.author}" /></td>
					<td><c:out value="${book.user.name}" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>