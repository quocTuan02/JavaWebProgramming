import java.util.Random;

public class Bai1 {
    public static void main(String[] args) {
        /*
        Nhập vào ma trận 2 chiều 3*3. In ra ma trận vừa nhập
       - Tính tổng mỗi hàng của ma trận và in ra
       - Tính tổng mỗi cột của ma trận và in ra.
         */
        Random random = new Random();
        int[][] number = new int[3][3];
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[0].length; j++) {
                number[i][j] = random.nextInt(10);
            }
        }

        int hang = 0;
        int cot = 0;
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[0].length; j++) {
                System.out.print("\t" + number[i][j]);
            }
            System.out.println("");
        }

        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[0].length; j++) {
                hang = hang + number[i][j];
                cot = cot + number[j][i];
            }
            System.out.printf("\nTổng hàng %d của ma trận : %d", (i + 1), hang);
            System.out.printf("\nTổng cột %d của ma trận : %d", (i + 1), cot);
        }
    }
}
