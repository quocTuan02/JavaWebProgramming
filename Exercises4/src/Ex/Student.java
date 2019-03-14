package Ex;

public class Student extends Person{
    private String studentId;

    public Student(String studentId) {
        this.studentId = studentId;
    }

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }
}
