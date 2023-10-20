/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author alvin
 */
public class SinhVien {

    private String ma;
    private String ten;
    private Boolean gioiTinh;
    private Integer namSinh;

    public SinhVien() {
    }

    public SinhVien(String ma, String ten, Boolean gioiTinh, Integer namSinh) {
        this.ma = ma;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.namSinh = namSinh;
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

    public Boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Integer getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(Integer namSinh) {
        this.namSinh = namSinh;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "ma=" + ma + ", ten=" + ten + ", gioiTinh=" + gioiTinh + ", namSinh=" + namSinh + '}';
    }

}
