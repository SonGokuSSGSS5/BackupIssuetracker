<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<link rel="stylesheet" href="IssuesPage.css">
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
    <a class="py-2 d-none d-md-inline-block" href="/#">Logout</a>
  </div>
</nav>

<div class="main">
<br>
<br>
<br>
<br>
<h1>Issue ID : ${issue.id } &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Topic :  ${issue.topic } &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Status :  ${issue.status }</h1>
<div class="card shadow1">
		  <h2>Name: ${issue.askedby }</h2>
		  <h5>${issue.timestamp}</h5>
		  <br>
		  <h4>${issue.description }</h4>
</div>


<h1>Solutions</h1>
<c:choose>
		<c:when test="${resolutionList == null}"> <p align="center"> Sorry!! No Resolutions Have Been Added to your Query Yet</p></c:when>
		<c:otherwise>


		<c:forEach var="cr" items="${resolutionList}">
		
		<div class="card shadow1">
		  <h2>Name: ${cr.repId }</h2>
		  <h5>${cr.timeStamp}</h5>
		  <br>
		  <h4>${cr.resolution }</h4>
		</div>

		</c:forEach>
		
		
		</c:otherwise>
</c:choose>

<div>

	<c:choose>
		<c:when test="${postCheck == null }"> Hi There :D !!</c:when>
		<c:otherwise>
			
			<h3>${postCheck}</h3>
			<c:set var="postCheck" scope = "request" value = "${null}"/>
		
		</c:otherwise>
	</c:choose>
	
	
</div>

<f:form action="addResolution?id=${issue.id }" method="post" modelAttribute="resolutionBean">

	<h3>Post your Resolution</h3> <br><br><f:textarea path="resolution" rows="20" cols="100"/><br><br>
	
	Authored By : ${rep.categoryrepid }<f:hidden path="repId" value="${rep.categoryrepid }"/><br><br>
	
	<input class="raise" type="submit" value="Submit Resolution"/>


</f:form>
<br>
<br>
<br>
<br>


</div>

	<%-- <h1 align=center> Issue id: ${issue.id }  &nbsp&nbsp&nbsp&nbsp Topic : ${issue.category }  &nbsp&nbsp&nbsp&nbsp Status : ${issue.status }</h1>
	
	

<table border="2" align="left" cellspacing="10"  cellpadding="10" width=100%>

	<tr>
		<th rowspan="2" width="200">Name: ${issue.askedby } <br><br> Asked On : ${issue.timestamp}</th>
		<th >Description <br><br><br> ${issue.description }</th>
	</tr>

	

	
</table>
<div>
	<br><br><br><br>
	<c:choose>
		<c:when test="${resolutionList == null}"> <p align="center"> Sorry!! No Resolutions Have Been Added to your Query Yet</p></c:when>
		<c:otherwise>
		
		<c:forEach var="cr" items="${resolutionList}">
				<table border="2" align="left" cellspacing="10"  cellpadding="10" width=100%>

						<tr>
							<th rowspan="2" width="200">Name: ${cr.repId } <br><br> Asked On : ${cr.timeStamp}</th>
							<th >Resolution <br><br><br> ${cr.resolution }</th>
						</tr>

	

	
			</table>
		</c:forEach>
		
		
		</c:otherwise>
	</c:choose>
</div>

<div>

	<c:choose>
		<c:when test="${postCheck == null }"> Hi There :D !!</c:when>
		<c:otherwise>
			
			<h3>${postCheck}</h3>
			<c:set var="postCheck" scope = "request" value = "${null}"/>
		
		</c:otherwise>
	</c:choose>
	
	
</div>


<f:form action="addResolution?id=${issue.id }" method="post" modelAttribute="resolutionBean">

	<h3>Post your Resolution</h3> <br><br><f:textarea path="resolution" rows="20" cols="100"/><br><br>
	
	Authored By : ${rep.categoryrepid }<f:hidden path="repId" value="${rep.categoryrepid }"/><br><br>
	
	<input type="submit" value="Submit Resolution"/>


</f:form>
--%>
</body> 
</html>