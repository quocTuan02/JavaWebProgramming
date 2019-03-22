import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Store store=new Store();
        Scanner scanner =new Scanner(System.in);
        int choice =0;
        do {

            System.out.println("===========MENU==========");
            System.out.println("\t1. Add Product ");
            System.out.println("\t2. List Product ");
            System.out.println("\t3. Search");
            System.out.println("\t4. Exit");
            System.out.print("choice: ");
            choice= scanner.nextInt();
            switch (choice){
                case 1:{
                    store.addProduct();
                    break;
                }
                case 2:{
                    store.listProduct();
                    break;
                }
                case 3:{
                    scanner.nextLine();
                    System.out.print("name: ");
                    store.search(scanner.nextLine());
                }
                case 4:{
                    break;
                }
            }
        }while (choice!=4);
    }
}
