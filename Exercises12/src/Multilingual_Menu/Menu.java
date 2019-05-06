package Multilingual_Menu;

import StudentManager.StudentManager;
import StudentManager.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {
    private Map<String, String> map;

    public Menu() {
        this.map = new HashMap<>();
        loadData("en");
    }

    /**
     * @param lang = "en" or "vn"
     */
    public void loadData(String lang) {
        String path = "menu-" + lang + ".locale";
        try (Scanner reader = new Scanner(new File(path))) {
            while (reader.hasNextLine()) {
                // System.out.println(reader.nextLine());
                String line = reader.nextLine();
                String[] split = line.split("=");
                this.map.put(split[0], split[1]);
                // System.out.println(this.map.get(split[0]));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void print() {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.printf("\n======%s======", this.map.get("menu"));
            System.out.printf("\n1. %s", this.map.get("add"));
            System.out.printf("\n2. %s", this.map.get("search"));
            System.out.printf("\n3. %s", this.map.get("update"));
            System.out.printf("\n4. %s", this.map.get("delete"));
            System.out.printf("\n5. %s", this.map.get("save"));
            System.out.printf("\n6. %s", this.map.get("load"));
            System.out.printf("\n7. %s", this.map.get("list"));
            System.out.printf("\n8. %s", this.map.get("lang"));
            System.out.printf("\n9. %s", this.map.get("exit"));
            System.out.printf("\n %s: ", this.map.get("choose"));
            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1: {
                    System.out.printf("%s: ", this.map.get("name"));
                    String name = scanner.nextLine();
                    System.out.printf("%s: ", this.map.get("email"));
                    String email = scanner.nextLine();
                    System.out.printf("%s: ", this.map.get("rollNumber"));
                    String rollNumber = scanner.nextLine();

                    Student student = new Student(name, email, rollNumber);

                    if (manager.add(student)) System.out.printf("%s", this.map.get("success"));
                    else System.out.printf("%s", this.map.get("fail"));
                    break;
                }
                case 2: {
                    System.out.printf("%s: ", this.map.get("name"));
                    if (manager.search(scanner.nextLine()) != null) {
                        System.out.println(" manager.search(scanner.nextLine())");
                    } else System.out.printf("\n%s", this.map.get("no result were found"));
                    break;
                }
                case 3: {
                    if (manager.update()) System.out.printf("%s !", this.map.get("success"));
                    else System.out.printf("%s !", this.map.get("fail"));
                    break;
                }
                case 4: {
                    System.out.printf("%s: ", this.map.get("name"));
                    String name = scanner.nextLine();
                    if (manager.delete(name)) System.out.printf("%s !", this.map.get("success"));
                    else System.out.printf("%s !", this.map.get("fail"));
                    break;
                }
                case 5: {
                    if (manager.save()) System.out.printf("%s !", this.map.get("success"));
                    else System.out.printf("%s !", this.map.get("fail"));
                    break;
                }
                case 6: {
                    System.out.printf("%s: ", this.map.get("path"));
                    String path = scanner.nextLine();
                    if (manager.load(path)) System.out.printf("%s !", this.map.get("success"));
                    else System.out.printf("%s !", this.map.get("fail"));
                    break;
                }
                case 7: {
                    manager.printList();
                    break;
                }
                case 8: {
                    System.out.print(this.map.get("mess"));
                    int la = Integer.parseInt(scanner.nextLine());
                    if (la == 1)
                        this.loadData("en");
                    else if (la == 2)
                        this.loadData("vi");
                    break;
                }
                case 9: {
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.printf("%s", this.map.get("not valid"));
                }
            }
        }
    }

//    public static void main(String[] args) {
//        Menu m = new Menu();
//        m.loadData("en");
//        m.print();
//    }
}
