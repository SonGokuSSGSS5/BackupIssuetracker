<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
  <link rel="stylesheet" href="/styleRaiseIssue.css">
  <link href="https://fonts.googleapis.com/css?family=Ubuntu" rel="stylesheet">
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <link rel="stylesheet" href="path/to/font-awesome/css/font-awesome.min.css">
<title>Insert title here</title>
</head>
<body>

<nav class="site-header sticky-top py-1">
  <div class="container d-flex flex-column flex-md-row justify-content-between">
    <a class="py-2" href="#" aria-label="Product">
      <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2" class="d-block mx-auto" role="img" viewBox="0 0 24 24" focusable="false"><title>Product</title><circle cx="12" cy="12" r="10"/><path d="M14.31 8l5.74 9.94M9.69 8h11.48M7.38 12l5.74-9.94M9.69 16L3.95 6.06M14.31 16H2.83m13.79-4l-5.74 9.94"/></svg>
    </a>
    <a class="py-2 d-none d-md-inline-block" href="RaiseIssue">Raise Issue</a>
    <a class="py-2 d-none d-md-inline-block" href="ViewIssueHistory">View Issue History</a>
    <a class="py-2 d-none d-md-inline-block" href="#">Help</a>
    <a class="py-2 d-none d-md-inline-block" href="/#">Logout</a>
  </div>
</nav>

<div class="main">
<p class="sign" align="center">Raise Issue</p>
	<br>

	

	<f:form action="RaiseIssueSuccess" method="post"
		modelAttribute="RaiseIssueBean">

	<f:select path="category" class="un ">

			<option disabled selected value>Choose Category</option>
			<f:options items="${categoryList }" />
		</f:select>
<p><f:errors path="category"/></p>

<f:input class="un " path="topic" placeholder="Topic"/><p><f:errors path="topic"/></p>

<f:input class="un " path="description" placeholder="Issue"/><p><f:errors path="description"/></p>

<f:hidden path="askedby" value="${user }"/>

<input class="raise" type="submit" value="RaiseIssue">



	</f:form>
</div>
</body>
</html>