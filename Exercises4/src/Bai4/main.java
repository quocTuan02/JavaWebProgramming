package Bai4;
/*
Tạo class numberPrime gồm:
- biến a lưu trữ 1 số nguyên tố.
Constructor không tham số. Constructor 1 tham số:
public numberPrime(int x){} Nếu x là số nguyên tố thì lưu x vào biến a.
Nếu không thì in ra màn hình: x không phải là số nguyên tố, không lưu trữ.
Hàm boolean checkPrime(int x){} kiểm tra số x có phải số nguyên tố không.
Hàm int timSoNguyenToTiepTheo(){} tìm và trả về số nguyên tố liền sau số nguyên tố a.
Hàm get/set biến a; Nếu tham số truyền vào hàm set là 1 số nguyên tố thì mới gán vào a.
Nếu không thì hiển thị thông báo: không set.
Ở hàm Main. Khai báo 1 đối tượng thuộc class numberPrime và test các hàm đã viết.

 */
public class main {
    public static void main(String[] args){
        numberPrime a= new numberPrime();
        a.setA();
        a.primeNext();
    }

}
