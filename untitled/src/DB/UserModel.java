package DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserModel {
    public void setUser(User user) throws SQLException, ClassNotFoundException {
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

    public User getUser(String username, String password) throws SQLException, ClassNotFoundException {

        DBConnect db = new DBConnect();
        Connection connect = db.getConnect();
        String sql = "SELECT * FROM qlythuvien.user where user.username =? and user.password = ?;";
        PreparedStatement pstmt = connect.prepareStatement(sql);
        pstmt.setString(1, username);
        pstmt.setString(2, password);

        ResultSet resultSet = pstmt.executeQuery();

        User user = new User();
        while (resultSet.next()) {

            user.setUsername(resultSet.getString("username"));
            user.setPassword(resultSet.getString("password"));
            user.setFullname(resultSet.getString("fullname"));
            user.setEmail(resultSet.getString("email"));
            user.setAddress(resultSet.getString("address"));
        }

        return user;
    }

    public static void main(String[] args) {


        try {
            UserModel model = new UserModel();
            User user = model.getUser("linhsk3", "root123");
            System.out.printf("%-20s%-20s \n", "username", user.getUsername());
            System.out.printf("%-20s%-20s \n", "password", user.getPassword());
            System.out.printf("%-20s%-20s \n", "fullname", user.getFullname());
            System.out.printf("%-20s%-20s \n", "email", user.getEmail());
            System.out.printf("%-20s%-20s \n", "address", user.getAddress());
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
