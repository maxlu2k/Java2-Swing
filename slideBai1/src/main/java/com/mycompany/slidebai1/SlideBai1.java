/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.slidebai1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alvin
 */
public class SlideBai1 {

    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        Product pr = new Product();
        Boolean chon = true;

        while (chon == true) {
            pr.inputt();
            list.add(pr);
            if (list.size() >= 5) {
                chon = false;
            }
        }
        for (Product x : list) {
            System.out.println("");
            System.out.println("Name: " + x.getName());
            System.out.println("Price: " + x.getPrice());
        }
    }
}
