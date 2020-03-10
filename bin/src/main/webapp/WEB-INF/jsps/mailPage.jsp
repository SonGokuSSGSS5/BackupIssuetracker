<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Contact Admin</title>


</head>
<body bgcolor="edcba">

	<div style="height: 50px; border =50px; background-color:"></div>


	<form:form action="sendMail" method="post" modelAttribute="mailForm">
	
Enter Name: <form:input path="Name" /><form:errors path="Name"></form:errors>
		<br>
		<br>
Enter EmailId: <form:input type="emailId" path="EmailId" /><form:errors path="EmailId"></form:errors>
		<br>
		<br>
		
Enter Issue: <form:input  path="subject" /><form:errors path="subject"></form:errors>
		<br>
		<br>
Enter Description: <form:input  path="content" /><form:errors path="content"></form:errors>
		<br>
		<br>
		

		<input type="submit" value="Send Mail" />
	</form:form>

	

</body>
</html>