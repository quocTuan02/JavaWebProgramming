package web;

import DB.User;
import DB.UserModel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

//@WebServlet(name = "signUp")
public class signUp extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {

        try {
            PrintWriter out = response.getWriter();

            User user = new User();

            user.setUsername(request.getParameter("username"));
            user.setPassword(request.getParameter("password"));
            user.setFullname(request.getParameter("fullname"));
            user.setEmail(request.getParameter("email"));
            user.setAddress(request.getParameter("address"));

            UserModel userModel = new UserModel();
            userModel.clgv(user);


            out.printf("%-20s%-20s </br>", "username", user.getUsername());
            out.printf("%-20s%-20s </br>", "password", user.getPassword());
            out.printf("%-20s%-20s </br>", "fullname", user.getFullname());
            out.printf("%-20s%-20s </br>", "email", user.getEmail());
            out.printf("%-20s%-20s </br>", "address", user.getAddress());



        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
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
