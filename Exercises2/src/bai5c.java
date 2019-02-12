import java.util.Scanner;

public class bai5c {
        // tinh tong S= 1^2 + 2^2 +3^2+ ... +n^2 .
    public static void main(String[] args) {
        System.out.print("n= ");
        int n = new Scanner(System.in).nextInt();
        int sum=0;
        for (int i=1;i<=n;i++) sum+=i*i;
        System.out.println("sum = "+sum);

    }
}
