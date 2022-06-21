<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<h1>
		<c:out value="${book.title}" />
	</h1>
	
	<p>
		Description: <c:out value="${book.description }"></c:out>
	</p>
	<p>
		Language: <c:out value="${book.language }"></c:out>
	</p>
	<p>
		Number of Pages: <c:out value="${book.numberOfPages }"></c:out>
	</p>
</body>
</html>