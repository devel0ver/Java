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
        <h1>New Ninja</h1>
        <form:form action="/ninja/create" method="post" modelAttribute="ninja"> <!-- The model attribute represents which model to blind to -->
        <!-- The path="" must match the member variables from the Table Model class -->
            <form:errors style="color: rgba(204, 12, 12, 0.856);" path="firstName"/>
        <p>
            <form:label path="firstName">First Name: </form:label>
            <form:input type="text" path="firstName" class="form-control"/>
        </p>
            <form:errors style="color: rgba(204, 12, 12, 0.856);" path="LastName"/>
        <p>
            <form:label path="LastName">Last Name: </form:label>
            <form:input type="text" path="LastName" class="form-control"/>
        </p>
            <form:errors style="color: rgba(204, 12, 12, 0.856);" path="age"/>
        <p>
            <form:label path="age">Age: </form:label>
            <form:input type="number" path="age" class="form-control"/>
        </p>
        <form:errors style="color: rgba(204, 12, 12, 0.856);" path="dojo"/>
        <div>
            <form:label path="dojo">Dojo:</form:label>
            <form:select path="dojo" name="" id="" class="form-select">
                <c:forEach items='${ allDojos }' var='dojoObj'>
                    <option value="${dojoObj.id}">${dojoObj.name}</option>
                </c:forEach>
            </form:select>
        </div>
        <div class="d-flex justify-content-around mt-3">
            <input type="submit" value="Add Ninja" class="btn btn-primary"/>
            <a href="/dojos/new" class="btn btn-dark">Back</a>
        </div>
        </form:form> 
    </div>
</body>
</html>