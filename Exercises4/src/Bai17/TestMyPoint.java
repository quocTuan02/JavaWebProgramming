package Bai17;
/*
Một lớp gọi là MyPoint, thể hiện một mô hình điểm hai chiều (2D)gồm hai tọa độ x và y,
được thiết kế theo dạng sơ đồ lớp
 */
public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint myPoint = new MyPoint(3,4);
        MyPoint A = new MyPoint();
        A.setXY(6,8);
// khoang cach tu diem cho truoc
        System.out.println(myPoint);
        System.out.println(myPoint.distance(A));
        System.out.println(myPoint.distance(6,8));

        // Circle
        MyCircle myCircle= new MyCircle(myPoint,8);
        System.out.println(myCircle);
        System.out.println("diện tích hình tròn: "+myCircle.getArea(myCircle));

    }
}
