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
<body class="bg-gray">
	<div class="flex between header">
		<div class="left column">
			<h1>Welcome, <c:out value="${user.name}"></c:out></h1>
		</div>
		<div class="right column">
			<a href="/books">back to the shelves</a>
		</div>
	</div>
	<form:form action="/books/${book.id}/update" method="post" modelAttribute="book" class="w-20p">
		<input type="hidden" name="_method" value="put">
		<form:errors path="title" class="error" />
		<form:errors path="author" class="error" />
		<form:errors path="thoughts" class="error" />
		<div class="title">
			<form:label path="title">Title</form:label>
			<form:input path="title" value="${book.title}" />
		</div>
		<div class="author">
			<form:label path="author">Author</form:label>
			<form:input path="author" value="${book.author}" />
		</div>
		<div class="thoughts">
			<form:label path="thoughts">My thoughts</form:label>
			<form:input path="thoughts" value="${book.thoughts}" />
		</div>
		<div class="right">
			<button>Submit</button>
		</div>
	</form:form>
</body>
</html>