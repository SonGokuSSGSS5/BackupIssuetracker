<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
  <link rel="stylesheet" href="/styleRaiseIssue.css">
  <link href="https://fonts.googleapis.com/css?family=Ubuntu" rel="stylesheet">
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <link rel="stylesheet" href="path/to/font-awesome/css/font-awesome.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Contact Admin</title>


</head>
<body>

<nav class="site-header sticky-top py-1">
  <div class="container d-flex flex-column flex-md-row justify-content-between">
    <a class="py-2" href="#" aria-label="Product">
      <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2" class="d-block mx-auto" role="img" viewBox="0 0 24 24" focusable="false"><title>Product</title><circle cx="12" cy="12" r="10"/><path d="M14.31 8l5.74 9.94M9.69 8h11.48M7.38 12l5.74-9.94M9.69 16L3.95 6.06M14.31 16H2.83m13.79-4l-5.74 9.94"/></svg>
    </a>
    <a class="py-2 d-none d-md-inline-block" href="RaiseIssue">Raise Issue</a>
    <a class="py-2 d-none d-md-inline-block" href="ViewIssueHistory">View Issue History</a>
    <a class="py-2 d-none d-md-inline-block" href="help">Help</a>
    <a class="py-2 d-none d-md-inline-block" href="/#">Logout</a>
  </div>
</nav>

	<div class="main">

	<br>
	<p class="sign">Mail Admin</p>
	<form:form action="sendMail" method="post" modelAttribute="mailForm">
	
 <form:input path="Name" class="un " placeholder="Enter Name"/><p><form:errors path="Name"></form:errors></p>
	
 <form:input type="emailId" path="EmailId" class="un " placeholder="Enter EmailId"/><p><form:errors path="EmailId"></form:errors></p>

		
 <form:input  path="subject" class="un " placeholder="Enter Issue" /><p><form:errors path="subject"></form:errors></p>

 <form:input  path="content" class="un " placeholder="Enter Description" /><p><form:errors path="content"></form:errors></p>


		<input class="raise" type="submit" value="Send Mail" />
	</form:form>

	
</div>
</body>
</html>