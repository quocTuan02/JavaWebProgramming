import java.util.Scanner;

public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;

    public Product(){}
    public Product( String name, int id, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public void addNew(){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Name: ");
        this.name=scanner.nextLine();
        System.out.printf("Id: ");
        this.id=scanner.nextInt();
        System.out.printf("Price: ");
        this.price=scanner.nextDouble();
        System.out.printf("Quantity: ");
        this.quantity=scanner.nextInt();
    }

    @Override
    public String toString() {
        return this.name+"\t"+this.id+"\t"+this.price+"\t"+this.quantity+"\t";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }



}
