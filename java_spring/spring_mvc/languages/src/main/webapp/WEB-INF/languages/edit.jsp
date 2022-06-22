<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${language.name}</title>
</head>
<body>
	<form action="/languages/${language.id}" method="post">
		<input type="hidden" name="_method" value="delete" />
		<button
			style="background-color: red; color: white; padding: 4px 8px; border: 2px solid black; box-shadow: 2px 2px black;">Delete</button>
	</form>
	<a href="/languages">Dashboard</a>
	<form:form actions="/languages/${language.id}/edit" method="post" modelAttribute="language">
		<input type="hidden" name="_method" value="put">
		<div>
			<form:label path="name">Name</form:label>
			<form:errors path="name" />
			<form:input path="name" value="${language.name}" />
		</div>
		<div>
			<form:label path="creator">Creator</form:label>
			<form:errors path="creator" />
			<form:input path="creator" value="${language.creator}" />
		</div>
		<div>
			<form:label path="version">Version</form:label>
			<form:errors path="version" />
			<form:input path="version" value="${language.version}" />
		</div>
		<button>Submit</button>
	</form:form>
</body>
</html>