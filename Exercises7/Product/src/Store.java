import java.util.Scanner;

public class Store {
    private int number = 0;
    private Product[] product = new Product[9];

    void addProduct() {
        //   nhập   sản   phẩm,   dùng   Scanner,
        // người   dùng   có   thể   chọn nhập   sản   phẩm   SmartPhone   hoặc   Camera

        Product p;
        System.out.printf("SmartPhone or Camera (1/0): ");
        int temp = new Scanner(System.in).nextInt();
        if (temp == 1) {
            p = new SmartPhone();
        } else {
            p = new Camera();
        }
        p.addNew();
        if (number < product.length) {
            product[number] = p;
            number++;
            System.out.println("success !!");
        } else System.out.println("Failure !!");
    }

    //   void   listProduct();   //   in   ra   danh   sách   sản   phẩm   dưới   dạng   bảng
    public void listProduct() {

        for (int i = 0; i < product.length; i++) {
            if (product[i] == null) continue;
            System.out.println(product[i]);
        }
    }

    //  void   search(String   name);   tìm   kiếm   thông   tin   sản   phẩm   theo   tên
    public void search(String name) {
        for (int i = 0; i < product.length; i++) {
            if (product[i] == null) continue;
            if (name.equalsIgnoreCase(product[i].getName())) {
                System.out.println(product[i]);
            } else System.out.println(" không tìm thấy" + " ' " + name + " '");
        }
    }


}



