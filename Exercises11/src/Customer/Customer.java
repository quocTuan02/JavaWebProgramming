package Customer;

import java.io.Serializable;
import java.util.Scanner;

public class Customer implements Serializable {
    private int id;
    private String name;
    private String address;
    private int age;
    private static   Scanner scanner =new Scanner(System.in);

    public Customer() {
    }

    public Customer(int id) {
        this.id = id;
    }

    public Customer(int id, String name, String address, int age) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setId() {
        try {
            System.out.print("ID: ");
            int id = Integer.parseInt(scanner.nextLine());
            this.id = id;
        } catch (Exception e) {
            System.out.printf("lỗi");
            //e.printStackTrace();
            setId();
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName() {
        try {
            System.out.print("Name: ");
            String name = scanner.nextLine();
            this.name = name;
        } catch (Exception e) {
            System.out.printf("lỗi");
            setName();
        }
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAddress() {
        try {
            System.out.print("Address: ");
            String address = scanner.nextLine();
            this.address = address;
        } catch (Exception e) {
            System.out.printf("lỗi");
            setAddress();
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAge() {
        try {
            System.out.print("Age: ");
            int age = Integer.parseInt(scanner.nextLine());
            this.age = age;
        } catch (Exception e) {
            System.out.println("lỗi");
            //e.printStackTrace();
            setAge();
        }
    }


    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Customer other = (Customer) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
