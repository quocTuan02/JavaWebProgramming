import java.util.Scanner;

public class Bai3a {
        // kiem tra n co phai so nguyen to
    public static void main(String[] args){
        while (true){
            Scanner input= new Scanner(System.in);
            System.out.print("nhap so n= ");
            int n= input.nextInt();
            int m=1;
            if (n<2) m=0;
            else for (int i=2;i<= Math.sqrt(n);i++) {
                if (n % i == 0) {
                    m=0;
                    System.out.println(i);
                }
            }
            if (m==1) System.out.printf("%d la so nguyen to\n",n);
            else System.out.printf("%d  khong phai so nguyen to\n",n);
        }

    }

}
