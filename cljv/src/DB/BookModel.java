package DB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookModel {
    public List<Book> getList() throws SQLException, ClassNotFoundException {
        DBConnect db = new DBConnect();
        Connection conn = db.getConn();
        String sql = "SELECT * FROM bookmanager.book;";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<Book> list = new ArrayList<>();

        while (resultSet.next()) {
            Book book = new Book();
            book.setId(resultSet.getString("id"));
            book.setTitle(resultSet.getString("title"));
            book.setAuthor(resultSet.getString("author"));
            book.setPrice(Double.parseDouble(resultSet.getString("price")));
            book.setQuantity(Integer.parseInt(resultSet.getString("quantity")));

            list.add(book);
        }
        return list;
    }


    public int addNew(Book book) throws SQLException, ClassNotFoundException {
        DBConnect db = new DBConnect();
        Connection conn = db.getConn();
        String sql = "INSERT INTO `bookmanager`.`book` (`title`, `author`, `price`, `quantity`) VALUES (?, ?, ?, ?);";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(1, book.getTitle());
        preparedStatement.setString(2, book.getAuthor());
        preparedStatement.setDouble(3, book.getPrice());
        preparedStatement.setInt(4, book.getQuantity());

        return preparedStatement.executeUpdate();

    }

    public int removeById(String id) throws SQLException, ClassNotFoundException {
        DBConnect db = new DBConnect();
        Connection connect = db.getConn();
        String sql = "DELETE FROM `bookmanager`.`book` WHERE (`id` = ?);\n";
        PreparedStatement pstmt = connect.prepareStatement(sql);
        pstmt.setString(1, id);

        return pstmt.executeUpdate();
    }

    public int update(Book book) throws SQLException, ClassNotFoundException {
        DBConnect db = new DBConnect();
        Connection connect = db.getConn();
        String sql = "UPDATE `bookmanager`.`book` SET `title` = ?, `author` = ?, `price` = ?, `quantity` = ? " +
                " WHERE (`id` = ?);";
        PreparedStatement preparedStatement = connect.prepareStatement(sql);
        preparedStatement.setString(1, book.getTitle());
        preparedStatement.setString(2, book.getAuthor());
        preparedStatement.setDouble(3, book.getPrice());
        preparedStatement.setInt(4, book.getQuantity());
        preparedStatement.setString(5, book.getId());


        return preparedStatement.executeUpdate();
    }


    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            BookModel model = new BookModel();
            List<Book> list = model.getList();
            for (Book b : list) {
                System.out.printf("%-5s%-20s%-20s%-20d%-20d\n",
                        b.getId(), b.getTitle(), b.getAuthor(),
                        b.getPrice(), b.getQuantity());
            }

            System.out.println("thêm Mới ");
            System.out.print("tên sách:");
            String title = scanner.nextLine();
            System.out.print("tác giả:");
            String author = scanner.nextLine();
            System.out.printf("giá tiền");
            String price = scanner.nextLine();
            System.out.printf("Số lượng:");
            String quangtity = scanner.nextLine();

            Book book = new Book();
            book.setTitle(title);
            book.setAuthor(author);
            book.setPrice(Integer.parseInt(price));
            book.setQuantity(Integer.parseInt(quangtity));

            model.addNew(book);

            list = model.getList();
            for (Book b : list) {
                System.out.printf("%-5s%-20s%-20s%-20d%-20d\n",
                        b.getId(), b.getTitle(), b.getAuthor(),
                        b.getPrice(), b.getQuantity());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

}
