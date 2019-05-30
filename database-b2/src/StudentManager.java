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

    public Student login(String email, String password) throws SQLException {
        String sql = "select * from students where email = ? and pass = ?;";
        PreparedStatement pstmt = this.conn.prepareStatement(sql);
        pstmt.setString(1, email);
        pstmt.setString(2, password);

        ResultSet rs = pstmt.executeQuery();
        Student student = null;
        if (rs.next()) {
            student = new Student(rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("email"),
                    rs.getString("pass")
            );
        }
        return student;
    }





}
