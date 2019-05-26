import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Scanner input = new Scanner(System.in);
            System.out.println("   QUIZ ONLINE   ");
            System.out.println("------------------");
            System.out.print("Enter Email: ");
            String email = input.nextLine();

            System.out.print("Enter Pass: ");
            String pass = input.nextLine();

            StudentManager sm = new StudentManager();
            boolean checkLogin = sm.login(email, pass);

            if (checkLogin) {
                System.out.println("LOGIN SUCCESS! PRESS ANY KEY TO START QUIZ");
            } else {
                System.out.println("LOGIN FAIL!");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }

}
