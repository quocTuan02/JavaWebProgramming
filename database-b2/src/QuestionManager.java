import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class QuestionManager {
    private int id;
    private String contens;
    private String answerA;
    private String answerB;
    private String answerC;
    private String answerD;
    private String corect;

    private ArrayList<Question> questionList;
    private Connection conn;

    public QuestionManager() throws SQLException, ClassNotFoundException {
        DBConnect dbConnect = new DBConnect();
        this.conn = dbConnect.getConn();
    }

    public void questionAdd() throws SQLException {
        String sql = "SELECT * FROM tracnghiem.questinos;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            this.id = Integer.parseInt(rs.getString(1));
            this.contens = rs.getString(2);
            this.answerA = rs.getString(3);
            this.answerB = rs.getString(4);
            this.answerC = rs.getString(5);
            this.answerD = rs.getString(6);
            this.corect = rs.getString(7);

            Question question = new Question(id,contens,answerA,answerB,answerC,answerD,corect);
            this.questionList.add(question);
        }
    }

}
