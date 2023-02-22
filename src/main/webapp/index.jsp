<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Truth or Dare Game</title>
</head>
<body>
	<h1> Truth or Dare</h1>
		<form action="truthDareServlet" method="post">
			Enter Truth or Dare: 
		 	<input type="text" name="userPick" size="10"> 
			<input type="submit" value="SUBMIT" />
		</form>
</body>
</html>