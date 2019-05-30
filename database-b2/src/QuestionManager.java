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

    public boolean checkAnswer(Question question, String answer) {
        if (answer(question, answer).equalsIgnoreCase(question.getCorect())
                || answer.equalsIgnoreCase(question.getCorect())) {
            return true;
        }
        return false;
    }

    /**
     * @param question câu hỏi
     * @param answer   câu trả lời ngắn: A or B or C or D
     * @return câu trả trả lời Full
     */
    public String answer(Question question, String answer) {
        if (answer.equalsIgnoreCase("a") ||
                answer.equalsIgnoreCase(question.getAnswerA())) {
            return question.getAnswerA();
        }

        if (answer.equalsIgnoreCase("b") ||
                answer.equalsIgnoreCase(question.getAnswerB())) {
            return question.getAnswerB();
        }

        if (answer.equalsIgnoreCase("c") ||
                answer.equalsIgnoreCase(question.getAnswerC())) {
            return question.getAnswerC();
        }

        if (answer.equalsIgnoreCase("d") ||
                answer.equalsIgnoreCase(question.getAnswerD())) {
            return question.getAnswerD();
        }

        return " ";
    }


}
