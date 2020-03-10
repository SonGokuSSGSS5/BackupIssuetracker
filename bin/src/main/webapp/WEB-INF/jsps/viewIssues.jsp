<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body body bgcolor="cyan">
	<h1> This is a view Issue page for ${rep.category }</h1>
	
<table border="2" align="center" cellspacing="10"  cellpadding="10">

	<tr>
		<th>IssueId</th>
		<th>Topic</th>
		<th>Description</th>
		<th>Status</th>
		<th>askedBy</th>
		<th>TimeStamp</th>
		
	</tr>
	
<c:forEach var="i" items="${categoryList}">
	
	<tr>
		<th><a href="issueUpdatePage">${i.id}</a> </th>
		<th>${i.topic} </th>
		<th>${i.description} </th>
		<th>${i.status} </th>
		<th>${i.askedby} </th>
		<th>${i.timestamp} </th>
	
	
	</tr>
	
	


</c:forEach>

</table>	

	
</body>
</html>