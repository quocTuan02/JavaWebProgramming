import java.sql.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String connStr = "jdbc:mysql://localhost:3306/qlthuvien";
            String user = "root";
            String password = "vannhucu";
            Connection conn = DriverManager.getConnection(connStr, user, password);

            if (conn != null) {
                System.out.println("ket noi thanh cong");
                System.out.println("==================");
                //sau khi ket noi thành công


                // Tim những đọc giả mượn sách theo ngày
                while (true) {
                    System.out.print("1.    Hiển thị tên, khoa của các độc giả và sắp xếp theo khoa\n" +
                            "2.    Tim những đọc giả mượn sách theo ngày\n" +
                            "3.    Hiển thị tên, số thẻ, tên sách của tất cả đọc giả mượn sách theo tháng\n" +
                            "4.    Danh sách các sách không ai mượn\n" +
                            "5.    Số lần mượn sách của từng đọc giả\n" +
                            "6.  Danh sách tên, số thẻ, các độc giả chưa trả sách\n"
                            + "chọn: ");
                    int choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1: {
                            // Hiển thị tên, khoa của các độc giả và sắp xếp theo khoa

                            String sql = "SELECT * FROM docgia ORDER By khoa";
                            PreparedStatement pstmt = conn.prepareStatement(sql);
                            ResultSet rs = pstmt.executeQuery();
                            while (rs.next()) {
                                System.out.printf("%-30s%s\n"
                                        , rs.getString("ten")
                                        , rs.getString("khoa")
                                );
                            }
                            break;
                        }
                        case 2: {
                            //Tim những đọc giả mượn sách theo ngày
                            System.out.printf("Tên sách: ");
                            String name = scanner.nextLine();
                            System.out.printf("Ngày mượn (dd/mm/yyyy): ");
                            String date = scanner.nextLine();

                            String sql = "select dg.ten from phieumuon as pm\n" +
                                    "join DOCGIA as dg on pm.sothe = dg.sothe\n" +
                                    "join SACH as s on pm.masach = s.masach\n" +
                                    "where s.ten = ? and pm.ngaymuon = STR_TO_DATE(?, '%d/%m/%Y')";

                            PreparedStatement pstmt = conn.prepareStatement(sql);
                            pstmt.setString(1, name);
                            pstmt.setString(2, date);

                            ResultSet rs = pstmt.executeQuery();
                            while (rs.next()) {
                                System.out.println(rs.getString("ten"));
                            }
                            break;
                        }
                        case 3: {
                            //Hiển thị tên, số thẻ, tên sách của tất cả đọc giả mượn sách theo thoi gian

                            System.out.printf("Từ ngày (dd/mm/yyyy): ");
                            String startDate = scanner.nextLine();
                            System.out.printf("Đến ngày (dd/mm/yyyy): ");
                            String endDate = scanner.nextLine();
                            String sql = "select dg.ten, pm.sothe, s.ten from PHIEUMUON as pm\n" +
                                    "join DOCGIA as dg on pm.sothe = dg.sothe\n" +
                                    "join SACH as s on pm.masach = s.masach\n" +
                                    "where pm.ngaymuon between STR_TO_DATE(?, '%d/%m/%Y') " +
                                    "and STR_TO_DATE(?, '%d/%m/%Y')";
                            PreparedStatement pstmt = conn.prepareStatement(sql);
                            pstmt.setString(1, startDate);
                            pstmt.setString(2, endDate);
                            ResultSet rs = pstmt.executeQuery();
                            System.out.printf("%-10s%-20s%-10s\n","mã thẻ","tên độc giả","tên sách");
                            while (rs.next()) {
                                System.out.printf("%-10s%-20s%-10s\n"
                                        , rs.getString(2)
                                        , rs.getString(1)
                                        , rs.getString(3)
                                );
                            }

                            break;
                        }
                        case 4: {
                            //Danh sách các sách không ai mượn


                            break;
                        }
                        case 5: {
                            break;
                        }
                        case 6: {
                            break;
                        }

                    }


                }

            } else System.out.printf("that bai");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
