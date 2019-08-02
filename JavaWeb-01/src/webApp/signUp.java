package webApp;

import DB.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(name = "signUp")
public class signUp extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        User user = new User();

        user.setUsername(request.getParameter("username"));
        user.setPassword(request.getParameter("password"));
        user.setFullname(request.getParameter("fullname"));
        user.setEmail(request.getParameter("email"));
        user.setAddress(request.getParameter("address"));

        try (PrintWriter out = response.getWriter()) {
            //   User user = new UserModel().getUser("linhsk3", "root123");

            out.print("<table border=1>\n" +
                    "    <tr>\n" +
                    "        <td>Name</td>\n" +
                    "        <td>Value</td>\n" +
                    "    </tr>\n" +
                    "    <tr>\n" +
                    "        <td>User Name</td>\n" +
                    "        <td> " + user.getUsername() + "</td>\n" +
                    "    </tr>\n" +
                    "    <tr>\n" +
                    "        <td>Password</td>\n" +
                    "        <td> " + user.getPassword() + " </td>\n" +
                    "    </tr>\n" +
                    "    <tr>\n" +
                    "        <td>Full name</td>\n" +
                    "        <td> " + user.getFullname() + "</td>\n" +
                    "    </tr>\n" +
                    "    <tr>\n" +
                    "        <td>Email</td>\n" +
                    "        <td> " + user.getEmail() + " </td>\n" +
                    "    </tr>\n" +
                    "    <tr>\n" +
                    "        <td>Address</td>\n" +
                    "        <td> " + user.getAddress() + "</td>\n" +
                    "    </tr>\n" +
                    "</table>");
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }
}

