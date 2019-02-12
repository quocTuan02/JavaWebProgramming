import java.util.Scanner;

public class Bai5d {
        // tinh tong  S= 1/2 + 1/4 +1/6+ ... +1/2n .
    public static void main(String[] args) {
        System.out.print("n= ");
        int n = new Scanner(System.in).nextInt();
        double sum=0;
        for (int i=1;i<=n;i++) sum+=1/(i*2.0);
        System.out.println("sum = "+sum);

    }
}
