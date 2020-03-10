<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Issue Update Page </h1>
	<c:set var="now" value="<%=new java.util.Date()%>" />
	
<f:form action="updateIssueStatus" method="post" modelAttribute="raiseissuebean">

	Id	<f:input path="id" readonly="true" placeholder="Id "/><br><br>
	
	
	Category	<f:input path="category" readonly="true" placeholder="Category "/><br><br>
	
	
	Topic	<f:input path="topic" readonly="true" placeholder="Topic "/><br><br>
	
			<f:hidden path="description"/>
			<f:hidden path="askedby"/>
	Status	<f:select path="status">
  			 <f:option value="Active(viewed by Mod)" label="Active"/>
  			 <f:option value="Work in Progress" label="Work in Progress"/>
  			 <f:option value="Completed" label="Completed"/>
  		</f:select>
  		
  		<br><br>
  	<input type="submit" value="Update Status">

</f:form>
</body>
</html>