package DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserModel {
    public void clgv(User user) throws SQLException, ClassNotFoundException {
        DBConnect db = new DBConnect();
        Connection connect = db.getConnect();
        String sql = "INSERT INTO `user`.`user` (`username`, `password`, `fullname`, `email`, `address`) " +
                " VALUES (?, ?, ?, ?, ?);";
        PreparedStatement pstmt = connect.prepareStatement(sql);
        pstmt.setString(1, user.getUsername());
        pstmt.setString(2, user.getPassword());
        pstmt.setString(3, user.getFullname());
        pstmt.setString(4, user.getEmail());
        pstmt.setString(5, user.getAddress());

    }
}
