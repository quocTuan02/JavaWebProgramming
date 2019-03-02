import java.util.Random;

public class Bai2 {
    // tạo ma trận
    public static int[][]Matrix(){
        Random random= new Random();
        int[][] arr = new  int[3][3];
        for (int i=0; i<arr.length;i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = random.nextInt(10);
            }
        }
        return arr;
    }
    // in ra ma trận
    public static void printMatrix(int [][] arr){
        for (int i=0; i<arr.length;i++) {
            for (int j = 0; j < arr[0].length; j++) {
               System.out.print(arr[i][j]+"\t");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static void main (String[] args){
        /*
        Nhập vào 2 ma trận 3*3. Tính
        - Tổng của 2 ma trận
        - Tích của 2 ma trận
        - Định thức của ma trận.
         */
        int [][] a = Matrix();// tạo ma trận thứ nhất
        printMatrix(a);// in ra ma trận vừa tạo
        int[][] b= Matrix();// tạo ma trận thứ 2
        printMatrix(b);// in ra ma trận vừa tạo

        // tính tổng 2 ma trận
        int[][] c = new  int[3][3];
        for (int i=0; i<c.length;i++){
            for (int j=0;j<c[0].length;j++){
                c[i][j]= a[i][j] + b[i][j];
            }
        }

        System.out.println("tổng của 2 ma trận");
        printMatrix(c);// in ra tổng 2 ma trận
// tích của 2 ma trận
       int[][] d=new int[3][3];
        for (int m=0; m<d.length;m++){
            for (int n=0; n<d[0].length;n++){
                for (int i=0;i<3;i++){
                    d[m][n]+= a[m][i]*b[i][n];
                }
            }
        }

        System.out.println("tích của 2 matrix: ");
        printMatrix(d);
    }
}
