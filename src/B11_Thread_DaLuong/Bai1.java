/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B11_Thread_DaLuong;

import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hangnt
 */
public class Bai1 implements Runnable {

    @Override
    public void run() {
        while (true) {
            try {
                // lay ra moi thong tin ve gio, phut, giay cua he thong
                Calendar cal = Calendar.getInstance();
                int h = cal.get(Calendar.HOUR);
                int m = cal.get(Calendar.MINUTE);
                int s = cal.get(Calendar.SECOND);
                System.out.println(h + ":" + m + ":" + s);
                Thread.sleep(1000); // ngat 
            } catch (InterruptedException ex) {
                Logger.getLogger(Bai1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void main(String[] args) {
        new Bai1().run();
    }

}
