import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Task> list;
    private String path;
    private File file = new File(path);
    private PrintWriter pW = new PrintWriter(file);

    public TaskManager() throws FileNotFoundException {
        this.list = new ArrayList<>();
    }
    /*
    void add(Task task) //task được thêm vào mảng và ghi vào ﬁle
     */
    public void add(Task task) {
        list.add(task);
        pW.println(task);
    }

    /*
    void showAll() // hiển thị danh sách tất cả các task trong mảng
     */
    public void showAll() {
        for ( Task ds : list ) {
            System.out.println(ds);
        }
    }

    /*
    void showDone(boolean isDone) //hiển thị task đã done hoặc chưa done
     */
    public void showDone(boolean isDone) {
        for ( Task ds : list ) {
            if (ds.getDone()==isDone){
                System.out.println(ds);
            }
        }
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
        boolean check = false;
        for (Task ds: list) {
            if (id==ds.getId()){
                ds.setDone(done);
                check= true;
            }
        }
        if (check) System.out.println(" Success!");
        else System.out.println("Không tìm thấy id: "+id);
    }

}
