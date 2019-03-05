package Bai2;
/*
Tạo lớp Student, lưu trữ các thông tin một sinh viên:
- Mã sinh viên: chứa 8 kí tự
- Điểm trung bình: từ 0.0 – 10.0
- Tuổi: Phải lớn hơn hoặc bằng 18
- Lớp: Phải bắt đầu bởi kí tự ‘A’ hoặc kí tự ‘C’
Constructor không tham số.
Constructor đầy đủ tham số.
Các hàm get/set
a. phương thức inputInfo(), nhập thông tin Student từ bàn phím
b. phương thức showInfo(), hiển thị tất cả thông tin Student
c. Viết phương thức xét xem Student có được học bổng không? Điểm trung bình trên 8.0 là được học bổng
 */
public class main {
    public static void main(String[] args){
        Student student = new Student();
        student.inputInfo();
        student.showInfo();
        student.scholarship();

    }
}
