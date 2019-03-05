package Bai1;
/*
Viết class NhanVien gồm các thuộc tính:
+ Tên
+ Tuổi
+ Địa chỉ
+ Tiền lương(kiểu double)
+Tổng số giờ làm (kiểu int)
Constructor không tham số. Constructor đầy đủ tham số.
Các hàm get/set Và các phương thức:
-   void inputInfo() : Nhập các thông tin cho nhân viên từ bàn phím
-   void printInfo() : in ra tất cả các thông tin của nhân viên
- double tinhThuong(): Tính toán và trả về số tiền thưởng của nhân viên theo công thức sau:
Nếu tổng số giờ làm của nhân viên >=200 thì thưởng = lương * 20%
Nếu tổng số giờ làm của nhân viên <200 và >=100 thì thưởng = lương * 10%
Nếu tổng số giờ làm của nhân viên <100 thì thưởng = 0
 */
public class main {
    public static void main(String[] args){
        Personnel personnel=new Personnel();
        personnel.inputInfo();
        personnel.printInfo();
        System.out.println("tiền thưởng: "+personnel.bonus());

    }

}
