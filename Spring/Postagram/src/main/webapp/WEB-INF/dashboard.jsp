<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta name="viewport" content="width=device-width,user-scalable=no">
    <title>Instagram Portfolio</title>
    <!-- Google Font -->
    <link href="https://fonts.googleapis.com/css?family=Nunito:200,300,400,700" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Neonderthaw&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Satisfy&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Tangerine:wght@700&display=swap" rel="stylesheet">
    <link href='http://fonts.googleapis.com/css?family=Lato:400,700|Kaushan+Script|Montserrat' rel='stylesheet'
        type='text/css'>
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <script type="text/javascript" src="js/modernizr.js"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
        crossorigin="anonymous">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <style>
        #heart {
            cursor: pointer;
        }
        #comment {
            cursor: pointer;
        }
        .aside1 {
            left: 0;
        }
        
        .aside2 {
            right: 0;
        }
        
        .general-sidebar {
            position: fixed;
        }
    </style>
</head>

<body style="background: linear-gradient(45deg, #f6f3f3, #ebedee);">
    <header>
        <div class="navbar navbar-dark bg-dark box-shadow fixed-top">
            <div class="container d-flex justify-content-between">
                <a href="#" class="navbar-brand d-flex align-items-center">
                    <svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" viewBox="0 0 24 24" fill="none"
                        stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"
                        class="mr-2">
                        <path d="M23 19a2 2 0 0 1-2 2H3a2 2 0 0 1-2-2V8a2 2 0 0 1 2-2h4l2-3h6l2 3h4a2 2 0 0 1 2 2z">
                        </path>
                        <circle cx="12" cy="13" r="4"></circle>
                    </svg>
                    <strong class="ms-1">Postagram</strong>
                </a>
                <ul class="navbar-nav ms-auto text-uppercase">
                    <li class="nav-item"><a class="nav-link" href="/home">Home</a></li>
                </ul>
                <button onclick="uploadFile()" style="border: 0px; background-color:transparent;" class="ms-2">
                    <svg style="background-color: #f6f3f3; border-radius:10px;" xmlns="http://www.w3.org/2000/svg" width="26" height="26" fill="currentColor"
                        class="bi bi-plus-square" viewBox="0 0 16 16">
                        <path
                            d="M14 1a1 1 0 0 1 1 1v12a1 1 0 0 1-1 1H2a1 1 0 0 1-1-1V2a1 1 0 0 1 1-1h12zM2 0a2 2 0 0 0-2 2v12a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V2a2 2 0 0 0-2-2H2z" />
                        <path
                            d="M8 4a.5.5 0 0 1 .5.5v3h3a.5.5 0 0 1 0 1h-3v3a.5.5 0 0 1-1 0v-3h-3a.5.5 0 0 1 0-1h3v-3A.5.5 0 0 1 8 4z" />
                    </svg>
                </button>
                <div class="dropdown" style="margin-right: 80px;">
                    <a href="#" role="button" id="dropdownMenuLink" data-bs-toggle="dropdown"
                        aria-expanded="false">
                        <img src="imgs/profile-icon.png" alt="" style="width: 35px; margin:10px; height:35px;">
                    </a>
                    <ul class="dropdown-menu" style="width: 200px;" aria-labelledby="dropdownMenuLink">
                        <li><a class="dropdown-item" href="/user/profile/${loggedInUser.id}">
                                <svg class="mb-1 me-1" xmlns="http://www.w3.org/2000/svg" width="15" height="15"
                                    fill="currentColor" class="bi bi-person-circle" viewBox="0 0 16 16">
                                    <path d="M11 6a3 3 0 1 1-6 0 3 3 0 0 1 6 0z" />
                                    <path fill-rule="evenodd"
                                        d="M0 8a8 8 0 1 1 16 0A8 8 0 0 1 0 8zm8-7a7 7 0 0 0-5.468 11.37C3.242 11.226 4.805 10 8 10s4.757 1.225 5.468 2.37A7 7 0 0 0 8 1z" />
                                </svg>
                                Profile
                            </a></li>
                        <li><a class="dropdown-item" href="#">
                                <svg class="mb-1 me-1" xmlns="http://www.w3.org/2000/svg" width="16" height="14"
                                    fill="currentColor" class="bi bi-bookmark" viewBox="0 0 16 16">
                                    <path
                                        d="M2 2a2 2 0 0 1 2-2h8a2 2 0 0 1 2 2v13.5a.5.5 0 0 1-.777.416L8 13.101l-5.223 2.815A.5.5 0 0 1 2 15.5V2zm2-1a1 1 0 0 0-1 1v12.566l4.723-2.482a.5.5 0 0 1 .554 0L13 14.566V2a1 1 0 0 0-1-1H4z" />
                                </svg>
                                Saved
                            </a></li>
                        <li>
                            <hr class="dropdown-divider">
                        </li>
                        <li><a class="text-danger dropdown-item" href="/logout">Logout</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </header>

    <main role="main ">
        <section class="container d-flex" style="margin-top: 90px;">
            <div class="general-sidebar aside1" style="background-color: rgb(195, 192, 192); width:25%; height:87vh; border-radius:20px; margin-left:30px;">
            </div>
            <div style="width:45%; height:100vh; margin-left:400px; ">
                <div style="background-color: white; width:90%; height:35vh; border-radius: 10px 10px; margin: 0 auto;">
                    <div class="d-flex">
                        <img src="imgs/profile-icon.png" alt="" style="width: 50px; margin:25px; height:50px;">
                        <p style="margin: 35px 10px 0 -15px; font-family:Nunito, sans-serif; font-size:1.2rem;">
                            ${loggedInUser.userName}</p>
                        <button onclick="uploadFile()" style="border: 0px; background-color:white; height:50px;"
                            class="mt-4">
                            <svg xmlns="http://www.w3.org/2000/svg" width="26" height="26" fill="currentColor"
                                class="bi bi-plus-square" viewBox="0 0 16 16">
                                <path
                                    d="M14 1a1 1 0 0 1 1 1v12a1 1 0 0 1-1 1H2a1 1 0 0 1-1-1V2a1 1 0 0 1 1-1h12zM2 0a2 2 0 0 0-2 2v12a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V2a2 2 0 0 0-2-2H2z" />
                                <path
                                    d="M8 4a.5.5 0 0 1 .5.5v3h3a.5.5 0 0 1 0 1h-3v3a.5.5 0 0 1-1 0v-3h-3a.5.5 0 0 1 0-1h3v-3A.5.5 0 0 1 8 4z" />
                            </svg>
                        </button>
                        <p class="text-danger">${message}</p>
                        <form action="/home/upload" method="post" enctype="multipart/form-data">
                            <div class="form-group">
                                <input type="file" name="pic" id="pics" hidden>
                                <input type="submit" value="" id="upload" hidden>
                            </div>
                    </div>
                    <div class="form-group ms-3 w-75">
                        <label for="des">Description:</label>
                        <textarea name="description" id="" cols="20" rows="3" class="form-control"></textarea>
                    </div>
                    <input type="submit" value="Upload Picture" class="btn btn-success ms-3 mt-3">
                    </form>
                    <c:forEach items='${ orderedPics }' var='pic'>
                        <div class="mt-5 m-auto"
                            style="background-color: white; width:100%; border:1px solid grey;">
                            <div class="div d-flex">
                                <img src="imgs/profile-icon.png" alt=""
                                    style="width: 50px; margin:25px; height:50px;">
                                <a href="/user/profile/${pic.user.id}" class="text-dark"
                                    style="text-decoration: none;">
                                    <p
                                        style="margin: 35px 0 0 -10px; font-family:Nunito, sans-serif; font-size:1.2rem;">
                                        ${pic.user.userName}</p>
                                </a>
                            </div>
                            <img src="${pic.image_url}" alt=""
                                style="position:relative; width:100%; height:600px">
                            <div class="d-flex m-2">
                                <c:if test='${!pic.usersThatLikedPic.contains(loggedInUser)}'>
                                <a style="text-decoration: none; color:black;" href="/post/like/${pic.id}">
                                    <svg id="heart" title="Set as Liked" xmlns="http://www.w3.org/2000/svg" width="16"
                                    height="16" fill="currentColor" class="bi bi-heart ms-2 unlike" viewBox="0 0 16 16">
                                        <path class="heart fa fa-heart-o" aria-hidden="true" d="m8 2.748-.717-.737C5.6.281 2.514.878 1.4 3.053c-.523 1.023-.641 2.5.314 4.385.92 1.815 2.834 3.989 6.286 6.357 3.452-2.368 5.365-4.542 6.286-6.357.955-1.886.838-3.362.314-4.385C13.486.878 10.4.28 8.717 2.01L8 2.748zM8 15C-7.333 4.868 3.279-3.04 7.824 1.143c.06.055.119.112.176.171a3.12 3.12 0 0 1 .176-.17C12.72-3.042 23.333 4.867 8 15z" />
                                    </svg>
                                </a>
                                </c:if>
                                <c:if test='${pic.usersThatLikedPic.contains(loggedInUser)}'>
                                <a style="text-decoration: none; color:red;" href="/post/unlike/${pic.id}">
                                    <svg style="color: red;" xmlns="http://www.w3.org/2000/svg" width="17" height="17" fill="currentColor" class="bi bi-heart-fill" viewBox="0 0 16 16">
                                        <path fill-rule="evenodd" d="M8 1.314C12.438-3.248 23.534 4.735 8 15-7.534 4.736 3.562-3.248 8 1.314z"/>
                                    </svg>
                                </a>
                                </c:if>

                                <a style="text-decoration: none; color:black;" href="/post/comment/${pic.id}">
                                    <svg id="comment" style="margin-top: -2px; margin-left:10px;"
                                        xmlns="http://www.w3.org/2000/svg" width="16" height="16"
                                        fill="currentColor" class="bi bi-chat" viewBox="0 0 16 16">
                                        <path class="fa fa-heart-o" aria-hidden="true" d="M2.678 11.894a1 1 0 0 1 .287.801 10.97 10.97 0 0 1-.398 2c1.395-.323 2.247-.697 2.634-.893a1 1 0 0 1 .71-.074A8.06 8.06 0 0 0 8 14c3.996 0 7-2.807 7-6 0-3.192-3.004-6-7-6S1 4.808 1 8c0 1.468.617 2.83 1.678 3.894zm-.493 3.905a21.682 21.682 0 0 1-.713.129c-.2.032-.352-.176-.273-.362a9.68 9.68 0 0 0 .244-.637l.003-.01c.248-.72.45-1.548.524-2.319C.743 11.37 0 9.76 0 8c0-3.866 3.582-7 8-7s8 3.134 8 7-3.582 7-8 7a9.06 9.06 0 0 1-2.347-.306c-.52.263-1.639.742-3.468 1.105z" />
                                    </svg>
                                </a>
                            </div>
                            <c:if test='${pic.usersThatLikedPic.size()<2}'>
                                <small class="p-3" style="font-weight: 600;">${pic.usersThatLikedPic.size()} like</small>
                            </c:if>
                            <c:if test='${pic.usersThatLikedPic.size()>1}'>
                                <small class="p-3" style="font-weight: 600;">${pic.usersThatLikedPic.size()} likes</small>
                            </c:if>
                            <div class="d-flex mt-2">
                                <p style="font-family:Nunito, sans-serif; font-size:1rem; margin-left:18px; font-weight:800;">${pic.user.userName}</p>
                                <p class="ms-1 float-left" style="font-family:Nunito, sans-serif; font-size:1rem;">${pic.description}</p>
                            </div>
                            <div class="ms-3" style="margin-top: -10px;">
                                <a class="text-muted" style="text-decoration: none;" href="">view all comments</a>
                            </div>
                            <form:form action="/comment/create/${pic.id}" method="post" modelAttribute="comment">
                                <hr style="margin-bottom: 0px;">
                                <div class="input-group">
                                    <form:input type="text" style="border: 0px; width:89% " placeholder="Add a comment..." path="userCommentOnPost" name="" id="" cols="40" rows="2" aria-describedby="button-addon2"/>
                                    <input id="button-addon2" type="submit" value="Post" style="border: 0; background-color:transparent; color:skyblue;" class="btn btn-info"/>
                                </div>
                                
                            </form:form>
                        </div>
                    </c:forEach>
                    <footer class="text-muted mt-5">
                        <div class="container">
                            <div class="d-flex justify-content-evenly">
                                <p>Postagram &copy; </p>
                                <p class="float-right">
                                    <a href="#">Back to top</a>
                                </p>
                            </div>
                        </div>
                    </footer>
                </div>
            </div>
        </section>
    </main>

