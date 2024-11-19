package dao;

import static dao.DAO.con;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.TKMatHang722;

public class TKMatHangDAO extends DAO {
    
    public TKMatHangDAO() {
	super();
    }
	
    public ArrayList<TKMatHang722> getTKMatHang(String ngaybd, String ngaykt) {
	ArrayList<TKMatHang722> results = new ArrayList<>();
	String sql = "SELECT tblmathang722.ID, tblmathang722.Ten, tblmathang722.Xuatxu, SUM(tblchitiethoadon722.Soluong) as Soluongban, tblhoadonbanhang722.Ngayban, (tblmathangban722.Giaban * SUM(tblchitiethoadon722.Soluong)) as Tongtien\n" +
                    "FROM tblmathang722 \n" +
                    "INNER JOIN tblmathangban722 ON tblmathang722.ID = tblmathangban722.tblMatHang722ID \n" +
                    "INNER JOIN tblchitiethoadon722 ON tblmathangban722.tblMatHang722ID = tblchitiethoadon722.tblMatHangBan722ID \n" +
                    "INNER JOIN tblhoadonbanhang722 ON tblchitiethoadon722.tblHoaDonBanHang722ID = tblhoadonbanhang722.ID\n" +
                    "WHERE tblhoadonbanhang722.Ngayban BETWEEN ? AND ?\n" +
                    "GROUP BY tblmathang722.ID;";
	try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, ngaybd);
            ps.setString(2, ngaykt);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                TKMatHang722 matHang = new TKMatHang722();
                matHang.setID(rs.getInt("ID"));
                matHang.setTen(rs.getString("Ten"));
                matHang.setXuatxu(rs.getString("Xuatxu"));
                matHang.setSoluongban(rs.getInt("Soluongban"));
                matHang.setNgayban(rs.getString("Ngayban"));
                matHang.setTongtien(rs.getFloat("Tongtien"));
                results.add(matHang);
            }
	}catch(Exception e) {
		e.printStackTrace();
	}
	return results;
    }
}
