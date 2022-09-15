/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B1_B2_ReviewOOP;

/**
 *
 * @author hangnt
 */
public class GiangVien extends Nguoi{
    
    private int bac;

    public GiangVien() {
    }

    public GiangVien(int bac, String ten, int tuoi, String diaChi) {
        super(ten, tuoi, diaChi);
        this.bac = bac;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }
    
    public void display(){
        System.out.println(super.getTen() + " - "+super.getTuoi() +" - "+super.getDiaChi()+ " - "+bac);
    }
   
}
