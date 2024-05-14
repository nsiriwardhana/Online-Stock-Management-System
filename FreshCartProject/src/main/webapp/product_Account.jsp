<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product</title>
<meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewreport"content="width=device-width, initial-scale=1.0">
     

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
	<table>


	<c:forEach var = "product" items = "${proDetails}">
	
	<c:set var="pName" value="${product.pName}"/>
	<c:set var="pPrice" value="${product.pPrice}"/>
	<c:set var="pQty" value="${product.pQty}"/>
	
	<tr>
		<td>Product Name</td>
		<td>${product.pName}</td>
	</tr>
	<tr>
		<td>Product Price</td>
		<td>${product.pPrice}</td>
	</tr>
	<tr>
		<td>Product Quantity</td>
		<td>${product.pQty}</td>
	</tr>
	
	
	
	</c:forEach>
	
	</table>
	
	<c:url value = "updateProduct.jsp" var="productupdate">
	
		<c:param name="pName" value="${pName}"/>
		<c:param name="pPrice" value="${pPrice}"/>
		<c:param name="pQty" value="${pQty}"/>
		
	</c:url>
	
	<a href ="${productupdate}">
	<input type="button" name="update" class="bttn1" value="Update Product Details">
	</a>
	
	<c:url value="deleteProduct.jsp" var="proDelete">
		<c:param name="pName" value="${pName}"/>
		<c:param name="pPrice" value="${pPrice}"/>
		<c:param name="pQty" value="${pQty}"/>
	</c:url>
	<a href ="${proDelete}">
	<input type="button" name="delete" class="bttn1" value="Delete Product">
	</a>
	

</body>
</html>