<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Payment</title>

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
        
	<h1>Payment</h1>
	<form action="cus_paymentServlet" method="post">
		
		<b>Amount <input type="text" name="cAmount"><br><br>
		Card holder's name <input type="text" name="cName"><br><br>
		Card number</b> <input type="text" name="cNum"><br><br><br>
		
		<input type="submit" class="bttn1" name="submit" value="Payment">
		<input type="submit" name="submit" class="bttn1" value="Cancel">
	</form>
</body>
</html>