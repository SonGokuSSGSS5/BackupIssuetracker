<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
  <link rel="stylesheet" href="/style4.css">
  <link href="https://fonts.googleapis.com/css?family=Ubuntu" rel="stylesheet">
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <link rel="stylesheet" href="path/to/font-awesome/css/font-awesome.min.css">
  <title>Sign in</title>
</head>

<body>
  <div class="main">
    <p class="sign" align="center">Category Representative Sign in</p>
   
    <c:if test="${flag==1 }">
		<h2>Invalid Username or Password</h2>
	</c:if>
    <f:form class="form1" method="post" action="loginrep" modelAttribute="login">
    
      <f:input class="un " path="userid" type="text" align="center" placeholder="Username"/><p><f:errors path="userid"/></p>
      
      <f:input class="pass" type="password" align="center" placeholder="Password" path="password"/><p><f:errors path="password"/></p>
      
      <input class="submit" align="center" type="submit" value="Sign in"><br><br><br>
      
      <a class="register" href="/RegisterCategory" align="center">Register</a>
    </f:form>      
                
    </div>
     
</body>

</html>