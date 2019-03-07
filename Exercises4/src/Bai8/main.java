package Bai8;

/*
Xây dựng lớp số phức có các thành phần sau:
+ Các thuộc tính:
-   Phần thực
- Phần ảo
+ Các hàm thành phần:
- Cộng hai số phức
- Trừ hai số phức
- Nhân hai số phức
- Chia hai số phức
Nhập vào 2 số phức và thực hiện các phép toán trên hai số phức đó.
 */
public class main {
   public static void main(String[] args){
       complexNumbers  a=new complexNumbers(2,3) ,b=new complexNumbers(4,5);
       complexNumbers z= new complexNumbers(0,0);
//       a.input();
//       b.input();

       z.add(a,b);
       a.print();System.out.print(" + ");b.print();System.out.print(" = ");z.print();
            System.out.println("");
       z.sub(a,b);
       a.print();System.out.print(" - ");b.print();System.out.print(" = ");z.print();
            System.out.println("");
       z.mul(a,b);
       a.print();System.out.print(" * ");b.print();System.out.print(" = ");z.print();
       z.div(a,b);
       System.out.println("");
       a.print();System.out.print(" / ");b.print();System.out.print(" = ");z.print();



// chưa làm xong



   }
}
