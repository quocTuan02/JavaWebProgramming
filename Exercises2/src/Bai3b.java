import java.util.Scanner;

public class Bai3b {
        // in ra n so nguyen to dau tien .
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("nhap  n= ");
        int n = input.nextInt();
        int x = 1, dem = 0;

        while (true) {
            int m = 1;
            if (x < 2) m = 0;
            else for (int i = 2; i <= Math.sqrt(x); i++) {
                     if (x % i == 0) m = 0;
                }
            if (m == 1) {
                System.out.println(x);
                dem++;
            }
            x++;
            if (dem == n) break;
        }


    }
}




