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
<title>Read Share</title>
</head>
<body>
	<h1>Save Travels</h1>
	<table>
		<thead>
			<tr>
				<th>Expense</th>
				<th>Vendor</th>
				<th>Amount</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="expense" items="${expenses}">
				<tr>
					<td><c:out value="${expense.name}"></c:out></td>
					<td><c:out value="${expense.vendor}"></c:out></td>
					<td><fmt:formatNumber value="${expense.amount}"
							type="currency" /></td>
					<td><a href="/expenses/edit/${expense.id}">edit</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div class="form-container">
		<form:form action="/expenses" method="post" modelAttribute="expense">
			<h2>Add an expense:</h2>
			<form:errors path="name" class="error" />
			<form:errors path="vendor" class="error" />
			<form:errors path="amount" class="error" />
			<form:errors path="description" class="error" />
			<div class="name">
				<form:label path="name">Expense Name:</form:label>
				<form:input path="name" />
			</div>
			<div class="vendor">
				<form:label path="vendor">Vendor:</form:label>
				<form:input path="vendor" />
			</div>
			<div class="amount">
				<form:label path="amount">Amount:</form:label>
				<form:input path="amount" type="double" />
			</div>
			<div class="description">
				<form:label path="description">Description:</form:label>
				<form:textarea path="description" />
			</div>
			<button>Submit</button>
		</form:form>
	</div>
</body>
</html>