import java.util.Scanner;

public class Bai5f {
        // tinh tong so nguyen S= 1+1/(1+2)+ 1/(1+2+3)+ ... +1/(1+2+3+4+5+..+n) .
    public static void main(String[] args) {
        System.out.print("n= ");
        int n = new Scanner(System.in).nextInt();
        int count=0;
        double sum=0;
        for (int i=1;i<=n;i++){
            count+=i;
            sum+=1/(count*1.0);
        }
        System.out.println("sum = "+sum);

    }
}
