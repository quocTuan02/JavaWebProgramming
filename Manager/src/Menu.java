import java.util.Scanner;

/**
 * 7. Tạo class Menu thực hiện việc in ra menu lựa chọn
 * thực hiện các chức năng
 * * add,
 * * show,
 * * search
 * Implement phương thức display() để thực hiện việc in menu
 */
public class Menu {
    protected Scanner scanner = new Scanner(System.in);
    private Manager manager;

    public Menu(Manager manager) {
        this.manager = manager;
    }

    public void display() {
        int choice = 0;
        do {
            System.out.println("=====MENU=====");
            System.out.println("1. Add");
            System.out.println("2. Show");
            System.out.println("3. Search");
            System.out.println("4. Exit");
            System.out.print("Choice: ");
            choice = Integer.parseInt(scanner.nextLine());//scanner.nextInt();
            switch (choice) {
                case 1: {
                    manager.add();
                    break;
                }
                case 2: {
                    manager.show();
                    break;
                }
                case 3: {
                    System.out.print("Name: ");
                    manager.search(scanner.nextLine());
                    break;
                }
                case 4: {
                    break;
                }
            }
        } while (choice != 4);
    }
}
