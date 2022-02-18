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
<body style="background: linear-gradient(45deg,#3f3431c9,#4b4e3d93); height:100vh;">
    <div class="container">
        <h1 class="text-center mt-5" style="font-size: 80px;">${dojoToShow.name} Ninjas</h1>
        <table class="table table-dark text-center">
            <thead>
                <tr>
                    <th scope="col">First Name</th>
                    <th scope="col">Last Name</th>
                    <th scope="col">Age</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items='${ dojoToShow.ninjas }' var='ninjaObj'>
                    <tr>
                        <td>${ninjaObj.firstName}</td>
                        <td>${ninjaObj.lastName}</td>
                        <td>${ninjaObj.age}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>