</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
    crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"
    integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB"
    crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"
    integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13"
    crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
    crossorigin="anonymous"></script>
<script>
    function uploadFile() {
        let pics = document.getElementById("pics")
        document.getElementById("pics").click();
    }
    /*function setMyFavorite(element){
        //element.findById("heart")
        //make it red
        if($("#heart").hasClass("unlike")){
            $("#heart").html('<svg style="color:red;" xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-heart-fill" viewBox="0 0 16 16"> <path fill-rule="evenodd" d="M8 1.314C12.438-3.248 23.534 4.735 8 15-7.534 4.736 3.562-3.248 8 1.314z"/> </svg>');
            $("#heart").removeClass("unlike");
            console.log("It's getting liked")
        }else{
            $("#heart").html('<svg id="heart" title="Set as Liked" onclick="setMyFavorite();" xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-heart ms-2 unlike" viewBox="0 0 16 16"> <path class="heart fa fa-heart-o" aria-hidden="true" d="m8 2.748-.717-.737C5.6.281 2.514.878 1.4 3.053c-.523 1.023-.641 2.5.314 4.385.92 1.815 2.834 3.989 6.286 6.357 3.452-2.368 5.365-4.542 6.286-6.357.955-1.886.838-3.362.314-4.385C13.486.878 10.4.28 8.717 2.01L8 2.748zM8 15C-7.333 4.868 3.279-3.04 7.824 1.143c.06.055.119.112.176.171a3.12 3.12 0 0 1 .176-.17C12.72-3.042 23.333 4.867 8 15z" /> </svg>');
            $("#heart").addClass("unlike");
            console.log("Its unliked")
        }
    }
    $("#heart").click(setMyFavorite)*/
</script>
</html>