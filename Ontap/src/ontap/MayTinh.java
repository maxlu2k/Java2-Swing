/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ontap;

/**
 *
 * @author alvin
 */
public class MayTinh {

    String ma;
    String ten;
    Integer gia;
    String hang;

    public MayTinh() {
    }

    public MayTinh(String ma, String ten, Integer gia, String hang) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.hang = hang;
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

    public Integer getGia() {
        return gia;
    }

    public void setGia(Integer gia) {
        this.gia = gia;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    @Override
    public String toString() {
        return "MayTinh{" + "ma=" + ma + ", ten=" + ten + ", gia=" + gia + ", hang=" + hang + '}';
    }

}
