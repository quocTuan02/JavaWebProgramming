package Bai10;
/*
Xây dựng lớp đa thức (polylomial) và các phép toán trên đa thức.
Thực hiện nhập vào 2 đa thức và tính tổng, tích của nó.
 */
public class main {
    public static void main(String[] args){
        Polylomial a=new Polylomial(),b=new Polylomial(),z=new Polylomial();
        a.input();
        b.input();
        System.out.print("\nĐa thức Q(x): ");
        a.print();
        System.out.print("\nĐa thức P(x): ");
        b.print();
        z.add(a,b);
        System.out.print("\nTổng của 2 đa thức: ");
        z.print();
        z.sub(a,b);
        System.out.print("\nHiệu của 2 đa thức: ");
        z.print();
    }

}
