import java.util.Scanner;

public class Ex1 {
    public static void main (String[] args) {
//        int sum=0;
//        int[] number = new int[5];
//       for (int i=0;i<number.length;i++) {
//           System.out.printf("number[%d]=",i);
//           number[i] = new Scanner(System.in).nextInt();
//           sum=sum+number[i];
//       }
//        for (int i=0;i<number.length;i++) { // number.length = 10
//            System.out.printf("\nnumber[%d]=%d",i,number[i]);
//        }
//        System.out.println("\nsum="+sum);
//        System.out.println("number.length="+number.length);


//        int[][] number=new int[3][5];
////        maTran[0][0]=5;
//        for (int i=0;i<3;i++)
//            for(int j=0;j<5;j++){
//                System.out.printf("number[%d][%d]=",i,j);
//                number[i][j] = new Scanner(System.in).nextInt();
//            }
//        for (int i=0;i<3;i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print("   " + number[i][j]);
//            }
//            System.out.println("");
//        }
//        System.out.println("number.length= " +number.length);
//        System.out.println("number[0].length= " +number[0].length);

        String name = "";
        name = "Nguyễn Quốc Tuấn";
        System.out.println(name);
        System.out.println("name.length(): " + name.length());
        System.out.println("name.charAt(4): " + name.charAt(4));
        System.out.println(name.concat(name));
        System.out.println(name.compareTo(name));


    }
}
