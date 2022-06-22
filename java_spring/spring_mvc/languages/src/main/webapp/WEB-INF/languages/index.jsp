<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Languages</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>Name</th>
				<th>Creator</th>
				<th>Version</th>
				<th>Actions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="language" items="${languages}">
				<tr>
					<td><a href="/languages/${language.id}"> <c:out
								value="${language.name}" />
					</a></td>
					<td><c:out value="${language.creator}" /></td>
					<td><c:out value="${language.version}" /></td>
					<td class="flex-center">
						<form action="/languages/${language.id}" method="post">
							<input type="hidden" name="_method" value="delete" />
							<button
								style="background-color: red; color: white; padding: 4px 8px; border: 2px solid black; box-shadow: 2px 2px black;">Delete</button>
						</form> <a href="/languages/${language.id}/edit">edit</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<form:form actions="/languages" method="post" modelAttribute="language">
		<div>
			<form:label path="name">Name</form:label>
			<form:errors path="name" />
			<form:input path="name" />
		</div>
		<div>
			<form:label path="creator">Creator</form:label>
			<form:errors path="creator" />
			<form:input path="creator" />
		</div>
		<div>
			<form:label path="version">Version</form:label>
			<form:errors path="version" />
			<form:input path="version" />
		</div>
		<button>Submit</button>
	</form:form>
</body>
</html>