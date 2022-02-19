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
<body>
    <div class="container mt-4">
        <h1 style="color: blue;">Welcome to the dashboard, ${loggedInUser.userName}</h1>
        <h4 class="mt-3 mb-3">This is your dashboard. Nothing to see here yet.</h4>
        <a href="/logout">Logout</a>
    </div>
</body>
</html>