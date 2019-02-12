import java.util.Scanner;

public class Bai6 {
        // tim UCLN va BCNN cua 2 so nguyen .
    public static void main(String[] args) {
        System.out.print("a= ");
        int a= new Scanner(System.in).nextInt();
        System.out.print("b= ");
        int b = new Scanner(System.in).nextInt();
        int c=a*b;
        while (a!=b){
           if (a>b) a=a-b;
            else b=b-a;
        }
        System.out.println("UCLN= "+a);
        System.out.println("BCNN= "+(c/a));

    }
}
