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
<body>
    <div class="container mt-4">
        <h1 style="color: blue;">Welcome!</h1>
        <h4 class="pb-3">Join our growing community.</h4>
        <div class="row">
            <div class="col">
                <h3>Register</h3>
                <form:form action="/register" method="post" modelAttribute="newUser">
                    <form:errors path="userName" class="text-danger"/>
                <div>
                    <form:label path="userName">User Name:</form:label>
                    <form:input path="userName" type="text" class="form-control"/>
                </div>  
                <form:errors path="email" class="text-danger"/>
                <div>
                    <form:label path="email">Email:</form:label>
                    <form:input path="email" type="email" class="form-control"/>
                </div>  
                <form:errors path="password" class="text-danger"/>
                <div>
                    <form:label path="password">Password:</form:label>
                    <form:input path="password" type="password" class="form-control"/>
                </div>  
                <form:errors path="confirm" class="text-danger"/>
                <div>
                    <form:label path="confirm">Confirm Password:</form:label>
                    <form:input path="confirm" type="password" class="form-control"/>
                </div>  
                <input type="submit" value="Submit" class="btn btn-success mt-3 float-end"/>
                </form:form> 
            </div>
            <div class="col">
                <h3>Login</h3>
                <form:form action="login" method="post" modelAttribute="newLogin">
                    <form:errors path="email" class="text-danger"/>
                <div>
                    <form:label path="email">Email:</form:label>
                    <form:input path="email" type="email" class="form-control"/>
                </div>  
                <form:errors path="password" class="text-danger"/>
                <div>
                    <form:label path="password">Password:</form:label>
                    <form:input path="password" type="password" class="form-control"/>
                </div>
                <input type="submit" value="Submit" class="btn btn-success mt-3 float-end"/>
                </form:form> 
            </div>
        </div>
    </div>
</body>
</html>