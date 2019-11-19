import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 2. Xây dựng lớp TaskManager có các phương thức
 * void add(Task task) //task được thêm vào mảng và ghi vào file
 * void showAll() // hiển thị danh sách tất cả các task trong mảng
 * void showDone(boolean isDone) //hiển thị task đã done hoặc chưa done
 * void load(String path) // đọc file, load dữ liệu task vào mảng
 * void updateStatus(int id, boolean done) // cập nhật trạng thái hoàn thành cho task
 */
public class TaskManager {
    private File file;
    private List<Task> taskList;

    public TaskManager(File file) {
        this.file = file;
        this.taskList = new ArrayList<>();
    }

    public void update(File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(this.taskList);
        objectOutputStream.close();
        fileOutputStream.close();
    }

    public void add(Task task) throws IOException {
        this.taskList.add(task);
        update(this.file);
    }

    public void showAll() {
        System.out.println("\n+========+==============================+========+\n" +
                "| ID     | TITLE                        | DONE   |\n" +
                "+========+==============================+========+");

        for (Task task : this.taskList) {
            System.out.printf("|%-8d|%-30s|%-8s|\n", task.getId(), task.getTitle(), task.isDone());
            System.out.println("+========+==============================+========+");
        }


    }

    public void showDone(boolean isDone) {
        System.out.println("\n+========+==============================+========+\n" +
                "| ID     | TITLE                        | DONE   |\n" +
                "+========+==============================+========+");

        for (Task task : this.taskList) {
            if (isDone == task.isDone()) {
                System.out.printf("|%-8d|%-30s|%-8s|\n", task.getId(), task.getTitle(), task.isDone());
                System.out.println("+========+==============================+========+");
            }
        }

    }

    public void load(File file) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        this.taskList = (List<Task>) objectInputStream.readObject();
        objectInputStream.close();
    }

    public void search(int id) {
        for (Task task : this.taskList) {
            if (task.getId() == id) {
                System.out.println("Id: " + task.getId());
                System.out.println("Title: " + task.getTitle());
                System.out.println("Content: " + task.getContent());
                System.out.println("Done: " + task.isDone());
                return;
            }
        }
        System.out.println("Not found.");
    }

    public void updateStatus(int id, boolean isDone) throws IOException {
        for (Task task : this.taskList) {
            if (task.getId() == id) {
                task.setDone(isDone);
                update(this.file);
                System.out.println("Update data Successful");
                return;
            }
        }
        System.out.println("Update data Fail");
    }
}
