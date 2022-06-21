<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit My Task</title>
</head>
<body>
	<div class="header">
		<h1>Edit Expense</h1>
		<a href="/expenses">Go back</a>
	</div>
	<form:form action="/expenses/${expense.id}/edit" method="post" modelAttribute="expense">
		<input type="hidden" name="_method" value="put">
		<form:errors path="name" class="error" />
		<form:errors path="vendor" class="error" />
		<form:errors path="amount" class="error" />
		<form:errors path="description" class="error" />
		<div class="name">
			<form:label path="name">Expense Name:</form:label>
			<form:input path="name" value="${expense.name}" />
		</div>
		<div class="vendor">
			<form:label path="vendor">Vendor:</form:label>
			<form:input path="vendor" value="${expense.vendor}" />
		</div>
		<div class="amount">
			<form:label path="amount">Amount:</form:label>
			<form:input path="amount" value="${expense.amount}" type="double" />
		</div>
		<div class="description">
			<form:label path="description">Description:</form:label>
			<form:textarea path="description" value="${expense.description}" />
		</div>
		<button>Submit</button>
	</form:form>
</body>
</html>