<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>CategoryRepresentative Login Success!!! Welcome ${rep.categoryrepid} you belong to ${rep.category }</h1>


<h2><a href="viewIssues?rib=${rep.category}">View Issues </a></h2><br><br>

<h2><a href="viewActiveIssues?rib=${rep.category}">View  Active Issues </a></h2>


</body>
</html>