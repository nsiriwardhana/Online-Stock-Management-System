<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>deleteproduct</title>
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
		String pID = request.getParameter("pID");
		String pName = request.getParameter("pName");
		
	%>
	
	<h1>Delete Product</h1>
	<form action="DeleteProductServlet" method="post">
		<b>Product ID <input type="text" name="pID" value="<%= pID%>"><br><br>
		Product Name </b><input type="text" name="pName" value="<%= pName%>"><br><br>
	
		
		<input type="submit" name="submit" class="bttn1" value="Delete Product">
		<input type="submit" name="submit" class="bttn1" value="Cancel">

	
	</form>

</body>
</html>