/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class MatHang722 {
    private int ID;
    private String Ten;
    private String Xuatxu;
    private String Mota;

    public MatHang722() {}

    public MatHang722(int ID, String Ten, String Xuatxu) {
        this.ID = ID;
        this.Ten = Ten;
        this.Xuatxu = Xuatxu;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public void setXuatxu(String Xuatxu) {
        this.Xuatxu = Xuatxu;
    }

    public void setMota(String Mota) {
        this.Mota = Mota;
    }

    public int getID() {
        return ID;
    }

    public String getTen() {
        return Ten;
    }

    public String getXuatxu() {
        return Xuatxu;
    }

    public String getMota() {
        return Mota;
    }
       
}
