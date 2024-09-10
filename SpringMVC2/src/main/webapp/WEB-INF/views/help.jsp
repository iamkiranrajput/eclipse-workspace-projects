<%@page import="java.sql.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>help</title>
</head>
<body>

<%
	/* String name=(String) request.getAttribute("name");
	Integer roll=(Integer) request.getAttribute("rollnumber");
	String d= (String)request.getAttribute("date"); */
%>
			<h3>  <%-- <%=d %> --%></h3>
			<h1>my roll number is ${rollnumber} <%-- <%=roll %> --%></h1>
			<h2>Hello my name is ${name} <%-- <%=name %> --%></h2>
		<hr/>
		<c:forEach var="item" items="${marks}">
		<h1>${item}</h1>
		</c:forEach>
		
			
</body>
</html>