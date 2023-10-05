/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.slide3.BaiTapTrenLop;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alvin
 */
public class Student {

    private String ma;
    private String ten;
    private double diemtoan;
    private double diemTiengAnh;

    public Student() {
    }

    public Student(String ma, String ten, double diemtoan, double diemTiengAnh) {
        this.ma = ma;
        this.ten = ten;
        this.diemtoan = diemtoan;
        this.diemTiengAnh = diemTiengAnh;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setDiemtoan(double diemtoan) {
        this.diemtoan = diemtoan;
    }

    public void setDiemTiengAnh(double diemTiengAnh) {
        this.diemTiengAnh = diemTiengAnh;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public double getDiemtoan() {
        return diemtoan;
    }

    public double getDiemTiengAnh() {
        return diemTiengAnh;
    }

    public double getDiemTB() {

        return (diemTiengAnh + diemTiengAnh) / 2;
    }
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("01", "nguyen van a", 6.0, 5.0));
        for (Student stIT : list) {
            System.out.println(stIT.getDiemTB());
        }
    }
}
