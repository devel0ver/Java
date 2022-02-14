<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
    <div class="container w-50 text-center">
        <h1>Here's Your Omikuji!</h1>
        <div class="border border-3 border-dark m-auto p-3" style="height:fit-content; width:45%; background-color:rgb(107, 192, 195);">
            <h2>In <%= session.getAttribute("num") %> years, you will live in <%= session.getAttribute("city") %> with <%= session.getAttribute("real_name") %> as your roommate, <%= session.getAttribute("hobby") %> for a living. Th enext time you see a <%= session.getAttribute("living_thing") %>, you will have good luck. Also, <%= session.getAttribute("comment") %></h2>
        </div>
        <a href="/omikuji">Go Back</a>
    </div>
</body>
</html>