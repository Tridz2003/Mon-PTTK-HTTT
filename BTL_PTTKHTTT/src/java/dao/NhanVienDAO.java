package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.NhanVien722;

public class NhanVienDAO extends DAO{
	
    public NhanVienDAO() {
	super();
    }
	
    public boolean isLogin(NhanVien722 nv) {
	boolean result = false;
	String sql = "SELECT * from tblnhanvien722 "
                + "WHERE Tendangnhap = ? AND Matkhau = ?;";
	try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nv.getTendangnhap());
            ps.setString(2, nv.getMatkhau());
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {				
                result = true;
            }
	}catch(Exception e) {
		e.printStackTrace();
	}
	return result;
    }
}
