<%@ page import="DB.StudentModel" %>
<%@ page import="DB.Student" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Nguyen Quoc Tuan
  Date: 29/07/2019
  Time: 2:52 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Buoi 25</title>
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
        <tr id="tr<%=s.getId()%>">
            <th scope="row" style="vertical-align: middle">
                <span class="idx"><%=idx%></span>
            </th>
            <td>
                <span id="nameSpan<%=s.getId()%>"><%=s.getName()%></span>
                <input id="nameInp<%=s.getId()%>" type="text" class="form-control" value="<%=s.getName()%>" hidden>
            </td>
            <td>
                <span id="ageSpan<%=s.getId()%>"><%=s.getAge()%></span>
                <input id="ageInp<%=s.getId()%>" type="text" class="form-control" value="<%=s.getAge()%>" hidden>
            </td>
            <td>
                <span id="addressSpan<%=s.getId()%>"><%=s.getAddress()%></span>
                <input id="addressInp<%=s.getId()%>" type="text" class="form-control" value="<%=s.getAddress()%>"
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
        <tr id="trNew">
            <th scope="row" style="vertical-align: middle">
                <span class="idx"></span>
            </th>
            <td>
                <input id="nameInpNew" type="text" class="form-control" placeholder="Full Name" hidden>
            </td>
            <td>
                <input id="ageInpNew" type="text" class="form-control" placeholder="Age" hidden>
            </td>
            <td>
                <input id="addressInpNew" type="text" class="form-control" placeholder="Address" hidden>
            </td>
            <td>
                <button type="button" class="btn btn-success" id="finish" onclick="finish()" hidden>Finish</button>
            </td>
        </tr>

        </tbody>
    </table>

    <input class="btn btn-success" type="button" value="Thêm" onclick="add()"/>
</div>

<script
        src="https://code.jquery.com/jquery-3.4.1.min.js"
        integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
        crossorigin="anonymous">

</script>

<script>
    const elemNames = ["name", "age", "address"];
    var inpName = "#nameInpNew";
    var inpAge = "#ageInpNew";
    var inpAddress = "#addressInpNew";

    function deleteRow(id) {
        $.ajax({
            url: "delete",
            type: "post",
            data: {
                id: id
            },
            success: function (result) {
                alert("Xóa thành công");
                location.reload();
            },
            error: function (error) {
                alert("Loi!");
            }
        });
    }

    function finish() {
        $.ajax({
            url: "add",
            type: "post",
            data: {
                name: document.getElementById("nameInpNew").value,
                age: document.getElementById("ageInpNew").value,
                address: document.getElementById("addressInpNew").value,
            },
            success: function (result) {
                alert("Thêm mới thành công");
                location.reload();
            },
            error: function (error) {
                alert("Loi!");
            }
        });
    }

    function add() {
        $(inpName).attr("hidden", false);
        $(inpAge).attr("hidden", false);
        $(inpAddress).attr("hidden", false);
        $("#finish").attr("hidden", false);

    }

    function enableUpdate(id) {

        elemNames.forEach(function (element) {
            const spanSelector = "#" + element + "Span" + id;
            const inpSelector = "#" + element + "Inp" + id;
            $(spanSelector).attr("hidden", true);
            $(inpSelector).attr("hidden", false);

            $(inpSelector).keypress(function (event) {
                if (event.which === 13) {
                    update(id);
                }
            })
        });
    }

    function update(id) {
        elemNames.forEach(function (element) {
            const spanSelector = "#" + element + "Span" + id;
            const inpSelector = "#" + element + "Inp" + id;

            $(spanSelector).attr("hidden", false);
            $(inpSelector).attr("hidden", true);

            const oldVal = $(spanSelector).text();
            const newVal = $(inpSelector).val();

            if (oldVal !== newVal) {
                $(spanSelector).text(newVal);

                $.ajax({
                    url: "update",
                    type: "post",
                    data: {
                        key: element,
                        id: id,
                        newValue: newVal
                    },
                    success: function (result) {
                        alert("Sua thanh cong!");
                    },
                    error: function (error) {
                        alert("Loi");
                    }
                })
            }
        })
    }
</script>
</body>
</html>
