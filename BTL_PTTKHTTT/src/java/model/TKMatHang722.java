package model;

public class TKMatHang722 extends MatHang722 { // Kế thừa từ MatHang722
    private int Soluongban;
    private String Ngayban;
    private float Tongtien;

    // Constructor không tham số
    public TKMatHang722() {
        super(); // Gọi constructor của lớp cha
    }

    // Constructor có tham số
    public TKMatHang722(int ID, String Ten, String Xuatxu, int Soluongban, String Ngayban, float Tongtien) {
        super(ID, Ten, Xuatxu); // Gọi constructor của lớp cha
        this.Soluongban = Soluongban;
        this.Ngayban = Ngayban;
        this.Tongtien = Tongtien;
    }

    // Getter và Setter cho các thuộc tính mới
    public void setSoluongban(int Soluongban) {
        this.Soluongban = Soluongban;
    }

    public void setNgayban(String Ngayban) {
        this.Ngayban = Ngayban;
    }

    public void setTongtien(float Tongtien) {
        this.Tongtien = Tongtien;
    }

    public int getSoluongban() {
        return Soluongban;
    }

    public String getNgayban() {
        return Ngayban;
    }

    public float getTongtien() {
        return Tongtien;
    }
}