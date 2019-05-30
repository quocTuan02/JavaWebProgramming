import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
            Student student = sm.login(email, pass);

            if (student != null) {
                System.out.println("LOGIN SUCCESS! PRESS ANY KEY TO START QUIZ");
                input.nextLine();
                // trả lời câu hỏi
                QuestionManager qm = new QuestionManager();
                StudentQuestion sq = new StudentQuestion();

                qm.printQuestion(student);

                System.out.print("\nSee details (Y/N): ");
                if (input.nextLine().equalsIgnoreCase("y")) {
                    System.out.println("\n------------------");
                    sq.printResult(student);
                }


            } else {
                System.out.println("LOGIN FAIL!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

}
