/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B9_DocGhiFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
public class Main {

    public static void main(String[] args) {
        try {
            new Main().docObjectInputStream();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void ghiFileObjectOutputStream() throws FileNotFoundException, IOException {
        // B1: Tao file
        File file = new File("test.txt");

        // B2: Check su ton tai cua file
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException ex) {
                System.out.println("File da ton tai");
            }
        }

        // B3: Tao noi dung cho file 
        List<Teacher> lists = new ArrayList<>();
        lists.add(new Teacher("hihi1", "hihi2", 2004));
        lists.add(new Teacher("hihi2", "hihi3", 2005));
        lists.add(new Teacher("hihi3", "hihi4", 2006));
        lists.add(new Teacher("hihi4", "hihi5", 2007));
        lists.add(new Teacher("hihi5", "hihi6", 2008));
        lists.add(new Teacher("hihi1", "hihi2", 2004));

        // B4: Ghi vao file
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        for (Teacher t : lists) {
            oos.writeObject(t);
        }
        // B5: Dong file
        oos.close();
        fos.close();
    }

    private void docObjectInputStream() throws FileNotFoundException, IOException, ClassNotFoundException {
        // B1: Tao file
        File file = new File("test.txt");

        // B2: Check ton tai
        if (file.exists() == false) {
            System.out.println("File khong ton tai");
        }
        // B2: Doc file 
        FileInputStream fis = new FileInputStream(file); // dung de mo file 
        ObjectInputStream ois = new ObjectInputStream(fis); // dung de doc data trong file

        Teacher inputTeacher = new Teacher();
        List<Teacher> listInput = new ArrayList<>();
        while (fis.available() > 0) {
            // doc noi dung trong file 
            inputTeacher = (Teacher) ois.readObject(); // doc tung dong 
            listInput.add(inputTeacher);
        }

        // B3: In ra 
        for (Teacher teacher : listInput) {
            System.out.println(teacher.toString());
        }

        // B4: Close 
        ois.close();
        fis.close();
    }
}
