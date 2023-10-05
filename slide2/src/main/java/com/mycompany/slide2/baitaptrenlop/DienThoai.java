/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.slide2.baitaptrenlop;

/**
 *
 * @author alvin
 */
public class DienThoai extends SanPham {

    private String heDieuHanh;
    private Double ram;

    public DienThoai() {
    }

    public DienThoai(String heDieuHanh, Double ram) {
        this.heDieuHanh = heDieuHanh;
        this.ram = ram;
    }

    
    public DienThoai(String heDieuHanh, Double ram, String ma, String ten, Double gia, String loai, Boolean conHang) {
        super(ma, ten, gia, loai, conHang);
        this.heDieuHanh = heDieuHanh;
        this.ram = ram;
    }

    public void setHeDieuHanh(String heDieuHanh) {
        this.heDieuHanh = heDieuHanh;
    }

    public void setRam(Double ram) {
        this.ram = ram;
    }

    public String getHeDieuHanh() {
        return heDieuHanh;
    }

    public Double getRam() {
        return ram;
    }

    @Override
    public String toString() {
        return "DienThoai{" + "heDieuHanh=" + heDieuHanh + ", ram=" + ram + '}';
    }

    @Override
    public String getPhanKhuc() {
        if (ram < 4) {
            return "Thấp";
        } else if (ram >= 4 && ram <= 6) {
            return "trung binh";
        } else if (ram > 6) {
            return "Cao";
        }
        return getPhanKhuc();
    }

    public static void main(String[] args) {
        DienThoai dt = new DienThoai("win",6.0);
        System.out.println(dt.toString() + " Phan khuc: " + dt.getPhanKhuc());
    }

}
