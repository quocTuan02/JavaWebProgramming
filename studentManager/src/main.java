import java.util.Scanner;

/**
 * Viết chương tình quản lý danh sách Học viên và đánh giá kết quả học tập.
 */
public class main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("---MENU---");
            System.out.println("1. Nhap");
            System.out.println("2. Danh sach");
            System.out.println("3. Top 3");
            System.out.println("4. Thoat");
            System.out.print("Chon > ");
            int c = Integer.parseInt(scanner.nextLine());
            switch (c) {
                case 1:
                    manager.addStudent();
                    break;
                case 2:
                    manager.list();
                    break;
                case 3:
                    // chưa xong
                    manager.showTop(3);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhap sai");
            }
        } while (true);

    }
}
