import javax.print.DocFlavor;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        StudentManager student =new StudentManager();
        Student b=new Student("Tuấn","Linhty1802@gmail.com",19),
                c=new Student("Linh","Thuong1802@gmail.com",20),
                d=new Student("Anh","Pa.dao1802@gmail.com",20);
        Scanner scanner=new Scanner(System.in);
        student.add(b);
        student.add(c);
        student.add(d);
        int choice =0;
        do {
            System.out.println("---Student Manager---");
            System.out.println("1.\tList");
            System.out.println("2.\tSearch");
            System.out.println("3.\tAdd");
            System.out.println("4.\tExit");
            System.out.print("Choice: ");
            choice=scanner.nextInt();

            switch (choice){
                case 1:{
                    student.list();
                    break;
                }
                case 2:{
                    student.search();
                    break;
                }
                case 3:{
                    student.add();
                    break;
                }
                case 4:{
                    break;
                }
            }
        }while (choice!=4);

    }
}
