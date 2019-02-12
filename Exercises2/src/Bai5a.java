import java.util.Scanner;

public class Bai5a {
        // tinh tong so nguyen S= 1/2 + 1/3 +1/4+ ... +1/n .
    public static void main(String[] args) {
        System.out.print("n= ");
        int n = new Scanner(System.in).nextInt();
        double sum=0;
        for (int i=1;i<=n;i++) sum+=1/(i*1.0);
        System.out.println("sum = "+sum);

    }
}
