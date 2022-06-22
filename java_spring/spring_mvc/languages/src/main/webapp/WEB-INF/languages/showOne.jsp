<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${language.name}</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<div class="header flex-between">
		<a href="/languages">Dashboard</a>
	</div>
	<p>
		<c:out value="${language.name}" />
	</p>
	<p>
		<c:out value="${language.creator}" />
	</p>
	<p>
		<c:out value="${language.version}" />
	</p>
	<a href="/languages/${language.id}/edit">edit</a>
	<form action="/languages/${language.id}" method="post">
		<input type="hidden" name="_method" value="delete" />
		<button
			style="background-color: red; color: white; padding: 4px 8px; border: 2px solid black; box-shadow: 2px 2px black;">Delete</button>
	</form>
</body>
</html>