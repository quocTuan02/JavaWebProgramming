import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("sdksdk");
        list.add("hello");
        list.add("vclcvcl");
        list.add("hello");
        System.out.println(list.size());
        System.out.println(list.indexOf("vclcvcl"));
        //list.sort(     );
        for (String s : list) {
            System.out.println(s);
        }


//        File f =new File("E:\\oOo");
//        if (f.isDirectory()){
//            String[] list= f.list();
//            for (String str: list) {
//                System.out.println(str);
//            }
//        }

    }
}
