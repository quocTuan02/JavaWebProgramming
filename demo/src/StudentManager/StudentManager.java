package StudentManager;

import java.util.ArrayList;

public class StudentManager {
    ArrayList<Student> list = new ArrayList<Student>();

    public void addStudent(String id, String name, double mark, String phone) {
        Student s = new Student(id, name, mark, phone);
        list.add(s);
    }

    public void addStudent() {
        Student s = new Student();
        InputStudent input = new InputStudent();
        System.out.print("ID > ");
        s.setId(input.inputId());
        System.out.print("Name > ");
        s.setName(input.inputName());
        System.out.print("Mark > ");
        s.setMark(input.inputMark());
        System.out.print("Phone > ");
        s.setPhone(input.inputPhone());

        if (list.add(s)) System.out.println("success !");
        else System.out.println("fail !");
    }

    public void list() {
        System.out.println("---DANH SACH---");
        for (Student hs : list) {
            System.out.println(hs);
        }
    }
//GOOD
    public ArrayList<Student> sortByMark(ArrayList<Student> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).getMark() < list.get(j).getMark()) {
                    Student temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list;
    }
    public void showTop(ArrayList<Student> list, int top) {
        System.out.printf("----TOP %d----\n", top);
        for (int i = 0; i < top; i++) {
            System.out.println( sortByMark(list).get(i));
        }
    }


}
