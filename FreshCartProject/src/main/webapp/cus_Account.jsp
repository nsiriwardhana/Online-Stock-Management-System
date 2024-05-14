<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
 
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewreport"content="width=device-width, initial-scale=1.0">
        <title>customeraccount</title>

        <style>
        .card{
          border-width: 5px;
          border-color: black;
          object-fit:contain;
          display:flex;
          
        }
       
        
        .row{
         dispaly:flex;
        }
        
      </style>
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
        
        
        
        <div class="row">
        
        <div class="col-md-4 mb-2" style="width: 18rem;">
     		 <div class="card" >
      			<img src="image/image1.jpeg" class="card-img-top" alt="shoes">
     			 <div class="card-body">
        		<h5 class="card-title">Women Shoes</h5>
		        <p class="card-text">Rs.1500</p>
		        <a href="#" class="btn btn-info">Add to cart</a>
		        <a href="cus_payment.jsp" class="btn btn-secondary">Buy Now</a>
		      </div>
      	</div>
      </div>

   		<div class="col-md-4 mb-2" style="width: 18rem;">
     		 <div class="card" >
      			<img src="image/doll.jpg" class="card-img-top" alt="doll">
     			 <div class="card-body">
        		<h5 class="card-title">Barbie Doll</h5>
		        <p class="card-text">Rs.500</p>
		        <a href="#" class="btn btn-info">Add to cart</a>
		        <a href="cus_payment.jsp" class="btn btn-secondary">Buy Now</a>
		      </div>
      	</div>
      </div>
   		
   		<div class="col-md-4 mb-2" style="width: 18rem;">
     		 <div class="card" >
      			<img src="image/kettle.jpg" class="card-img-top" alt="kettle">
     			 <div class="card-body">
        		<h5 class="card-title">Kettle</h5>
		        <p class="card-text">Rs.2500</p>
		        <a href="#" class="btn btn-info">Add to cart</a>
		        <a href="cus_payment.jsp" class="btn btn-secondary">Buy Now</a>
		      </div>
      	</div>
      </div>
      
      <div class="col-md-4 mb-2" style="width: 18rem;">
     		 <div class="card" >
      			<img src="image/bottle.jpg" class="card-img-top" alt="bottle">
     			 <div class="card-body">
        		<h5 class="card-title">Water Bottle</h5>
		        <p class="card-text">Rs.600</p>
		        <a href="#" class="btn btn-info">Add to cart</a>
		        <a href="cus_payment.jsp" class="btn btn-secondary">Buy Now</a>
		      </div>
      	</div>
      </div>
      
      <div class="col-md-4 mb-2" style="width: 18rem;">
     		 <div class="card" >
      			<img src="image/earing.jpeg" class="card-img-top" alt="earing">
     			 <div class="card-body">
        		<h5 class="card-title">Earings</h5>
		        <p class="card-text">Rs.760</p>
		        <a href="#" class="btn btn-info">Add to cart</a>
		        <a href="cus_payment.jsp" class="btn btn-secondary">Buy Now</a>
		      </div>
      	</div>
      </div>
      
      <div class="col-md-4 mb-2" style="width: 18rem;">
     		 <div class="card" >
      			<img src="image/necklace.jpg" class="card-img-top" alt="necklace">
     			 <div class="card-body">
        		<h5 class="card-title">Necklace</h5>
		        <p class="card-text">Rs.1590</p>
		        <a href="#" class="btn btn-info">Add to cart</a>
		        <a href="cus_payment.jsp" class="btn btn-secondary">Buy Now</a>
		      </div>
      	</div>
      </div>
      
      <div class="col-md-4 mb-2" style="width: 18rem;">
     		 <div class="card" >
      			<img src="image/bottle.jpg" class="card-img-top" alt="bottle">
     			 <div class="card-body">
        		<h5 class="card-title">Water Bottle</h5>
		        <p class="card-text">Rs.600</p>
		        <a href="#" class="btn btn-info">Add to cart</a>
		        <a href="cus_payment.jsp" class="btn btn-secondary">Buy Now</a>
		      </div>
      	</div>
      </div>
      
      <div class="col-md-4 mb-2" style="width: 18rem;">
     		 <div class="card" >
      			<img src="image/doll.jpg" class="card-img-top" alt="doll">
     			 <div class="card-body">
        		<h5 class="card-title">Barbie Doll</h5>
		        <p class="card-text">Rs.500</p>
		        <a href="#" class="btn btn-info">Add to cart</a>
		        <a href="cus_payment.jsp" class="btn btn-secondary">Buy Now</a>
		      </div>
      	</div>
      </div>
      
      
      </div>
        
        
<table>
	<c:forEach var = "cus" items = "${cusDetails}">
	
	<c:set var="cus_id" value="${cus.cus_id}"/>
	<c:set var="cus_name" value="${cus.cus_name}"/>
	<c:set var="cus_email" value="${cus.cus_email}"/>
	<c:set var="cus_phone" value="${cus.cus_phone}"/>
	<c:set var="cus_username" value="${cus.cus_username}"/>
	<c:set var="cus_password" value="${cus.cus_password}"/>
	
	<tr>
		<td>Customer ID</td>
		<td>${cus.cus_id}</td>
	</tr>
	<tr>
		<td>Customer Name</td>
		<td>${cus.cus_name}</td>
	</tr>
	<tr>
		<td>Customer Email</td>
		<td>${cus.cus_email}</td>
	</tr>
	<tr>
		<td>Customer Phone Number</td>
		<td>${cus.cus_phone}</td>
	</tr>
	<tr>
		<td>Customer User name</td>
		<td>${cus.cus_username}</td>
	</tr>
	<tr>
		<td>Customer Password</td>
		<td>${cus.cus_password}</td>
	</tr>
	
	
	</c:forEach>
</table>

	<c:url value = "updateCustomer.jsp" var="cusupdate">
		<c:param name="cus_id" value="${cus_id}"/>
		<c:param name="cus_name" value="${cus_name}"/>
		<c:param name="cus_email" value="${cus_email}"/>
		<c:param name="cus_phone" value="${cus_phone}"/>
		<c:param name="cus_username" value="${cus_username}"/>
		<c:param name="cus_password" value="${cus_password}"/>
	</c:url>
	
	<a href ="${cusupdate}">
	<input type="button" name="update" class="bttn1" value="Update My Data">
	</a>
	
	<c:url value="deleteCustomer.jsp" var="cusDelete">
		<c:param name="cus_id" value="${cus_id}"/>
		<c:param name="cus_name" value="${cus_name}"/>
		<c:param name="cus_email" value="${cus_email}"/>
		<c:param name="cus_phone" value="${cus_phone}"/>
		<c:param name="cus_username" value="${cus_username}"/>
		<c:param name="cus_password" value="${cus_password}"/>
	</c:url>
	<a href ="${cusDelete}">
	<input type="button" name="delete" class="bttn1" value="Delete Account">
	</a>
	
</body>
</html>