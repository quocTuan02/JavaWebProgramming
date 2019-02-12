import java.util.Scanner;

public class Bai4a {
    public static void main(String[] args){
// in ra tam giac can  dac chieu cao h
        System.out.printf("Nhap chieu cao h: ");
        int h = new Scanner(System.in).nextInt();
        int j;
        for (int i=1; i<=h;i++)
        {
            for ( j = 1;j <= h-i; j++)System.out.print("   ");
            for ( j = 1; j <= 2*i-1; j++) System.out.print(" * ");
            System.out.println("");
        }
    }
}
