package servlets;

import DB.Student;
import DB.StudentModel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "add", urlPatterns = "/add")
public class add extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StudentModel model = new StudentModel();
        Student student = new Student();
        student.setName(request.getParameter("name"));
        student.setAge(Integer.parseInt(request.getParameter("age")));
        student.setAddress(request.getParameter("address"));
        try {
            model.addNew(student);

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
