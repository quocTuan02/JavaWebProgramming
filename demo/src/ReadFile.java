import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

class ReadFile {
    public static void main(String[] args) throws IOException {
//        Scanner scanner =
//        new Scanner(new File("C:\\Users\\oOo\\Desktop\\demo.txt"));// open file to read
//        // đọc toàn bộ dòng trong file
//        while (scanner.hasNextLine()){
//            String lineData = scanner.nextLine();
//            System.out.println(lineData);
//        }
//        scanner.close();//đóng file sau khi đọc


        try (Scanner scanner = new Scanner(new File("C:\\Users\\oOo\\Desktop\\demo.txt"))){
            while (scanner.hasNextLine()){
            String lineData = scanner.nextLine();
            System.out.println(lineData);
            }
        }catch (Exception e){

        }
    }

}