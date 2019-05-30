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
                ArrayList<Question> list = qm.getList();
                int countCorr = 0;
                int number = 0;
                for (int i = 0; i < list.size(); i++) {
                    System.out.printf("Question %d/%d", ++number, list.size());
                    System.out.println(list.get(i));
                    System.out.printf("Your Answer: ");

                    String answer = input.nextLine();
                    sq.addAnswer(student, list.get(i), answer);
                    if (qm.checkAnswer(list.get(i), answer)) {
                        countCorr++;
                    }
                }
                System.out.println("\nCongratulation !");
                System.out.printf("Your result: %d/%d", countCorr, list.size());

                System.out.println("See details (Y/N): ");
                if (input.nextLine().equalsIgnoreCase("y")) {
                    System.out.println("------------------");

                    ResultSet rs = sq.details(student);
                    int questionId;
                    String answer;
                    while (rs.next()) {
                        questionId = rs.getInt("question_id");
                        answer = rs.getString("answer");

                        System.out.printf("Question %d/%d", questionId, list.size());

                        System.out.println(list.get(questionId - 1).answer(answer));

                    }

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
