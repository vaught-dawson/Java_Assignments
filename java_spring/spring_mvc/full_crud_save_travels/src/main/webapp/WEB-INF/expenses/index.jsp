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
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<h1>Save Travels</h1>
	<table>
		<thead>
			<tr>
				<th>Expense</th>
				<th>Vendor</th>
				<th>Amount</th>
				<th>Actions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="expense" items="${expenses}">
				<tr>
					<td>
						<a href="/expenses/${expense.id}">
							<c:out value="${expense.name}"></c:out>
						</a>
					</td>
					<td><c:out value="${expense.vendor}"></c:out></td>
					<td><fmt:formatNumber value="${expense.amount}"
							type="currency" /></td>
					<td class="flex-center"><a href="/expenses/edit/${expense.id}">edit</a>
						<form action="/expenses/${expense.id}" method="post">
							<input type="hidden" name="_method" value="delete" />
							<button
								style="background-color: red; color: white; padding: 4px 8px; border: 2px solid black; box-shadow: 2px 2px black;">Delete</button>
						</form></td>
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