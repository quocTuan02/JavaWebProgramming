import java.util.Scanner;

public class Bai5e {
        // tinh tong  S= 1+1/3 + 1/5 +1/7+ ... +1/(2n+1) .
    public static void main(String[] args) {
        System.out.print("n= ");
        int n = new Scanner(System.in).nextInt();
        double sum=0;
        for (int i=0;i<=n;i++) sum+=1/(i*2.0+1);
        System.out.println("sum = "+sum);

    }
}
