import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        /*
        Nhập vào mảng số nguyên 5 phần tử và một số nguyên a từ bàn phím.
        - Kiểm tra xem số nguyên a có trong mảng không.
        - Neu có in ra vị trí số đó có trong mảng
         */
        System.out.print("Nhập số nguyên a: ");
        int a = new Scanner(System.in).nextInt();

        System.out.println("Nhập mảng số nguyên 5 phần tử: ");
        int[] number = new int[5];
        for (int i = 0; i < number.length; i++) {
            System.out.printf("number[%d]= ", i);
            number[i] = new Scanner(System.in).nextInt();
        }

        int temp = 0;
        for (int i = 0; i < number.length; i++) {
            if (a == number[i]) {
                System.out.printf("%d nằm ở vị trí %d trong mảng \n", a, (i + 1));
                temp = 1;
            }
        }
        if (temp == 1) System.out.printf("==> %d tồn tại trong mảng", a);
        else System.out.printf("==> %d không tồn tại trong mảng", a);

    }
}
