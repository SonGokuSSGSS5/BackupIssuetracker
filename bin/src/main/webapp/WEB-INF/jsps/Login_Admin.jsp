<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html lang="en">
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<link rel="stylesheet" href="/style1.css">
  <link href="https://fonts.googleapis.com/css?family=Ubuntu" rel="stylesheet">
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <link rel="stylesheet" href="path/to/font-awesome/css/font-awesome.min.css">

</head>
<title>Issue Tracker</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
<style>
body,h1,h2,h3,h4,h5 {font-family: "Raleway", sans-serif}
.w3-third img{margin-bottom: -6px; opacity: 0.8; cursor: pointer}
.w3-third img:hover{opacity: 1}
</style>
<body class="w3-black w3-content" style="max-width:1600px">

<nav class="site-header sticky-top py-1">
  <div class="container d-flex flex-column flex-md-row justify-content-between">
    <a class="py-2" href="#" aria-label="Product">
      <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2" class="d-block mx-auto" role="img" viewBox="0 0 24 24" focusable="false"><title>Product</title><circle cx="12" cy="12" r="10"/><path d="M14.31 8l5.74 9.94M9.69 8h11.48M7.38 12l5.74-9.94M9.69 16L3.95 6.06M14.31 16H2.83m13.79-4l-5.74 9.94"/></svg>
    </a>
    <a class="py-2 d-none d-md-inline-block" href="/">User</a>
    <a class="py-2 d-none d-md-inline-block" href="CategoryLogin">Category Rep</a>
    <a class="py-2 d-none d-md-inline-block" href="AdminLogin">Admin</a>
  </div>
</nav>





<!-- Top menu on small screens -->

<!-- Overlay effect when opening sidebar on small screens -->
<div class="w3-overlay w3-hide-large w3-animate-opacity" onclick="w3_close()" style="cursor:pointer" title="close side menu" id="myOverlay"></div>

<!-- !PAGE CONTENT! -->
<div class="w3-main" style="margin-left:0px">

  <!-- Push down content on small screens --> 
  <div class="w3-hide-large" style="margin-top:83px"></div>
  
  <!-- Contact section -->
  <div class="adminsign" id="adminsign">
  <br>
  <br>
  <br>
   <p class="sign" align="center">Admin Sign in</p>
    
  <c:if test="${flag==1 }">
		<h2>Invalid AdminId or Password</h2>
	</c:if>
    
    <f:form class="form1" method="post" action="loginadmin" modelAttribute="login">
      <f:input class="un " type="text" align="center" placeholder="Username" path="userid"/><br><f:errors class="error" path="userid" /><br><br>
      <f:input class="pass" type="password" align="center" placeholder="Password" path="password"/><br><f:errors class="error" path="password" /><br><br>
      <input class="submit" type="submit" value="Sign in"><br><br>
    </f:form> 
  </div>

  <!-- Footer -->
  

<!-- End page content -->
</div>



</body>
</html>