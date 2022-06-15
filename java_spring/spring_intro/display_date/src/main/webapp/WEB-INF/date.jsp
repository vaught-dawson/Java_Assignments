<%@page import="java.time.LocalDateTime"%>
<%@page import="java.time.LocalDate"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.Calendar"%>
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
	<h1 class="date"><%= LocalDateTime.now().getDayOfWeek() %>, the <%= LocalDateTime.now().getDayOfMonth() %> of <%= LocalDateTime.now().getMonth() %>, <%= LocalDateTime.now().getYear() %></h1>
	<script type="text/javascript" src="/js/alert.js"></script>
	<script type="text/javascript">templateAlert("date")</script>
</body>
</html>