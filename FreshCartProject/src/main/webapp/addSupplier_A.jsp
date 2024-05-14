<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Supplier</title>
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
	<h1>Add a New Supplier</h1>
	<form action="addSupplierServlet" method="post">
		
		<b>Supplier ID <input type="text" name="sId"><br><br>
		Supplier Name <input type="text" name="sName"><br><br>
		Supplier Email <input type="text" name="sEmail"><br><br>
		Supplier Address <input type="text" name="sAddress"><br><br>
		Supplier PhoneNo. </b><input type="text" name="sPhone"><br><br>
		
		<input type="submit" name="submit" class="bttn1" value="Add Supplier">
		<input type="submit" name="submit" class="bttn1" value="Cancel">
	</form> 
</body>
</html>