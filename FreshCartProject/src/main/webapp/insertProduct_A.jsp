<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Products</title>
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
	<h1>Insert Product</h1>
	
	<form action="insertProductServlet" method="post">
		<br>
		<b>Product ID <input type="text" name="pId" ><br><br>
		Product Name <input type="text" name="pName"><br><br>
		Product Price <input type="text" name="pPrice"><br><br>
		Product Quantity</b> <input type="text" name="pQty"><br><br>
		
		<input type="submit" name="submit" class="bttn1" value="Insert Product">
		<input type="submit" name="submit" class="bttn1" value="Cancel">
	</form>
	
</body>
</html>