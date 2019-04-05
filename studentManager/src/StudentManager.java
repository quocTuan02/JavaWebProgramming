import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;

public class StudentManager {
    ArrayList<Student> studentList = new ArrayList<Student>();

    public void addStudent(){
        InputStudent input = new InputStudent();
        System.out.print("ID > ");
        String id = input.inputId();
        System.out.print("Name > ");
        String name = input.inputName();
        System.out.print("Mark > ");
        double mark = input.inputMark();
        System.out.print("Phone > ");
        String phone = input.inputPhone();

        Student s= new Student(id,name,mark,phone);
        studentList.add(s);
    }
    public void list() {
        System.out.println("---DANH SACH---");
        for (Student hs : studentList) {
            System.out.println(hs);
        }
    }





   public void showTop(int top) {

        for (int i = 0; i < this.studentList.size() - 1; i++) {
            for (int j = i + 1; j < this.studentList.size(); j++){
                if (studentList.get(i).getMark() < studentList.get(j).getMark()) {
                    Student temp = studentList.get(i);
                    studentList.set(i,studentList.get(j));
                    studentList.set(j,temp);
                }
            }
        }

        System.out.printf("----TOP %d----\n", top);
        for (int i = 0; i < top; i++) {
            System.out.println(studentList.get(i));
        }

//        studentList.sort();
//        return ;
    }
}
