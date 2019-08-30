package com.java.demo.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
    public Connection getConnect() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String connectStr = "jdbc:mysql://localhost:3306/website_showcase";
        String user = "root";
        String password = "root123";

        Connection connection = DriverManager.getConnection(connectStr, user, password);
        return connection;

    }
}
