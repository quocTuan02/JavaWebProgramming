import java.util.Scanner;

public class Bai4b {
    public static void main(String[] args){
// in ra tam giac can  rong chieu cao h
        System.out.printf("Nhap chieu cao h: ");
        int h = new Scanner(System.in).nextInt();
        int k=h-1;
        for (int i=0; i<h-1;i++) {
            for (int j=0;j<2*h-1;j++){
                if (j== k-i||j==k+i) System.out.printf(" %d ",j);
                else System.out.print("   ");
            }
            System.out.println("");
        }
       for (int i=0;i< 2*h-1;i++) System.out.printf(" %d ",i);
    }

}
