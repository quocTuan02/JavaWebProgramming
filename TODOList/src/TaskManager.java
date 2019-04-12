import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Task> list;
    private String path;
    private File file = new File(path);

    public TaskManager() {
        this.list = new ArrayList<>();
    }

    /*
    void add(Task task) //task được thêm vào mảng và ghi vào ﬁle
     */
    public void add(Task task) {
        list.add(task);

    }

    /*
    void showAll() // hiển thị danh sách tất cả các task trong mảng
     */
    public void showAll() {

    }

    /*
    void showDone(boolean isDone) //hiển thị task đã done hoặc chưa done
     */
    public void showDone(boolean isDone) {

    }

    /*
    void load(String path) // đọc ﬁle, load dữ liệu task vào mảng
     */
    public void load(String path) {

    }

    /*
    void updateStatus(int id, boolean done) // cập nhật trạng thái hoàn thành cho task
     */
    public void updateStatus(int id, boolean done) {

    }

}
