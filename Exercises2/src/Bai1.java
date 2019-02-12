import java.util.Scanner;

public class Bai1 {
        // giai phuong trinh bac 2 aX^2 +bX+c=0 .
    public static void main(String[] args){

        Scanner input= new Scanner(System.in);
        System.out.print("nhap a#0  ");
            double a=input.nextDouble();
        System.out.print("nhap b    ");
            double b=input.nextDouble();
        System.out.print("nhap c    ");
            double c=input.nextDouble();
        double delta=(b*b-4*a*c);
        if (delta<0) System.out.println("phuong trinh bac 2 vo nghiem");
            else if(delta==0) System.out.printf("phuong trinh co nghiem duy nhat \n X=%f",(-b/(2*a)));
                else {
                    double x1= (-b-Math.sqrt(delta))/(2*a);
                    double x2= (-b+Math.sqrt(delta))/(2*a);
                System.out.printf("phuong trinh co 2 nghiem \nX1=%f \nX2=%f",x1, x2);
                }
    }
}
