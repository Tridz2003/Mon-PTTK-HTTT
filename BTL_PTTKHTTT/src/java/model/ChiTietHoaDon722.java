/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class ChiTietHoaDon722 {
    private int ID;
    private int Soluongban;
    private int HoadonID;
    private int MathangID; 

    public ChiTietHoaDon722() {}       

    public ChiTietHoaDon722(int Soluongban, int HoadonID) {
        this.Soluongban = Soluongban;
        this.HoadonID = HoadonID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setSoluongban(int Soluongban) {
        this.Soluongban = Soluongban;
    }

    public void setHoadonID(int HoadonID) {
        this.HoadonID = HoadonID;
    }

    public void setMathangID(int MathangID) {
        this.MathangID = MathangID;
    }

    public int getID() {
        return ID;
    }

    public int getSoluongban() {
        return Soluongban;
    }

    public int getHoadonID() {
        return HoadonID;
    }

    public int getMathangID() {
        return MathangID;
    }
}
