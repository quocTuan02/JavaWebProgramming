import java.util.Scanner;

public class Bai5 {
    public static void main (String[] args){

        Scanner input= new Scanner(System.in);
        System.out.print(" chieu dai m: ");
            int m =input.nextInt();
        System.out.print(" chieu cao n: ");
            int n=input.nextInt();
        // in ra hinh chu nhat dac kich thuoc m*n
        System.out.printf("hinh chu nhat dac kich thuoc %d*%d \n",m,n);
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(" * ");
            }
            System.out.println("");
        }
        // in ra hinh chu nhat rong kich thuoc m*n
        System.out.printf("\nhinh chu nhat rong kich thuoc %d*%d \n",m,n);
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
             if (i==0||i==n-1||j==0||j==m-1) System.out.print(" * ");
             else System.out.print("   ");
            }
            System.out.println("");
        }

    }
}
