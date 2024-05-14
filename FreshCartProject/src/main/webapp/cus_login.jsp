<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Login</title>

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
        <br>
	

	
	<div class="box">
            <form action="cus_loginServlet" method="post">
                <h1>Login as Customer</h1>
                <b>User Name <input type="text" name="cus_uid"><br><br>
				Password </b> <input type="password" name="cus_pass"><br><br>
                <input type="submit" name="submit" value="Login" class="bttn1">
            </form>
        </div>
	
</body>
</html>