import java.util.Scanner;

/**
 * 1. Xây dựng class Person (id, name)
 * Phương thức + input()
 */
public class Person {
    private String id;
    private String name;
    protected Scanner scanner=new Scanner(System.in);

    public void input(){
        System.out.print("Id: ");
        this.id=scanner.nextLine();
        System.out.print("Name: ");
        this.name=scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Id: " + this.id +
                "\nName: " + this.name;
    }

    public Person(){}
    public Person(String id, String name) {
        this.id = id;
        this.name = name;
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
}
