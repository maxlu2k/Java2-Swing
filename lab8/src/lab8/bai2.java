/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alvin
 */
public class bai2 {

    public static void main(String[] args) {
        ArrayList<Integer> myarrr = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.print("Nhập số thứ " + i + ": ");
            myarrr.add(sc.nextInt());
        }

        for (int i = 0; i < myarrr.size(); i++) {
            System.out.println(myarrr.get(i));
        }
    }
}
