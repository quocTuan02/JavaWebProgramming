import java.util.Scanner;

public class Bai1 {
    // nhap so co 2 chu so vao tu ban phim va in ra cach doc cua so do
    public static void main (String[] args){
        Scanner input= new Scanner(System.in);
        int n;
        do{
            System.out.println("nhap n ");
            n=input.nextInt();
            if (n<0||n>99) System.out.println(" nhap n co hai chu so");

        }while (n<0 ||n>99);

        int a=n/10;
        int b=n%10;
        if (a==1)System.out.print("muoi ");
        if (a==2) System.out.print("hai muoi ");
        if (a==3) System.out.print("ba muoi ");
        if (a==4) System.out.print("bon muoi ");
        if (a==5) System.out.print("nam muoi ");
        if (a==6) System.out.print("sau muoi ");
        if (a==7) System.out.print("bay muoi ");
        if (a==8) System.out.print("tam muoi ");
        if (a==9) System.out.print("chin muoi ");
        if (a==0) System.out.print("");

        if (b==1)System.out.print("mot ");
        if (b==2) System.out.print("hai  ");
        if (b==3) System.out.print("ba ");
        if (b==4) System.out.print("bon ");
        if (b==5) System.out.print("lam ");
        if (b==6) System.out.print("sau ");
        if (b==7) System.out.print("bay ");
        if (b==8) System.out.print("tam ");
        if (b==9) System.out.print("chin ");
        if (b==0) System.out.print("");




    }
}
