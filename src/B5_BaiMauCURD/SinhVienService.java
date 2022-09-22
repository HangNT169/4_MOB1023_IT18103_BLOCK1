/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B5_BaiMauCURD;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hangnt
 */
public class SinhVienService {

    public List<SinhVien> searchByName(List<SinhVien> listSinhVien, String name) {
        List<SinhVien> listSearch = new ArrayList<>();
        // code
        for (SinhVien sv : listSinhVien) {
            if (sv.getTen().contains(name)) {
                listSearch.add(sv);
            }
        }
        return listSearch;
    }

    // https://github.com/AnhDT0407/Course-JavaCore/blob/master/Java-Lesson/Java%208/1.%20Lamda%20Expressions/3.%20So%20s%C3%A1nh%20m%E1%BA%A1nh%20m%E1%BA%BD%20v%E1%BB%9Bi%20Lambda.md
    public void sortByName(List<SinhVien> lists) {
        lists.sort((o1, o2) -> {
            return o1.getTen().compareTo(o2.getTen()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/LambdaBody
        });
    }
}
