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
<body style="background: linear-gradient(90deg,#5f6569,#506466); height:100vh;">
    <div class="container p-5">
        <div class="d-flex justify-content-between">
            <h1>Change your Entry</h1>
            <a href="/books" class="btn btn-secondary mt-2" style="height: 40px;">Back to shelves</a>
        </div>
        <form:form action="/books/${book.id}/update" method="post" modelAttribute="book">
            <form:errors path="title" class="text-danger"/>
            <div>
                <form:label path="title">Title:</form:label>
                <form:input path="title" type="text" class="form-control"/>
            </div>  
            <form:errors path="author" class="text-danger"/>
            <div>
                <form:label path="author">Author:</form:label>
                <form:input path="author" type="text" class="form-control"/>
            </div>
            <form:errors path="thoughts" class="text-danger"/>
            <div>
                <form:label path="thoughts">My thoughts:</form:label>
                <form:textarea path="thoughts" rows="5" class="form-control"></form:textarea>
            </div>
            <form:input path="user" type="hidden" value="${book.id}"/>
            <input type="submit" value="Submit" class="btn btn-success mt-3 float-end"/>
        </form:form>
    </div>
</body>
</html>