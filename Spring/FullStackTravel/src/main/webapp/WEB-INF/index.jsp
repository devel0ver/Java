<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
    <div class="container">
        <h1  style="color: #08083ade;">Save Travels</h1>
        <table class="table table-dark table-striped text-center">
            <thead>
                <tr>
                    <th style="border-right: 2px solid rgba(245, 245, 245, 0.452);" scope="col">Expense</th>
                    <th style="border-right: 2px solid rgba(245, 245, 245, 0.452);" scope="col">Vendor</th>
                    <th scope="col">Amount</th>
                    <th scope="col">Action</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items='${ allExpenses }' var='expenseObj'>
                    <tr>
                        <td style="border-right: 2px solid rgba(245, 245, 245, 0.452);"><a href="/expenses/${expenseObj.id}">${expenseObj.name}</a></td>
                        <td style="border-right: 2px solid rgba(245, 245, 245, 0.452);">${expenseObj.vendor}</td>
                        <td>${expenseObj.price}</td>
                        <td>
                            <a href="/expense/edit/${expenseObj.id}">Edit</a> || 
                            <a class="btn btn-danger btn-sm" href="/expense/delete/${expenseObj.id}">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <hr>
        <h1 style="color: #08083ade;">Add an expense:</h1>
        <form:form action="/expense/create" method="post" modelAttribute="expense"> <!-- The model attribute represents which model to blind to -->
        <!-- The path="" must match the member variables from the Table Model class -->
            <form:errors style="color: rgba(204, 12, 12, 0.856);" path="name"/>
        <p>
            <form:label path="name">Expense Name: </form:label>
            <form:input type="text" path="name" class="form-control"/>
        </p>
        <form:errors style="color: rgba(204, 12, 12, 0.856);" path="vendor"/>
        <p>
            <form:label path="vendor">Vendor:</form:label>
            <form:input type="text" path="vendor" class="form-control"/>
        </p>
        <form:errors style="color: rgba(204, 12, 12, 0.856);" path="price"/>
        <p>
            <form:label path="price">Amount: </form:label>
            <form:input type="number" step="0.01" path="price" class="form-control w-25"/>
        </p>
        <form:errors style="color: rgba(204, 12, 12, 0.856);" path="description"/>     
        <p>
            <form:label path="description">Description: </form:label>
            <form:textarea path="description" class="form-control"/>
        </p>    
        <input type="submit" value="Add Expense" class="btn btn-primary"/>
        </form:form> 
    </div>
</body>
</html>