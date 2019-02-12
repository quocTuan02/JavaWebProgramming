import java.util.Scanner;

public class Bai2 {
         // tinh n giai thua .
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("nhap n= ");
        int n= input.nextInt();
        int giaiThua=1;
        for (int i=1;i<=n;i++) giaiThua*=i;
        System.out.printf("%d!=%d",n,giaiThua);
    }
}
