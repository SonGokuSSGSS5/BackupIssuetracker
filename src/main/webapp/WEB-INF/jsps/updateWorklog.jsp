<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<link rel="stylesheet" href="/TablePage.css">
  <link href="https://fonts.googleapis.com/css?family=Ubuntu" rel="stylesheet">
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <link rel="stylesheet" href="path/to/font-awesome/css/font-awesome.min.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<nav class="site-header sticky-top py-1">
  <div class="container d-flex flex-column flex-md-row justify-content-between">
    <a class="py-2" href="#" aria-label="Product">
      <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2" class="d-block mx-auto" role="img" viewBox="0 0 24 24" focusable="false"><title>Product</title><circle cx="12" cy="12" r="10"/><path d="M14.31 8l5.74 9.94M9.69 8h11.48M7.38 12l5.74-9.94M9.69 16L3.95 6.06M14.31 16H2.83m13.79-4l-5.74 9.94"/></svg>
    </a>
    <a class="py-2 d-none d-md-inline-block" href="viewIssues?rib=${rep.category}">View Issues </a>
    <a class="py-2 d-none d-md-inline-block" href="viewActiveIssues?rib=${rep.category}">View  Active Issues </a>
    <a class="py-2 d-none d-md-inline-block" href="updateWorklogIssues?rib=${rep.category}&uid=${rep.categoryrepid}">Update Issue Worklog </a>
    <a class="py-2 d-none d-md-inline-block" href="/CategoryLogin">Logout</a>
  </div>
</nav>


<div class="main">

<section>
  <!--for demo wrap-->
  <br>
  <h1>UPDATE Worklogs</h1>
  <div class="tbl-header">
    <table cellpadding="0" cellspacing="0" border="0">
      <thead>
        <tr>
		<th>IssueIds</th>
		<th>CategoryName</th>
		<th>Topic</th>
		<th>Description</th>
		<th>Status</th>
		<th>TimeStamp</th>
		</tr>
      </thead>
    </table>
  </div>
  <div class="tbl-content">
    <table cellpadding="0" cellspacing="0" border="1">
      <tbody>

<c:forEach var="cr" items="${IssueList}">

	<tr>
			<th><a href="showIssuePage?cid=${cr.id}" >${cr.id }</a></th>
			
			<th>${cr.category }</th>
			
			<th>${cr.topic }</th>
			
			<th>${cr.description }</th>
						
			
			<c:choose>
    		<c:when test="${cr.status == 'Active' }">
        		<th bgcolor="#adad13">${cr.status }</th>
    		</c:when>
    		<c:when test="${cr.status == 'Completed' }">
        		<th bgcolor="#017709">${cr.status }</th>
    		</c:when>
    		<c:when test="${cr.status == 'Work in Progress' }">
        		<th bgcolor="#db8427">${cr.status }</th>
    		</c:when>
    		<c:when test="${cr.status == 'Closed' }">
        		<th bgcolor="#204a1f">${cr.status }</th>
    		</c:when>
    		<c:otherwise>
        		<th>${cr.status }</th>
    		</c:otherwise>
			</c:choose>
			
			
			<th>${cr.timestamp }</th>
			
			
		</tr>

</c:forEach>
      </tbody>
    </table>
  </div>
</section>

</div>




</body>
</html>