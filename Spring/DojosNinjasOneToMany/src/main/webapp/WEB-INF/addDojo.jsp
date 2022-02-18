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
<body style="background: linear-gradient(45deg,#3f3431c9,#4b4e3d93); height:100vh;">
    <div class="container">
        <h1>New Dojo</h1>
        <form:form action="/dojo/create" method="post" modelAttribute="dojo"> <!-- The model attribute represents which model to blind to -->
        <!-- The path="" must match the member variables from the Table Model class -->
            <form:errors style="color: rgba(204, 12, 12, 0.856);" path="name"/>
        <p>
            <form:label path="name">Name: </form:label>
            <form:input type="text" path="name" class="form-control"/>
        </p>
        <div class="d-flex justify-content-around">
            <input type="submit" value="Add Dojo" class="btn btn-primary"/>
            <a href="/ninja/new" class="btn btn-dark">Add Ninja</a>
        </div>
        </form:form> 
    </div>
</body>
</html>