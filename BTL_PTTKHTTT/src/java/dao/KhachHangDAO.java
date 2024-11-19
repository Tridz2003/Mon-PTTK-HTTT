package dao;

import static dao.DAO.con;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.KhachHang722;

public class KhachHangDAO extends DAO{
	
    public KhachHangDAO() {
	super();
    }
	
    public int saveKhachHang(KhachHang722 kh) {
        int result = 0;
        String sql1 = "SELECT \n" +
                "    CASE \n" +
                "        WHEN EXISTS (SELECT 1 FROM tblkhachhang722 WHERE Tendangnhap = ?) THEN 1\n" +
                "        WHEN EXISTS (SELECT 1 FROM tblkhachhang722 WHERE Sodienthoai = ?) THEN 2\n" +
                "        ELSE 0\n" +
                "    END AS result;";
        String sql2 = "INSERT INTO tblkhachhang722 (Ten, Tendangnhap, Matkhau, Diachi, Email, Sodienthoai, Ghichu)\n" +
                            "VALUES (?, ?, ?, ?, ?, ?, ?);";
        try {
                PreparedStatement ps1 = con.prepareStatement(sql1);
                ps1.setString(1, kh.getTendangnhap());
                ps1.setString(2, kh.getSodienthoai());
                ResultSet rs = ps1.executeQuery();
                while (rs.next()) { // Kiểm tra xem có bản ghi nào được chèn hay không
                    result = rs.getInt("result"); // Nếu có, gán result là true
                }
                if(result == 0){                    
                    PreparedStatement ps = con.prepareStatement(sql2);
                    ps.setString(1, kh.getTen());
                    ps.setString(2, kh.getTendangnhap());
                    ps.setString(3, kh.getMatkhau());
                    ps.setString(4, kh.getDiachi());
                    ps.setString(5, kh.getEmail());
                    ps.setString(6, kh.getSodienthoai());
                    ps.setString(7, kh.getGhichu());
                    int rowsAffected = ps.executeUpdate();                    
                }
        }catch(Exception e) {
            e.printStackTrace();
        }
	return result;
    }
}
