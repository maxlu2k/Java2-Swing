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
    private Integer diem;

    public Object[] toRow(){
        return new Object[]{ma,ten,diem};
    }
    public SinhVien() {
    }

    public SinhVien(String ma, String ten, Integer diem) {
        this.ma = ma;
        this.ten = ten;
        this.diem = diem;
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

    public Integer getDiem() {
        return diem;
    }

    public void setDiem(Integer diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "ma=" + ma + ", ten=" + ten + ", diem=" + diem + '}';
    }

}
