package Customer;

import java.io.File;
import java.util.Scanner;

public class main {
      public static void main(String[] args) {
//        CustomerManager manager = new CustomerManager();
//
//        System.out.println("1");
//        manager.add();
//        System.out.println("2");
//        manager.add();
//        System.out.println("3");
//        manager.add();
//
//        System.out.println(manager.search(1));
//        System.out.println(manager.save());
//        System.out.println(manager.load("Cust.txt"));
//

        Scanner input = new Scanner(System.in);
        CustomerManager manager = new CustomerManager();

         while (true){
            System.out.println("1. Load");
            System.out.println("2. Add");
            System.out.println("3. Save");
            System.out.println("4. Search");
            System.out.println("5. Exit");
            System.out.print("Choose ? ");
            int c = Integer.parseInt(input.nextLine());
            switch (c) {
                case 1:
                   // System.out.print("File Path > ");
                    String path = "Cust.data";//input.nextLine();
                    if (manager.load(path)) {
                        System.out.println("Successful");
                    } else {
                        System.out.println("Error");
                    }
                    break;
                case 2:
                    manager.add();
                    break;
                case 3:
                    if (manager.save()) {
                        System.out.println("Successful");
                    } else {
                        System.out.println("Error");
                    }
                    break;
                case 4:
                    System.out.print("Id > ");
                    int id = Integer.parseInt(input.nextLine());
                    Customer cust = manager.search(id);
                    if (cust != null) {
                        System.out.println(cust);
                    } else {
                        System.out.println("NOT FOUND");
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Not valid");
            }
        }
    }
}
