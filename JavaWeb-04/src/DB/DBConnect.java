package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
    public Connection getConnect() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String connStr = "jdbc:mysql://lacalhost:3306/news";
        String user = "root";
        String password = "root123";
        Connection connection = DriverManager.getConnection(connStr, user, password);
        return connection;

    }
}
