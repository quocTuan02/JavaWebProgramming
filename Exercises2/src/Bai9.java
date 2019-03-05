import java.util.Scanner;

public class Bai9 {
        // tinh Cos(x) .
    public static void main(String[] args) {
        System.out.print("x(do)= ");
        double x = new Scanner(System.in).nextDouble();
        double rad=Math.toRadians(x);// doi x sang radian
        int n=0;

        double Cos=0;
        double e=1; // sai so
        final double E= 0.0001;
        while (e>E){
            long giaiThua=1;
            for (int i=1;i<=(2*n);i++) giaiThua*=i;
           // System.out.println(+giaiThua);
            e= ((Math.pow(rad,(2*n)))/(giaiThua)); // tinh sai so
            if (n%2==0) Cos+=e;
            else Cos-=e;
            n++;

        }


        System.out.printf(" cos(%.2f)= %f",x,Cos);


    }
}
