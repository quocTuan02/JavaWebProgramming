import java.util.Scanner;

public class Bai3a {
        // kiem tra n co phai so nguyen to
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("nhap so nguyen to n= ");
        int n= input.nextInt();
        int m=1;
        if (n<2) m=0;
            else for (int i=2;i<= Math.sqrt(n);i++) {
                if (n % i == 0) m = 0;
            }
        if (m==1) System.out.printf("%d la so nguyen to",n);
            else System.out.printf("%d  khong phai so nguyen to",n);
    }

}
