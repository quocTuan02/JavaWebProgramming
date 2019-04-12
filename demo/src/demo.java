import java.io.File;

public class demo {
    public static void main(String[] args) {
        File f =new File("E:\\oOo");
        if (f.isDirectory()){
            String[] list= f.list();
            for (String str: list) {
                System.out.println(str);
            }
        }


    }
}
