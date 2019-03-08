package Bai7;
/*
Xây dựng lớp Phân số (Fraction) có các thành phần sau:
* Các thuộc tính: Tử số, mẫu số.
* Hàm tạo không đối số và hai đối số để khởi tạo giá trị cho tử số và mẫu số.
* Các phương thức setter và getter.
* Các phương thức:
- Nhập phân số
- In Phân số
- Rút gọn phân số
- Nghịch đảo phân số
- add(), sub(), mul(), div() tương ứng để thực hiện cộng, trừ, nhân, chia hai phân số cho nhau.
 */

public class main {
    public static void main(String[] args){
        Fraction a=new Fraction(1,2),b=new Fraction(3,4),z=new Fraction();
//        a.input();
//        b.input();



        z.add(a,b);// print add()
        a.print();
        System.out.print(" + ");
        b.print();
        System.out.print(" = ");
        z.print();
            System.out.println("");
        z.sub(a,b);//print sub()
        a.print();
        System.out.print(" - ");
        b.print();
        System.out.print(" = ");
        z.print();
            System.out.println("");
        z.mul(a,b);// print mul()
        a.print();
        System.out.print(" * ");
        b.print();
        System.out.print(" = ");
        z.print();
            System.out.println("");
        z.div(a,b);//print div()
        a.print();
        System.out.print(" % ");
        b.print();
        System.out.print(" = ");
        z.print();

    }
}
