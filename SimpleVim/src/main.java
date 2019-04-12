import java.io.File;

/**
 * Xây dựng ứng dụng soạn thảo văn bản đơn giản SimpleVim, ứng dụng có các chức năng
 * 1. Tạo 1 ﬁle mới (đường dẫn ﬁle được truyền vào)
 * 2. Người dùng có thể soạn nội dung cho ﬁle (nội dung ﬁle là text)
 * 3. Khi người dùng nhập vào kí tự :q
 *      chương trình sẽ dừng lại nhưng nội dung ﬁle và ﬁle không được lưu lại
 * 4. Khi người dùng nhập vào kí tự :wq
 *      chương trình sẽ dừng lại đồng thời toàn bộ nội dung soạn thảo được ghi lại vào ﬁle.
 * 5. Xem nội dung ﬁle bất kì ( giống như lệnh cat )
 */
public class main {
    public static void main(String[] args) {
        SimpleVim sV = new SimpleVim();
    }
}
