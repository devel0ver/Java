<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body style="background: linear-gradient(45deg,#29211fc9,#2e34aa93); height:100vh;">
    <div class="container" style="margin-top: 50px;">
        <div class="d-flex justify-content-around">
            <h1 style="color: #0c52bb;">Expense Details</h1>
            <a href="/expenses" class="btn btn-primary mt-2" style="height: 40px;">Go Back</a>
        </div>
    </div>
    <div class="container mt-3">
        <div class="m-auto p-2" style="width: 64%;">
            <h3>Expense Name: <span style="color: black;">${oneExpense.name}</span></h3>
            <h3>Expense Description: <span style="color: black;">${oneExpense.description}</span></h3>
            <h3>Vendor: <span style="color: black;">${oneExpense.vendor}</span></h3>
            <h3>Amount Spent: <span style="color: black;">${oneExpense.price}</span></h3>
        </div>
    </div>
</body>
</html>