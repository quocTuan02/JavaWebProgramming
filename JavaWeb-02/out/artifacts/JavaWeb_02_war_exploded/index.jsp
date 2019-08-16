<%@ page import="DB.StudentModel" %>
<%@ page import="DB.Student" %>
<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: Nguyen Quoc Tuan
  Date: 29/07/2019
  Time: 2:52 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Jsp Page</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <style>
        .table > tbody > tr > td, th {
            vertical-align: middle;
        }
    </style>
</head>
<body>
<%@include file="components/navbar.jsp" %>

<div class="container">
    <table class="table">
        <thead class="thead-dark">
        <tr>
            <th scope="col">#</th>
            <th scope="col">Tên</th>
            <th scope="col">Tuổi</th>
            <th scope="col">Địa chỉ</th>
            <th scope="col">Chức năng</th>
        </tr>
        </thead>
        <tbody>
        <%
            StudentModel model = new StudentModel();
            List<Student> list = model.getList();
            int idx = 0;
            for (Student s : list) {
                idx++;
        %>
        <tr id="tr<%=s.getId()%>" class="list">
            <th scope="row" style="vertical-align: middle">
                <span class="idx"><%=idx%></span>
            </th>
            <td>
                <span id="nameSpan<%=s.getId()%>"><%=s.getName()%></span>
                <input id="nameInput<%=s.getId()%>" type="text" class="form-control" value="<%=s.getName()%>" hidden>
            </td>
            <td>
                <span id="ageSpan<%=s.getId()%>"><%=s.getAge()%></span>
                <input id="ageInput<%=s.getId()%>" type="text" class="form-control" value="<%=s.getAge()%>" hidden>
            </td>
            <td>
                <span id="addressSpan<%=s.getId()%>"><%=s.getAddress()%></span>
                <input id="addressInput<%=s.getId()%>" type="text" class="form-control" value="<%=s.getAddress()%>"
                       hidden>
            </td>
            <td>
                <button type="button" class="btn btn-primary" onclick="enableUpdate(<%=s.getId()%>)">Sửa</button>
                <button type="button" class="btn btn-danger" onclick="deleteRow(<%=s.getId()%>)">Xóa</button>
            </td>
        </tr>
        <%
            }
        %>
        <tr id="trNew" hidden>
                <th scope="row" style="vertical-align: middle">
                    <span class="idx"></span>
                </th>
                <td>
                    <input id="nameInputNew" type="text" class="form-control" placeholder="Full Name">
                </td>
                <td>
                    <input id="ageInputNew" type="text" class="form-control" placeholder="Age">
                </td>
                <td>
                    <input id="addressInputNew" type="text" class="form-control" placeholder="Address">
                </td>
                <td>
                    <input id="finish" type="button" class="btn btn-success" onclick="finish()" value="Hoàn thành"/>
                    <input id="cancel" type="button" class="btn btn-danger" onclick="cancel()" value="Hủy"/>
                </td>

        </tr>

        </tbody>
    </table>

    <input id="add_new" class="btn btn-success" type="button" value="Thêm mới" onclick="add()"/>
</div>

<script
        src="https://code.jquery.com/jquery-3.4.1.min.js"
        integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
        crossorigin="anonymous">

</script>
<script
        src="js/main.js">

</script>

</body>
</html>
