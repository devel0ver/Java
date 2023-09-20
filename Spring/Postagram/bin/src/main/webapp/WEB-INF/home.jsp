<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no" />
    <!-- Google Font -->
    <link href="https://fonts.googleapis.com/css?family=Nunito:200,300,400,700" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Neonderthaw&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Satisfy&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Tangerine:wght@700&display=swap" rel="stylesheet">
    <!-- css -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
        crossorigin="anonymous">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="/css/style.css">
    <title>Postagram</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
        crossorigin="anonymous">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Kaushan+Script">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat:400,700">
    <link rel="stylesheet" href="assets/fonts/font-awesome.min.css">
</head>

<body id="page-top" data-bs-spy="scroll" data-bs-target="#mainNav" data-bs-offset="54"
    style="background-image: url(imgs/map-image.jpeg);">
    <nav id="mainNav" class="navbar navbar-dark navbar-expand-lg fixed-top bg-dark">
        <div class="container"><a class="navbar-brand" href="#page-top" style="font-size: 2rem; font-family: 'Tangerine', cursive;">Postagram</a><button
                class="navbar-toggler navbar-toggler-right" data-bs-toggle="collapse"
                data-bs-target="#navbarResponsive" type="button" aria-controls="navbarResponsive"
                aria-expanded="false" aria-label="Toggle navigation"><i class="fa fa-bars"></i></button>
            <div id="navbarResponsive" class="collapse navbar-collapse">
                <ul class="navbar-nav ms-auto text-uppercase">
                    <li class="nav-item"><a class="nav-link" href="/signup">Signup</a></li>
                </ul>
            </div>
        </div>
    </nav>
    <div class="container">
        <img src="/imgs/phone.png" alt="" style="height: 500px; margin:100px 0px 0px 150px">
        <div style="background-color: azure; width:215px; height:380px; position:relative; bottom:440px; left:165px">
            <nav style="background-color: #22252a; height:40px;" class="navbar navbar-expand-lg">
                <div class="container-fluid">
                    <h6 class="navbar-brand text-light fs-5 mt-1" style="font-family: 'Tangerine', cursive;">Postagram</h6>
                </div>
            </nav>
            <div class="d-flex">
                <img src="imgs/profile-icon.png" alt="" style="width: 30px; margin:10px; height:35px;">
                <p class="mt-3">username</p>
            </div>
            <div class="container">
                <img src="imgs/post.JPG" alt="" style="width: 210px; height:230px; margin-left:-10px;">
                <div class="d-flex">
                    &#9825;
                    <i class="fa fa-comment mt-1 ms-2"></i>
                </div>
                <sub>View comments</sub>
            </div>
        </div>
    </div>
    <section class="login-dark">
        <form:form action="/login" method="post" modelAttribute="newLogin">
            <div class="illustration"><i class="icon ion-ios-locked-outline"></i></div>
            <form:errors path="email" class="text-danger"/>
            <div class="mb-3"><form:input path="email" class="form-control" type="email" name="email" placeholder="Email" />
            </div>
            <form:errors path="password" class="text-danger"/>
            <div class="mb-3"><form:input  path="password" class="form-control" type="password" name="password"
                    placeholder="Password" /></div>
            <div class="mb-3"><button class="btn btn-primary d-block w-100" type="submit">Log In</button>
            </div><a class="forgot" href="#">Forgot your email or password?</a>
        </form:form>
    </section>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"
        integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB"
        crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"
        integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13"
        crossorigin="anonymous"></script>
</body>

</html>