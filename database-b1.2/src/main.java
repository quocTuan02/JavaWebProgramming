import java.sql.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            DBQuery dbQuery = new DBQuery();
            while (true) {
                System.out.printf("\n1. Hiển thị tên, khoa của các độc giả và sắp xếp theo khoa\n" +
                        "2. Tim những đọc giả mượn sách theo ngày\n" +
                        "3. Hiển thị tên, số thẻ, tên sách của tất cả đọc giả mượn sách theo thời gian\n" +
                        "4. Danh sách các sách không ai mượn\n" +
                        "5. Đếm số lần mượn sách của đọc giả\n" +
                        "6. Danh sách tên, số thẻ, các độc giả chưa trả sách\n" +
                        "7. Thoát.\n" +
                        "\tchọn: "
                );
                int chiose = Integer.parseInt(scanner.nextLine());
                switch (chiose) {
                    case 1: {
                        ResultSet rs = dbQuery.get1();
                        System.out.printf("%-8s%-20s%10s\n\n", "Số thẻ", "Tên đọc giả", "Khoa");
                        while (rs.next()) {
                            System.out.printf("%-8s%-20s%10s\n",
                                    rs.getString(1),
                                    rs.getString(2),
                                    rs.getString(3)
                            );
                        }
                        break;
                    }
                    case 2: {
                        System.out.printf("Tên sách: ");
                        String name = scanner.nextLine();
                        System.out.printf("Ngày (dd/mm/YYYY): ");
                        String date = scanner.nextLine();
                        ResultSet rs = dbQuery.get2(name, date);
                        System.out.println("Tên đọc giả\n");
                        while (rs.next()) {
                            System.out.println(rs.getString(1));
                        }
                        break;
                    }
                    case 3: {
                        System.out.printf("Bắt đầu từ ngày (dd/mm/YYYY): ");
                        String startDate = scanner.nextLine();
                        System.out.print("Ngày kết thúc (dd/mm/YYYY): ");
                        String endDate = scanner.nextLine();
                        ResultSet rs = dbQuery.get3(startDate, endDate);
                        System.out.printf("%-20s%-8s%-10s\n", "Tên", "Số thẻ", "Tên sách");
                        while (rs.next()) {
                            System.out.printf("%-20s%-8s%-10s\n",
                                    rs.getString(1),
                                    rs.getString(2),
                                    rs.getString(3)
                            );
                        }
                        break;
                    }
                    case 4: {
                        ResultSet rs = dbQuery.get4();
                        System.out.println("Tên sách");
                        while (rs.next()) {
                            System.out.println(rs.getString(1));
                        }
                        break;
                    }
                    case 5: {
                        System.out.printf("Tên đọc giả: ");
                        String name = scanner.nextLine();
                        ResultSet rs = dbQuery.get5(name);
                        if (rs.next()) System.out.println("Số lần: " + rs.getString(1));
                        break;
                    }
                    case 6: {
                        ResultSet rs = dbQuery.get6();
                        System.out.printf("%-8s%-20s%-10s%-15s%-20s\n",
                                "Số thẻ",
                                "Tên đọc giả",
                                "Khoa",
                                "Khóa học",
                                "Thời hạn thẻ"
                        );
                        while (rs.next()) {
                            System.out.printf("%-8s%-20s%-10s%-15s%-20s\n",
                                    rs.getString(1),
                                    rs.getString(2),
                                    rs.getString(3),
                                    rs.getString(4),
                                    rs.getString(5)
                            );
                        }
                        break;
                    }
                    case 7: {
                        System.exit(0);
                        break;
                    }
                    default:
                        System.out.println("Not valid");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
