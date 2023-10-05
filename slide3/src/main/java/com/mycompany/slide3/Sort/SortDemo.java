/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.slide3.Sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author alvin
 */
public class SortDemo {

    public static void main(String[] args) {
        List<Integer> ds = Arrays.asList(1, 6, 5, 8, 7, 4, 3, 2);
        double x0 = 4.4;
//        Collections.sort(ds);
        Collections.sort(ds);
        System.out.println(ds);
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return (int) (Math.abs(o1-x0)- Math.abs(o2-x0));
            }
        };
        Collections.sort(ds, comparator);
        System.out.println(ds);
    }
}
