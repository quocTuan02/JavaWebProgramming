<%@ page import="DB.NewsModel" %>
<%@ page import="DB.News" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Nguyen Quoc Tuan
  Date: 12/08/2019
  Time: 4:08 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <style>
        .bg-light {
            background-color: rgb(222, 222, 222) !important;
        }

        .btn-outline-success {
            color: rgb(201, 201, 201);
            border-color: #ffffff;
            background: rgba(134, 134, 134, 0.85);
        }


        .content {
            margin-right: 50px;
            margin-left: 50px;
            border: 1px solid #111111;
            padding-left: 20px;
            padding-right: 20px;
            padding-bottom: 5px;
        }

        .title {
            white-space: nowrap;
        }

        .datetime {
            text-align: right;
            float: right;
            margin-top: 20px;
            margin-right: 30px;
        }

    </style>

</head>
<body>
<nav class="navbar navbar-light bg-light">
    <a class="navbar-brand">Tin nhanh</a>
    <form class="form-inline">
        <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>
</nav>
<br/>


<c:forEach var="item" items="${news}">
    <div class="content">
        <div class="title">
            <a style="font-size: 2em ">Title</a>
            <div class="datetime">Datetime</div>
        </div>
        <div class="summary">
            <label>Summary</label>
        </div>
        <div class="sources">
            <a>Đăng bởi: ID</a>
        </div>
    </div>
</c:forEach>


<br/>

<nav aria-label="Page navigation example">
    <ul class="pagination">
        <li class="page-item">
            <a class="page-link" href="#" aria-label="Previous">
                <span aria-hidden="true">&laquo;</span>
            </a>
        </li>
        <li class="page-item"><a class="page-link" href="#">1</a></li>
        <li class="page-item"><a class="page-link" href="#">2</a></li>
        <li class="page-item"><a class="page-link" href="#">3</a></li>
        <li class="page-item">
            <a class="page-link" href="#" aria-label="Next">
                <span aria-hidden="true">&raquo;</span>
            </a>
        </li>
    </ul>
</nav>

<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
</body>
</html>
