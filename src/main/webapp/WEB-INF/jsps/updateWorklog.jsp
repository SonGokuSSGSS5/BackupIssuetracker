<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="maroon">

<h1 align=center> Issue page to UPDATE Worklogs</h1>

<table border="2" align="center" cellspacing="10"  cellpadding="10">

	<tr>
		<th>IssueIds</th>
		<th>CategoryName</th>
		<th>Topic</th>
		<th>Description</th>
		<th>Status</th>
		<th>TimeStamp</th>
		
	</tr>

<c:forEach var="cr" items="${IssueList}">

	<tr>
			<th><a href="showIssuePage?cid=${cr.id}" >${cr.id }</a></th>
			
			<th>${cr.category }</th>
			
			<th>${cr.topic }</th>
			
			<th>${cr.description }</th>
			
			
			<c:choose>
    		<c:when test="${cr.status == 'Active' }">
        		<th bgcolor="#017709">${cr.status }</th>
    		</c:when>
    		<c:otherwise>
        		<th>${cr.status }</th>
    		</c:otherwise>
			</c:choose>
			
			
			
			
			<th>${cr.timestamp }</th>
			
			
		</tr>

</c:forEach>

</table>

</body>
</html>