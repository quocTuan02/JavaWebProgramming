package StudentManager;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);
       while (true){
           System.out.println("=====MENU=====");
           System.out.println("1. Add new");
           System.out.println("2. Search by name");
           System.out.println("3. Update");
           System.out.println("4. Delete by name");
           System.out.println("5. Save to file");
           System.out.println("6. Read to file");
           System.out.println("7. List");
           System.out.println("8. Exit.");
           System.out.print("Chose: ");
           int chose = Integer.parseInt(scanner.nextLine());


           switch (chose){
               case 1:
                   if (manager.add()) System.out.println("Success !");
                   else System.out.println("Failure !");
                   break;
               case 2:
                   System.out.print("Name: ");
                   System.out.println( manager.search(scanner.nextLine()));
                   break;
               case 3:
                   if (manager.update()) System.out.println("Success !");
                   else System.out.println("Failure !");
                   break;
               case 4:
                   System.out.print("Name: ");
                   String name = scanner.nextLine();
                   if (manager.delete(name)) System.out.println("Success !");
                   else System.out.println("Failure !");
                   break;
               case 5:
                   if (manager.save()) System.out.println("Success !");
                   else System.out.println("Failure !");
                   break;
               case 6:
                   System.out.print("Path to file: ");
                   String path = scanner.nextLine();
                   if (manager.load(path)) System.out.println("Success !");
                   else System.out.println("Failure !");
                   break;
               case 7:
                   manager.printList();
                   break;
               case 8:
                   System.exit(0);
                   break;
               default:
                   System.out.println("Not valid");
           }

       }
    }

}
