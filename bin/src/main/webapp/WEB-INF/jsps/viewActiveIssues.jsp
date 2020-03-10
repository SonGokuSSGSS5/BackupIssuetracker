<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
<h1> This is a view Active Issue page for ${rep.category }</h1>
	
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
		<th>${i.id}</th>
		<th>${i.topic} </th>
		<th>${i.description} </th>
		<th><a href="issueUpdatePage?id=${i.id }">${i.status} (Click to Update) </a> </th>
		<th>${i.askedby} </th>
		<th>${i.timestamp} </th>
	
	
	</tr>
	
	


</c:forEach>

</table>	
</body>
</html>