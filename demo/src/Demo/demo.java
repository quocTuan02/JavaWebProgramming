package Demo;

import java.io.File;
import java.sql.*;
import java.util.*;

public class demo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String connStr = "jdbc:mysql://localhost:3306/qlthuvien";
            String user = "root";
            String password = "vannhucu";
            Connection conn = DriverManager.getConnection(connStr, user, password);

            if (conn != null) {
                System.out.println("ket noi thanh cong");
                System.out.println("==================");
                //sau khi ket noi thành công
                Statement stmt = conn.createStatement();
                //insert du lieu
                PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM sach");


//                ResultSet rs = stmt.executeQuery("SELECT * FROM sach");

//                while (rs.next()){
//                    System.out.printf("\n%-10s\t%s",rs.getString("ten"),rs.getString(3));
//                }

            } else System.out.printf("that bai");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

/*
        ArrayList arr = new ArrayList<String>();

        arr.add(5);
        arr.add(9);
        arr.remove(1);

        String pathname= "C:\\Users\\oOo\\CLionProjects\\untitled1";
        File f = new File(pathname);
       f.delete();
        /*
        ArrayList<Demo.Ojb> list = new ArrayList<>();
        list.add(new Demo.Ojb(122, "Tùng", "linhsk3@xmail.com", 19));
        list.add(new Demo.Ojb(125, "Linh", "linhsk4@xmail.com", 17));
        list.add(new Demo.Ojb(155, "Hương", "linhsk36@xmail.com", 19));
        list.add(new Demo.Ojb(124, "Hoa", "linhsk38@xmail.com", 18));
        list.add(new Demo.Ojb(133, "Tuấn", "linhsk34@xmail.com", 19));
        list.add(new Demo.Ojb(105, "Hải", "linhsk39@xmail.com", 20));


        System.out.println("+========+===========+===============================+========+");
        System.out.printf("%s%-7s%s%-10s%s%-30s%s%-7s%s\n",
                "| ", "ID", "| ", "NAME", "| ", "EMAIL", "| ", " AGE", "|");
        System.out.println("+========+===========+===============================+========+");

        for (Demo.Ojb obj : list) {
            System.out.printf("%s%-7d%s%-10s%s%-30s%s%-7d%s\n",
                    "| ", obj.getId(), "| ", obj.getName(), "| ", obj.getEmail(), "| ", obj.getAge(), "|");
            System.out.println("+========+===========+===============================+========+");
        }


         */
/*
       Set<String> hs = new HashSet<>();
        hs.add("l");
        hs.add("hhhj");
        hs.add("l");
        hs.add("lalal");
        System.out.println(hs+"\n");
        for (String s: hs) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(s);

        }

 */


      /*
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

*/


//        File f =new File("E:\\oOo");
//        if (f.isDirectory()){
//            String[] list= f.list();
//            for (String str: list) {
//                System.out.println(str);
//            }
//        }

    }
}
