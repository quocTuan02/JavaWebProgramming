import java.util.Objects;

/**
 * 2. Xây dựng class Student(id, name, email) kế thừa lại Person
 * Override phương thức input
 */
public class Student extends Person {
    private String email;

    @Override
    public void input() {
        super.input();
        System.out.print("Email: ");
        this.email=scanner.nextLine();
    }

    @Override
    public String toString() {
        super.toString();
        return "Email: "+this.email;
    }

    public Student(){}
    public Student(String email) {
        this.email = email;
    }
    public Student(String id, String name, String email) {
        super(id, name);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
