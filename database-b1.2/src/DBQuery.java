import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBQuery {
    private DBConnect dbConnect;
    private Connection conn;

    public DBQuery() throws SQLException, ClassNotFoundException {
        dbConnect = new DBConnect();
        conn = dbConnect.getConnct();
    }

    /**
     * // Hiển thị tên, khoa của các độc giả và sắp xếp theo khoa
     *
     * @return
     * @throws SQLException
     */
    public ResultSet get1() throws SQLException {

        String sql = "SELECT * FROM docgia ORDER By khoa asc";
        PreparedStatement pstmt = conn.prepareStatement(sql);

        return pstmt.executeQuery();
    }

    /**
     * //Tim những đọc giả mượn sách theo ngày
     *
     * @param name tên môn học
     * @param date ngày cần tìm theo định dạng dd/mm/YYYY
     * @return
     * @throws SQLException
     */
    public ResultSet get2(String name, String date) throws SQLException {

        String sql = "select dg.ten from PHIEUMUON as pm\n" +
                "join DOCGIA as dg on pm.sothe = dg.sothe\n" +
                "join SACH as s on pm.masach = s.masach\n" +
                "where s.ten = ? and pm.ngaymuon = STR_TO_DATE(?, '%d/%m/%Y');";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, name);
        pstm.setString(2, date);

        return pstm.executeQuery();
    }

    /**
     * //Hiển thị tên, số thẻ, tên sách của tất cả đọc giả mượn sách theo thoi gian
     *
     * @param startDate ngày bắt đầu tìm
     * @param endDate   ngày kết thúc
     * @return
     */
    public ResultSet get3(String startDate, String endDate) throws SQLException {
        String sql = "select dg.ten, pm.sothe, s.ten from PHIEUMUON as pm\n" +
                "join DOCGIA as dg on pm.sothe = dg.sothe\n" +
                "join SACH as s on pm.masach = s.masach\n" +
                "where pm.ngaymuon between " +
                "STR_TO_DATE(?, '%d/%m/%Y') and STR_TO_DATE(?, '%d/%m/%Y');";

        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, startDate);
        pstmt.setString(2, endDate);

        return pstmt.executeQuery();
    }

    /**
     * # Danh sách các sách không ai mượn
     *
     * @return
     * @throws SQLException
     */
    public ResultSet get4() throws SQLException {
        String sql = "select s.ten from SACH as s\n" +
                "where s.masach not in (select distinct masach from PHIEUMUON);";
        PreparedStatement pstmt = conn.prepareStatement(sql);

        return pstmt.executeQuery();
    }

    /**
     * Cho biết đọc giả tên "name" mượn sách bao nhiêu lần
     *
     * @param name tên đọc giả
     * @return
     * @throws SQLException
     */
    public ResultSet get5(String name) throws SQLException {
        String sql="select count(*) as 'So lan' from PHIEUMUON as pm\n" +
                "join DOCGIA as dg on pm.sothe = dg.sothe\n" +
                "join SACH as s on pm.masach = s.masach\n" +
                "where dg.ten = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,name);

        return pstmt.executeQuery();
    }


}