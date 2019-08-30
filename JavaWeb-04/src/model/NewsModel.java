package model;

import DB.DBConnect;
import DTO.News;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class NewsModel {
    //1. get all
    public List<News> getAll() throws SQLException, ClassNotFoundException {
        DBConnect db = new DBConnect();
        Connection connect = db.getConnect();
        String sql = "select * from news.news";
        PreparedStatement preparedStatement = connect.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<News> list = new ArrayList<>();
        while (resultSet.next()){
            News news = new News();
            news.setId(resultSet.getInt("id"));

        }

        return list;
    }

    //2. get by id
    public News getById(int id) {
        return null;
    }

    //3. create
    public int create(News news) {
        return 0;
    }

    //4. update
    public int update(News news) {
        return 0;
    }

    //5. delete
    public int detele(int id) {
        return 0;
    }


}
