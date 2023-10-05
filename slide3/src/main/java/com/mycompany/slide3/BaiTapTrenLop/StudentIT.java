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
public class StudentIT extends Student {

    private double diemLT;

    public StudentIT() {
    }

    public StudentIT(double diemLT) {
        this.diemLT = diemLT;
    }

    public StudentIT(double diemLT, String ma, String ten, double diemtoan, double diemTiengAnh) {
        super(ma, ten, diemtoan, diemTiengAnh);
        this.diemLT = diemLT;
    }

    public double getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(double diemLT) {
        this.diemLT = diemLT;
    }

    @Override
    public double getDiemTB() {

        return (diemLT + getDiemTiengAnh() + getDiemtoan()) / 3;
    }

    public static void main(String[] args) {
        List<StudentIT> list = new ArrayList<>();
        list.add(new StudentIT(3.0, "01", "nguyen van a", 6.0, 5.0));
        for (StudentIT stIT : list) {
            System.out.println(stIT.getDiemTB());
        }
    }
}
