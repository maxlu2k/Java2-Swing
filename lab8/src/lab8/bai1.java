/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;

import java.util.ArrayList;

/**
 *
 * @author alvin
 */
public class bai1 {

    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(10);
        list.add(6.6);
        list.add(true);
        list.add("Manh Dung");
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
