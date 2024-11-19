package model;

public class TKCTMatHang722 extends ChiTietHoaDon722 { // Kế thừa từ ChiTietHoaDon722
    private String TenKH; // Tên khách hàng
    private String Ngayban; // Ngày bán
    private float Tongtien; // Tổng tiền

    // Constructor không tham số
    public TKCTMatHang722() {
        super(); // Gọi constructor của lớp cha
    }

    // Constructor có tham số
    public TKCTMatHang722(String TenKH, int HoadonID, String Ngayban, int Soluongban, float Tongtien) {
        super(Soluongban, HoadonID); // Gọi constructor của lớp cha
        this.TenKH = TenKH;
        this.Ngayban = Ngayban;
        this.Tongtien = Tongtien;
    }

    // Getter và Setter cho các thuộc tính
    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public void setNgayban(String Ngayban) {
        this.Ngayban = Ngayban;
    }

    public void setTongtien(float Tongtien) {
        this.Tongtien = Tongtien;
    }

    public String getTenKH() {
        return TenKH;
    }

    public String getNgayban() {
        return Ngayban;
    }

    public float getTongtien() {
        return Tongtien;
    }
}