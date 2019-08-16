package DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NewsModel {
    public List<News> getlist(int limit, int offset) throws SQLException, ClassNotFoundException {
        DBConnect db = new DBConnect();
        Connection connect = db.getConnect();
        String sql = "SELECT * FROM news LIMIT ? OFFSET ?";
        PreparedStatement preparedStatement = connect.prepareStatement(sql);
        preparedStatement.setInt(1, limit);
        preparedStatement.setInt(2, offset);

        ResultSet resultSet = preparedStatement.executeQuery();
        List<News> list = new ArrayList<News>();
        while (resultSet.next()) {
            News news = new News();
            news.setId(resultSet.getInt("id"));
            news.setTitle(resultSet.getString("title"));
            news.setImage(resultSet.getString("image"));
            news.setSummary(resultSet.getString("summary"));
            news.setContent(resultSet.getString("content"));
            news.setDate(resultSet.getDate("create_at"));
            news.setAuthorId(resultSet.getInt("author_id"));

            list.add(news);
        }
        return list;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        NewsModel model = new NewsModel();
        List<News> list = model.getlist(5, 6);

        for (News news : list) {
            System.out.printf("%-5d%-20s%-30s%-30s%-25s%-20s%-5d\n",
                    news.getId(), news.getTitle(), news.getImage(), news.getSummary(),
                    news.getContent(), news.getDate(), news.getAuthorId()
            );
        }

    }
}

