/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B8_HalderError;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    public static void main(String[] args) {
        // try....catch: de xu ly van de khi xay ra loi
        Scanner sc = new Scanner(System.in);
//        try {
//            // chua tat ca nhung dong nghi ngo xay ra loi
//            System.out.print("Nhap so:");
//            int number = sc.nextInt();
//            System.out.println(number);
//        } catch (Exception e) {
//            // cach xu ly khi co loi xay ra 
//            System.out.println("Nhap sai kieu roi. Vui long xem xet lai");
//        }

        try {
            int number = sc.nextInt();
            System.out.println(number);
        } catch (Exception e) {
            System.out.println("Loi roi");
        } finally {
            System.out.println("Cuoi cung");
        }
        // throw, throws

    }
}
