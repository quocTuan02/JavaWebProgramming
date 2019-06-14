package Demo;

import java.io.*;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.Vector;

class ReadFile {
    public static void main(String[] args)  {


//        Scanner scanner =
//        new Scanner(new File("C:\\Users\\oOo\\Desktop\\Demo.User.txt"));// open file to read
//        // đọc toàn bộ dòng trong file
//        while (scanner.hasNextLine()){
//            String lineData = scanner.nextLine();
//            System.out.println(lineData);
//        }
//        scanner.close();//đóng file sau khi đọc

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("lim.dat"));

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (Scanner scanner = new Scanner(new File("C:\\Users\\oOo\\Desktop\\Demo.User.txt"))){
            while (scanner.hasNextLine()){
            String lineData = scanner.nextLine();
            System.out.println(lineData);
            }
        }catch (Exception e){

        }
    }

}