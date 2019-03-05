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
        Fraction fraction = new Fraction();
        fraction.input();
        fraction.print();
        fraction.compact();
        fraction.inverse();

    }
}
