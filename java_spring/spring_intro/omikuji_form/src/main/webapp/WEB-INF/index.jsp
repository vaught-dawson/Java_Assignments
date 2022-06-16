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
	<h1>Send an Omikuji!</h1>
	<div class="container">
		<form action="/omikuji/submit" method="post">
			<label for="years">Pick any number from 5 to 25.</label> <input
				type="number" name="years" /> <label for="city">Enter the
				name of any city.</label> <input type="text" name="city" /> <label
				for="person">Enter the name of any real person</label> <input
				type="text" name="person" /> <label for="hobby">Enter
				professional endeavor or hobby:</label> <input type="text" name="hobby" />
			<label for="livingThing">Enter any type of living thing.</label> <input
				type="text" name="livingThing" /> <label for="last">Say
				something nice to someone:</label>
			<textarea name="last"></textarea>
			<p>
				<em>Send and show a friend</em>
			</p>
			<button class="bg-primary">Send</button>
		</form>
	</div>
</body>
</html>