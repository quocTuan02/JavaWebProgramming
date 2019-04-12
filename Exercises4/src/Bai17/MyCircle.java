package Bai17;

public class MyCircle extends MyPoint {
    //- Hai biến thể hiện private: tâm (một thể hiện của MyPoint) và bán kính (có kiểu int).
    private MyPoint center;
    private double radius;

    //- Một hàm tạo để khởi tạo hình tròn với tâm có tọa độ (x,y)
    // và bán kính được đưa ra từ người dùng.
    public MyCircle() {
    }

    public MyCircle(int x, int y, double radius) {
        setXY(x, y);
        this.radius = radius;
    }

    //- Một hàm tạo khác để khởi tạo một hình tròn với
    // tâm là thể hiện của lớp MyPoint và bán kính tương ứng.
    public MyCircle(MyPoint center, double radius) {
        this.center = center;
        this.radius = radius;
    }
    //- Các phương thức getter và setter.

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //- Phương thức toString() trả về một chuỗi mô tả hình tròn hiện thời theo dạng
    // "Hình tròn @ (x,y) bán kính=r".
    @Override
    public String toString() {
        return "Hình tròn @" + "(" + center.getX() + ", " + center.getY() + ")\n" + "bán kính=" + this.radius;
    }

    //- Phương thức getArea() trả về diện tích của hình tròn.
    public double getArea(double radius) {
        return Math.PI * Math.pow(radius / 2, 2);
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getArea(MyCircle a) {
        return Math.PI * Math.pow(a.radius, 2);
    }
}
