package Bai17;

public class MyPoint {
    //- Hai biến thể hiện x (kiểu int) và y (int).
    private int x;
    private int y;
    //- Hàm tạo không đối số dùng để khởi tạo một điểm có tọa độ (0,0).
    public MyPoint(){
        x=0;
        y=0;
    }
    //- Một hàm tạo dùng để khởi tạo một điểm với tọa độ đã cho theo người dùng.
    public MyPoint(int x,int y){
        this.x=x;
        this.y=y;
    }
//- Các phương thức getter và setter cho các biến thể hiện x và y.
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
//- Một phương thức setXY() để set giá trị cho cả x và y.
    public void setXY(int x,int y){
        this.x=x;
        this.y=y;
    }
//- Phương thức toString() trả về mộ mô tả chuỗi theo định dạng "(x, y)".
    @Override
    public String toString() {
        return "("+this.x+", "+this.y+")";
    }
    //- Một phương thức gọi là distance(int x, int y)
    // trả về khoảng cách từ điểm này tới điểm khác tại các tọa độ (x, y) đã cho.
    public double distance(int x,int y){
        int X=this.x - x;
        int Y=this.y - y;
        return Math.sqrt(X*X +Y*Y);
    }
    //- Một phương thức tải chồng distance(MyPoint point1)
    // trả về khoảng cách từ điểm hiện thời tới điểm point1
    public double distance(MyPoint a){
        int X = this.x - a.x;
        int Y = this.y - a.y;
        return Math.sqrt(X*X +Y*Y);
    }

}
