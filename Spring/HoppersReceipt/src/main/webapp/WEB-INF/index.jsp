<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
	<div class = "mt-5 ms-3">
		<h1>Customer Name: <c:out value="${name}"/></h1>
		<p>Item name: <c:out value="${item}"/></p>
		<p>Price: <c:out value="${price}"/></p>
		<p>Description: <c:out value="${description}"/></p>
		<p>Vendor: <c:out value="${vendor}"/></p>
	</div>
</body>
</html>