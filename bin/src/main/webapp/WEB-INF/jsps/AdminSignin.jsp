<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>        

<!DOCTYPE html>
<html>
<head>
  <link rel="stylesheet" href="/style3.css">
  <link href="https://fonts.googleapis.com/css?family=Ubuntu" rel="stylesheet">
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <link rel="stylesheet" href="path/to/font-awesome/css/font-awesome.min.css">
  <title>Sign in</title>
</head>

<body>
  <div class="main">
    <p class="sign" align="center">Admin Sign in</p>
    
  <c:if test="${flag==1 }">
		<h2>Invalid AdminId or Password</h2>
	</c:if>
    
    <f:form class="form1" method="post" action="loginadmin" modelAttribute="login">
      <f:input class="un " type="text" align="center" placeholder="Username" path="userid"/><p><f:errors path="userid" /></p>
      <f:input class="pass" type="password" align="center" placeholder="Password" path="password"/><p><f:errors path="password" /></p>
      <input class="submit" type="submit" value="Sign in"><br><br>
    </f:form>      
                
    </div>
     
</body>

</html>