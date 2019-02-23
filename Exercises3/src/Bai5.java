import java.util.Scanner;

public class Bai5 {
    public static void main (String[] arge){
        /*
        Nhập vào 2 vector 3 chiều A(xa, ya, za) và B(xb, yb, zb). Tính
        - Tổng 2 vector
        - Tích vô hướng 2 vector
         */
        System.out.println("nhập vector A:");
        int[] a = new int[3];
        for (int i=0; i<a.length;i++){
            System.out.printf("a[%d]= ",i);
            a[i]= new Scanner(System.in).nextInt();
        }
        System.out.println("\nnhap vector B: ");
        int[] b = new int[3];
        for (int i=0; i<b.length;i++){
            System.out.printf("b[%d]= ",i);
            b[i]= new Scanner(System.in).nextInt();
        }
        // tổng 2 vector
        System.out.println("tổng của 2 vector: ");
        int[] c = new int[3];
        for (int i=0; i<c.length;i++){
            c[i]=a[i]+b[i];
        }

        System.out.printf("A(%d;%d;%d)+B(%d;%d;%d)=C(%d;%d;%d)",a[0],a[1],a[2],b[0],b[1],b[2],c[0],c[1],c[2]);

        // tính tích vô hướng của 2 vector
        int temp =0;
        for (int i=0; i<c.length;i++) {
            temp = temp + a[i] * b[i];
        }
        System.out.println("\ntích vô hướng của 2 vector = "+temp);


    }
}
