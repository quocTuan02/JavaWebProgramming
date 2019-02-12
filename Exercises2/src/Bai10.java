import java.util.Scanner;

public class Bai10 {
        //kiem tra tinh doi xung cua 1 so .
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("nhap n= ");
        int n = input.nextInt();
        int tg =n;
        int sum=0;
        while (n>0){
            sum=sum*10+n%10;
            n/=10;  
        }
        if(sum==tg) System.out.printf("%d la so doi xung",tg);
            else System.out.printf("%d khong phai la so doi xung",tg);
    }
}
