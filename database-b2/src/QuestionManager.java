import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class QuestionManager {


    private ArrayList<Question> QuestionList;
    private Connection conn;

    public QuestionManager() throws SQLException, ClassNotFoundException {
        DBConnect dbConnect = new DBConnect();
        this.conn = dbConnect.getConn();
        this.QuestionList = new ArrayList<>();
    }

    public ArrayList<Question> getList() throws SQLException {
        String sql = "SELECT * FROM tracnghiem.questinos;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Question question = new Question();
            question.setId(rs.getInt("id"));
            question.setContens(rs.getString("contens"));
            question.setAnswerA(rs.getString("answer_a"));
            question.setAnswerB(rs.getString("answer_b"));
            question.setAnswerC(rs.getString("answer_c"));
            question.setAnswerD(rs.getString("answer_d"));
            question.setCorect(rs.getString("correct"));

            this.QuestionList.add(question);
        }
        return this.QuestionList;
    }

    public void printQuestion(Student student) throws SQLException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        StudentQuestion sq = new StudentQuestion();
        ArrayList<Question> list = getList();
        Question question;
        String answer;
        int totalQuestions = list.size();
        int number = 0, countCorr = 0;
        for (int i = 0; i < totalQuestions; i++) {
            question = list.get(i);
            System.out.printf("Question %d/%d\n", ++number, totalQuestions);
            System.out.println(question);
            System.out.printf("Your Answer: ");
            answer = scanner.nextLine();
            sq.addAnswer(student, question, answer); // thêm câu trả lời vào Database
            if (sq.checkAnswer(question, answer)) {
                countCorr++;
            }
        }
        System.out.println("\nCongratulation !");
        System.out.printf("Your result: %d/%d", countCorr, totalQuestions);
    }


}
