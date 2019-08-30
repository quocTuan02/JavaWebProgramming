import java.util.Scanner;

public class Bai4a {
    // nhap vao so nguyen den khi nhap so 0 thi dung lai in ra so lon nhat .
    public static void main(String[] args) {
        System.out.println("nhap so nguyen :");
        int a = Integer.MIN_VALUE, n;
        do {
            n = new Scanner(System.in).nextInt();
            if (n >= a) a = n;
        } while (n != 0);
        System.out.println("max = " + a);

    }
}
