import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
    public Connection getConnct() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String conStr = "jdbc:mysql://localhost:3306/qlthuvien";
        String user ="root";
        String password = "vannhucu";
        String url;
        Connection connection = DriverManager.getConnection(conStr,user,password);
        return connection;
    }

}
