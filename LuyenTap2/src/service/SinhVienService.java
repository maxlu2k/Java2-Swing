/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.SinhVien;

/**
 *
 * @author Admin
 */
public class SinhVienService {

    List<SinhVien> list = new ArrayList<>();

    public SinhVienService() {
        list.add(new SinhVien("sv1", "Dung", "Nam", 2016));
        list.add(new SinhVien("sv2", "Minh", "Nam", 2015));
        list.add(new SinhVien("sv3", "Long", "Nam", 2021));
        list.add(new SinhVien("sv4", "Duong", "Nu", 2012));
        list.add(new SinhVien("sv5", "Giang", "Nu", 2014));
    }
    public List<SinhVien> getAll() {
        return list;
    }

    public SinhVien getAt(int i) {
        return list.get(i);
    }

    public SinhVien getLast() {
        return list.get(list.size() - 1);
    }

    public void add(SinhVien sv) {
        list.add(sv);
        JOptionPane.showMessageDialog(null, "Thêm thành công!");
    }

    public void removeSV(SinhVien sv) {
        list.remove(sv);
    }

    public void writeFile() {
        try {
            FileOutputStream os = new FileOutputStream("D:/luyentap.dat");
            ObjectOutputStream oo = new ObjectOutputStream(os);
            oo.writeObject(list);
            oo.close();
            JOptionPane.showMessageDialog(null, "Lưu thành công!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void readFile() {
        try {
            FileInputStream fi = new FileInputStream("D:/luyentap.dat");
            ObjectInputStream oi = new ObjectInputStream(fi);
            list = (List<SinhVien>) oi.readObject();
            oi.close();
            JOptionPane.showMessageDialog(null, "Đọc dữ liệu thành công!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
