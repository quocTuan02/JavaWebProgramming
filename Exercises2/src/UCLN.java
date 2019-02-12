import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int min ;
//        System.out.println("nhap a");
//        int a= sc.nextInt();
//        System.out.println("nhap b:");
//        int b = sc.nextInt();
//
//        if(a>b) min=b;
//        else min=a;
//        int uc = 1;
//        for(int i=1;i<=min;i++){
//            if(a%i==0 && b%i==0){
//                if (i > uc) uc = i;
//            }
//        }
//        System.out.println(uc);

        for (int i=0; i<5;i++){
            for (int j=0; j<i; j++){
                System.out.print(+j);
            }
            System.out.println("\n "+i);

        }



    }
}
