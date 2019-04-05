import java.util.Scanner;

public class Student {
    //Mỗi học sinh sẽ có thông tin cơ bản như sau:
    private String id;
    private String name;
    private double mark;
    private int group;
    private String phone;
    Scanner scanner = new Scanner(System.in);

    public Student(){}
    public Student(String id, String name, double mark,  String phone) {
        this.id = id;
        this.name = name;
        this.mark = mark;
        calGroup();
        this.phone = phone;
    }
    private void calGroup() {
        if (this.mark >= 8)
            this.setGroup(1);
        else if (this.mark >= 6)
            this.setGroup(2);
        else if (this.mark >= 4)
            this.setGroup(3);
        else
            this.setGroup(4);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
