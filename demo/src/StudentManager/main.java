package StudentManager;

import java.util.Scanner;

/**
 * Viết chương tình quản lý danh sách Học viên và đánh giá kết quả học tập.
 */
public class main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);
        manager.addStudent("HV125","tuan",8,"0123456789");
        manager.addStudent("HV185","linh",4,"0254668245");
        manager.addStudent("HV145","tung",6,"0245622555");
        manager.addStudent("HV165","na",7,"0123505504");

        do {
            System.out.println("-------MENU-------");
            System.out.println("1. Nhap");
            System.out.println("2. Danh sach");
            System.out.println("3. Top 3");
            System.out.println("4. Thoat");
            System.out.print("Chon > ");
            int c = scanner.nextInt();
            switch (c) {
                case 1:
                    manager.addStudent();
                    break;
                case 2:
                    manager.list();
                    break;
                case 3:
                    // chưa code xong
                    manager.showTop(manager.list,3);
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
