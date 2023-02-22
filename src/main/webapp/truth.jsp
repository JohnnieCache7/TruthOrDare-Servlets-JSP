<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Truth</title>
</head>
<body>
	
	<p> ${usersTruthOrDare.getChoice()} was your choice: <br /> <br/>
		${usersTruthOrDare.getTruth()} <br/> 
	</p>
	
	<form action="truthDareServlet" method="get">
	Click button for a message!
	<input type="submit" value="Thanks" /> <br/> </br> </br>
	</form>
	<a href="index.jsp">Back to Main Menu</a>

</body>
</html>