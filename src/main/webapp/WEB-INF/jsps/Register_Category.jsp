<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
  <link rel="stylesheet" href="/style2.css">
  <link href="https://fonts.googleapis.com/css?family=Ubuntu" rel="stylesheet">
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <link rel="stylesheet" href="path/to/font-awesome/css/font-awesome.min.css">
  <title>Register</title>
</head>
<body>
<div class="main">
    <p class="sign" align="center">Register</p>
    <f:form class="form1" action="registerCategoryRep" method="post" modelAttribute="categoryRep">
    
      <f:input class="un " type="text" path="firstname" align="center" placeholder="FirstName"/><p><f:errors path="firstname"/></p>
      
      <f:input class="un " type="text" path="lastname" align="center" placeholder="LastName"/><p><f:errors path="lastname"/></p>
      
      <f:input class="un " type="date" path="dob" align="center" placeholder="DOB"/><br><p><f:errors path="dob"/></p>
      
      &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<f:radiobutton path="gender"  id="male" name="gender" value="male"/>
	  <label for="male" style="color:white;">Male</label>
	  <f:radiobutton path="gender" id="female" name="gender" value="female"/>
	  <label for="female" style="color:white;">Female</label><p><f:errors path="gender"/></p><br>
	  
      <f:input class="un " path="contactno" type="text" align="center" placeholder="ContactNo"/><p><f:errors path="contactno"/></p>
      
      <f:input class="un " path="categoryrepid" type="text" align="center" placeholder="CategoryRep_id"/><p><f:errors path="categoryrepid"/></p>
      
      <f:select class="un "  path="category" align="center">
      <f:options items="${CategoryName }"></f:options> 
      </f:select>
      <p><f:errors path="category"/></p>
      
      <f:input class="pass" path="password" type="password" align="center" placeholder="Password"/><p><f:errors path="password"/></p>
      
	  <input type="submit" class="submit" value="Register">
	  <br>
	  <br>
	  <br>
    </f:form>      
                
    </div>
</body>
</html>