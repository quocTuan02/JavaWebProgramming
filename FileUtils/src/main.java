import java.io.File;
import java.util.Scanner;
/**
 * Xây dựng lớp FileUtils chứa các phương thức để thực hiện các yêu cầu sau
 * ( mỗi yêu cầu viêt thành 1 method trong lớp FileUtils)
 * 1. Lấy ra tất cả các folder có trong đường dẫn
 * ( đường dẫn được truyền vào như là 1 tham số của hàm ).
 * 2. Lấy ra tất cả các ﬁle có trong đường dẫn ( đường dẫn là tham số của hàm )
 * 3. Lấy ra tất cả các ﬁle ảnh có trong đường dẫn
 * ( ﬁle ảnh là ﬁle có đuổi .png, .jpg, .jpeg)
 * 4. Lấy ra tất cả các ﬁle có phần mở rộng ext có trong đường dẫn path
 * ( ext và path là tham số truyền vào của hàm )
 * 5. Lấy ra thời gian cập nhật cuối cùng của ﬁle last modified time
 * ( đường dẫn là tham số truyền vào )
 * 6. In ra kích thước của ﬁle, hiển thị theo type = Mb hoặc Kb
 * ( type là tham số truyền vào)
 * Xây dựng lớp Main, trong lớp Main sử dụng các phương thức của lớp FileUtils
 */
public class main {
    public static void main(String[] args) {
        String str = "C:\\Users\\oOo\\IdeaProjects\\FileUtils\\srcee";
        FileUtils path = new FileUtils(str);
        int choice = 0;

        File f = new File(str);

        System.out.println(f.exists());


//        do {
//            System.out.println("===TEST===");
//            System.out.println("1. Lấy ra tất cả các folder có trong đường dẫn");
//            System.out.println("2. Lấy ra tất cả các ﬁle có trong đường dẫn");
//            System.out.println("3. Lấy ra tất cả các ﬁle ảnh có trong đường dẫn");
//            System.out.println("4. Lấy ra tất cả các ﬁle có phần mở rộng ext có trong đường dẫn path");
//            System.out.println("5. Lấy ra thời gian cập nhật cuối cùng của ﬁle last modified time");
//            System.out.println("6. In ra kích thước của ﬁle, hiển thị theo type = Mb hoặc Kb");
//            System.out.println("7. Exit");
//            System.out.print("*Choice: ");
//            choice = new Scanner(System.in).nextInt();
//
//            switch (choice) {
//                case 1: {
//                    path.folder();
//                    break;
//                }
//                case 2: {
//                    path.file();
//                    break;
//                }
//                case 3: {
//                    path.fileImg();
//                    break;
//                }
//                case 4: {
//                    path.fileExt();
//                    break;
//                }
//                case 5: {
//                    path.lastModfiedDate(str);
//                    break;
//                }
//                case 6: {
//                    path.size(str);
//                    break;
//                }
//                case 7: {
//                    System.exit(0);
//                    break;
//                }
//            }
//
//        } while (true);
    }
}
