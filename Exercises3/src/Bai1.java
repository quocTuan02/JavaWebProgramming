import java.util.Scanner;

public class Bai1 {
    public static void main (String[] args) {
        /*Nhập vào mảng số nguyên 5 phần tử. In ra mảng vừa nhập và
        a. Tính tổng các phần tử trong mảng
        b. Tính tổng các phần tử lẻ
        c. Tính tổng các phần tử chẳn
        */
        int sum=0;
        int[] number = new int[5];
        for (int i=0;i<number.length;i++){
            System.out.printf("number[%d]=",i);
            number[i] = new Scanner(System.in).nextInt();
            sum = sum +number[i];

        }

        int tongChan=0;
        int tongLe=0;
        for (int i=0;i<number.length;i++){
            System.out.printf("\nnumber[%d]= %d",i,number[i]);
            if (number[i]%2==0) tongChan=tongChan+ number[i];
            else tongLe=tongLe+number[i];
        }

        System.out.println("\nsum= "+sum);
        System.out.println("tổng số chẳn: "+tongChan);
        System.out.println("tổng số lẽ: "+tongLe);


    }
}
