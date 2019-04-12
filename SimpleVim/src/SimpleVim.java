import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SimpleVim {
    // * 1. Tạo 1 ﬁle mới (đường dẫn ﬁle được truyền vào)
    public void newFile(String folderPath){
        try{
            System.out.print("File_Name: ");
            String fileName = new Scanner(System.in).nextLine();
            File file = new File(folderPath+"\\"+fileName);
            if(file.createNewFile())
                System.out.println("Success!");
            else
                System.out.println
                        ("Error, file already exists.");
        }
        catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }
    // * 2. Người dùng có thể soạn nội dung cho ﬁle (nội dung ﬁle là text)
    public void writerFile(String path) {
        try (
                PrintWriter pW = new PrintWriter(new File(path))
        ) {
            Scanner scanner = new Scanner(System.in);
            String writer = "";
            do {
                writer += scanner.nextLine();
                if (writer.endsWith(":q")) {
                    break;
                }
                if (writer.endsWith(":wq")) {
                    pW.print(writer);
                    break;
                }
                if (1==1){
                    break;
                }
            } while (true);
        } catch (Exception e) {
        }

    }


    /*
     3. Khi người dùng nhập vào kí tự :q
    chương trình sẽ dừng lại nhưng nội dung ﬁle và ﬁle không được lưu lại
    4. Khi người dùng nhập vào kí tự :wq
    chương trình sẽ dừng lại đồng thời toàn bộ nội dung soạn thảo được ghi lại vào ﬁle.
     */

    /*
    5. Xem nội dung ﬁle bất kì ( giống như lệnh cat )
     */

}
