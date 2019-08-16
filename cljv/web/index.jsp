<%@ page import="DB.BookModel" %>
<%@ page import="DB.Book" %>
<%@ page import="java.util.List" %>
<%@ page import="java.sql.SQLException" %><%--
  Created by IntelliJ IDEA.
  User: Nguyen Quoc Tuan
  Date: 04/08/2019
  Time: 2:21 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Book</title>
    <link rel="stylesheet"
          href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

    <link rel="stylesheet"
          href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">

</head>
<body>
<%@include file="component/navbar.jsp" %>

<div class="container">
    <table class="table">
        <thead class="thead-dark">
        <tr>
            <th scope="col">#</th>
            <th scope="col">Tên sách</th>
            <th scope="col">Tác giả</th>
            <th scope="col">Giá</th>
            <th scope="col">Số lượng</th>
            <th scope="col">Chức năng</th>

        </tr>
        </thead>
        <tbody>
        <%
            try {
                BookModel model = new BookModel();
                List<Book> list = model.getList();
                int idx = 0;
                for (Book book : list) {
                    idx++;
        %>
        <tr id="tr<%=book.getId()%> " class="list">
            <th scope="row">
                <span class="idx"><%=idx%></span>
            </th>
            <td>
                <span id="titleSpan<%=book.getId()%>"><%=book.getTitle()%></span>
                <input id="titleInput<%=book.getId()%>" class="form-control" type="text" value="<%=book.getTitle()%>"
                       hidden
                />
            </td>
            <td>
                <span id="authorSpan<%=book.getId()%>"><%=book.getAuthor()%></span>
                <input id="authorInput<%=book.getId()%>" class="form-control" type="text" value="<%=book.getAuthor()%>"
                       hidden/>
            </td>
            <td>
                <span id="priceSpan<%=book.getId()%>"><%=book.getPrice()%></span>
                <input id="priceInput<%=book.getId()%>" class="form-control" type="text" value="<%=book.getPrice()%>"
                       hidden/>
            </td>
            <td>
                <span id="quantitySpan<%=book.getId()%>"><%=book.getQuantity()%></span>
                <input id="quantityInput<%=book.getId()%>" class="form-control" type="text"
                       value="<%=book.getQuantity()%>" hidden/>
            </td>
            <td id="update<%=book.getId()%>">
                <input type="button" class="btn btn-primary" onclick="enableUpdate(<%=book.getId()%>)" value="Sửa"/>
                <input type="button" class="btn btn-danger" onclick="deleteRow(<%=book.getId()%>)" value="Xóa"/>
            </td>
            <td id="apply<%=book.getId()%>" hidden>
                <input type="button" class="btn btn-success" onclick="update(<%=book.getId()%>)" value="Hoàm thành"/>
                <input type="button" class="btn btn-danger" onclick="cancel()" value="Hủy"/>
            </td>
        </tr>
        <%
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        %>
        <tr id="trNew" hidden>
            <th scope="row"></th>
            <td>
                <input id="titleInputNew" class="form-control" type="text" placeholder="Tên sách"/>
            </td>
            <td>
                <input id="authorInputNew" class="form-control" type="text" placeholder="Tác giả"/>
            </td>
            <td>
                <input id="priceInputNew" class="form-control" type="text" placeholder="Giá"/>
            </td>
            <td>
                <input id="quantityInputNew" class="form-control" type="text" placeholder="Số lượng"/>
            </td>
            <td>
                <input type="button" class="btn btn-success" onclick="finish()" value="Hoàm thành"/>
                <input type="button" class="btn btn-danger" onclick="cancel()" value="Hủy"/>
            </td>
        </tr>
        </tbody>
    </table>
    <input id="add_new" class="btn btn-success" type="button" onclick="addNew()" value="Thêm mới"/>
</div>


<script>

    const elemNames = ["title", "author", "price", "quantity"];

    function addNew() {
        $("#trNew").attr("hidden", false);
        //  $(".list").attr("hidden", true);
        $("#add_new").attr("hidden", true);

    }

    function cancel() {
        $("#trNew").attr("hidden", true);
        location.reload()
    }


    function finish() {
        $.ajax({
            url: "add_new",
            type: "post",
            data: {
                title: $("#titleInputNew").val(),
                author: $("#authorInputNew").val(),
                price: $("#priceInputNew").val(),
                quantity: $("#quantityInputNew").val(),
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

    function update(id) {

        $.ajax({
            url: "update",
            type: "post",
            data: {
                id: id,
                title: $("#titleInput" + id).val(),
                author: $("#authorInput" + id).val(),
                price: $("#priceInput" + id).val(),
                quantity: $("#quantityInput" + id).val(),
            },

            success: function (result) {
                alert("Sửa thành công !");
                location.reload();

            },
            error: function (error) {
                alert("Lỗi!");
            }
        });
    }

    function enableUpdate(id) {
        elemNames.forEach(function (element) {
            var inputSelector = "#" + element + "Input" + id;
            var spanSelector = "#" + element + "Span" + id;

            $(inputSelector).attr("hidden", false);
            $(spanSelector).attr("hidden", true);

            $("#apply" + id).attr("hidden", false);
            $("#update" + id).attr("hidden", true);

        })
    }


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


</script>

<script
        src="https://code.jquery.com/jquery-3.4.1.min.js"
        integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
        crossorigin="anonymous">

</script>
</body>
</html>
