<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ page isErrorPage="true" %> 
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
        <h1>Edit Expense below: </h1>
        <form:form action="/expense/update/${expenseToEdit.id}" method="post" modelAttribute="expenseToEdit">
            <input type="hidden" name="_method" value="put">
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
            <div class="d-flex justify-content-between">
                <input type="submit" value="Edit" class="btn btn-success pe-3 ps-3"/>
                <a href="/expenses" class="btn btn-primary">Home</a>
            </div>
        </form:form> 
    </div>
</body>
</html>