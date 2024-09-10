<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success</title>
</head>
<body>

	<h3 class="text-center">${Header}</h3>
  		<p class="text-center">${Desc}</p>
  		<hr/>
  		
	<h2>your email address ${user.email}</h2>
	<h3>your password is ${user.password }</h3>
</body>
</html>