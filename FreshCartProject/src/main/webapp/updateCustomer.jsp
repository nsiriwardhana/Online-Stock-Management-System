<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Customer</title>
<style>


	body{
		background-color: #D1FFBD;
		text-align: center;
	}
	#test{
		border-top: 3px solid black;
	}
	.bttn1{
		  margin: 8px 4px 4px 4px;
		  width: 20%;
		  height: 30px;
		  background-color: #06680D;
		  font-size: 15px;
		  font-weight: bold;
		  color: white;
	}
	
</style>

	<!-- css file -->
        <link rel="stylesheet" href="style.css">

</head>

<body>
<h1>SMS WAREHOUSE</h1> 
        <hr id="test"/>
        <br><br>
	<h2>Update My Profile</h2>
	
	<%
		String cus_id = request.getParameter("cus_id");
		String cus_name= request.getParameter("cus_name");
		String cus_email= request.getParameter("cus_email");
		String cus_phone= request.getParameter("cus_phone");
		String cus_username= request.getParameter("cus_username");
		String cus_password= request.getParameter("cus_password");
	%>
	
	
	<form action="UpdateCustomerServlet" method="post">
	<br>
		<b>Customer ID<input type="text" name="cus_id" value="<%= cus_id%>"readonly><br><br>
		Customer Name<input type="text" name="cus_name" value="<%= cus_name%>"><br><br>
		Customer Email<input type="text" name="cus_email" value="<%= cus_email%>"><br><br>
		Phone Number<input type="text" name="cus_phone" value="<%= cus_phone%>"><br><br>
		UserName<input type="text" name="cus_username" value="<%= cus_username%>"><br><br>
		Password</b><input type="password" name="cus_password" value="<%= cus_password%>"><br><br>
		
		<input type="submit" name="submit" class="bttn1" value="Update My Data">
		<input type="submit" name="submit" class="bttn1" value="Cancel">
	
	</form>
	

</body>
</html>