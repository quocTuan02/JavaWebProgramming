import javax.lang.model.element.NestingKind;

public class StudentManager extends Student {
    private final int MAX_STUDENT = 20;
    private int numberStudent = 0;
    private Student[] listStudents = new Student[MAX_STUDENT];


    public boolean add(Student student) {
        if (numberStudent < MAX_STUDENT) {
            listStudents[numberStudent] = student;
            numberStudent++;
            return true;
        }
        return false;
    }

    public void add() {
        Student hs = new Student();
        hs.inputInfo();
        if (add(hs)) {
            System.out.println("success !!");
        } else System.out.println("Failure !!");
    }

    public void search(String name) {
        boolean found = false;
        for (int i = 0; i < listStudents.length; i++) {
            if (listStudents[i] == null) continue;
            if (name.compareToIgnoreCase(listStudents[i].getName()) == 0) {
                System.out.println(listStudents[i]);
                found = true;
            }
        }
        if (!found) System.out.println(" không tìm thấy" + " ' " + name + " '");
    }

    public void search() {

        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.println("+=======+==========================+=======+");
        System.out.println("| NAME  | EMAIL                    | AGE   |");
        System.out.println("+=======+==========================+=======+");
        search(name);
    }

    public void list() {
        System.out.print("Order(Y/N): ");
        String or = scanner.nextLine();
        boolean order;
        if (or.compareToIgnoreCase("n") == 0) {
            order = false;
        } else {
            order = true;
        }

        System.out.println("+=======+==========================+=======+");
        System.out.println("| NAME  | EMAIL                    | AGE   |");
        System.out.println("+=======+==========================+=======+");

        list(order);
    }

    public void list(boolean order) {
        if (order) {

            for (int i = 0; i < listStudents.length; i++) {
                for (int j = i + 1; j < listStudents.length; j++) {
                    if (listStudents[i] == null || listStudents[j] == null) continue;
                    if (listStudents[i].getName().charAt(0) > listStudents[j].getName().charAt(0)) {
                        Student temp = listStudents[i];
                        listStudents[i] = listStudents[j];
                        listStudents[j] = temp;
                    }
                }
            }
        } else {
            for (int i = 0; i < listStudents.length; i++) {
                for (int j = i + 1; j < listStudents.length; j++) {
                    if (listStudents[i] == null || listStudents[j] == null) continue;
                    if (listStudents[i].getName().charAt(0) < listStudents[j].getName().charAt(0)) {
                        Student temp = listStudents[i];
                        listStudents[i] = listStudents[j];
                        listStudents[j] = temp;
                    }
                }
            }
        }
        for (int i = 0; i < listStudents.length; i++) {
            if (listStudents[i] == null) continue;
            System.out.println(listStudents[i]);
        }

    }
}




