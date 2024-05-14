<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>deleteSupplier</title>
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
		String sID = request.getParameter("sID");
		String sName = request.getParameter("sName");
		
	%>
	
	<h1>Delete Supplier</h1>
	<form action="DeleteSupplierServlet" method="post">
		<b>Supplier ID <input type="text" name="sID" value="<%= sID%>"><br><br>
		Supplier Name</b> <input type="text" name="sName" value="<%= sName%>"><br><br>
				
		<input type="submit" name="submit" class="bttn1" value="Delete Supplier">
		<input type="submit" name="submit" class="bttn1" value="Cancel">
	
	</form>

</body>
</html>