import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentManager {
    private Connection conn;

    public StudentManager() throws SQLException, ClassNotFoundException {
        DBConnect dbConnect = new DBConnect();
        this.conn = dbConnect.getConn();
    }

    public boolean login(String email,String password) throws SQLException {
        String sql = "select * from students where email = ? and pass = ?;";
        PreparedStatement  pstmt = this.conn.prepareStatement(sql);
        pstmt.setString(1,email);
        pstmt.setString(2,password);

        ResultSet rs = pstmt.executeQuery();;

        return rs.next();
    }

}
