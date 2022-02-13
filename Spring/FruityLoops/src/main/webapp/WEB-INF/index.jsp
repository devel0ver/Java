<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/style.css"/>
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<title>Fruits</title>
</head>
<body>
    <div class="container mt-5">
	    <div class="table-responsive table-size">
    		<h1 class="mb-4 text-color">Fruit Store</h1>
	        <table class="table size">
	            <thead>
	                <tr>
	                    <th>Name</th>
	                    <th>Price</th>
	                </tr>
	            </thead>
	            <tbody>
	            	<c:forEach var="item" items="${items}">
		                <tr>
		                    <td><c:out value="${item.name}"/></td>
		                    <td><c:out value="${item.price}"/></td>
		                </tr>
	                </c:forEach>
	            </tbody>
	        </table>
	    </div>
    </div>
</body>
</html>