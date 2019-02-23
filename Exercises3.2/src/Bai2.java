import java.util.Random;

public class Bai2 {
    public static void main (String[] args){
        /*
        Nhập vào 2 ma trận 3*3. Tính
        - Tổng của 2 ma trận
        - Tích của 2 ma trận
        - Định thức của ma trận
         */
        Random random= new Random();
        // tạo ma trận thứ nhất
        int[][] a = new  int[3][3];
        for (int i=0; i<a.length;i++){
            for (int j=0;j<a[0].length;j++){
                a[i][j]= random.nextInt(10);
            }
        }


        System.out.println("ma trận thứ nhất");
        for (int i=0; i<a.length;i++){
            for (int j=0;j<a[0].length;j++){
                System.out.print("\t"+a[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
        // tạo ma trận thứ 2
        int[][] b = new  int[3][3];
        for (int i=0; i<b.length;i++){
            for (int j=0;j<b[0].length;j++){
                b[i][j]= random.nextInt(10);
            }
        }

        System.out.println("ma trận thứ 2");
        for (int i=0; i<b.length;i++){
            for (int j=0;j<b[0].length;j++){
                System.out.print("\t"+b[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
        // tính tổng 2 ma trận
        int[][] c = new  int[3][3];
        for (int i=0; i<c.length;i++){
            for (int j=0;j<c[0].length;j++){
                c[i][j]= a[i][j] + b[i][j];
            }
        }

        System.out.println("tổng của 2 ma trận");
        for (int i=0; i<c.length;i++){
            for (int j=0;j<c[0].length;j++){
               System.out.print("\t"+c[i][j]);
            }
            System.out.println("");
        }

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
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print("\t"+d[i][j]);
            }
            System.out.println("");
        }
    }
}
