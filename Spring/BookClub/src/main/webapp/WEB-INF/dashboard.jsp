<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
        crossorigin="anonymous">
    <title>Insert title here</title>
</head>

<body style="background: linear-gradient(90deg,#7a848b,#2C3E50); height:100vh;">
    <div class="container p-5">
        <div class="d-flex justify-content-between">
            <h1>Welcome, ${loggedInUser.name}</h1>
            <a href="/logout" class="btn btn-danger mt-2" style="height: 40px;">logout</a>
        </div>
        <div class="d-flex justify-content-between mt-3">
            <h5>Books from everyone's shelves:</h5>
            <a href="/books/new" class="btn btn-primary mt-2" style="height: 40px;">Add to my shelf</a>
        </div>
        <table class="table table-dark mt-3">
            <h5 class="mt-3">Available books to borrow</h5>
            <thead>
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Title</th>
                    <th scope="col">Author Name</th>
                    <th scope="col">Posted By</th>
                    <th scope="col">Actions</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items='${ allBooks }' var='book'>
                    <c:if test='${book.currentBorrower.id != loggedInUser.id}'>
                    <tr>
                        <th scope="row">${book.id}</th>
                        <td><a href="/books/${book.id}">${book.title}</a></td>
                        <td>${book.author}</td>
                        <td>${book.user.name}</td>
                        <c:if test='${book.user.id == loggedInUser.id}'>
                            <td>
                                <a href="/books/${book.id}/edit">Edit</a> ||
                                <a href="/books/${book.id}/delete">Delete</a>
                            </td>
                        </c:if>
                        <c:if test='${book.user.id != loggedInUser.id}'>
                            <td>
                                <a href="/books/${book.id}/borrow" class="ms-3">Borrow</a>
                            </td>
                        </c:if>
                    </tr>
                    </c:if>
                </c:forEach>
            </tbody>
        </table>
        <table class="table table-dark mt-3">
            <h5 class="mt-5">Books I'm Borrowing</h5>
            <thead>
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Title</th>
                    <th scope="col">Author Name</th>
                    <th scope="col">Posted By</th>
                    <th scope="col">Actions</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items='${ allBooks }' var='book'>
                    <c:if test='${book.currentBorrower.id == loggedInUser.id}'>
                    <tr>
                        <th scope="row">${book.id}</th>
                        <td><a href="/books/${book.id}">${book.title}</a></td>
                        <td>${book.author}</td>
                        <td>${book.user.name}</td>
                        <td>
                            <a href="/books/${book.id}/return" class="ms-1">Return</a>
                        </td>
                    </tr>
                    </c:if>
                </c:forEach>
            </tbody>
        </table>
    </div>
</body>

</html>