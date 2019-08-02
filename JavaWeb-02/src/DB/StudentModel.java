package DB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentModel {

    public List<Student> getList() throws SQLException, ClassNotFoundException {
        DBConnect db = new DBConnect();
        Connection connect = db.getConnect();
        String sql = "SELECT * FROM qlsv.student;";
        PreparedStatement pstmt = connect.prepareStatement(sql);
        ResultSet resultSet = pstmt.executeQuery();
        List<Student> list = new ArrayList<>();
        while (resultSet.next()) {
            Student student = new Student();
            student.setId(resultSet.getString("id"));
            student.setName(resultSet.getString("name"));
            student.setAge(resultSet.getInt("age"));
            student.setAddress(resultSet.getString("address"));

            list.add(student);
        }

        return list;

    }

    public Student searchById(String id) throws SQLException, ClassNotFoundException {
        List<Student> list = getList();
        for (Student s : list) {
            if (s.getId().equals(id)) {
                return s;
            }
        }
        return null;
    }

    public int removeById(String id) throws SQLException, ClassNotFoundException {
        DBConnect db = new DBConnect();
        Connection connect = db.getConnect();
        String sql = "DELETE FROM `qlsv`.`student` WHERE (`id` = ?);";
        PreparedStatement pstmt = connect.prepareStatement(sql);
        pstmt.setString(1, id);

        return pstmt.executeUpdate();
    }

    public int updateById(String id, Student student) throws SQLException, ClassNotFoundException {
        DBConnect db = new DBConnect();
        Connection connect = db.getConnect();
        String slq = "UPDATE `qlsv`.`student` SET `name` = ?, `age` = ?, `address` = ? " +
                " WHERE (`id` = ?);";
        PreparedStatement pstmt = connect.prepareStatement(slq);

        pstmt.setString(1, student.getName());
        pstmt.setInt(2, student.getAge());
        pstmt.setString(3, student.getAddress());
        pstmt.setString(4, id);

        return pstmt.executeUpdate();

    }

    public int addNew(Student student) throws SQLException, ClassNotFoundException {
        DBConnect db = new DBConnect();
        Connection conn = db.getConnect();
        String sql = "INSERT INTO `qlsv`.`student` (`name`, `age`, `address`) VALUES (?, ?, ?);";
        PreparedStatement pstmt = conn.prepareStatement(sql);

        pstmt.setString(1, student.getName());
        pstmt.setInt(2, student.getAge());
        pstmt.setString(3, student.getAddress());

        return pstmt.executeUpdate();

    }


    public static void main(String[] args) {

        try {
            StudentModel model = new StudentModel();
            List<Student> list = null;
            list = model.getList();
            for (Student s : list) {
                System.out.printf("%-20s%-20s%-20s%-20s\n",
                        s.getId(), s.getName(), s.getAge(), s.getAddress()
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


}