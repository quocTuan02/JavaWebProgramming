package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
    public Connection getConnect() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String conStr = "jdbc:mysql://localhost:3306/NEWS?autoReconnect=true&useSSL=false";
        String user = "root";
        String password = "root123";
        Connection connection = DriverManager.getConnection(conStr, user, password);
        return connection;
    }

}
