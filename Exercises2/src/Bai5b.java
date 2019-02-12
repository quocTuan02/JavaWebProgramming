import java.util.Scanner;

public class Bai5b {
        // tinh tong S(n)= 1+2+3+...+n  .
    public static void main(String[] args) {
        System.out.print("n= ");
        int n = new Scanner(System.in).nextInt();
        int sum=0;
        for (int i=1;i<=n;i++) sum+=i;
        System.out.println("sum = "+sum);

    }
}
