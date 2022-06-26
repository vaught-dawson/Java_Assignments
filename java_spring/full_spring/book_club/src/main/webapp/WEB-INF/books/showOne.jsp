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
			<h1 class="italic"><c:out value="${book.title}"></c:out></h1>
		</div>
		<div class="right column">
			<a href="/books">back to the shelves</a>
		</div>
	</div>
	<h4>
		<span class="red">
			<c:choose>
				<c:when test="${book.user.id == user.id}">
					You
				</c:when>
				<c:otherwise>
					<c:out value="${book.user.name}" />
				</c:otherwise>
			</c:choose>
		</span> read 
		<span class="purple"><c:out value="${book.title}" /></span> by
		<span class="green"><c:out value="${book.author}" /></span>
		<br />
		Here are 
		<c:choose>
				<c:when test="${book.user.id == user.id}">
					Your
				</c:when>
				<c:otherwise>
					<c:out value="${book.user.name}'s" />
				</c:otherwise>
			</c:choose>
		thoughts:
	</h4>
	<div class="container">
		<hr />
		<p>
			<c:out value="${book.thoughts}" />
		</p>
		<hr />
		<div class="right">
			<c:if test="${book.user.id == user.id}">
				<a href="/books/${book.id}/edit" class="button">Edit</a>
			</c:if>
		</div>
	</div>
</body>
</html>