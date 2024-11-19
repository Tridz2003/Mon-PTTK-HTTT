package dao;

import static dao.DAO.con;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.TKCTMatHang722;

public class ChiTietMatHangDAO extends DAO{
    public ChiTietMatHangDAO() {
	super();
    }
	
    public ArrayList<TKCTMatHang722> getCTMatHang(int id, String ngaybd, String ngaykt) {
        ArrayList<TKCTMatHang722> results = new ArrayList<>();
        String sql = "SELECT tblkhachhang722.Ten, tblhoadonbanhang722.ID as HoadonID, tblhoadonbanhang722.Ngayban, tblchitiethoadon722.Soluong, (tblmathangban722.Giaban*tblchitiethoadon722.Soluong) AS Tongtien\n" +
                    "FROM tblkhachhang722\n" +
                    "INNER JOIN tblhoadonbanhang722 on tblkhachhang722.ID = tblhoadonbanhang722.tblKhachHang722ID\n" +
                    "INNER JOIN tblchitiethoadon722 on tblhoadonbanhang722.ID = tblchitiethoadon722.tblHoaDonBanHang722ID\n" +
                    "INNER JOIN tblmathangban722 ON tblchitiethoadon722.tblMatHangBan722ID = tblmathangban722.tblMatHang722ID\n" +
                    "WHERE tblchitiethoadon722.tblMatHangBan722ID = ? AND tblhoadonbanhang722.Ngayban BETWEEN ? AND ?;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, ngaybd);
            ps.setString(3, ngaykt);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                TKCTMatHang722 CTmatHang = new TKCTMatHang722();
                CTmatHang.setTenKH(rs.getString("Ten"));
                CTmatHang.setHoadonID(rs.getInt("HoadonID"));
                CTmatHang.setNgayban(rs.getString("Ngayban"));
                CTmatHang.setSoluongban(rs.getInt("Soluong"));
                CTmatHang.setTongtien(rs.getFloat("Tongtien"));
                results.add(CTmatHang);
            }
	}catch(Exception e) {
		e.printStackTrace();
	}
	return results;
    }   
}
