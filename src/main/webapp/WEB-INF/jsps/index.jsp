<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
  <link rel="stylesheet" href="/style1.css">
  <link href="https://fonts.googleapis.com/css?family=Ubuntu" rel="stylesheet">
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <link rel="stylesheet" href="path/to/font-awesome/css/font-awesome.min.css">
  <title>Sign in</title>
</head>

<body>
  <div class="main">
    <p class="sign" align="center">Sign in</p>
    
<c:if test="${flag==1 }">
<h2>Invalid Username or Password</h2>
</c:if>
    
    <f:form class="form1" method="post" action="login" modelAttribute="login">
      <f:input class="un " type="text" align="center" path="userid" placeholder="UserId"/><p><f:errors path="userid"/></p>
      
      <f:input class="pass" type="password" align="center" path="password" placeholder="Password"/><p><f:errors path="password"/></p>
      
      <input class="submit" type="submit" value="Sign in"><br><br><br>
      
      <a class="register" href="/RegisterUser" align="center">Register</a>
      
      <p class="forgot" align="center"><a href="/forgot">Forgot Password?</a></p>
      
      <p class="links" align="center"><a href="/SignAdmin">Sign in as Admin</a></p>
      
      <p class="links" align="center"><a href="/SignCategory">Sign in as Category Representative</a></p>
    </f:form>      
                
    </div>
     
</body>

</html>