<%--
  Created by IntelliJ IDEA.
  User: Nguyen Quoc Tuan
  Date: 15/07/2019
  Time: 20:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form action="sign_up" method="post">
    <center>
        <h1>REGISTER FORM</h1>
        <TABLE>
            <tr>
                <td>Username:</td>
                <td><input type="text" name="username"/></td>
            </tr>
            <tr>
                <td>Password:</td>
                <td><input type="password" name="password"/></td>
            </tr>
            <tr>
                <td>Fullname:</td>
                <td><input type="text" name="fullname"/></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><input type="email" name="email"/></td>
            </tr>
            <tr>
                <td>Address:</td>
                <td><input type="text" name="adderss"/></td>
            </tr>
            <tr>
                <td><input type="reset"/></td>
                <td><input type="submit"/></td>
            </tr>
        </TABLE>
    </center>
</form>

</body>
</html>
