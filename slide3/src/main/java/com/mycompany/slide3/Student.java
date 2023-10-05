/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.slide3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alvin
 */
public class Student {

    private String ma, ten;

    public Student() {
    }

    public Student(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public static void main(String[] args) {
        Student[] students = {
            new Student("001", "Nguyen Van A"),
            new Student("002", "Nguyen Van B")
        };
        for (Student x : students) {
            System.out.println(x.ma + ":" + x.ten);
        }
        System.out.println("___________________________");
        List<Student> students1 = new ArrayList<>();
        students1.add(new Student("0001", "Nguyen Van A"));
        students1.add(new Student("0002", "Nguyen Van B"));
        for (Student st1 : students1) {
            System.out.println(st1.ma + ":" + st1.ten);
        }
    }

}
