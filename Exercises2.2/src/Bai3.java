import java.util.Scanner;

public class Bai3 {
    //In ra tat ca cac cach doi tien
    public static void main (String[] args) {
        Scanner input= new Scanner(System.in);
        int money=0;
        do {
            System.out.println("So tien: ");
            money = input.nextInt();
            if (money%100000 != 0) System.out.println("Nhap so tien la boi cua 100,000");
        }while (money%100000 != 0);


//        System.out.println("So tien: ");
//        int money = new Scanner(System.in).nextInt();

        int sum=0;


        for (int soTo100k =0;soTo100k <= money/100000;soTo100k++)
            for (int soTo200k =0;soTo200k <= money/200000;soTo200k++)
                for (int soTo500k =0;soTo500k <= money/500000;soTo500k++)
                {
                    sum=soTo100k*100000+soTo200k*200000+soTo500k*500000;
                    if (sum==money) {
                        System.out.printf("%,d = %d*100.000 + %d*200.000 + %d*500.000 \n", money, soTo100k, soTo200k, soTo500k);
                    }else if (sum > money) break;
                }



    }
}
