import java.util.Scanner;

public class Bai7 {
        // in ra tat ca day Fibonaci < n .
    public static void main(String[] args) {
        System.out.print("n= ");
        int n = new Scanner(System.in).nextInt();
        long f0=0;
        long f1 = 1;
        long fn=0;
        for (int i=0;i<=n;i++){
            if(i<2) System.out.println(+i);
            else {
                fn=f0+f1;
                f1=fn;
                f0=f1;
                System.out.println(+fn);
            }
        }
    }
}
