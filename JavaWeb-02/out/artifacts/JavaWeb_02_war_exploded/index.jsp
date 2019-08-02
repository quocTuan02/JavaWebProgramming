<%@ page import="java.util.List" %>
<%@ page import="DB.StudentModel" %>
<%@ page import="DB.Student" %>
<%@ page import="java.sql.SQLException" %><%--
  Created by IntelliJ IDEA.
  User: Nguyen Quoc Tuan
  Date: 27/07/2019
  Time: 3:55 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>Jsp page</title>

    <link rel="stylesheet" href="css/main.css">

</head>
<body>
<div class="container-table100">
    <div class="wrap-table100">
        <div class="table100">
            <table>
                <thead>
                <tr class="table100-head">
                    <th class="column1"><font style="vertical-align: inherit;"><font
                            style="vertical-align: inherit;">ID</font></font></th>
                    <th class="column2"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Name</font></font>
                    </th>
                    <th class="column3"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Age</font></font>
                    </th>
                    <th class="column4"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Address</font></font>
                    </th>
                    <th class="column6"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Function</font></font>
                    </th>
                </tr>
                </thead>

                <tbody>

                <% try {
                    StudentModel model = new StudentModel();
                    List<Student> list = null;
                    list = model.getList();
                    for (Student s : list) {
                %>
                <tr>
                    <td class="column1"><font style="vertical-align: inherit;"><font
                            style="vertical-align: inherit;"><%= s.getId()%>
                    </font></font></td>
                    <td class="column2"><font style="vertical-align: inherit;"><font
                            style="vertical-align: inherit;"><%= s.getName() %>
                    </font></font></td>
                    <td class="column3"><font style="vertical-align: inherit;"><font
                            style="vertical-align: inherit;"><%= s.getAge() %>
                    </font></font></td>
                    <td class="column4"><font style="vertical-align: inherit;"><font
                            style="vertical-align: inherit;"><%= s.getAddress() %>
                    </font></font></td>
                    <td class="column6"><a href="new.jsp" style="background: blue;color: white; text-decoration: none;">Sửa</a>
                        <a
                                href="new.jsp" style="background: red ;color: white ; text-decoration: none;">Xóa</a>
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

                </tbody>
            </table>
            <a href="new.jsp">Add new</a>
        </div>
    </div>

</div>
</body>
</html>
