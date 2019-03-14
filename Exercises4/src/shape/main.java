package shape;
/*
Xây dựng lớp đa giác,
- hình bình hành thừa kế từ đa giác,
- hình chữ nhật thừa kế từ hình bình hành và hình vuông thừa kế từ hình chữ nhật.
Nhập vào các thuộc tính cần thiết của mỗi hình và tính chu vi, diện tích của hình đó.
*/
/*
    Xây dựng lớp điểm, lớp elip thừa kế từ lớp điểm, lớp đường tròn thừa kế từ lớp elip.
Nhập vào các thuộc tính cần thiết của elip và tính diện tích
 */
/*
    Xây dựng lớp tam giác, lớp tam giác vuông, tam giác cân thừa kế từ lớp tam giác.
Lớp tam giác đều thừa kế từ lớp tam giác cân.
 */

public class main {
    public static void main(String[] args){
        Coordinates d=new Coordinates(1,0),a= new Coordinates(0,3);
        Coordinates b=new Coordinates(3,3),c=new Coordinates(3,0);
        Square z = new Square();


        if (z.checkParallelogram(a,b,c,d)) System.out.println(" hinh binh hanh");
        else System.out.println(" khong phai hinh binh hanh");
        if (z.checkRectangle(a,b,c,d)) System.out.println(" la hinh chu nhat");
        else System.out.println(" khong phai hinh chu nhat");
        if (z.checkSquare(a,b,c,d)) System.out.println(" la hinh vuong");
        else System.out.println("khong phai hinh vuong");
// tam giac
        EquilateralTriangle triangle=new EquilateralTriangle();
        if (triangle.checkTriangle(a,b,c)) System.out.println(" tao thanh tam giac");
        else System.out.println(" khong taoj thanh tam giac");
        if (triangle.checkIsosceles(a,b,c)) System.out.println(" tam giac can");
        else System.out.println("khong phai tam giac can");
        if (triangle.checkEquilateral(a,b,c)) System.out.println("tam giac deu");
        else System.out.println(" khong phai tam giac deu");

        SquareTriangle sq = new SquareTriangle();
        if (sq.checkSquare(a,b,c)) System.out.println(" tam giac vuong ");
        else System.out.println(" khong phai tam giac vuong");


    }
}

/*
điều kiện để 4 điểm hình thành 1 tứ giác có nghĩa là ko có 3 điểm nào thẳng hàng

. điều kiện để là hình chữ nhật là có 3 góc vuông,
điều kiện là hình vuông là hình chữ nhật và AB == AC

điều kiện là hình bình hành là AB//CD và AB==CD
điều kiện là hình thoi là hình bình hành có 2 cặp cạnh đối vuông góc

cứ thế là code!
ok ?
 */