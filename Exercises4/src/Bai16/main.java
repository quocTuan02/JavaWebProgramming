package Bai16;

import Bai4.numberPrime;

/*
    Tạo class SoNguyenTo gồm: biến a lưu trữ 1 số nguyên tố.
    Constructor không tham số.  Constructor 1 tham số:

public SoNguyenTo(int x){} Nếu x là số nguyên tố thì lưu x vào biến a.
Nếu không thì in ra màn hình: x không phải là số nguyên tố, không lưu trữ.

Hàm boolean isSoNguyenTo(int x){} kiểm tra số x có phải số nguyên tố không.

Hàm int timSoNguyenToTiepTheo(){} tìm và trả về số nguyên tố liền sau số nguyên tố a.

Hàm get/set biến a; Nếu tham số truyền vào hàm set là 1 số nguyên tố thì mới gán vào a.
Nếu không thì hiển thị thông báo: không set.
Ở hàm Main: Khai báo 1 đối tượng thuộc class SoNguyenTo và test các hàm đã viết.
 */
public class main {
    public static void main(String[] args) {
        numberPrime prime =new numberPrime(29);
        if (prime.checkPrime(29)) System.out.println(" 29 la so nguyen to");
        else System.out.println("29 khong phai laf so nguyen to");
        prime.primeNext();

    }
}
