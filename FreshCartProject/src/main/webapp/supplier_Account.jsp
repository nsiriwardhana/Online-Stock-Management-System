<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Supplier</title>
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

	<c:forEach var = "sup" items = "${supDetails}">
	
	<c:set var="sName" value="${sup.sName}"/>
	<c:set var="sEmail" value="${sup.sEmail}"/>
	<c:set var="sAddress" value="${sup.sAddress}"/>
	<c:set var="sPhone" value="${sup.sPhone}"/>
	
	<tr>
		<td>Supplier Name</td>
		<td>${sup.sName}</td>
	</tr>
	<tr>
		<td>Supplier Email</td>
		<td>${sup.sEmail}</td>
	</tr>
	<tr>
		<td>Supplier Address</td>
		<td>${sup.sAddress}</td>
	</tr>
	<tr>
		<td>Supplier Phone Number</td>
		<td>${sup.sPhone}</td>
	</tr>
	
	</c:forEach>
	
	</table>
	
	<c:url value = "updateSupplier.jsp" var="supupdate">
	
		<c:param name="sName" value="${sName}"/>
		<c:param name="sEmail" value="${sEmail}"/>
		<c:param name="sAddress" value="${sAddress}"/>
		<c:param name="sPhone" value="${sPhone}"/>
		

	</c:url>
	
	<a href ="${supupdate}">
	<input type="button" name="update" class="bttn1" value="Update Supplier Data">
	</a>
	
	
	<c:url value="deleteSupplier.jsp" var="supDelete">
		<c:param name="sName" value="${sName}"/>
		<c:param name="sEmail" value="${sEmail}"/>
		<c:param name="sAddress" value="${sAddress}"/>
		<c:param name="sPhone" value="${sPhone}"/>
	</c:url>
	<a href ="${supDelete}">
	<input type="button" name="delete" class="bttn1" value="Delete Supplier">
	</a>

</body>
</html>