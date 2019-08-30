<%--
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

        .btn-outline-primary {
            color: rgb(201, 201, 201);
            border-color: #ffffff;
            background: rgba(134, 134, 134, 0.85);
        }

        .container {
            padding: 0;
        }

        .content {
            margin-right: 50px;
            margin-left: 50px;
            margin-bottom: 3px;
            margin-top: 3px;
            border: 1px solid #111111;
            padding-left: 20px;
            padding-right: 20px;
            padding-bottom: 5px;
        }

        .title {
            white-space: nowrap;
        }

        .datetime {
            font-size: 20px;
            text-align: right;
            float: right;
            margin-top: 10px;
        }

    </style>

</head>
<body>
<div class="container">

    <nav class="navbar navbar-light bg-light">
        <a class="navbar-brand">Tin nhanh</a>
        <form class="form-inline" style=" margin-bottom: 0px ">
            <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-primary my-2 my-sm-0" type="submit">Search</button>
        </form>
    </nav>
    <br/>


    <c:forEach var="item" items="${list}">
        <div class="content">
            <div class="title">
                <a style="font-size: 2em ">${item.getTitle()}</a>
                <div class="datetime">${item.getDate()}</div>
            </div>
            <div class="summary">
                <label>${item.getSummary()}</label>
            </div>
            <div class="sources">
                <a>Đăng bởi: ${item.getAuthorId()}</a>
            </div>
        </div>
    </c:forEach>


    <br/>

    <nav aria-label="Page navigation example">
        <ul class="pagination" style=" margin-left: 50px;">
            <c:if test="${currentPage > 1}">
                <li class="page-item" id="page_link_previous">
                    <a class="page-link" href="?page=${currentPage - 1}" aria-label="Previous">
                        <span aria-hidden="true">&laquo;</span>
                    </a>
                </li>
            </c:if>

            <c:forEach var="i" begin="1" end="${total}" step="1">
                <li class="page-item">
                    <a
                            <c:if test="${currentPage == i}">
                                style="background-color: rgb(222, 222, 222) !important;"
                            </c:if>
                            class="page-link" href="?page=${i}"> ${i} </a>
                </li>
            </c:forEach>

            <c:if test="${currentPage < total}">
                <li class="page-item" id="page_link_next">
                    <a class="page-link" href="?page=${currentPage + 1}" aria-label="Next">
                        <span aria-hidden="true">&raquo;</span>
                    </a>
                </li>
            </c:if>

        </ul>
    </nav>

</div>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>


</body>
</html>
