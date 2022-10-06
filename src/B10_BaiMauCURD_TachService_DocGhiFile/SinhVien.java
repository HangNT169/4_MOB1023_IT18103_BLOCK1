/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B10_BaiMauCURD_TachService_DocGhiFile;

import java.io.Serializable;

/**
 *
 * @author hangnt
 */
public class SinhVien implements Serializable{

    private String maSV;
    private String ten;
    private int tuoi;
    private int gioiTinh;
    private String diaChi;

    public SinhVien() {
    }

    public SinhVien(String maSV, String ten, int tuoi, int gioiTinh, String diaChi) {
        this.maSV = maSV;
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Object[] toDataRow() {
        return new Object[]{maSV, ten, tuoi, gioiTinh == 1 ? "Nam" : "Nu", diaChi};
    }
}
