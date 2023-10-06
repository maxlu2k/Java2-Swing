/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minitest4.Model;

import java.io.Serializable;

/**
 *
 * @author alvin
 */
public class Product implements Serializable {

    private String ma;
    private String ten;
    private Integer gia;

    public Object[] toRow() {
        return new Object[]{ma, ten, gia};
    }

    public Product() {
    }

    public Product(String ma, String ten, Integer gia) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
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

    @Override
    public String toString() {
        return "Product{" + "ma=" + ma + ", ten=" + ten + ", gia=" + gia + '}';
    }

}
