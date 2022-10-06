/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B10_BaiMauCURD_TachService_DocGhiFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    public String ghiFile(String path, List<SinhVien> lists) {
        try {
            File file = new File(path);
            // kiem tra file ton tai 
            if (!file.exists()) {
                file.createNewFile();
            }
            // Ghi ra file
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            // Ghi tung doi tuong SV vao list
            for (SinhVien sv : lists) {
                oos.writeObject(sv);
            }

            // dong file
            oos.close();
            fos.close();
            return "Ghi file thanh cong";
        } catch (Exception e) {
            return "Ghi file that bai";
        }
    }

    public String docFile(String path, List<SinhVien> lists) {
        try {
            File file = new File(path);
            // kiem tra file ton tai 
            if (!file.exists()) {
                return "File khong tai";
            }
            // doc file 
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);

            SinhVien inputTeacher = new SinhVien();
            while (fis.available() > 0) {
                // doc noi dung trong file 
                inputTeacher = (SinhVien) ois.readObject(); // doc tung dong 
                lists.add(inputTeacher);
            }

            // dong file
            ois.close();
            fis.close();
            return "Doc file thanh cong";
        } catch (Exception e) {
            return "Doc file that bai";
        }
    }
}
