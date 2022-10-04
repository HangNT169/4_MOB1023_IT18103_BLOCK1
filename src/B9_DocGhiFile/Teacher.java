/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B9_DocGhiFile;

import java.io.Serializable;

/**
 *
 * @author hangnt
 */
public class Teacher implements Serializable{

    // file nhu the nao doc ra duoc nhu the va thu tu doc ra khong bi lon xon
    private String ten;
    private String diaChi;
    private int namSinh;

    public Teacher() {
    }

    public Teacher(String ten, String diaChi, int namSinh) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.namSinh = namSinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    @Override
    public String toString() {
        return "Teacher{" + "ten=" + ten + ", diaChi=" + diaChi + ", namSinh=" + namSinh + '}';
    }

}
