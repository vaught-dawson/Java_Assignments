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
	<div class="header flex-between">	
		<h1>Expense Details</h1>
		<a href="/expenses">Go back</a>
	</div>
	<p>
		Expense Name: <c:out value="${expense.name}" />
	</p>
	<p>
		Expense Description: <c:out value="${expense.description}" />
	</p>
	<p>
		Vendor: <c:out value="${expense.vendor}" />
	</p>
	<p>
		Amount Spent: <fmt:formatNumber value="${expense.amount}" type="currency" />
	</p>
</body>
</html>