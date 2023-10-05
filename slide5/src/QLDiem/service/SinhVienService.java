/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLDiem.service;

import QLDiem.model.SinhVien;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alvin
 */
public class SinhVienService {

    List<SinhVien> list = new ArrayList<>();

    public SinhVienService() {
        list.add(new SinhVien("sv1", "Manh Dũng", 10));
        list.add(new SinhVien("sv2", "Binh Minh", 5));
        list.add(new SinhVien("sv3", "Long", 8));
        list.add(new SinhVien("sv4", "Kien", 2));
    }

    public List<SinhVien> getAll() {
        return list;
    }

    public void loadData() {
        try {
            FileInputStream fl = new FileInputStream("D:/sv.dat");
            ObjectInputStream oi = new ObjectInputStream(fl);
            list = (List<SinhVien>) oi.readObject();
        } catch (Exception e) {
        }
    }
}
