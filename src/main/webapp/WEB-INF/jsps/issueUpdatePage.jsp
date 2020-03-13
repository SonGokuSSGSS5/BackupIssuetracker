<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
 
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
  <link rel="stylesheet" href="/styleRaiseIssue.css">
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
    <a class="py-2 d-none d-md-inline-block" href="viewIssues">Go to Homepage</a>
  </div>
</nav>

<div class="main">
<p class="sign" align="center">Update Issue</p>

	<c:set var="now" value="<%=new java.util.Date()%>" />
	
<f:form action="updateIssueStatus" method="post" modelAttribute="raiseissuebean">

<f:input class="un " path="id" readonly="true" placeholder="Id "/><br><br>
	
	
			<f:select path="category" class="un ">

			<option disabled selected value>Choose Category</option>
			<f:options items="${categoryList }" />
		</f:select>
		<br><br>
	
<f:input class="un " path="topic" readonly="true" placeholder="Topic "/><br><br>
	
			<f:hidden path="description"/>
			<f:hidden path="askedby"/>
			<f:select class="un " path="status">
  			 <f:option value="Active(viewed by Mod)" label="Active"/>
  			 <f:option value="Work in Progress" label="Work in Progress"/>
  			 <f:option value="Completed" label="Completed"/>
  		</f:select>
  		
  		<br><br>
  	<input class="raise" type="submit" value="Update Status">

</f:form>

</div>
</body>
</html>