package StudentManager;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/*
Tạo class StudentManager thực hiện các chức năng
a. Thêm mới
b. Tìm kiếm theo tên
c. Cập nhật
d. Xóa
e. Lưu vào file
f. Đọc dữ liệu từ file
 */
public class StudentManager {
    private List<Student> list;


    public StudentManager() {
        list = new ArrayList<Student>();
        load("student.dat");
    }

    //thêm mới
    public boolean add(Student student) {
        return list.add(student);
    }

    //Tìm kiếm theo tên
    public Student search(String name) {
        for (Student s:list){
            if (s.getName().compareToIgnoreCase(name)==0) return s;
        }
        return null;
    }

    //Cập nhật
    public boolean update() {
        if (save() && load("student.dat")) return true;
        return false;
    }

    //Xóa
    public boolean delete(String name) {
        for (Student s: list){
            if (s.getName().compareToIgnoreCase(name)==0) {
                list.remove(s);
                return true;
            }
        }
        return false;
    }

    //Lưu vào file
    public boolean save() {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("student.dat"))
        ) {
            oos.writeObject(this.list);
        } catch (IOException e) {
            e.printStackTrace();
            return false;

        }
        return true;
    }

    //Đọc dữ liệu từ file
    public boolean load(String path) {
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(path))
        ) {
            List<Student> data = (List<Student>) ois.readObject();
            this.list = data;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    //in ra danh sách hs
    public void printList (){
        for (Student s:list) {
            System.out.println(s);
        }
    }

}
