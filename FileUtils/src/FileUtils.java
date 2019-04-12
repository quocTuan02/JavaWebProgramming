import java.io.File;
import java.util.Date;

public class FileUtils {
    private String path;

    public FileUtils(String path) {
        this.path = path;
    }

    public String getPath() { return path; }
    public void setPath(String path) {
        this.path = path;
    }
    /**
     * 1. Lấy ra tất cả các folder có trong đường dẫn
     * ( đường dẫn được truyền vào như là 1 tham số của hàm ).
     */
    public void folder() {
        File f = new File(this.path);
        boolean check = false;
        if (f.isDirectory() && f.exists()) {
            File[] list = f.listFiles();
            for (File str : list) {
                if (!str.isFile()) {
                    System.out.println(str.getName());
                    check = true;
                }
            }
        }
        if (check == false) {
            System.out.println(path + "\nNot Folder !");
        }
    }
    /**
     * 2. Lấy ra tất cả các ﬁle có trong đường dẫn ( đường dẫn là tham số của hàm )
     */
    public void file() {
        File f = new File(path);
        boolean check = false;
        if (f.isDirectory() && f.exists()) {
            File[] list = f.listFiles();
            for (File str : list) {
                if (str.isFile()) {
                    System.out.println(str.getName());
                    check = true;
                }
            }
        }
        if (check == false) {
            System.out.println(path + "\nNot File !");
        }
    }
    /**
     * 3. Lấy ra tất cả các ﬁle ảnh có trong đường dẫn
     * ( ﬁle ảnh là ﬁle có đuổi .png, .jpg, .jpeg)
     */
    public void fileImg() {
        File f = new File(path);
        boolean check = false;
        if (f.isDirectory() && f.exists()) {
            File[] list = f.listFiles();
            for (File str : list) {
                if (str.isFile() && str.getAbsolutePath().endsWith(".png")
                        || str.getAbsolutePath().endsWith(".jpg")
                        || str.getAbsolutePath().endsWith(".jpeg")) {
                    System.out.println(str.getName());
                    check = true;
                }
            }
        }
        if (check == false) {
            System.out.println(path + "\nNot File Image !");
        }
    }
    /**
     * 4. Lấy ra tất cả các ﬁle có phần mở rộng ext có trong đường dẫn path
     * ( ext và path là tham số truyền vào của hàm )
     */
    public void fileExt() {
        File f = new File(path);
        boolean check = false;
        if (f.isDirectory() && f.exists()) {
            File[] list = f.listFiles();
            for (File str : list) {
                if (str.isFile() && str.getAbsolutePath().endsWith(".ext")) {
                    System.out.println(str.getName());
                    check = true;
                }
            }
        }
        if (check == false) {
            System.out.println(path + "\nNot File Ext !");
        }
    }
    /**
     * 5. Lấy ra thời gian cập nhật cuối cùng của ﬁle last modified time
     * ( đường dẫn là tham số truyền vào )
     */
    public void lastModfiedDate(String path) {
        File f = new File(path);
        if (f.exists()) {
            // Thời điểm sửa lần cuối
            long lastMofifyInMillis = f.lastModified(); // milliseconds
            Date lastModifyDate = new Date(lastMofifyInMillis);
            System.out.println("Last modify date: " + lastModifyDate);
        }
    }
    /**
     * 6. In ra kích thước của ﬁle, hiển thị theo type = Mb hoặc Kb
     * ( type là tham số truyền vào)
     */
    public void size(String path) {
        File f = new File(path);
        if (f.exists()) {
            System.out.println("kích thước file: " + f.length()+" KB");
        }
    }
}
//43 6153