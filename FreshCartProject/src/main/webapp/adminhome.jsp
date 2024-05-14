<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AdminHomeview</title>
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
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <link rel="stylesheet" href="style.css">

</head>
<body>
 <h1>SMS WAREHOUSE</h1>
        
        <hr>
        
        <ul class="menu">
            <li id="menubar"><a href="#">Home</a></li>
            <li id="menubar"><a href="#">News</a></li>
            <li id="menubar"><a href="#">Contact</a></li>
            <li id="menubar"><a href="#">About Us</a></li>
             <li id="menubar" style="float:right;"><a class="HomeLogin" href="home.jsp">Logout</a></li>
        </ul>
        <br>
        
        <div class="button text-center">
                        <button class="bttn1"><a href="insertProduct_A.jsp" class="nav-link text-light bg-info my-1">Insert Products</a></button>
                        <button class="bttn1"><a href="product_Account.jsp" class="nav-link text-light bg-info my-1">View Products</a></button>
                        <button class="bttn1"><a href="addSupplier_A.jsp" class="nav-link text-light bg-info my-1">Add New Supplier</a></button>
                        <button class="bttn1"><a href="supplier_Account.jsp" class="nav-link text-light bg-info my-1">View Suppliers</a></button><br><br>
                        <button class="bttn1"><a href="#" class="nav-link text-light bg-info my-1">All Orders</a></button>
                        <button class="bttn1"><a href="#" class="nav-link text-light bg-info my-1">All payments</a></button>
                       
         </div>
        
</body>
</html>