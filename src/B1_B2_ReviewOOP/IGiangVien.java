/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package B1_B2_ReviewOOP;

import java.util.ArrayList;

/**
 *
 * @author hangnt
 */
public interface IGiangVien {

    GiangVien inputGiangVien();
    
    void inThongTin();
    
    ArrayList<GiangVien>searchByName(String name);
    
}
