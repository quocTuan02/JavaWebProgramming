import java.util.Scanner;

public class Bai2 {
        // nhap so co 3 chu so vao tu ban phim va in ra cach doc cua so do
        public static void main (String[] args){
            Scanner input= new Scanner(System.in);
            int n;
            do{
                System.out.println("nhap n ");
                n=input.nextInt();
                if (n<100||n>999) System.out.println(" nhap n co ba chu so");

            }while (n<100 ||n>999);
            //            int soChuSo = 1 +(int)Math.log10(n);
            int hangTram =n/100;
            int hangChuc=n%100;
            int HC = hangChuc/10;
            int hangDV =hangChuc%10;


            if (hangTram==1)System.out.print("một trăm ");
            if (hangTram==2)System.out.print("hai trăm ");
            if (hangTram==3)System.out.print("ba trăm ");
            if (hangTram==4)System.out.print("bốn trăm ");
            if (hangTram==5)System.out.print("năm trăm ");
            if (hangTram==6)System.out.print("sáu trăm ");
            if (hangTram==7)System.out.print("bảy trăm ");
            if (hangTram==8)System.out.print("tám trăm ");
            if (hangTram==9)System.out.print("chín trăm");


            if (HC==1)System.out.print("mười ");
            if (HC==2)System.out.print("hai mươi ");
            if (HC==3)System.out.print("ba mươi ");
            if (HC==4)System.out.print("bốn mươi ");
            if (HC==5)System.out.print("năm mươi ");
            if (HC==6)System.out.print("sáu mươi ");
            if (HC==7)System.out.print("bảy mươi ");
            if (HC==8)System.out.print("tám mươi ");
            if (HC==9)System.out.print("chín mươi ");

            if (HC==0 && hangDV==0)System.out.print(".");
              else if (HC==0)System.out.print("linh ");
                else  if (hangDV==0)System.out.print(".");



            if (hangDV==1)System.out.print("một.");
            if (hangDV==2)System.out.print("hai.");
            if (hangDV==3)System.out.print("ba.");
            if (hangDV==4)System.out.print("bốn.");
            if (hangDV==5)System.out.print("năm.");
            if (hangDV==6)System.out.print("sáu.");
            if (hangDV==7)System.out.print("bảy.");
            if (hangDV==8)System.out.print("tám.");
            if (hangDV==9)System.out.print("chín.");





        }
    }


