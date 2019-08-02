<%@ page import="DB.UserModel" %>
<%@ page import="DB.User" %><%--
  Created by IntelliJ IDEA.
  User: Nguyen Quoc Tuan
  Date: 27/07/2019
  Time: 2:52 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    try {
        UserModel model = new UserModel();
        User user = model.getUser("linhsk3", "root123");
%>


<table border="1">
    <tr>
        <td>Name</td>
        <td>Value</td>
    </tr>
    <tr>
        <td>User name</td>
        <td><%=
            user.getUsername()
        %></td>
    </tr>
    <tr>
        <td>Password</td>
        <td><%=
            user.getPassword()
        %></td>
    </tr>
    <tr>
        <td>Full name</td>
        <td><%=
            user.getFullname()
        %></td>
    </tr>
    <tr>
        <td>Email</td>
        <td><%=
            user.getEmail()
        %></td>
    </tr>
    <tr>
        <td>Address</td>
        <td><%=
            user.getAddress()
        %></td>
    </tr>
</table>

<%
    } catch (Exception e) {
        e.printStackTrace();

    }

%>


</body>
</html>
