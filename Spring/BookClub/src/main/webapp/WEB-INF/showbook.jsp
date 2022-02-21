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
<body style="background: linear-gradient(90deg,#5f6569,#506466); height:100vh;">
    <div class="container p-5">
        <div class="d-flex justify-content-between">
            <h1>${book.title}</h1>
            <a href="/books" class="btn btn-secondary mt-2" style="height: 40px;">Back to shelves</a>
        </div>
        <div class="mt-5">
            <c:if test='${book.user.id == user.id}'>
            <h3><span style="color: rgb(160, 0, 0);">You</span> read <span style="color: blue">${book.title}</span> by <span style="color: rgb(0, 83, 0)">${book.author}</span>.</h3>
            <h3 class="mt-3">Here are your thoughts:</h3>
            </c:if>
            <c:if test='${book.user.id != user.id}'>
            <h3><span style="color: rgb(160, 0, 0);">${book.user.name}</span> read <span style="color: blue">${book.title}</span> by <span style="color: rgb(0, 83, 0)">${book.author}</span>.</h3>
            <h3 class="mt-3">Here are ${book.user.name}'s thoughts:</h3>
            </c:if>
        </div>
        <div class="p-5">
            <hr class="mb-5 text-light">
            <h5>${book.thoughts}</h5>
            <hr class="mt-5 text-light">
            <c:if test='${book.user.id == user.id}'>
                <a href="/books/${book.id}/edit" class="btn btn-warning float-end mt-3">Edit</a>
            </c:if>
        </div>
    </div>
</body>
</html>