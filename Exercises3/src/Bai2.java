import java.util.Scanner;

public class Bai2 {
    public static void main (String[] args) {
        /*
        Nhập vào mảng số nguyên 5 phần tử. Tìm
        a. Phan tử lớn nhất trong mảng
        b. Phần tử nhỏ nhất trong mảng
        c. Tất cả các phần tử chia hết cho 3
         */
        int[] number = new int[5];
        for (int i=0;i<number.length;i++){
            System.out.printf("number[%d]= ",i);
            number[i] = new Scanner(System.in).nextInt();
        }

        int max = number[0];
        for (int i=0; i<number.length;i++){
            if (number[i]>max) max=number[i];
        }

        int min= number[0];
        for (int i=0; i<number.length;i++){
            if (number[i]<min) min=number[i];
        }

        System.out.println("max= "+max);
        System.out.println("min= "+min);

        System.out.print("Các phần tử chia hết cho 3: ");
        for (int i=0; i< number.length;i++){
            if (number[i]%3==0) System.out.printf("%d\t",number[i] );
        }

//        if (number[1]>max) max=number[1];
//        if (number[2]>max) max=number[2];
//        if (number[3]>max) max=number[3];
//        if (number[4]>max) max=number[4];

    }
}
