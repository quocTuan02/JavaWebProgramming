package servlet;

import DB.News;
import DB.NewsModel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "news", urlPatterns = "/news")
public class news extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            NewsModel model = new NewsModel();

            int totalNews = model.countNews();
            int currentPage = 1;
            int recordsPerPage = 3;
            int totalPage = (totalNews / recordsPerPage) + (totalNews % recordsPerPage == 0 ? 0 : 1);

            String currPage = request.getParameter("page");
            if (currPage != null) {
                currentPage = Integer.parseInt(currPage);
            }

            List<News> list = model.getlist(recordsPerPage, recordsPerPage * (currentPage - 1));

            request.setAttribute("currentPage", currentPage);
            request.setAttribute("total", totalPage);
            request.setAttribute("list", list);

            request.getRequestDispatcher("index.jsp").forward(request, response);

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
