<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Omikuji</title>
<link rel="stylesheet" href="/css/style.css" media="all" />
</head>
<body>
	<h1>Here's Your Omikuji!</h1>
	<div class="container bg-primary">
		<span> In <c:out value="${years }" /> years, you will live in <c:out
				value="${city}" /> with <c:out value="${person }" /> as your roommate, <c:out
				value="${hobby}" /> for a living. The next time you see a <c:out
				value="${livingThing}" />, you will have good luck. Also, <c:out
				value="${last}" />
		</span>
	</div>
	<a href="/omikuji">Go Back</a>
</body>
</html>