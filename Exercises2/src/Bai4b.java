import java.util.Scanner;

public class Bai4b {
        // nhap vao  so nguyen den khi nhap so 0 thi dung lai in ra so nho nhat .
    public static void main(String[] args) {
        System.out.println("nhap so nguyen :");

        int a=Integer.MAX_VALUE,n=a;
        do {
            if (n<=a) a=n;
            n = new Scanner(System.in).nextInt();

        } while (n!=0);
        System.out.println("min = "+a);

    }

}
