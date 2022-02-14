<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- for Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/style.css"/>
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
    <div class="container mt-5" style="width: 42%;">
        <h1>Send an Omijuki!</h1>
        <form action="/omikuji/process" method="post" class="bg-dark text-light p-2">
            <div class="form-group col-9 m-auto">
                <label for="num">Pick any number from 5 to 25:</label>
                <input type="number" name="num" id="num" class="form-control" style="width: 30%;">
            </div>
            <div class="form-group col-9 m-auto">
                <label for="city">Enter the name of any city:</label>
                <input type="text" name="city" id="city" class="form-control">
            </div>
            <div class="form-group col-9 m-auto">
                <label for="real_name">Enter the name of any real person:</label>
                <input type="text" name="real_name" id="real_name" class="form-control">
            </div>
            <div class="form-group col-9 m-auto">
                <label for="hobby">Enter professional endeavor or hobby:</label>
                <input type="text" name="hobby" id="hobby" class="form-control">
            </div>
            <div class="form-group col-9 m-auto">
                <label for="living_thing">Enter any type of living thing:</label>
                <input type="text" name="living_thing" id="living_thing" class="form-control">
            </div>
            <div class="form-group col-9 m-auto">
                <label for="">Say something nice to someone:</label>
                <textarea name="comment" id="" cols="30" rows="10" class="form-control"></textarea>
                <input type="submit" value="Send" class="btn btn-success mt-3 float-end">
                <h3 class="p-2">Send and show a friend</h3>
            </div>
        </form>
    </div>
</body>
</html>