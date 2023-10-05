/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide4;

import java.util.Date;

/**
 *
 * @author alvin
 */
public class Products {

    private String ma;
    private String ten;
    private double gia;
    private Date ngayNhap;

    public Products() {
    }

    public Products(String ma, String ten, double gia, Date ngayNhap) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.ngayNhap = ngayNhap;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    @Override
    public String toString() {
        return "Products{" + "ma=" + ma + ", ten=" + ten + ", gia=" + gia + ", ngayNhap=" + ngayNhap + '}';
    }

}
