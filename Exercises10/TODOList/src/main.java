import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Xây dựng ứng dụng TODOList
 * 1. Xây dựng lớp Task (int id, String title, String content, boolean done)
 * 2. Xây dựng lớp TaskManager có các phương thức
 * void add(Task task) //task được thêm vào mảng và ghi vào file
 * void showAll() // hiển thị danh sách tất cả các task trong mảng
 * void showDone(boolean isDone) //hiển thị task đã done hoặc chưa done
 * void load(String path) // đọc file, load dữ liệu task vào mảng
 * void updateStatus(int id, boolean done) // cập nhật trạng thái hoàn thành cho task
 * 3. Xây dựng lớp Main
 * * In ra menu
 * ----TODO App----
 * 1. Load tasks
 * 2. Show tasks
 * 3. Create new task
 * 4. Filter by Status
 * 5. Update Status
 * 6. View Detail
 * 7. Exit
 * Choose ?
 * * Màn hình load
 * Enter file path: <Ng dùng nhập đường dẫn>
 * Load data Successful
 * * Màn hình show
 * +========+============================+=======+
 * | ID     | TITLE                      | DONE  |
 * +========+============================+=======+
 * | 1.     | Lam bai tap                | Yes   |
 * +--------+----------------------------+-------+
 * | 2.     | On thi mon cuoi            | No    |
 * +--------+----------------------------+-------+
 * | 3.     | Di cho mua gao             | No    |
 * +--------+----------------------------+-------+
 * <p>
 * * Màn hình detail
 * id: 1
 * title: Lam bai tap
 * content:
 * - lam bai tap java core
 * - lam bai tap toan cao cap
 * - lam bai tap co so du lieu
 * done: Yes
 */
public class Main {
    static File f() {
        while (true) {
            System.out.println("Enter file path");
            String path = new Scanner(System.in).nextLine();
            File file = new File(path);
            if (file.isFile()) {
                return file;
            }
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        File file = new File("demo.dat");
        TaskManager taskManager = new TaskManager(file);
        taskManager.load(file);
        //  taskManager.add(new Task(0, "", "", false));

        int choose = 0;
        while (choose != 7) {
            System.out.println(" ----TODO App----\n" +
                    " 1. Load tasks\n" +
                    " 2. Show tasks\n" +
                    " 3. Create new task\n" +
                    " 4. Filter by Status\n" +
                    " 5. Update Status\n" +
                    " 6. View Detail\n" +
                    " 7. Exit\n" +
                    " Choose ?");
            choose = scanner.nextInt();
            switch (choose) {
                case 1: {
                    try {
                        file = f();
                        taskManager.load(file);
                        System.out.println("Load data Successful");
                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("Load data Fail");
                    }
                    break;
                }
                case 2: {
                    taskManager.showAll();
                    break;
                }
                case 3: {
                    Task task = new Task();
                    System.out.print("Id: ");
                    task.setId(scanner.nextInt());
                    scanner.nextLine();
                    System.out.print("Title: ");
                    task.setTitle(scanner.nextLine());
                    System.out.print("Content: ");
                    task.setContent(scanner.nextLine());
                    System.out.printf("Done (Y/N): ");
                    if (scanner.nextLine().equalsIgnoreCase("Y")) {
                        task.setDone(true);
                    } else {
                        task.setDone(false);
                    }
                    taskManager.add(task);
                    break;
                }
                case 4: {
                    System.out.printf("Status (Y/N): ");
                    if (scanner.nextLine().equalsIgnoreCase("Y")) {
                        taskManager.showDone(true);
                    } else taskManager.showDone(false);
                    break;
                }
                case 5: {
                    System.out.printf("Id: ");
                    int id = scanner.nextInt();
                    System.out.printf("Done (Y/N): ");
                    if (scanner.nextLine().equalsIgnoreCase("Y")) {
                        taskManager.updateStatus(id, true);
                    } else {
                        taskManager.updateStatus(id, false);
                    }
                    break;
                }
                case 6: {
                    System.out.println("View Detail TaskId: ");
                    taskManager.search(scanner.nextInt());
                    break;
                }
                case 7: {
                    break;
                }

            }
        }

    }
}
