<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Date</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
	<h1 class="time">
	<c:out value="${ now }"></c:out>
	</h1>
	
	<script type="text/javascript" src="/js/alert.js"></script>
	<script type="text/javascript">templateAlert("time")</script>
</body>
</html>