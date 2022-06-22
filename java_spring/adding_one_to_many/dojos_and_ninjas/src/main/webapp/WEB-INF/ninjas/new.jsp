<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Ninja</title>
</head>
<body>
	<h1>New Ninja</h1>
	<form:form action="/ninjas/new" method="post" modelAttribute="ninja">
		<p>
			<form:select path="dojo">
				<c:forEach var="dojo" items="${dojos}">
					<form:option value="${dojo.id}">
						<c:out value="${dojo.name}" />
					</form:option>
				</c:forEach>
			</form:select>
		</p>
		<p>
			<form:errors path="firstName" />
			<form:label path="firstName">First Name:</form:label>
			<form:input path="firstName" />
		</p>
		<p>
			<form:errors path="lastName" />
			<form:label path="lastName">last Name:</form:label>
			<form:input path="lastName" />
		</p>
		<p>
			<form:errors path="age" />
			<form:label path="age">Age:</form:label>
			<form:input path="age" />
		</p>
		<button>Create</button>
	</form:form>
</body>
</html>