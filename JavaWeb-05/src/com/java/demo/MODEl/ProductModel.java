package com.java.demo.MODEl;

import com.java.demo.BEAN.Products;
import com.java.demo.DB.DBConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductModel {
    public List<Products> getList() throws SQLException, ClassNotFoundException {
        DBConnect db = new DBConnect();
        Connection connect = db.getConnect();
        String sql="SELECT * FROM website_showcase.products;";
        PreparedStatement preparedStatement = connect.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<Products> list = new ArrayList<>();
        while (resultSet.next()){
            Products products = new Products();
            products.setId(resultSet.getInt("id"));
            products.setName(resultSet.getString("name"));
            products.setDescription(resultSet.getString("description"));
            products.setAuthor(resultSet.getInt("author_id"));

        }
        return list;
    }
}
