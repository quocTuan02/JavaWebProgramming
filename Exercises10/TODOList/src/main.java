import java.io.FileNotFoundException;

/**
 * Xây dựng ứng dụng TODOList
 * 1. Xây dựng lớp Task (int id, String title, String content, boolean done)
 * 2. Xây dựng lớp TaskManager có các phương thức:
 * *    void add(Task task)//task được thêm vào mảng và ghi vào ﬁle
 * *    void showAll() // hiển thị danh sách tất cả các task trong mảng
 * *    void showDone(boolean isDone) //hiển thị task đã done hoặc chưa done
 * *    void load(String path) // đọc ﬁle, load dữ liệu task vào mảng
 * *    void updateStatus(int id, boolean done) // cập nhật trạng thái hoàn thành cho task
 * 3. Xây dựng lớp Main
 */
public class main {
    public static void main(String[] args) throws FileNotFoundException {
        TaskManager taskManager = new TaskManager();
        Task task =new Task(123,"not title","khoong bieets nois gif theem",false);

        taskManager.add(task);
        taskManager.showAll();
        taskManager.showDone(true);
        taskManager.load("chiu.txt");
        taskManager.updateStatus(123,true);


    }
}
