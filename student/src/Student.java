import java.util.Scanner;

public class Student {
    private String name;
    private String email;
    private  int age;
    public  Scanner scanner =new Scanner(System.in);

    public void inputInfo(){
        System.out.println("----NEW STUDENT----");
        System.out.print("NAME: ");
        this.name=scanner.nextLine();
        System.out.print("EMAIL: ");
        this.email=scanner.nextLine();
        System.out.print("AGE: ");
        this.age=scanner.nextInt();
        System.out.println("-------------------");
    }

    public Student(){}
    public Student(String name,String email, int age){
        this.name=name;
        this.email= email;
        this.age= age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "| "+this.name+"\t| "+this.email+"   \t| "+this.age+"\t|"
                +"\n+=======+==========================+=======+";
    }
}
