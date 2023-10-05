/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minitestday5;

import java.util.Date;

/**
 *
 * @author alvin
 */
public class Sach {

    private String maSach;
    private String tenSach;
    private Date ngayXuatBan;
    private String theLoai;
    private Boolean xuatSu;

    public Sach() {
    }

    public Sach(String maSach, String tenSach, Date ngayXuatBan, String theLoai, Boolean xuatSu) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.ngayXuatBan = ngayXuatBan;
        this.theLoai = theLoai;
        this.xuatSu = xuatSu;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public Date getNgayXuatBan() {
        return ngayXuatBan;
    }

    public void setNgayXuatBan(Date ngayXuatBan) {
        this.ngayXuatBan = ngayXuatBan;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public Boolean getXuatSu() {
        return xuatSu;
    }

    public void setXuatSu(Boolean xuatSu) {
        this.xuatSu = xuatSu;
    }

    @Override
    public String toString() {
        return "Sach{" + "maSach=" + maSach + ", tenSach=" + tenSach + ", ngayXuatBan=" + ngayXuatBan + ", theLoai=" + theLoai + ", xuatSu=" + xuatSu + '}';
    }
    
    
}
