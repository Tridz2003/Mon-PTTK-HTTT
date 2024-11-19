/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class KhachHang722 {
    private int ID;
    private String Ten;
    private String Tendangnhap;
    private String Matkhau;
    private String Diachi;
    private String Email;
    private String Sodienthoai;
    private String Ghichu;

    public KhachHang722() {}       

    public KhachHang722(String Ten, String Tendangnhap, String Matkhau, String Diachi, String Email, String Sodienthoai, String Ghichu) {
        this.Ten = Ten;
        this.Tendangnhap = Tendangnhap;
        this.Matkhau = Matkhau;
        this.Diachi = Diachi;
        this.Email = Email;
        this.Sodienthoai = Sodienthoai;
        this.Ghichu = Ghichu;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public void setTendangnhap(String Tendangnhap) {
        this.Tendangnhap = Tendangnhap;
    }

    public void setMatkhau(String Matkhau) {
        this.Matkhau = Matkhau;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setSodienthoai(String Sodienthoai) {
        this.Sodienthoai = Sodienthoai;
    }

    public void setGhichu(String Ghichu) {
        this.Ghichu = Ghichu;
    }   

    public int getID() {
        return ID;
    }

    public String getTen() {
        return Ten;
    }

    public String getTendangnhap() {
        return Tendangnhap;
    }

    public String getMatkhau() {
        return Matkhau;
    }

    public String getDiachi() {
        return Diachi;
    }

    public String getEmail() {
        return Email;
    }

    public String getSodienthoai() {
        return Sodienthoai;
    }

    public String getGhichu() {
        return Ghichu;
    }
}
