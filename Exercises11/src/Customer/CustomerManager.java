package Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerManager {
    private List<Customer> list;

    private Scanner scanner = new Scanner(System.in);

    public CustomerManager() {
        list = new ArrayList<Customer>();
    }

//
//    private Customer obj = new Customer();
//    public void setId() {
//        try {
//            System.out.print("ID: ");
//            int id = Integer.parseInt(scanner.nextLine());
//            obj.setId(id);
//        } catch (Exception e) {
//            System.out.printf("lỗi");
//            //e.printStackTrace();
//            setId();
//        }
//    }
//
//
//
//    public void setName() {
//        try {
//            System.out.print("Name: ");
//            String name = scanner.nextLine();
//            obj.setName(name);
//        } catch (Exception e) {
//            System.out.printf("lỗi");
//            setName();
//        }
//    }
//
//    public void setAddress() {
//        try {
//            System.out.print("Address: ");
//            String address = scanner.nextLine();
//            obj.setAddress(address);
//        } catch (Exception e) {
//            System.out.printf("lỗi");
//            setAddress();
//        }
//    }
//
//    public void setAge() {
//        try {
//            System.out.print("Age: ");
//            int age = Integer.parseInt(scanner.nextLine());
//            obj.setAge(age);
//        } catch (Exception e) {
//            System.out.println("lỗi");
//            //e.printStackTrace();
//            setAge();
//        }
//    }
//
//













    // load dữ liệu từ file
    public boolean load(String file) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            List<Customer> data = (List<Customer>) ois.readObject();
            this.list = data;
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }


    //Nhập dữ liệu
    public void add() {
//        System.out.print("ID: ");
//        int id = Integer.parseInt(scanner.nextLine());
//        System.out.print("Name: ");
//        String name = scanner.nextLine();
//        System.out.print("Address: ");
//        String address = scanner.nextLine();
//        System.out.print("Age: ");
//        int age = Integer.parseInt(scanner.nextLine());

        Customer kh = new Customer();
        kh.setId();
        kh.setName();
        kh.setAddress();
        kh.setAge();
        list.add(kh);
    }

    // tìm kiếm theo id
    public Customer search(int id) {
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).getId() == id) {
//                return list.get(i);
//            }
//        }
        int index = this.list.indexOf(new Customer(id));
        if (index>=0) return this.list.get(index);
        return null;
    }

    //lưu lại thông tin
    public boolean save() {
        try {
            File f = new File("Cust.data");
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
            oos.writeObject(this.list);
            oos.flush();
            oos.close();

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
