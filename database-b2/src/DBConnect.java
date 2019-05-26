import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
    public Connection getConn() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String conStr = "jdbc:mysql://localhost:3306/TracNghiem";
        String user = "root";
        String password = "vannhucu";
        Connection connection = DriverManager.getConnection(conStr, user, password);
        return connection;
    }

}
