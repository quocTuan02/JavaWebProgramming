import java.util.Scanner;

public class Bai8 {
        // tinh Sin(x)
    public static void main(String[] args) {
        System.out.print("x(do)= ");
        double x = new Scanner(System.in).nextDouble();
        double rad=Math.toRadians(x);
        int n=0;

        double Sin=0;
        double e=1; // sai so
        double E= 0.0001;
        while (e>E){
            long giaiThua=1;
           for (int i=1;i<=(2*n+1);i++) giaiThua*=i;
          // System.out.println(+giaiThua);
            e= ((Math.pow(rad,(2*n+1)))/(giaiThua)); // tinh sai so
            if (n%2==0) Sin+=e;
                else Sin-=e;
             n++;
//System.out.println(+Sin);
        }


        System.out.printf(" sin(%.2f)= %f",x,Sin);


    }
}
