import java.sql.*;
import java.util.ArrayList;

public class StudentQuestion {

    private Connection conn;

    public StudentQuestion() throws SQLException, ClassNotFoundException {
        DBConnect dbConnect = new DBConnect();
        this.conn = dbConnect.getConn();
    }


    public int addAnswer(Student student, Question question, String answer) throws SQLException, ClassNotFoundException {
        String sql;
        PreparedStatement pstmt;
        if (details(student).next()) {
            sql = "UPDATE `tracnghiem`.`student_questions` SET `student_id` = ?, `question_id` = ?, `answer` = ? \n" +
                    "WHERE (`student_id` = ?) and (`question_id` = ?);";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, student.getId());
            pstmt.setInt(2, question.getId());
            pstmt.setString(3, answer(question, answer));
            pstmt.setInt(4, student.getId());
            pstmt.setInt(5, question.getId());
            return pstmt.executeUpdate();
        }

        sql = "INSERT INTO `tracnghiem`.`student_questions` (`student_id`, `question_id`, `answer`)" +
                " VALUES (?, ?, ?);";
        pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, student.getId());
        pstmt.setInt(2, question.getId());
        pstmt.setString(3, answer(question, answer));

        return pstmt.executeUpdate();
    }

    public ResultSet details(Student student) throws SQLException {
        String sql = "SELECT * FROM tracnghiem.student_questions\n" +
                "where student_id = ?;";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, student.getId());

        return pstmt.executeQuery();
    }

    public void printResult(Student student) throws SQLException, ClassNotFoundException {
        QuestionManager qm = new QuestionManager();
        ArrayList<Question> list = qm.getList();
        ResultSet rs = details(student);
        int questionId;
        String answer;
        Question question;

        while (rs.next()) {

            questionId = rs.getInt("question_id");
            answer = rs.getString("answer");
            question = list.get(questionId - 1);
            System.out.printf("Question %d/%d", questionId, list.size());
            System.out.println(" - " + checkAnswer(question, answer));
            System.out.println(question.answer(answer));
        }
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

    public boolean checkAnswer(Question question, String answer) {
        if (answer(question, answer).equalsIgnoreCase(question.getCorect())
                || answer.equalsIgnoreCase(question.getCorect())) {
            return true;
        }
        return false;
    }


}
