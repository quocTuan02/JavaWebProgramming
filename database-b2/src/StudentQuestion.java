import java.sql.*;

public class StudentQuestion {
    private Question question;
    private Student student;
    private String answer;
    private Connection conn;

    public StudentQuestion() throws SQLException, ClassNotFoundException {
        DBConnect dbConnect = new DBConnect();
        this.conn = dbConnect.getConn();
    }


    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int addAnswer(Student student, Question question, String answer) throws SQLException, ClassNotFoundException {
        QuestionManager qm = new QuestionManager();


        String sql = "INSERT INTO `tracnghiem`.`student_questions` (`student_id`, `question_id`, `answer`)" +
                " VALUES (?, ?, ?);";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, student.getId());
        pstmt.setInt(2, question.getId());
        pstmt.setString(3, qm.answer(question, answer));

        return pstmt.executeUpdate();
    }

    public ResultSet details(Student student) throws SQLException {
        String sql = "SELECT * FROM tracnghiem.student_questions\n" +
                "where student_id = ?;";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, student.getId());

        return pstmt.executeQuery();
    }


}
