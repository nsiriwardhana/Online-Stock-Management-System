<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>deletecustomer</title>
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
	

	<%
		String cus_id = request.getParameter("cus_id");
		String cus_name= request.getParameter("cus_name");
		String cus_email= request.getParameter("cus_email");
		String cus_phone= request.getParameter("cus_phone");
		String cus_username= request.getParameter("cus_username");
		String cus_password= request.getParameter("cus_password");
	%>
	
	<h1>Delete Account</h1>
	
	<form action="DeleteCustomerServlet" method="post">
	<br>
		<b>Customer ID<input type="text" name="cus_id" value="<%= cus_id%>"readonly><br><br>
		Customer Name<input type="text" name="cus_name" value="<%= cus_name%>"readonly><br><br>
		Customer Email<input type="text" name="cus_email" value="<%= cus_email%>"readonly><br><br>
		Phone Number<input type="text" name="cus_phone" value="<%= cus_phone%>"readonly><br><br>
		UserName</b><input type="text" name="cus_username" value="<%= cus_username%>"readonly><br><br>
		
		
		<input type="submit" name="submit" class="bttn1" value="Delete Account">
		<input type="submit" name="submit" class="bttn1" value="Cancel">
	
	</form>
	
	

</body>
</html>