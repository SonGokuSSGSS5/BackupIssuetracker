<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
<div class="row">
  
</div>
<div class="main">
    <p class="sign" align="center">Register</p>
    
    <form:form class="form1" action="success" method="post" modelAttribute="userregister">
    
      <form:input class="un " type="text" align="center" path="firstname" placeholder="FirstName"/><p><form:errors path="firstname"/></p>
      
      <form:input class="un " type="text" align="center" path="lastname"  placeholder="LastName"/><p><form:errors path="lastname"/></p>
      
      <form:input class="un " type="date" align="center" path="dob" placeholder="DOB"/><br><p><form:errors path="dob"/></p>
      
      &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<form:radiobutton path="gender" id="male" name="gender" value="male"/>
	  <label for="male" style="color:white;">Male</label>
	  <form:radiobutton path="gender" id="female" name="gender" value="female"/>
	  <label for="female" style="color:white;">Female</label><p><form:errors path="gender"/></p>
	  
      <form:input  path="contactno" class="un " type="text" align="center" placeholder="ContactNo"/><p><form:errors path="contactno"/></p>
      
      <form:input  path="userid" class="un " type="text" align="center" placeholder="Username"/><p><form:errors path="userid"/></p>
      
      <form:input path="password" class="pass" type="password" align="center" placeholder="Password"/><p><form:errors path="password"/></p>
      
      <form:select class="un " path="squestion1" name="q1">
      <option disabled selected value>Question 1</option>
	  <form:option value="Name of your First Pet?">Name of your First Pet?</form:option>
	  <form:option value="Name of the first Movie you watched?">Name of the first Movie you watched?</form:option>
	  <form:option value="What is your mother's maiden name?">What is your mother's maiden name?</form:option>
	  <form:option value="What is the name of the town where you were born?">What is the name of the town where you were born?</form:option>
	  </form:select>
	  <p><form:errors path="squestion1"/></p>

	  <form:input class="un " path="sanswer1"  type="text" align="center" placeholder="Answer 1"/><p><form:errors path="sanswer1"/></p>
	  
	  <form:select class="un " path="squestion2" name="q2">
	  <option disabled selected value>Question 2</option>
	  <form:option value="Name of your First Pet?">Name of your First Pet?</form:option>
	  <form:option value="Name of the first Movie you watched?">Name of the first Movie you watched?</form:option>
	  <form:option value="What is your mother's maiden name?">What is your mother's maiden name?</form:option>
	  <form:option value="What is the name of the town where you were born?">What is the name of the town where you were born?</form:option>
	  </form:select>
	  <p><form:errors path="squestion2"/></p>

	  <form:input class="un " path="sanswer2" type="text" align="center" placeholder="Answer 2"/><p><form:errors path="sanswer2"/></p>
	  
	  <form:select class="un " path="squestion3" name="q3">
	  <option disabled selected value>Question 3</option>
	  <form:option value="Name of your First Pet?">Name of your First Pet?</form:option>
	  <form:option value="Name of the first Movie you watched?">Name of the first Movie you watched?</form:option>
	  <form:option value="What is your mother's maiden name?">What is your mother's maiden name?</form:option>
	  <form:option value="What is the name of the town where you were born?">What is the name of the town where you were born?</form:option>
	  </form:select>
	  <p><form:errors path="squestion3"/></p>

	  
	  <form:input class="un " path="sanswer3" type="text" align="center" placeholder="Answer 3"/><p><form:errors path="sanswer3"/></p>
	  <br>
	  <input type="submit" class="submit" align="center" value="Register">
	  <br>
	  <br>
	  <br>
    </form:form>      
                
    </div>
</body>
</html>