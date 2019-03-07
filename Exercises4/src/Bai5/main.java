package Bai5;
/*
Xây dựng lớp tam giác (Triangle) có các thành phần:
* Các thuộc tính: 3 cạnh a, b, c của tam giác.
* Các phương thức:
 - Nhập độ dài 3 cạnh
 - Xác định kiểu tam giác
 - Tính chu vi tam giác
 - Tính diện tích tam giác
 */
public class main {
    public static void main(String[] args0){
        Triangle triangle= new Triangle();
        triangle.input();
        triangle.checkTriangle();
        System.out.println("chu vi tam giác: "+triangle.circumference());
        System.out.println("diện tích tam giác: "+triangle.area());
    }
}
