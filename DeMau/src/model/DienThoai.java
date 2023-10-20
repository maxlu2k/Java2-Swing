/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author alvin
 */
public class DienThoai {

    private String ma;
    private String mauSac;
    private String hang;
    private String boNho;
    private Integer gia;

    public DienThoai() {
    }

    public DienThoai(String ma, String mauSac, String hang, String boNho, Integer gia) {
        this.ma = ma;
        this.mauSac = mauSac;
        this.hang = hang;
        this.boNho = boNho;
        this.gia = gia;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public String getBoNho() {
        return boNho;
    }

    public void setBoNho(String boNho) {
        this.boNho = boNho;
    }

    public Integer getGia() {
        return gia;
    }

    public void setGia(Integer gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "DienThoai{" + "ma=" + ma + ", mauSac=" + mauSac + ", hang=" + hang + ", boNho=" + boNho + ", gia=" + gia + '}';
    }

}
