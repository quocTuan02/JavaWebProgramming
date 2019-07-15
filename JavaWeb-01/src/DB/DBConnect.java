package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
    public Connection getConnect() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String conStr = "jdbc:mysql://localhost:3306/USER";
        String username = "root";
        String password = "root123";
        Connection connection = DriverManager.getConnection(conStr, username, password);

        return connection;
    }
}
