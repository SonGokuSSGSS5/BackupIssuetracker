<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align=center> Issue id: ${issue.id }  &nbsp&nbsp&nbsp&nbsp Topic : ${issue.category }  &nbsp&nbsp&nbsp&nbsp Status : ${issue.status }</h1>
	
<br><br>

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
</body>
</html>