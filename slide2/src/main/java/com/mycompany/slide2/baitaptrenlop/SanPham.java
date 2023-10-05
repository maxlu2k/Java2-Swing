/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.slide2.baitaptrenlop;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alvin
 */
public class SanPham {

    private String ma;
    private String ten;
    private Double gia;
    private String loai;
    private Boolean conHang;

    public SanPham() {
    }

    public SanPham(String ma, String ten, Double gia, String loai, Boolean conHang) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.loai = loai;
        this.conHang = conHang;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public void setConHang(Boolean conHang) {
        this.conHang = conHang;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public Double getGia() {
        return gia;
    }

    public String getLoai() {
        return loai;
    }

    public Boolean getConHang() {
        return conHang;
    }

    public String getPhanKhuc() {
        if (gia < 5) {
            return "Thấp";
        } else if (gia >= 5 && gia <= 15) {
            return "trung binh";
        } else if (gia > 15) {
            return "Cao";
        }
        return getPhanKhuc();
    }

    @Override
    public String toString() {
        return "SanPham{" + "ma=" + ma + ", ten=" + ten + ", gia=" + gia + ", loai=" + loai + ", conHang=" + conHang + '}';
    }

    public static void main(String[] args) {
        SanPham sp = new SanPham("1", "minh", 16.0, "", true);
        System.out.println(sp.toString()+" Phan khuc: " +sp.getPhanKhuc());
    }
}
