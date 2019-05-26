import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
    public Connection getConnct(String database) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String conStr = "jdbc:mysql://localhost:3306/"+database;
        String user ="root";
        String password = "vannhucu";
        Connection connection = DriverManager.getConnection(conStr,user,password);
        return connection;
    }
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DBConnect dbConnect = new DBConnect();
        if (dbConnect.getConnct("tracnghiem")!=null){
            System.out.printf("thanh cong");
        }
    }

}
